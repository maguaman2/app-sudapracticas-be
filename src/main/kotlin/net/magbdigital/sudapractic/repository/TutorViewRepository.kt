package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import net.magbdigital.sudapractic.model.TutorView
import org.springframework.data.jpa.repository.JpaRepository

interface TutorViewRepository: JpaRepository<TutorView, Long?> {
    fun findById(id: Long?): TutorView?
}