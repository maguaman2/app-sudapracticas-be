package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.PracticeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/practices")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class PracticeController {
    @Autowired
    lateinit var practiceService: PracticeService

    @GetMapping
    fun list(): List<Practice>{
        return practiceService.list()
    }

    @GetMapping("/{studentId}/student")
    fun listByStudent(@PathVariable("studentId") studentId: Long): List<Practice>{
        return practiceService.listByStudent (studentId)
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Practice?{
        return practiceService.listById(id)
    }
    @GetMapping("/with/estudiante")
    fun listEst(): List<PracticeView>{
        return practiceService.listEstudiante()
    }
    @PostMapping
    fun save(@RequestBody practice:Practice):Practice{
        return practiceService.save(practice)
    }
    @PutMapping
    fun update(@RequestBody practice:Practice):Practice {
        return practiceService.save(practice)
    }


    @DeleteMapping("/delete/{id}")


    fun delete(@PathVariable("id") id:Long):Boolean{
        return practiceService.delete(id)
    }
}