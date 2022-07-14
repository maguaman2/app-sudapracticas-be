package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.model.PracticeView
import net.magbdigital.sudapractic.model.for9
import net.magbdigital.sudapractic.model.for9View
import net.magbdigital.sudapractic.repository.For9Repository
import net.magbdigital.sudapractic.repository.For9ViewRepository
import net.magbdigital.sudapractic.repository.PracticeViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class For9Service {
    @Autowired
    lateinit var for9Repository: For9Repository
    lateinit var for9ViewRepository: For9ViewRepository


    fun list(): List<for9> {

        return for9Repository.findAll()
    }
    fun listEstudiante(): List<for9View> {

        return for9ViewRepository.findAll()
    }

    fun listById (id:Long?): for9?{
        return for9Repository.findById(id)
    }

    fun save(formulario9: for9): for9 {
        return for9Repository.save(formulario9)
    }
    fun update(formulario9: for9): for9 {
        val response =for9Repository.findById(formulario9.id)
        if (response==null){
            throw Exception()
        }else{
            return for9Repository.save(formulario9)
        }
    }

    fun delete(id:Long):Boolean{
        for9Repository.deleteById(id)
        return true
    }
}


