package net.magbdigital.sudapractic.controller
import net.magbdigital.sudapractic.model.Convenio
import net.magbdigital.sudapractic.service.ConvenioService


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/convenios")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class ConvenioController {
    @Autowired
    lateinit var convenioService: ConvenioService

    @GetMapping
    fun list(): List<Convenio>{
        return convenioService.list()
    }

    @PostMapping
    fun save(@RequestBody convenio: Convenio):Convenio{
        return convenioService.save(convenio)
    }

    @PutMapping
    fun update(@RequestBody convenio: Convenio):Convenio{
        return convenioService.save(convenio)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return convenioService.delete(id)
    }
}