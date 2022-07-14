package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Teacher
import net.magbdigital.sudapractic.repository.StudentRepository
import net.magbdigital.sudapractic.repository.TeacherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TeacherService {
    @Autowired
    lateinit var teacherRepository: TeacherRepository

    fun list(): List<Teacher> {

        return teacherRepository.findAll()
    }
    fun listById (id:Long?): Teacher?{
        return teacherRepository.findById(id)
    }

    fun save(teacher:Teacher):Teacher{
        teacher.apply {
            status=true
        }
        return teacherRepository.save(teacher)
    }
    fun update(teacher:Teacher): Teacher {
        val response =teacherRepository.findById(teacher.id)
        if (response==null){
            throw Exception()
        }else{
            return teacherRepository.save(teacher)
        }
    }

    fun delete(id:Long):Boolean{
        teacherRepository.deleteById(id)
        return true
    }
}


