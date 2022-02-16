package net.magbdigital.sudapractic.service
import net.magbdigital.sudapractic.model.Convenio
import net.magbdigital.sudapractic.repository.ConvenioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ConvenioService {
    @Autowired
    lateinit var convenioRepository: ConvenioRepository

    fun list(): List<Convenio> {
        return convenioRepository.findAll()
    }

    fun save(convenio: Convenio):Convenio{
        return convenioRepository.save(convenio)
    }

    fun update(convenio: Convenio):Convenio{
        val response =convenioRepository.findById(convenio.id)
        if (response==null){
            throw Exception()
        }else{
            return convenioRepository.save(convenio)
        }
    }

    fun delete(id:Long):Boolean{
        convenioRepository.deleteById(id)
        return true
    }
}


