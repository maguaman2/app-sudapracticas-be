package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Activity
import net.magbdigital.sudapractic.model.ActivityDetail
import net.magbdigital.sudapractic.model.PracticeView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ActivityDetailRepository: JpaRepository<ActivityDetail, Long?> {
    fun findById(id: Long?): ActivityDetail?
    @Query(nativeQuery = true)
    fun listDetailId (@Param("detailId") detailId:Long): List<ActivityDetail>

}