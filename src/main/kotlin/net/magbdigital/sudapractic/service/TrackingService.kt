package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tracking
import net.magbdigital.sudapractic.repository.StudentRepository
import net.magbdigital.sudapractic.repository.TrackingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TrackingService {
    @Autowired
    lateinit var trackingRepository: TrackingRepository

    fun list(): List<Tracking> {

        return trackingRepository.findAll()
    }

    fun save(tracking:Tracking):Tracking{
        tracking.apply {
            status=true
        }
        return trackingRepository.save(tracking)
    }
}


