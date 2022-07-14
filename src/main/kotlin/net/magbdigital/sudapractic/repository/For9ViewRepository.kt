package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.*
import org.springframework.data.jpa.repository.JpaRepository

interface For9ViewRepository: JpaRepository<for9View, Long?> {
    fun findById(id: Long?): for9View?
}