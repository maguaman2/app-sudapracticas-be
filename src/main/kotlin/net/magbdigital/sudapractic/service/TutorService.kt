package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import net.magbdigital.sudapractic.repository.StudentRepository
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
}


