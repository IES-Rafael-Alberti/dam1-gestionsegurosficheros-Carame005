package src.model

import src.model.Perfil.ADMIN

enum class Riesgo(interesAplicado : Double) {
    BAJO(2.0),
    MEDIO(5.0),
    ALTO(10.0);

    companion object {
        fun getRiesgo(valor: String) : Riesgo{
            if (valor.lowercase() == "bajo"){
                return BAJO
            }
            if (valor.lowercase() == "alto"){
                return ALTO
            }
            else{
                return MEDIO
            }
        }
    }
}