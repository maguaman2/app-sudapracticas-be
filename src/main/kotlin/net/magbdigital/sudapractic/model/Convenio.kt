package net.magbdigital.sudapractic.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name="convenio")
class Convenio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var tipo:String? = null
    @Column(name="fecha_firma")
    var fechaFirma:Date? = null

    @Column(name="fecha_vencimiento")
    var fechaVencimiento:Date? = null
    var estado:Boolean? = null

    @Column(name="carrera_id")
    var carreraId: Long? = null

    @Column(name="company_id")
    var companyId: Long? = null
}