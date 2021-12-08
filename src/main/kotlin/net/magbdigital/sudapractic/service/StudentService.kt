package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {
    @Autowired
    lateinit var studentRepository: StudentRepository

    fun list(): List<Student> {

        return studentRepository.findAll()
    }

    fun save(student:Student):Student{
        student.apply {
            status=true
        }
        return studentRepository.save(student)
    }
}


