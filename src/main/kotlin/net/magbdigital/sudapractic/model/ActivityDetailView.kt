package net.magbdigital.sudapractic.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name="activity_detail_view")
class ActivityDetailView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name="activities_id")
    var activitiesId: Long? = null
    @Column(name="detail_id")
    var detailId: Long? = null
    var student:Long?=null
    var actividad: String? = null
}
