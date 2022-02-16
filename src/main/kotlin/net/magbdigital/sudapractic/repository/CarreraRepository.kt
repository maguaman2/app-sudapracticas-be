package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Carrera
import org.springframework.data.jpa.repository.JpaRepository

interface CarreraRepository: JpaRepository<Carrera, Long?> {
    fun findById(id: Long?): Carrera?
}