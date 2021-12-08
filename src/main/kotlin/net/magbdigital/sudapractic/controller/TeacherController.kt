package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Teacher
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teachers")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class TeacherController {
    @Autowired
    lateinit var teacherService: TeacherService

    @GetMapping
    fun list(): List<Teacher>{
        return teacherService.list()
    }

    @PostMapping
    fun save(@RequestBody teacher:Teacher):Teacher{
        return teacherService.save(teacher)
    }
}