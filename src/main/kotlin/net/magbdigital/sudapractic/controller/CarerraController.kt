package net.magbdigital.sudapractic.controller
import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.service.CarreraService
import net.magbdigital.sudapractic.service.StudentService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carreras")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class CarerraController {
    @Autowired
    lateinit var carreraService: CarreraService

    @GetMapping
    fun list(): List<Carrera>{
        return carreraService.list()
    }

    @PostMapping
    fun save(@RequestBody carrera: Carrera):Carrera{
        return carreraService.save(carrera)
    }

    @PutMapping
    fun update(@RequestBody carrera: Carrera):Carrera{
        return carreraService.save(carrera)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return carreraService.delete(id)
    }
}