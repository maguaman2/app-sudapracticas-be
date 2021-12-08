package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long?> {
    fun findById(id: Long?): Student?
}