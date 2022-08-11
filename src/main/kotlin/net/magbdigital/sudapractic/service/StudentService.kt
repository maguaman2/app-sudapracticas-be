package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.dto.DatosReporteDto
import net.magbdigital.sudapractic.dto.DetalleReporteDto
import net.magbdigital.sudapractic.dto.actividadesDto
import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.repository.*
import org.hibernate.annotations.LazyToOne
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {
    @Autowired
    lateinit var studentRepository: StudentRepository
    @Autowired
    lateinit var practiceRepository: PracticeRepository
    @Autowired
    lateinit var practiceViewRepository: PracticeViewRepository
    @Autowired
    lateinit var studentViewRepository:StudentViewRepository

    @Autowired
    lateinit var detallePracticeRepository: PracticeDetailRepository
    @Autowired
    lateinit var actividadRepositoy:ActivityDetailViewRepository

    fun list(): List<Student> {

        return studentRepository.findAll()
    }
    fun listByEstudiante (): List<StudentView>{
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
        var practiceView:PracticeView=practiceViewRepository.findByStudentIdAndTutorId(idStudent,idTutor)
        var studentView:StudentView=studentViewRepository.findById(idStudent).get()
        var practiceDetail:PracticeDetail=detallePracticeRepository.findById(idStudent).get()
        var activityDetail:ActivityDetailView=actividadRepositoy.findById(idStudent).get()


        var datosReporteDto: DatosReporteDto = DatosReporteDto()

        datosReporteDto.nombreCompleto = student.name + " " + student.lastname
        datosReporteDto.identificaciob = student.nui.toString()
        datosReporteDto.nombreCarrera= studentView.carrera+" "
        datosReporteDto.nombreInstirucionBeneficiaria=practiceView.empresa+" "
        datosReporteDto.inicioSemana=practiceView.startDate.toString()
        datosReporteDto.finSemana=practiceView.endDate.toString()
        var detalleReporteDto:DetalleReporteDto=DetalleReporteDto()
        detalleReporteDto.horaEntrada=practiceDetail.startTime.toString()
        detalleReporteDto.horaSalida=practiceDetail.endTime.toString()
        detalleReporteDto.horaSalida=practiceDetail.observations+" "
        var ActividadesDto:actividadesDto=actividadesDto()
        ActividadesDto.nombreActividad=activityDetail.actividad+" "


        //cargar datos practica
        //var practice: Practice = practiceRepository.findByStudentIdAndTutorId(idStudent, idTutor)


        //var detailPractice = practice.id?.let { detallePracticeRepository.listDetailByPractice(it.toLong()) }


        return datosReporteDto
    }

    fun cargarDatosPracticas(idStudent: Long, idTutor: Long) {
        practiceRepository.findByStudentIdAndTutorId(idStudent, idTutor);
    }
}
