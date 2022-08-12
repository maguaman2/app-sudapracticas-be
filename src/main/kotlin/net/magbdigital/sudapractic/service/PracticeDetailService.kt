package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.PracticeDetail
import net.magbdigital.sudapractic.repository.PracticeDetailRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PracticeDetailService {
    @Autowired
    lateinit var practiceDetailRepository: PracticeDetailRepository

    fun list(): List<PracticeDetail> {
        return practiceDetailRepository.findAll()
    }

    fun listDetailByPractice (practiceId:Long): List<PracticeDetail>{
        return practiceDetailRepository.listDetailByPractice(practiceId)
    }

    fun listById (id:Long?): PracticeDetail?{
        return practiceDetailRepository.findById(id)
    }

    fun save(practiceDetail: PracticeDetail): PracticeDetail {
        return practiceDetailRepository.save(practiceDetail)
    }

    fun update(practiceDetail: PracticeDetail): PracticeDetail {
        val response =practiceDetailRepository.findById(practiceDetail.id)
        if (response==null){
            throw Exception()
        }else{
            return practiceDetailRepository.save(practiceDetail)
        }
    }

    fun delete(id:Long):Boolean{
        practiceDetailRepository.deleteById(id)
        return true
    }
}