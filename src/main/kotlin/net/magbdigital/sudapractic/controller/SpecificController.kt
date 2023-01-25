package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Specific
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.SpecificService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/specifics")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class SpecificController {
    @Autowired
    lateinit var specificService: SpecificService

    @GetMapping
    fun list(): List<Specific>{
        return specificService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Specific?{
        return specificService.listById(id)
    }


    @PostMapping
    fun save(@RequestBody specific:Specific):Specific{
        return specificService.save(specific)
    }
    @PutMapping
    fun update(@RequestBody specific:Specific): Specific {
        return specificService.save(specific)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return specificService.delete(id)
    }
}