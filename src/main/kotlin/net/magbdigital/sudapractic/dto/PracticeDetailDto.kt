package net.magbdigital.sudapractic.dto

import net.magbdigital.sudapractic.model.ActivityDetailView
import java.util.Date

class PracticeDetailDto (
        var currentDate: String? = null,
        var startTime: String? = null,
        var endTime: String? = null,
        var totalHours: Long? = null,
        var activityDetails: List<ActivityDetailView> = ArrayList(),
        var observations: String? = null,

)