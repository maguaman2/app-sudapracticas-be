package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import net.magbdigital.sudapractic.model.TutorView
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.TutorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tutors")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class TutorController {
    @Autowired
    lateinit var tutorService: TutorService

    @GetMapping
    fun list(): List<Tutor>{
        return tutorService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Tutor?{
        return tutorService.listById(id)
    }
    @GetMapping("/with/empresa")
    fun listEmpresa(): List<TutorView>{
        return tutorService.listEmpresa()
    }

    @PostMapping
    fun save(@RequestBody tutor:Tutor):Tutor{
        return tutorService.save(tutor)
    }

    @PutMapping
    fun update(@RequestBody tutor: Tutor):Tutor{
        return tutorService.save(tutor)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return tutorService.delete(id)
    }
}