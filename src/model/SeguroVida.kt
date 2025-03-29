package src.model
import java.time.LocalDate

class SeguroVida(numPoliza: Int, dniTitular: String, importe : Double, val fechaNac: String, val nivelRiesgo: Riesgo, val indemnizacion: Double ) : Seguro(numPoliza,dniTitular,importe) {

    init {
        require(numPoliza > 800000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        var importeVida : Double = importe
        importeVida *= interes
        return importeVida
    }

    override fun tipoSeguro(): String {
        return this::class.simpleName ?: "Desconocido"
    }

    override fun serializar(separador : String): String {
        return super.toString()+ separador + fechaNac + separador + nivelRiesgo + separador + indemnizacion + separador + tipoSeguro()
    }
}