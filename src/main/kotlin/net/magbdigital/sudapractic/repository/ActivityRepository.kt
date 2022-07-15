package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Activity
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityRepository: JpaRepository<Activity, Long?> {
    fun findById(id: Long?): Activity?
}