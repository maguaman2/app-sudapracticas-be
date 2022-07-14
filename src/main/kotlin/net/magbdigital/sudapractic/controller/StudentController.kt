package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class StudentController {
    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list(): List<Student>{
        return studentService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Student?{
        return studentService.listById(id)
    }


    @PostMapping
    fun save(@RequestBody student:Student):Student{
        return studentService.save(student)
    }
    @PutMapping
    fun update(@RequestBody student:Student):Student{
        return studentService.update(student)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return studentService.delete(id)
    }
}