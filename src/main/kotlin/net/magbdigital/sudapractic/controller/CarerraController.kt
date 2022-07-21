package net.magbdigital.sudapractic.controller
import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.service.CarreraService
import net.magbdigital.sudapractic.service.StudentService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carreras")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class CarerraController {
    @Autowired
    lateinit var carreraService: CarreraService

    @GetMapping
    fun list(): List<Carrera>{
        return carreraService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Carrera?{
        return carreraService.listById(id)
    }
    @GetMapping("/with/profesor")
    fun listPr(): List<CarreraView>{
        return carreraService.listProfesor()
    }


    @PostMapping
    fun save(@RequestBody carrera: Carrera):Carrera{
        return carreraService.save(carrera)
    }

    @PutMapping
    fun update(@RequestBody carrera: Carrera):Carrera{
        return carreraService.update(carrera)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return carreraService.delete(id)
    }
}