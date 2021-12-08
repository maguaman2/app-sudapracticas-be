package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.TutorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tutors")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class TutorController {
    @Autowired
    lateinit var tutorService: TutorService

    @GetMapping
    fun list(): List<Tutor>{
        return tutorService.list()
    }

    @PostMapping
    fun save(@RequestBody tutor:Tutor):Tutor{
        return tutorService.save(tutor)
    }
}