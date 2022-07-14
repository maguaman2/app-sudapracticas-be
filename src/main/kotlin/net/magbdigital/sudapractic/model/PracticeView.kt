package net.magbdigital.sudapractic.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name="practice")
class PracticeView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var activities:String? = null
    @Column(name = "start_date")
    var startDate:Date? = null

    var hours:Long? = null

    @Column(name = "end_date")
    var endDate:Date? = null

    var observations:String? = null

    @Column(name = "student_id")
    var studentId:Long? = null
    var student:String?=null

    @Column(name = "tutor_id")
    var tutorId:Long? = null
    var tutor:String?=null

    @Column(name = "teacher_id")
    var teacherId:Long? = null
    var teacher:String?=null

    var status: Boolean? = null

}