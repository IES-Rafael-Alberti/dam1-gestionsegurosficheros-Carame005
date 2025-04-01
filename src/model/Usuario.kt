package src.model

class Usuario(public val nombre : String, public var clave : String, public val perfil : Perfil) : IExportable {
    companion object{
        fun crearUsuario(datos : List<String>) : Usuario{
            val datosnombre = datos[0]
            val datosclave = datos[1]
            val datosperfil = datos[2]
            return Usuario(datosnombre,datosclave,datosperfil)
        }
    }

    fun cambiarClave(nuevaClaveEncriptada : String){
        clave = nuevaClaveEncriptada
    }

    override fun serializar(separador: String): String {
        return nombre.toString() + separador + clave + separador + perfil + separador
    }
}