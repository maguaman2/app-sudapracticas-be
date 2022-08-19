package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.dto.PracticeDetailDto
import net.magbdigital.sudapractic.model.ActivityDetailView
import net.magbdigital.sudapractic.model.PracticeDetail
import net.magbdigital.sudapractic.repository.PracticeDetailRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.text.SimpleDateFormat

@Service
class PracticeDetailService {
    @Autowired
    lateinit var practiceDetailRepository: PracticeDetailRepository

    @Autowired
    lateinit var activityDetailService: ActivityDetailService
    fun list(): List<PracticeDetail> {
        return practiceDetailRepository.findAll()
    }

    fun listDetailByPractice (practiceId:Long): List<PracticeDetail>{
        return practiceDetailRepository.listDetailByPractice(practiceId)
    }
    fun listDetailByPracticeToDto (practiceId:Long): List<PracticeDetailDto>{
        val responseDetail =practiceDetailRepository.listDetailByPractice(practiceId)
        var simpleDateFormat = SimpleDateFormat("LLLL")
         simpleDateFormat = SimpleDateFormat("dd-MM-yyyy")


        val response = ArrayList<PracticeDetailDto>()


        responseDetail.map {
        val itemResponse  =PracticeDetailDto().apply {
            currentDate=simpleDateFormat.format(it.actualDate).toString()
            startTime=it.startTime.toString()
            endTime=it.endTime.toString()
            totalHours=it.totalHours.toString()
            observations=it.observations
            activityDetails=  activityDetailService.listActivitiesDetailFull(it.id!!)

        }
            response.add(itemResponse)
        }
        return response
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