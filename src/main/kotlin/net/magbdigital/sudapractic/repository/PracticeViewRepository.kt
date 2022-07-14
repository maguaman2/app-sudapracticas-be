package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.model.PracticeView
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository

interface PracticeViewRepository: JpaRepository<PracticeView, Long?> {
    fun findById(id: Long?): PracticeView?
}