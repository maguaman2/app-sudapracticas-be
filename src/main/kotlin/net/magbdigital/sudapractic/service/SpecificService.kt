package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Specific
import net.magbdigital.sudapractic.repository.SpecificRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SpecificService {
    @Autowired
    lateinit var specificRepository: SpecificRepository

    fun list(): List<Specific> {

        return specificRepository.findAll()
    }
    fun listById (id:Long?): Specific?{
        return specificRepository.findById(id)
    }

    fun save(specific:Specific):Specific{
        specific.apply {
            status=true
        }
        return specificRepository.save(specific)
    }
    fun update(specific:Specific): Specific {
        val response =specificRepository.findById(specific.id)
        if (response==null){
            throw Exception()
        }else{
            return specificRepository.save(specific)
        }
    }

    fun delete(id:Long):Boolean{
        specificRepository.deleteById(id)
        return true
    }
}


