package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="student")
class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var nui:String? = null
    var name:String? = null
    var lastname:String? = null
    var email:String? = null
    var phone:String? = null
    var status: Boolean? = null


}