package src.menu
import src.utils.Utilidades
import src.servicios.SeguroService
class MenuAdmin : Menu {
    override fun mostrarMenu() {
        println("1. Usuarios")
        println("2. Seguros")
        println("3. Salir")
        var opcion = Utilidades.pedirNumero("Elije una opcion")
        when(opcion){
            1->{
                println("1.Nuevo")
                println("2.Eliminar")
                println("3.Cambiar contraseña")
                opcion = Utilidades.pedirNumero("Elije una opcion")
            }
            2->{
                println("1.Contratar")
                println("2.Eliminar")
                println("3.Consultar")
                opcion = Utilidades.pedirNumero("Elije una opcion")
                when(opcion){
                    1->{
                        println("1.Hogar")
                        println("2.Auto")
                        println("3.Vida")
                        opcion = Utilidades.pedirNumero("Elije una opcion")
                    }
                    2->{

                    }
                    3->{
                        println("1.Todos")
                        println("2.Hogar")
                        println("3.Auto")
                        println("4.Vida")
                        opcion = Utilidades.pedirNumero("Elije una opcion")
                    }
                }
            }
            3->{
                return
            }
        }
    }
}