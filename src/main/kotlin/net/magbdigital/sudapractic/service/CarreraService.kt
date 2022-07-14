package net.magbdigital.sudapractic.service
import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.model.CarreraView
import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.TutorView
import net.magbdigital.sudapractic.repository.CarreraRepository
import net.magbdigital.sudapractic.repository.CarreraViewRepository
import net.magbdigital.sudapractic.repository.TutorViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarreraService {
    @Autowired
    lateinit var carreraRepository: CarreraRepository
    @Autowired
    lateinit var CarreraViewRepository: CarreraViewRepository


    fun list(): List<Carrera> {
        return carreraRepository.findAll()
        //return carreraRepository.findAll()
    }
    fun listById (id:Long?): Carrera?{
        return carreraRepository.findById(id)
    }


    fun save(carrera: Carrera):Carrera{
        return carreraRepository.save(carrera)
    }
    fun listProfesor(): List<CarreraView> {

        return CarreraViewRepository.findAll()
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


