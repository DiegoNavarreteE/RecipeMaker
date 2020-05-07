package Model

class Cereal:Ingredient(),IListActions{
    private var quantity:Int = 0
    private var ingredient:Int = 0
    private var name:String = ""

    private val listCerealString = arrayListOf("Avena","Trigo","Arroz","Maíz")
    private var listFinal = arrayOf("",0)


    override fun showList() {
        println("""
                            ***Cereales***
        Selecciona un tipo de cereal que desee agreagar a la receta:
        """.trimIndent())
        createList(this.listCerealString)
    }

    override fun addToIngredientList(quantity: Int) {
        this.listFinal = arrayOf(name,quantity)
        this.quantity = quantity
        println("Se ha agregado $quantity $name")
    }

    override fun selectList(ingredient: Int) {
        when(ingredient) {
            in 1..7 -> {
                for ((index, f) in listCerealString.withIndex()) {
                    if ((index == (ingredient - 1)) && (ingredient > 0)) {
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
        return listCerealString.size
    }

    override fun nameIngredient(): String {
        return name
    }
}