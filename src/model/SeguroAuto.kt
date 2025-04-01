package src.model

class SeguroAuto : Seguro{

    var descripcion: String = ""
    var combustible: String = ""
    var tipoAuto : Auto = Auto.MOTO
    var tipoCobertura: String = ""
    var asistenciaCarretera: Boolean = true
    var numPartes: Int = 0

    companion object{
        private var numPolizasAuto : Int = 4000000
    }

    constructor(
        dniTitular : String,
        importe : Double,
        descripcion: String,
        combustible: String,
        tipoAuto : Auto,
        tipoCobertura: String,
        asistenciaCarretera: Boolean,
        numPartes: Int
    ) : super(++numPolizasAuto,dniTitular,importe){
        this.descripcion = descripcion
        this.combustible = combustible
        this.tipoAuto = tipoAuto
        this.tipoCobertura = tipoCobertura
        this.asistenciaCarretera = asistenciaCarretera
        this.numPartes = numPartes
    }

    private constructor(
        numPoliza : Int,
        dniTitular : String,
        importe : Double,
        descripcion: String,
        combustible: String,
        tipoAuto : Auto,
        tipoCobertura: String,
        asistenciaCarretera: Boolean,
        numPartes: Int
    ) : super(numPoliza,dniTitular,importe){
        this.descripcion = descripcion
        this.combustible = combustible
        this.tipoAuto = tipoAuto
        this.tipoCobertura = tipoCobertura
        this.asistenciaCarretera = asistenciaCarretera
        this.numPartes = numPartes
    }

    init {
        require(numPoliza > 400000)
    }

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        var importeAuto : Double = importe
        importeAuto *= interes
        return importeAuto
    }

    override fun tipoSeguro(): String {
        return this::class.simpleName ?: "Desconocido"
    }

    override fun serializar(separador : String): String {
        return super.toString() + descripcion.toString() + separador + combustible + separador + tipoAuto + separador + tipoCobertura + separador + asistenciaCarretera + separador + numPartes + separador + tipoSeguro()
    }
}