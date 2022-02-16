package net.magbdigital.sudapractic.service
import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.repository.CarreraRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarreraService {
    @Autowired
    lateinit var carreraRepository: CarreraRepository

    fun list(): List<Carrera> {
        return carreraRepository.findAll()
        //return carreraRepository.findAll()
    }

    fun save(carrera: Carrera):Carrera{
        return carreraRepository.save(carrera)
    }

    fun update(carrera: Carrera):Carrera{
        val response =carreraRepository.findById(carrera.id)
        if (response==null){
            throw Exception()
        }else{
            return carreraRepository.save(carrera)
        }
    }

    fun delete(id:Long):Boolean{
        carreraRepository.deleteById(id)
        return true
    }
}


