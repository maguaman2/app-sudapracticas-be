package net.magbdigital.sudapractic.controller

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tracking
import net.magbdigital.sudapractic.service.StudentService
import net.magbdigital.sudapractic.service.TrackingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/trackings")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class TrackingController {
    @Autowired
    lateinit var trackingService: TrackingService

    @GetMapping
    fun list(): List<Tracking>{
        return trackingService.list()
    }

    @PostMapping
    fun save(@RequestBody tracking:Tracking):Tracking{
        return trackingService.save(tracking)
    }
}