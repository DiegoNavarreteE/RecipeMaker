package Model

interface IListActions {
    fun showList()
    fun indexIngredients():Int
    fun selectList(option:Int)
    fun addToIngredientList(quantity:Int)
    fun nameIngredient():String
}