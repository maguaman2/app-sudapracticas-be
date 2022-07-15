package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="career")
class Carrera {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name:String? = null
    var coordinator:String? = null
    @Column(name="teacher_id")
    var teacherId: Long? = null
}