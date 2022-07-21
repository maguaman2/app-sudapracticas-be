package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="activity_Detail")
class ActivityDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name="activity_id")
    var activityId: Long? = null
    @Column(name="detail_id")
    var detailId: Long? = null
}
