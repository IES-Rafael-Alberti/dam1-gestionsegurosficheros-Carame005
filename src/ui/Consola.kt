package src.ui

import jdk.internal.org.jline.reader.EndOfFileException
import jdk.internal.org.jline.reader.LineReaderBuilder
import jdk.internal.org.jline.reader.UserInterruptException
import jdk.internal.org.jline.terminal.TerminalBuilder

class Consola : IEntradaSalida {
    override fun mostrar(msj: String, salto: Boolean, pausa: Boolean) {
        println(msj)
        if (salto == true){
            println("\n")
        }
        if (pausa == true){
            readln()
        }
    }

    override fun mostrarError(msj: String, pausa: Boolean) {
        println(msj)
        if(pausa == true){
            readln()
        }
    }

    override fun pedirInfo(msj: String): String {
        println(msj)
        return readln().toString()
    }

    override fun pedirInfo(
        msj: String,
        error: String,
        debeCumplir: (String) -> Boolean
    ): String {
        println(msj)
        var respuesta =  readln().toString()
        if (debeCumplir(respuesta)){
            return respuesta
        }
        else{
            println(error)
        }
        return respuesta
    }

    override fun pedirDouble(
        prompt: String,
        error: String,
        errorConv: String,
        debeCumplir: (Double) -> Boolean
    ): Double {
        val double = readln().toDoubleOrNull()
        require(double == Double?)
    }

    override fun pedirEntero(
        prompt: String,
        error: String,
        errorConv: String,
        debeCumplir: (Int) -> Boolean
    ): Int {
        return readln().toInt()
    }

    override fun pedirInfoOculta(prompt: String): String {
        return try {
            val terminal = TerminalBuilder.builder()
                .dumb(true) // Para entornos no interactivos como IDEs
                .build()

            val reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build()

            reader.readLine(prompt, '*') // Oculta la contraseña con '*'
        } catch (e: UserInterruptException) {
            mostrarError("Entrada cancelada por el usuario (Ctrl + C).", pausa = false)
            ""
        } catch (e: EndOfFileException) {
            mostrarError("Se alcanzó el final del archivo (EOF ó Ctrl+D).", pausa = false)
            ""
        } catch (e: Exception) {
            mostrarError("Problema al leer la contraseña: ${e.message}", pausa = false)
            ""
        }
    }

    override fun pausar(msj: String) {
        println(msj)
        readln()
    }

    override fun limpiarPantalla(numSaltos: Int) {
        if (System.console() != null) {
            mostrar("\u001b[H\u001b[2J", false)
            System.out.flush()
        } else {
            repeat(numSaltos) {
                mostrar("")
            }
        }
    }

    override fun preguntar(mensaje: String): Boolean {
        println(mensaje)
        var respuesta = readln().toString()
        while (respuesta.lowercase() != "s" || respuesta.lowercase() != "n"){
            println("Escriba una respuesta valida")
            respuesta = readln().toString()
        }
        return true
    }
}