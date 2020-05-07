package Model

class Recipe {
    var receta = arrayOf<Array<String>>()

    fun showRecipe(){
        if (receta.size != 0) {
            for (a in receta) {
                for (value in a) {
                    print("$value ")
                }
                println()
            }
        }else println("No existe ninguna receta")
    }

    fun addToRecipe(quantity:Int,ingredient:String){
        for (i in receta.size..receta.size) {
            var a = arrayOf<String>()
            for (j in 0..1) {
                a = if (j == 0) a.plus(quantity.toString()) else a.plus(ingredient)
            }
            receta += a
        }
    }
}