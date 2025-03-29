package src.data
import src.model.Seguro
import src.model.Usuario

open class RepoSeguros(private val archivo: String, private val mapaSeguros: Map<String, (List<String>) -> Seguro>) : IRepoSeguros {
    private val seguros = mutableListOf<Seguro>()

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