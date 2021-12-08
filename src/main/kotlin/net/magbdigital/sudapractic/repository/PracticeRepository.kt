package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository

interface PracticeRepository: JpaRepository<Practice, Long?> {
    fun findById(id: Long?): Practice?
}