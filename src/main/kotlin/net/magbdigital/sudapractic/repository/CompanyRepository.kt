package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository: JpaRepository<Company, Long?> {
    fun findById(id: Long?): Company?
}