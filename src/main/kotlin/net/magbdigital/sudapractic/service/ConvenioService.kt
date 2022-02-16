package net.magbdigital.sudapractic.service
import net.magbdigital.sudapractic.model.Convenio
import net.magbdigital.sudapractic.repository.CarreraRepository
import net.magbdigital.sudapractic.repository.CompanyRepository
import net.magbdigital.sudapractic.repository.ConvenioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.system.exitProcess

@Service
class ConvenioService {

    @Autowired
    lateinit var  carreraRepository: CarreraRepository

    @Autowired
    lateinit var convenioRepository: ConvenioRepository

    @Autowired
    lateinit var companyRepository: CompanyRepository

    fun list(): List<Convenio> {
        return convenioRepository.findAll()
    }

    fun save(convenio: Convenio):Convenio{
        try {
            convenio.estado = true;
            carreraRepository.findById(convenio.carreraId) ?: throw Exception()
            companyRepository.findById(convenio.companyId) ?: throw Exception()
            return convenioRepository.save(convenio)
        }catch (e: Exception){
            throw Exception()
        }
    }

    fun update(convenio: Convenio):Convenio{
        val response =convenioRepository.findById(convenio.id) ?: throw Exception()

            return convenioRepository.save(response)
    }

    fun delete(id:Long):Boolean{
        convenioRepository.deleteById(id)
        return true
    }
}


