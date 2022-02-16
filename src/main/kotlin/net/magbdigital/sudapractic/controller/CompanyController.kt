package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.service.CompanyService
import net.magbdigital.sudapractic.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/companies")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class CompanyController {
    @Autowired
    lateinit var companyService: CompanyService

    @GetMapping
    fun list(): List<Company>{
        return companyService.list()
    }

    @PostMapping
    fun save(@RequestBody company:Company):Company{
        return companyService.save(company)
    }

    @PutMapping
    fun update(@RequestBody company: Company): Company {
        return companyService.save(company)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return companyService.delete(id)
    }
}