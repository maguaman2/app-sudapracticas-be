package net.magbdigital.sudapractic.dto

class PracticeReportDto (
    var startDate: String? = "",
    var endDate: String? = "",
    var studentName: String? = "",
    var studentNui: String? = "",
    var careerName: String? = "",
    var companyName: String? = "",
    var practiceDetails: List<PracticeDetailDto> = ArrayList()
)