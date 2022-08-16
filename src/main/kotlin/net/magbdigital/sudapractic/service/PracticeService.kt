package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.dto.PracticeReportDto
import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.model.PracticeView
import net.magbdigital.sudapractic.repository.PracticeRepository
import net.magbdigital.sudapractic.repository.PracticeViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PracticeService {
    @Autowired
    lateinit var practiceRepository: PracticeRepository
    @Autowired
    lateinit var practiceViewRepository: PracticeViewRepository
    @Autowired
    lateinit var studentService: StudentService
    @Autowired
    lateinit var carreraService: CarreraService
    @Autowired
    lateinit var practiceDetailService: PracticeDetailService
    @Autowired
    lateinit var tutorService: TutorService
    @Autowired
    lateinit var companyService: CompanyService


    fun list(): List<Practice> {

        return practiceRepository.findAll()
    }
    fun listEstudiante(): List<PracticeView> {

        return practiceViewRepository.findAll()
    }

    fun listById (id:Long?): Practice?{
        return practiceRepository.findById(id)
    }
    fun listByStudent (studentId:Long): List<PracticeView>{
        return practiceViewRepository.listPracticeByStudent(studentId)
    }
    fun listPracticeFullData (practiceId:Long): PracticeReportDto{
        val response = PracticeReportDto()

        val practice =listById(practiceId)
        val student = studentService.listById(practice?.studentId)
        val career = carreraService.listById(student?.careerId)
        val tutor= tutorService.listById(practice?.tutorId)
        val company= companyService.listById(tutor?.companyId)

        response.apply {
            startDate=practice?.startDate.toString()
            endDate=practice?.endDate.toString()
            studentName=student?.name + ' ' +student?.lastname
            careerName=career?.name
            companyName=company?.name
            practiceDetails=practiceDetailService.listDetailByPracticeToDto(practiceId)
        }
        return response
    }


    fun save(practice:Practice):Practice{
        practice.apply { status=true }
        return practiceRepository.save(practice)
    }
    fun update(practice:Practice):Practice {
        val response =practiceRepository.findById(practice.id)
        if (response==null){
            throw Exception()
        }else{
            return practiceRepository.save(practice)
        }
    }

    fun delete(id:Long):Boolean{
        practiceRepository.deleteById(id)
        return true
    }
}


