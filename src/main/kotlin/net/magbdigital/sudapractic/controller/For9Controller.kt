package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.service.For9Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/formulario9")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class For9Controller {
    @Autowired
    lateinit var for9Service: For9Service

    @GetMapping
    fun list(): List<for9>{
        return for9Service.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): for9?{
        return for9Service.listById(id)
    }
    @GetMapping("/with/estudiante")
    fun listEstudiante(): List<for9View>{
        return for9Service.listEstudiante()
    }
    @PostMapping
    fun save(@RequestBody formulario9:for9):for9{
        return for9Service.save(formulario9)
    }
    @PutMapping
    fun update(@RequestBody formulario9:for9):for9 {
        return for9Service.save(formulario9)
    }


    @DeleteMapping("/delete/{id}")


    fun delete(@PathVariable("id") id:Long):Boolean{
        return for9Service.delete(id)
    }
}