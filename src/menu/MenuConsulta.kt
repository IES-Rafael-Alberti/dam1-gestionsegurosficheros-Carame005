package src.menu

import src.utils.Utilidades

class MenuConsulta : Menu {
    override fun mostrarMenu() {
        println("1. Seguros")
        println("2. Salir")
        var opcion = Utilidades.pedirNumero("Elije una opcion")
        when(opcion){
            1->{
                println("1.Consultar")
                opcion = Utilidades.pedirNumero("Elije una opcion")
                when(opcion){
                    1->{
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