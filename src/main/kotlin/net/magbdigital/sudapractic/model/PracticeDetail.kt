package net.magbdigital.sudapractic.model

import java.sql.Time
import java.util.*
import javax.persistence.*

@Entity
@Table(name="practice_detail")
class PracticeDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name = "actual_date")
    var actualDate:Date? = null
    @Column(name = "start_time")
    var strartTime:Time?=null
    @Column(name = "end_time")
    var endTime:Time?=null
    @Column(name = "total_hours")
    var totalHours:Time?=null
    var observations:String? = null
    @Column(name = "activity_id")
    var activityId:Long? = null
    @Column(name = "practice_id")
    var practiceId:Long? = null
}