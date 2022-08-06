package net.magbdigital.sudapractic.service
import net.magbdigital.sudapractic.model.ActivityDetail
import net.magbdigital.sudapractic.model.ActivityDetailView
import net.magbdigital.sudapractic.repository.ActivityDetailRepository
import net.magbdigital.sudapractic.repository.ActivityDetailViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ActivityDetailService {
    @Autowired
    lateinit var activitydetailRepository: ActivityDetailRepository
    @Autowired
    lateinit var activityDetailViewRepository: ActivityDetailViewRepository


    fun list(): List<ActivityDetail> {
        return activitydetailRepository.findAll()
        //return carreraRepository.findAll()
    }
    fun listById (id:Long?): ActivityDetail?{
        return activitydetailRepository.findById(id)
    }

    fun listDetailId (detailId:Long): List<ActivityDetail>{
        return activitydetailRepository.listDetailId(detailId)
    }
    fun listActivitiesDetailFull (detailId:Long): List<ActivityDetailView>{
        return activityDetailViewRepository.listDetailActivity(detailId)
    }
    fun save(ActivityDetail: ActivityDetail):ActivityDetail{
        return activitydetailRepository.save(ActivityDetail)
    }

    fun update(ActivityDetail: ActivityDetail):ActivityDetail{
        val response =activitydetailRepository.findById(ActivityDetail.id)
        if (response==null){
            throw Exception()
        }else{
            return activitydetailRepository.save(ActivityDetail)
        }
    }

    fun delete(id:Long):Boolean{
        activitydetailRepository.deleteById(id)
        return true
    }
}


