package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Activity
import net.magbdigital.sudapractic.model.ActivityDetail
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityDetailRepository: JpaRepository<ActivityDetail, Long?> {
    fun findById(id: Long?): ActivityDetail?
}