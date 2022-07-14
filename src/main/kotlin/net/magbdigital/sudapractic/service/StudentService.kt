package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Teacher
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
    fun listById (id:Long?): Student?{
        return studentRepository.findById(id)
    }

    fun save(student:Student):Student{
        student.apply {
            status=true
        }
        return studentRepository.save(student)
    }
    fun update(student:Student):Student {
        val response =studentRepository.findById(student.id)
        if (response==null){
            throw Exception()
        }else{
            return studentRepository.save(student)
        }
    }

    fun delete(id:Long):Boolean{
        studentRepository.deleteById(id)
        return true
    }
}


