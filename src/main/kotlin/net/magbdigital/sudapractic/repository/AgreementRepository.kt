package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Agreement
import org.springframework.data.jpa.repository.JpaRepository

interface AgreementRepository: JpaRepository<Agreement, Long?> {
    fun findById(id: Long?): Agreement?
}