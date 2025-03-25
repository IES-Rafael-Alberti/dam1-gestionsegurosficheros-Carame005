package src.ui

import src.utils.Utilidades

class MenuGestion : IMenu {
    override fun mostrarMenu() {
        println("1. Seguros")
        println("2. Salir")
        var opcion = Utilidades.pedirNumero("Elije una opcion")
        when(opcion){
            1->{
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
            2->{
                return
            }
        }
    }
}
