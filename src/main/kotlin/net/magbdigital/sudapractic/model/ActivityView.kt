package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="activity_view")
class ActivityView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var description:String? = null
    var observation:String?=null
    @Column(name="career_id")
    var careerId: Long? = null
    var carrera:String?=null


}