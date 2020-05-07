import Model.Fruits

fun main(args: Array<String>) {

    val cant = 5;
    val fruit:Int = 7;

    val listFruitsString = arrayListOf<String>("Fresa","Platano","Uvas","Manzana","Naranja","Pero","Cereza")
    val listFinal = arrayOf("",cant)
    when(fruit) {
        in 1..7 -> {
            for ((index, f) in listFruitsString.withIndex()) {
                if (index.equals(fruit - 1) && (fruit > 0)) println("$f y la cantidad es: $cant")
            }
        }
        else -> println("Opcióon no válida")
    }
    val fruta = Fruits()
    fruta.showList()

    /*var cinema = arrayOf<Array<Int>>()

    for (i in 0..4) {
        var array = arrayOf<Int>()
        for (j in 0..1) {
            array += 0
        }
        cinema += array
    }

    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }*/

    var receta = arrayOf<Array<String>>()

    println(receta.size)

    receta.plus(arrayOf("0","Verde"))

    println(receta.size)

    for (i in 0..receta.size) {
        var a = arrayOf<String>()
        for (j in 0..1) {
            a = if (j == 0) a.plus("0") else a.plus("Arroz")
        }
        receta += a
    }

    for (a in receta) {
        for (value in a) {
            print("$value ")
        }
        println()
    }
    println(receta.size)

    for (i in receta.size..receta.size) {
        var a = arrayOf<String>()
        for (j in 0..1) {
            a = if (j == 0) a.plus("1") else a.plus("Cereal")
        }
        receta += a
    }
    //println(receta[2][0])
    for ((index,a) in receta.withIndex()) {
        print("$index ")
        for (value in a) {
            print("$value ")
        }
        println()
    }
    println(receta.size)
}