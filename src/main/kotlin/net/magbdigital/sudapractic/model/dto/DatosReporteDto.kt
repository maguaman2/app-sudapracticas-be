package net.magbdigital.sudapractic.dto

import net.magbdigital.sudapractic.model.ActivityDetailView
import net.magbdigital.sudapractic.model.PracticeDetail

class DatosReporteDto {
    var nombreCompleto: String = ""
    var identificaciob: String = ""
    var nombreCarrera: String = ""
    var nombreInstirucionBeneficiaria: String = ""
    var numeroHoras: String = ""
    var inicioSemana: String = ""
    var finSemana: String = ""
    var nombreMesTexto: String = ""
    var anio: String = ""
    var detalleReporte: ArrayList<DetalleReporteDto> = ArrayList();
    var listActivities: List<ActivityDetailView> = ArrayList();
    var Actividades:ArrayList<actividadesDto> = ArrayList()


}