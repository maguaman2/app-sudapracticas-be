package net.magbdigital.sudapractic.service
import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.model.CarreraView
import net.magbdigital.sudapractic.model.actsoftware
import net.magbdigital.sudapractic.repository.ActsoftwareRepository
import net.magbdigital.sudapractic.repository.CarreraViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActsoftwareService {
    @Autowired
    lateinit var actsoftwareRepository: ActsoftwareRepository
    fun list(): List<actsoftware> {
        return actsoftwareRepository.findAll()
        //return carreraRepository.findAll()
    }
    fun listById (id:Long?): actsoftware?{
        return actsoftwareRepository.findById(id)
    }

    fun save(Actsoftware: actsoftware):actsoftware{
        return actsoftwareRepository.save(Actsoftware)
    }

    fun update(Actsoftware: actsoftware):actsoftware{
        val response =actsoftwareRepository.findById(Actsoftware.id)
        if (response==null){
            throw Exception()
        }else{
            return actsoftwareRepository.save(Actsoftware)
        }
    }

    fun delete(id:Long):Boolean{
        actsoftwareRepository.deleteById(id)
        return true
    }
}


