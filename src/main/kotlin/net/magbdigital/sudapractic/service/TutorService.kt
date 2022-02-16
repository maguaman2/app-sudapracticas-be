package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Tutor
import net.magbdigital.sudapractic.repository.TutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TutorService {
    @Autowired
    lateinit var tutorRepository: TutorRepository

    fun list(): List<Tutor> {

        return tutorRepository.findAll()
    }

    fun save(tutor:Tutor):Tutor{
        tutor.apply {
            status=true
        }
        return tutorRepository.save(tutor)
    }

    fun update(tutor: Tutor):Tutor{
        val response =tutorRepository.findById(tutor.id)
        if (response==null){
            throw Exception()
        }else{
            return tutorRepository.save(tutor)
        }
    }

    fun delete(id:Long):Boolean{
        tutorRepository.deleteById(id)
        return true
    }
}


