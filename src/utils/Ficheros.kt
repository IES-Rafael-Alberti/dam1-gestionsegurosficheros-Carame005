package src.utils

import src.model.IExportable

class Ficheros : IUtilFicheros {
    override fun leerArchivo(ruta: String): List<String> {
        TODO("Not yet implemented")
    }

    override fun agregarLinea(ruta: String, linea: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun <T : IExportable> escribirArchivo(
        ruta: String,
        elementos: List<T>
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun existeFichero(ruta: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun existeDirectorio(ruta: String): Boolean {
        TODO("Not yet implemented")
    }
}