package src.data
import src.model.Seguro
interface IRepositorioSegurosFicheros {
    fun guardarSeguro(seguro: Seguro)
    fun cargarSeguros(): List<Seguro>
}