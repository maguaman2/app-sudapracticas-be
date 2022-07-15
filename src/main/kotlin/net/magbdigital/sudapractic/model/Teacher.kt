package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="teacher")
class Teacher {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name:String? = null
    var phone:String? = null
    var status: Boolean? = null
    @Column(name="career_id")
    var careerId: Long? = null

}