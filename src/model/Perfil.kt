package src.model

enum class Perfil {
    ADMIN,
    CONSULTA,
    GESTION;
    
    companion object {
        fun getPerfil(valor: String) : Perfil{
            if (valor.lowercase() == "admin"){
                return ADMIN
            }
            if (valor.lowercase() == "gestion"){
                return GESTION
            }
            else{
                return CONSULTA
            }
        }
    }
}