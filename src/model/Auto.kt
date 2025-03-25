package src.model

import src.model.Perfil.ADMIN
import src.model.Perfil.CONSULTA
import src.model.Perfil.GESTION

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