package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Activity
import net.magbdigital.sudapractic.model.ActivityDetail
import net.magbdigital.sudapractic.model.ActivityDetailView
import net.magbdigital.sudapractic.model.PracticeView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ActivityDetailViewRepository: JpaRepository<ActivityDetailView, Long?> {
    fun findById(id: Long?): ActivityDetailView?
    @Query(nativeQuery = true)
    fun listDetailActivity (@Param("detailId") detailId:Long): List<ActivityDetailView>
    /*fun findByDetailActivity (@Param("detailId") detailId:Long): List<ActivityDetailView>*/


}