fun main(args: Array<String>) {
    var i:Int = 1
    mPrincipal@ do {
        println("""
            ***Bienvenidos a Recipe Maker***
               Selecccione una opción:
            1.- Hacer una receta
            2.- Ver mis recetas1
            3.- Salir
        """.trimIndent())
        var dataEntry = DataEntry(readLine())
        when (dataEntry.getOption()) {
            in 1..1 -> {
                i = 1;
                do {
                    makeRecipe()
                    var firstMenu = DataEntry(readLine())
                    when (firstMenu.getOption()) {
                        in 9..9 -> continue@mPrincipal
                        in 10..10 -> i = 3
                        else -> println("Opción no existe o no configurada")
                    }
                } while (i != 3)
            }
            in 2..2 -> {
                i = 2
                do {
                    viewRecipe()
                    var secondMenu = DataEntry(readLine())
                    when (secondMenu.getOption()) {
                        in 2..2 -> continue@mPrincipal
                        in 3..3 -> i=3
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
fun makeRecipe(){
    return println("""
                        ***Hacer receta***
        Selecciona por categoría el ingrediente que buscar:
        1.- Agua
        2.- Leche
        3.- Carne
        4.- Verduras
        5.- Frutas
        6.- Cereal
        7.- Huevos
        8.- Aceite
        9.- Menú Principal
        10.- Salir
    """.trimIndent())
}

fun viewRecipe(){
    return println("""
        ***Ver mis Recetas***
        2.- Menu Principal
        3.- Salir
    """.trimIndent())
}