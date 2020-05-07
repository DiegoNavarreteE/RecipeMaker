package Model

abstract class Ingredient(){
    fun createList(listIngredients: ArrayList<String>){
        var indice = 0
        for ((index, f) in listIngredients.withIndex()) {
            indice = index
            println("${++indice}.- $f")
        }
        println("${++indice}.- Menú Anterior")
        println("${++indice}.- Salir")
    }
}