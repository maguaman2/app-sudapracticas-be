package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.security.SecurityConfiguration
import net.magbdigital.sudapractic.util.EncryptPassword
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import java.util.ArrayList

@Service
class AppUserDetailsService : UserDetailsService{
    override fun loadUserByUsername(username: String?): UserDetails {

        val value = SecurityConfiguration().passwordEncoder()?.encode("admin")

        return User("root", value, ArrayList())
    }
}