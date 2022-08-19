package net.magbdigital.sudapractic.dto

import net.magbdigital.sudapractic.model.ActivityDetailView
import java.util.Date

class PracticeDetailDto (
        var currentDate: String? = "",
        var startTime: String? = "",
        var endTime: String? = "",
        var totalHours: String? = "",
        var activityDetails: List<ActivityDetailView> = ArrayList(),
        var observations: String? = "",

)