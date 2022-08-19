package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.dto.DatosReporteDto
import net.magbdigital.sudapractic.dto.DetalleReporteDto
import net.magbdigital.sudapractic.dto.actividadesDto
import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.repository.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.text.SimpleDateFormat

@Service
class StudentService {
    @Autowired
    lateinit var studentRepository: StudentRepository

    @Autowired
    lateinit var practiceRepository: PracticeRepository

    @Autowired
    lateinit var practiceViewRepository: PracticeViewRepository

    @Autowired
    lateinit var studentViewRepository: StudentViewRepository

    @Autowired
    lateinit var practiceDetailRepository: PracticeDetailRepository
@Autowired
lateinit var activityDetailViewRepository: ActivityDetailViewRepository


    fun list(): List<Student> {

        return studentRepository.findAll()
    }

    fun listByEstudiante(): List<StudentView> {
        return studentViewRepository.findAll()
    }

    fun listById(id: Long?): Student? {
        return studentRepository.findById(id)
    }

    fun save(student: Student): Student {
        student.apply {
            status = true
        }
        return studentRepository.save(student)
    }

    fun update(student: Student): Student {
        val response = studentRepository.findById(student.id)
        if (response == null) {
            throw Exception()
        } else {
            return studentRepository.save(student)
        }
    }

    fun delete(id: Long): Boolean {
        studentRepository.deleteById(id)
        return true
    }

    fun datosReporte(idStudent: Long, idTutor: Long): DatosReporteDto {

        var student: Student = studentRepository.findById(idStudent).get()
        var studentView: StudentView = studentViewRepository.findById(idStudent).get()

        var practiceView: PracticeView = practiceViewRepository.findByStudentIdAndTutorId(idStudent, idTutor)
        var listActivities:List<ActivityDetailView>?=activityDetailViewRepository.listDetailActivity(practiceView.id!!)
       /* var listActivities:List<ActivityDetailView>?=practiceView.id?.let{activityDetailViewRepository.listDetailActivity(it)}*/


        var practiceDetail: List<PracticeDetail>? = practiceView.id?.let { practiceDetailRepository.findByPracticeId(it) }

        var datosReporteDto: DatosReporteDto = DatosReporteDto()

        datosReporteDto.nombreCompleto = student.name + " " + student.lastname
        datosReporteDto.identificaciob = student.nui.toString()
        datosReporteDto.nombreCarrera = studentView.carrera + " "
        datosReporteDto.nombreInstirucionBeneficiaria = practiceView.empresa + " "

        var simpleDateFormat = SimpleDateFormat("LLLL")
        var dateTime = simpleDateFormat.format(practiceView.startDate).toString()
        datosReporteDto.nombreMesTexto = dateTime.toString()

        datosReporteDto.inicioSemana = practiceView.startDate?.day.toString()
        datosReporteDto.finSemana = practiceView.endDate?.day.toString()




        return datosReporteDto
    }

    fun cargarDatosPracticas(idStudent: Long, idTutor: Long) {
        practiceRepository.findByStudentIdAndTutorId(idStudent, idTutor);
    }
}
