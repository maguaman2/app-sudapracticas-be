package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository

interface TutorRepository: JpaRepository<Tutor, Long?> {
    fun findById(id: Long?): Tutor?
}