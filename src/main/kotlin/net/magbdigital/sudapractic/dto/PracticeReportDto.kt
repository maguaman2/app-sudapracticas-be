package net.magbdigital.sudapractic.dto

class PracticeReportDto (
    var startDate: String? = null,
    var endDate: String? = null,
    var studentName: String? = null,
    var studentNui: String? = null,
    var careerName: String? = null,
    var companyName: String? = null,
    var practiceDetails: List<PracticeDetailDto> = ArrayList()
)