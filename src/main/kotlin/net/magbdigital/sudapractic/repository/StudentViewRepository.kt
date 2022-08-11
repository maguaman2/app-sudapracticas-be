package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.PracticeView
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.StudentView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface StudentViewRepository: JpaRepository<StudentView, Long?> {
    fun findById(id: Long?): StudentView?
}