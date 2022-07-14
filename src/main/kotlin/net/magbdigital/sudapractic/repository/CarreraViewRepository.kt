package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.model.CarreraView
import org.springframework.data.jpa.repository.JpaRepository


interface CarreraViewRepository: JpaRepository<CarreraView, Long?> {
    fun findById(id: Long?): CarreraView?
}