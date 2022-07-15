package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="tutor")
class Tutor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name:String? = null
    var email:String? = null
    var phone:String? = null
    var alternative:String? = null
    var status: Boolean? = null
    @Column(name="company_id")
    var companyId: Long? = null

}