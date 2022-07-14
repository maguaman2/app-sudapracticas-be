package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import net.magbdigital.sudapractic.model.for9
import org.springframework.data.jpa.repository.JpaRepository

interface For9Repository: JpaRepository<for9, Long?> {
    fun findById(id: Long?): for9?
}