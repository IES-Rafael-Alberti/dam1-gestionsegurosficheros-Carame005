package src.model

class Usuario(public val nombre : String, public val clave : Int, public val perfil : String) : IExportable {
    companion object{
        fun crearUsuario(datos){
            return Usuario(datos)
        }
    }

    fun cambiarClave(){

    }

    override fun serializar(separador: String): String {
        TODO("Not yet implemented")
    }
}