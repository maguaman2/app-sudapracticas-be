package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.PracticeDetail
import org.springframework.data.jpa.repository.JpaRepository

interface PracticeDetailRepository: JpaRepository<PracticeDetail, Long?> {
    fun findById(id: Long?): PracticeDetail?
}