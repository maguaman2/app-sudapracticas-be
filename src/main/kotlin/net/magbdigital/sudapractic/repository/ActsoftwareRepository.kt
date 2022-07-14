package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.model.actsoftware
import org.springframework.data.jpa.repository.JpaRepository

interface ActsoftwareRepository: JpaRepository<actsoftware, Long?> {
    fun findById(id: Long?): actsoftware?
}