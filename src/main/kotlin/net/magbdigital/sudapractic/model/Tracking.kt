package net.magbdigital.sudapractic.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name="tracking")
class Tracking {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "visit_date")
    var visitDate:Date? = null
    var observations:String? = null
    @Column(name = "practice_id")
    var practiceId:Long? = null
    var status: Boolean? = null


}