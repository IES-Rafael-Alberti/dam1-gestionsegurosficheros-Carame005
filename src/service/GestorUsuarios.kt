package src.service

import src.model.Perfil
import src.model.Usuario

class GestorUsuarios : IServUsuarios {
    override fun iniciarSesion(nombre: String, clave: String): Perfil? {
        TODO("Not yet implemented")
    }

    override fun agregarUsuario(nombre: String, clave: String, perfil: Perfil): Boolean {
        return Usuario(nombre,clave,perfil)
    }

    override fun eliminarUsuario(nombre: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun cambiarClave(usuario: Usuario, nuevaClave: String): Boolean {
        usuario.clave = nuevaClave
        return true
    }

    override fun buscarUsuario(nombre: String): Usuario? {
        TODO("Not yet implemented")
    }

    override fun consultarTodos(): List<Usuario> {
        TODO("Not yet implemented")
    }

    override fun consultarPorPerfil(perfil: Perfil): List<Usuario> {
        TODO("Not yet implemented")
    }
}