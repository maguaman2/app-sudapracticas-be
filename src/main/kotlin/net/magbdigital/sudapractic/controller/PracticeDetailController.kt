package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.service.PracticeDetailService
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.PracticeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/practicedetail")

@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class PracticeDetailController {
    @Autowired
    lateinit var practiceDetailService: PracticeDetailService

    @GetMapping
    fun list(): List<PracticeDetail>{
        return practiceDetailService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): PracticeDetail?{
        return practiceDetailService.listById(id)
    }
    @GetMapping("/{practiceId}/practice")
    fun listpractica(@PathVariable("practiceId") practiceId:Long): List<PracticeDetail>{
        return practiceDetailService.listDetailByPractice(practiceId)
    }

    @PostMapping
    fun save(@RequestBody practiceDetail: PracticeDetail):PracticeDetail{
        return practiceDetailService.save(practiceDetail)
    }
    @PutMapping
    fun update(@RequestBody practiceDetail: PracticeDetail):PracticeDetail {
        return practiceDetailService.save(practiceDetail)
    }


    @DeleteMapping("/delete/{id}")


    fun delete(@PathVariable("id") id:Long):Boolean{
        return practiceDetailService.delete(id)
    }
}