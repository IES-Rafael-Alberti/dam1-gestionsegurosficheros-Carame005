package src.data
import src.model.Seguro
import src.model.Usuario

class RepoSeguros(private val archivo: String, private val mapaSeguros: Map<String, (List<String>) -> Seguro>) : IRepoSeguros {
    private val seguros = mutableListOf<Seguro>()

    // Guardar un seguro en el fichero
     fun guardarSeguro(seguro: Seguro) {
        File(archivo).appendText(seguro.serializar() + "\n")
    }

    // Cargar todos los seguros del fichero
     fun cargarSeguros(): List<Seguro> {
        val seguros = mutableListOf<Seguro>()
        val file = File(archivo)

        if (!file.exists()) return seguros

        file.forEachLine { linea ->
            val datos = linea.split(";")
            val tipoSeguro = datos.last() // El último campo indica el tipo de seguro

            val seguro = mapaSeguros[tipoSeguro]?.invoke(datos.dropLast(1)) // Pasamos la lista de datos SIN el tipoSeguro
            if (seguro != null) {
                seguros.add(seguro)
            }
        }
        return seguros
    }

    override fun agregar(seguro: Seguro): Boolean {
        return seguros.add(seguro)
    }

    override fun buscar(numPoliza: Int): Seguro? {
        for(seguro in seguros){
            if (numPoliza == seguro.numPoliza){
                return seguro
            }
        }
        return null
    }

    override fun eliminar(seguro: Seguro): Boolean {
       return seguros.remove(seguro)
    }

    override fun eliminar(numPoliza: Int): Boolean {
        for(seguro in seguros){
            if (numPoliza == seguro.numPoliza){
                return seguros.remove(seguro)
            }
        }
        return false
    }

    override fun obtenerTodos(): List<Seguro> = seguros

    override fun obtener(tipoSeguro: String): List<Seguro> {
        val listaTipo = mutableListOf<Seguro>()
        for (seguro in seguros){
            if (seguro.tipoSeguro() == tipoSeguro){
                listaTipo.add(seguro)
            }
        }
        return listaTipo
    }
}