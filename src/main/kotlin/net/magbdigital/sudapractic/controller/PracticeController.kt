package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.PracticeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/practices")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class PracticeController {
    @Autowired
    lateinit var practiceService: PracticeService

    @GetMapping
    fun list(): List<Practice>{
        return practiceService.list()
    }

    @PostMapping
    fun save(@RequestBody practice:Practice):Practice{
        return practiceService.save(practice)
    }
}