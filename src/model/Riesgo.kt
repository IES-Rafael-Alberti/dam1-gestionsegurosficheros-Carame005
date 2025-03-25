package src.model

import src.model.Perfil.ADMIN
import src.model.Perfil.CONSULTA
import src.model.Perfil.GESTION

enum class Riesgo {
    BAJO,
    MEDIO,
    ALTO;

    val interesAplicado : List<Double> = (2.0,5.0,10.0)

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