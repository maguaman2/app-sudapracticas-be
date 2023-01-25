package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Specific
import org.springframework.data.jpa.repository.JpaRepository

interface SpecificRepository: JpaRepository<Specific, Long?> {
    fun findById(id: Long?): Specific?


}