import Model.Cereal
import Model.Fruits
import Model.Recipe

fun main(args: Array<String>) {
    var i = 1
    val recipe = Recipe()
    mPrincipal@ do {
        println("""
            ***Bienvenidos a Recipe Maker***
               Selecccione una opción:
            1.- Hacer una receta
            2.- Ver mis recetas1
            3.- Salir
        """.trimIndent())
        val dataEntry = DataEntry(readLine())
        when (dataEntry.getOption()) {
            in 1..1 -> {
                i = 1
                iMenu@do {
                    makeRecipe()
                    val firstMenu = DataEntry(readLine())
                    val fruit = Fruits()
                    val cereal = Cereal()
                    when (firstMenu.getOption()) {
                        in 5..5 -> {
                            do{
                                fruit.showList()
                                val fruitOption = DataEntry(readLine())
                                val ind = fruit.indexIngredients()
                                val finalInd :Int = ind+2
                                fruit.selectList(fruitOption.getOption())
                                when(fruitOption.getOption()){
                                    in 1..(ind) -> {
                                        println("""
                                            Seleccione la cantidad que desea añadir de ${fruit.nameIngredient()}
                                        """.trimIndent())
                                        val quantity = DataEntry(readLine())
                                        fruit.addToIngredientList(quantity.getOption())
                                        recipe.addToRecipe(quantity.getOption(),fruit.nameIngredient())
                                    }
                                    in ind+1..ind+1 -> continue@iMenu
                                    in finalInd..finalInd -> continue@mPrincipal
                                    else -> println("Opción no válida")
                                }
                            }while (finalInd >= fruitOption.getOption())
                        }
                        in 6..6 -> {
                            do{
                                cereal.showList()
                                val cerealOption = DataEntry(readLine())
                                val ind = cereal.indexIngredients()
                                println(ind)
                                val finalInd :Int = ind+2
                                cereal.selectList(cerealOption.getOption())
                                when(cerealOption.getOption()){
                                    in 1..(ind) -> {
                                        println("""
                                            Seleccione la cantidad que desea añadir de ${cereal.nameIngredient()}
                                        """.trimIndent())
                                        val quantity = DataEntry(readLine())
                                        cereal.addToIngredientList(quantity.getOption())
                                    }
                                    in ind+1..ind+1 -> continue@iMenu
                                    in finalInd..finalInd -> continue@mPrincipal
                                    else -> println("Opción no válida")
                                }
                            }while (finalInd >= cerealOption.getOption())
                        }
                        in 9..9 -> continue@mPrincipal
                        in 10..10 -> i = 3
                        else -> println("Opción no existe o no configurada")
                    }
                } while (i != 3)
            }
            in 2..2 -> {
                i = 2
                do {
                    println("""
                                    ***Ver Receta***
                                      ***Receta***
                                
                            """.trimIndent())
                    recipe.showRecipe()
                    viewRecipe()
                    val secondMenu = DataEntry(readLine())
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
        
        2.- Menu Principal
        3.- Salir
    """.trimIndent())
}