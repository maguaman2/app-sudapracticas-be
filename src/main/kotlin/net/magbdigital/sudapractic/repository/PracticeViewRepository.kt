package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Practice
import net.magbdigital.sudapractic.model.PracticeView
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface PracticeViewRepository: JpaRepository<PracticeView, Long?> {
    fun findById(id: Long?): PracticeView?
    @Query(nativeQuery = true)
    fun listPracticeByStudent (@Param("studentId") studentId:Long): List<PracticeView>

    fun findByStudentIdAndTutorId(studentId: Long, tutorId: Long): PracticeView
}