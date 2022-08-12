package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.ActivityDetail
import net.magbdigital.sudapractic.model.PracticeDetail
import net.magbdigital.sudapractic.model.PracticeView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface PracticeDetailRepository: JpaRepository<PracticeDetail, Long?> {
    fun findById(id: Long?): PracticeDetail?

    @Query(nativeQuery = true)
    fun listDetailByPractice (@Param("practiceId") practiceId:Long): List<PracticeDetail>

    fun findByPracticeId (@Param("practiceId") practiceId:Long): List<PracticeDetail>

    fun findByStudentIdAndTutorId(studentId: Long, tutorId: Long): PracticeDetail

}