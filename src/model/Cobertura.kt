package src.model

import src.model.Perfil.ADMIN
import src.model.Perfil.CONSULTA
import src.model.Perfil.GESTION

enum class Cobertura {
    TERCEROS,
    TERCEROS_AMPLIADO,
    FRANQUICIA_200,
    FRANQUICIA_300,
    FRANQUICIA_400,
    FRANQUICIA_500,
    TODO_RIESGO;

    val desc = ("Terceros, Terceros +, Todo Riesgo con Franquicia de 200€, ... , Todo Riesgo")

    companion object {
        fun getCobertura(valor: String) : Cobertura{
            if (valor.lowercase() == "terceros_ampliado"){
                return TERCEROS_AMPLIADO
            }
            if (valor.lowercase() == "franquicia_200"){
                return FRANQUICIA_200
            }
            if (valor.lowercase() == "franquicia_300"){
                return FRANQUICIA_300
            }
            if (valor.lowercase() == "franquicia_400"){
                return FRANQUICIA_400
            }
            if (valor.lowercase() == "franquicia_500"){
                return FRANQUICIA_500
            }
            if (valor.lowercase() == "todo_riesgo"){
                return TODO_RIESGO
            }
            else{
                return TERCEROS
            }
        }
    }
}