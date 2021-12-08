package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.repository.PracticeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PracticeService {
    @Autowired
    lateinit var practiceRepository: PracticeRepository

    fun list(): List<Practice> {

        return practiceRepository.findAll()
    }

    fun save(practice:Practice):Practice{
        return practiceRepository.save(practice)
    }
}


