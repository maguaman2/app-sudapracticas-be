package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.repository.CompanyRepository
import net.magbdigital.sudapractic.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService {
    @Autowired
    lateinit var companyRepository: CompanyRepository

    fun list(): List<Company> {

        return companyRepository.findAll()
    }

    fun save(company:Company):Company{
        company.apply {
            status=true
        }
        return companyRepository.save(company)
    }
}


