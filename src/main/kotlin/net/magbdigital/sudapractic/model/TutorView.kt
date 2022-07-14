package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="tutor_view")
class TutorView {
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
    var empresa:String? = null

}