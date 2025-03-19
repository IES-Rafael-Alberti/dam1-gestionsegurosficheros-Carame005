package src.data
import src.aplicacion.Seguro
interface IRepositorioSegurosFicheros {
    fun guardarSeguro(seguro: Seguro)
    fun cargarSeguros(): List<Seguro>
}