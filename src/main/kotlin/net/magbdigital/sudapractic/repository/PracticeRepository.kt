package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.model.PracticeView
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.time.LocalDate
import java.util.*

interface PracticeRepository : JpaRepository<Practice, Long?> {
    fun findById(id: Long?): Practice?

    fun findByStudentIdAndTutorId(studentId: Long, tutorId: Long): Practice

}