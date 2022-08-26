package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Activity
import net.magbdigital.sudapractic.model.ActivityView
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityViewRepository: JpaRepository<ActivityView, Long?> {
    fun findById(id: Long?): ActivityView?

}