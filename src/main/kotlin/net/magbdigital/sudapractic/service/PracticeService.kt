package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.model.PracticeView
import net.magbdigital.sudapractic.model.Teacher
import net.magbdigital.sudapractic.model.TutorView
import net.magbdigital.sudapractic.repository.PracticeRepository
import net.magbdigital.sudapractic.repository.PracticeViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PracticeService {
    @Autowired
    lateinit var practiceRepository: PracticeRepository
    lateinit var practiceViewRepository: PracticeViewRepository


    fun list(): List<Practice> {

        return practiceRepository.findAll()
    }
    fun listEstudiante(): List<PracticeView> {

        return practiceViewRepository.findAll()
    }

    fun listById (id:Long?): Practice?{
        return practiceRepository.findById(id)
    }

    fun save(practice:Practice):Practice{
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


