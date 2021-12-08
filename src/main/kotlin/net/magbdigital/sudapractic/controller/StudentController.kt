package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class StudentController {
    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list(): List<Student>{
        return studentService.list()
    }

    @PostMapping
    fun save(@RequestBody student:Student):Student{
        return studentService.save(student)
    }
}