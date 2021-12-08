package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Tracking
import net.magbdigital.sudapractic.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository

interface TrackingRepository: JpaRepository<Tracking, Long?> {
    fun findById(id: Long?): Tracking?
}