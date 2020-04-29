fun main(args: Array<String>) {
    var i:Int = 1
    mPrincipal@ do {
        println("""
            ***Bienvenidos a Recipe Maker***
               Selecccione una opción:
            1.- Hacer una receta
            2.- Ver mis recetas
            3.- Salir
        """.trimIndent())
        var dataEntry = DataEntry(readLine())
        when (dataEntry.getOption()) {
            in 1..1 -> {
                i = 1;
                do {
                    println(
                        """
                        ***Bienvenido a la creación de una receta***
                           Seleccione una opción: 
                        1.-Crear una receta
                        2.-Regresar al menú principal
                        3.-Salir
                    """.trimIndent())
                    var firstMenu = DataEntry(readLine())
                    when (firstMenu.getOption()) {
                        in 2..2 -> continue@mPrincipal
                        in 3..3 -> i = 3
                        else -> println("Opción no existe o no configurada")
                    }
                } while (i != 3)
            }
            in 2..2 -> {
                i = 2
                do {
                    println(
                        """
                    ***Bienvenido a la vista de una receta***
                       Seleccione una opción: 
                    1.-Buscar una receta
                    2.-Regresar al menú principal
                    3.-Salir
                    """.trimIndent()
                    )
                    var secondMenu = DataEntry(readLine())
                    when (secondMenu.getOption()) {
                        in 2..2 -> continue@mPrincipal
                        in 3..3 -> break@mPrincipal
                        else -> println("Opción no existe o no configurada")
                    }
                } while (i != 3)
            }
            in 3..3 -> {
                i = 3
                println(
                    """
                ***Gracias por usar nuestro servicio***
            """.trimIndent()
                )
            }
            in 0..0 -> println("No se permite valores nulos")
            else -> println("La opción no es válida")
        }
    }while(i!=3)
}