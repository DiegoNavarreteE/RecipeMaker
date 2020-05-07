package Model

class Fruits():Ingredient(),IListActions{
    private var quantity:Int = 0;
    private var ingredient:Int = 0;
    private var name:String = ""

    private val listFruitsString = arrayListOf<String>("Fresa","Platano","Uvas","Manzana","Naranja","Pero","Cereza")
    private var listFinal = arrayOf("",0)


    override fun showList() {
        println("""
                            ***Frutas***
        Selecciona la fruta que desee agreagar a la receta:
        """.trimIndent())
        createList(this.listFruitsString)
    }

    override fun addToIngredientList(quantity: Int) {
        this.listFinal = arrayOf(name,quantity)
        this.quantity = quantity
        println("Se ha agregado $quantity $name")
    }

    override fun selectList(ingredient: Int) {
        when(ingredient) {
            in 1..7 -> {
                for ((index, f) in listFruitsString.withIndex()) {
                    if (index.equals(ingredient - 1) && (ingredient > 0)) {
                        this.ingredient = ingredient
                        name = f
                        println("Ha seleccioado la fruta $f")
                    }
                }
            }
            else -> {
                println("Opcióon no válida")
                name = ""
            }
        }
    }

    override fun indexIngredients():Int {
        return listFruitsString.size
    }

    override fun nameIngredient(): String {
        return name
    }

}