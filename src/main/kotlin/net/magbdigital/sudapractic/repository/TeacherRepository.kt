package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Teacher
import net.magbdigital.sudapractic.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherRepository: JpaRepository<Teacher, Long?> {
    fun findById(id: Long?): Teacher?
}