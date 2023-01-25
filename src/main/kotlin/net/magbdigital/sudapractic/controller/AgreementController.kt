package net.magbdigital.sudapractic.controller
import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.service.AgreementService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/agreements")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class AgreementController {
    @Autowired
    lateinit var agreementService: AgreementService

    @GetMapping
    fun list(): List<Agreement>{
        return agreementService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Agreement?{
        return agreementService.listById(id)
    }

    @PostMapping
    fun save(@RequestBody agreement: Agreement):Agreement{
        return agreementService.save(agreement)
    }

    @PutMapping
    fun update(@RequestBody agreement: Agreement):Agreement{
        return agreementService.update(agreement)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return agreementService.delete(id)
    }
}