package net.magbdigital.sudapractic.controller
import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.service.ActsoftwareService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/actividadsoftware")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class ActsoftwareController {
    @Autowired
    lateinit var actsoftwareService: ActsoftwareService

    @GetMapping
    fun list(): List<actsoftware>{
        return actsoftwareService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): actsoftware?{
        return actsoftwareService.listById(id)
    }
    @PostMapping
    fun save(@RequestBody Actsoftware: actsoftware):actsoftware{
        return actsoftwareService.save(Actsoftware)
    }

    @PutMapping
    fun update(@RequestBody Actsoftware: actsoftware):actsoftware{
        return actsoftwareService.update(Actsoftware)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return actsoftwareService.delete(id)
    }
}