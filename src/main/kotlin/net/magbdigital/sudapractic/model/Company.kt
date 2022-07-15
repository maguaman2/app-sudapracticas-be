package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="company")
class Company {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name:String? = null
    var phone:String? = null
    var contact:String? = null
    var status: Boolean? = null
}