package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="actsoftware")
class actsoftware {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var actividad:String? = null
}