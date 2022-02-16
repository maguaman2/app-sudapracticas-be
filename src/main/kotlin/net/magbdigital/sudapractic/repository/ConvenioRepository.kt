package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Convenio
import org.springframework.data.jpa.repository.JpaRepository

interface ConvenioRepository: JpaRepository<Convenio, Long?> {
    fun findById(id: Long?): Convenio?
}