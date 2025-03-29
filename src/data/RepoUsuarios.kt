package src.data

import src.model.Perfil
import src.model.Usuario

class RepoUsuarios : IRepoUsuarios {
    private val usuarios = mutableListOf<Usuario>()

    override fun agregar(usuario: Usuario): Boolean {
        return usuarios.add(usuario)
    }

    override fun buscar(nombreUsuario: String): Usuario? {
        for(usuario in usuarios){
            if (nombreUsuario == usuario.nombre){
                return usuario
            }
        }
        return null
    }

    override fun eliminar(usuario: Usuario): Boolean {
        return usuarios.remove(usuario)
    }

    override fun eliminar(nombreUsuario: String): Boolean {
        for(usuario in usuarios){
            if (nombreUsuario == usuario.nombre){
                return usuarios.remove(usuario)
            }
        }
        return false
    }

    override fun obtenerTodos(): List<Usuario> = usuarios

    override fun obtener(perfil: Perfil): List<Usuario>{
        val listaPerfil = mutableListOf<Usuario>()
        for (usuario in usuarios){
            if (usuario.perfil == perfil){
                listaPerfil.add(usuario)
            }
        }
        return listaPerfil
    }

    override fun cambiarClave(usuario: Usuario, nuevaClave: String): Boolean {
        usuario.clave = nuevaClave
        return true
    }
}