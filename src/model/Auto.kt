package src.model
enum class Auto {
    COCHE,
    MOTO,
    CAMION;

    companion object {
        fun getAuto(valor: String) : Auto{
            if (valor.lowercase() == "moto"){
                return MOTO
            }
            if (valor.lowercase() == "camion"){
                return CAMION
            }
            else{
                return COCHE
            }
        }
    }
}