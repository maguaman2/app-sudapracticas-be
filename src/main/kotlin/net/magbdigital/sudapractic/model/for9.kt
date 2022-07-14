package net.magbdigital.sudapractic.model

import java.sql.Time
import java.util.*
import javax.persistence.*

@Entity
@Table(name="formulary")
class for9 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var activities:String? = null
    @Column(name = "dates")
    var dates:Date? = null
    @Column(name = "start_hours")
    var startHours:Time?=null
    @Column(name = "end_hours")
    var endHours:Time?=null

    var observations:String? = null

    @Column(name = "student_id")
    var studentId:Long? = null

    @Column(name = "tutor_id")
    var tutorId:Long? = null

    @Column(name = "teacher_id")
    var teacherId:Long? = null

    var status: Boolean? = null

}