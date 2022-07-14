package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Teacher
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teachers")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class TeacherController {
    @Autowired
    lateinit var teacherService: TeacherService

    @GetMapping
    fun list(): List<Teacher>{
        return teacherService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Teacher?{
        return teacherService.listById(id)
    }


    @PostMapping
    fun save(@RequestBody teacher:Teacher):Teacher{
        return teacherService.save(teacher)
    }
    @PutMapping
    fun update(@RequestBody teacher:Teacher): Teacher {
        return teacherService.save(teacher)
    }


    @DeleteMapping("/delete/{id}")


    fun delete(@PathVariable("id") id:Long):Boolean{
        return teacherService.delete(id)
    }
}