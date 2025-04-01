package src.service

import src.model.Auto
import src.model.Cobertura
import src.model.Riesgo
import src.model.Seguro
import src.model.SeguroAuto
import src.model.SeguroHogar
import src.model.SeguroVida
import java.time.LocalDate

class GestorSeguros : IServSeguros {
    override fun contratarSeguroHogar(
        dniTitular: String,
        importe: Double,
        metrosCuadrados: Int,
        valorContenido: Double,
        direccion: String,
        anioConstruccion: Int
    ): Boolean {
        return SeguroHogar(dniTitular,importe,metrosCuadrados,valorContenido,direccion,anioConstruccion)
    }

    override fun contratarSeguroAuto(
        dniTitular: String,
        importe: Double,
        descripcion: String,
        combustible: String,
        tipoAuto: Auto,
        cobertura: Cobertura,
        asistenciaCarretera: Boolean,
        numPartes: Int
    ): Boolean {
        return SeguroAuto(dniTitular,importe,descripcion,combustible,tipoAuto,cobertura,asistenciaCarretera,numPartes)
    }

    override fun contratarSeguroVida(
        dniTitular: String,
        importe: Double,
        fechaNacimiento: LocalDate,
        nivelRiesgo: Riesgo,
        indemnizacion: Double
    ): Boolean {
        return SeguroVida(dniTitular,importe,fechaNacimiento,nivelRiesgo,indemnizacion)
    }

    override fun eliminarSeguro(numPoliza: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun consultarTodos(): List<Seguro> {
        TODO("Not yet implemented")
    }

    override fun consultarPorTipo(tipoSeguro: String): List<Seguro> {
        TODO("Not yet implemented")
    }
}