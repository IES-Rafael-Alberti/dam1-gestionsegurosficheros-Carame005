package src.data
import src.app.Seguro
interface IRepositorioSegurosFicheros {
    fun guardarSeguro(seguro: Seguro)
    fun cargarSeguros(): List<Seguro>
}