
fun main() {

    //********CODIGO DE PRUEBA********
    println("Código Prueba")
    println("-------------")
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)

    if (!listOf("four", "three", "two", "one").equals(numbersRev)) {
        println("Error")
    } else {
        println("Correcto")
    }

    println(numbersRev)
    println()

    //Realiza la misma prueba, pero con listas de otros tipos de datos...
    //por ejemplo una lista que combine valores numéricos Int, Float y Double

    //Otra con una lista de cualquier data class que te inventes.

    //Comprueba también si podemos hacerlo con una lista de tipos de datos distintos...
    //por ejemplo con una lista que contenga tipos de datos String, Int, Float, Usuario("Pepe", 30), Boolean...
    //¿Por qué es posible usarla si parece que la lista contiene tipos de datos diferentes?

    /*
    La podemos usar porque la función reverse y la clase Stack son genéricos es decir
    pueden ser utilizados por cualquier tipo de dato, por eso no hay ningún problema
    al crear una lista con distintos tipos de datos.
     */

 // ****************LISTA DE CUALQUIER VALOR NUMÉRICO************************************
    println("Lista de cualquier valor numérico")
    println("---------------------------------")
    val num = listOf(1.3333333333333333, 2, 3.0, -21, 5.05444444)
    val numRev = reverse(num)
    if (!listOf(5.05444444, -21, 3.0, 2, 1.3333333333333333).equals(numRev)) {
        println("Error")
    } else {
        println("Correcto")
    }

    println(numRev)
    println()

 // ****************LISTA DE UNA DATA CLASS************************************
    data class Book(val title: String, val tomo: Int)

    println("Lista de una data class")
    println("-----------------------")
    val books = listOf(
        Book("Hellsing (Edicion coleccionista)", 4),
        Book("Dragon Ball", 38),
        Book("Jujutsu Kaisen", 18),
        Book("Saint Young Men", 20)
    )

    val booksRev = reverse(books)

    if (!listOf(Book("Saint Young Men",20), Book("Jujutsu Kaisen", 18), Book("Dragon Ball", 38), Book("Hellsing (Edicion coleccionista)", 4)).equals(booksRev)) {
        println("Error")
    } else {
        println("Correcto")
    }

    println(booksRev)
    println()

 // ****************LISTA DE CUALQUIER TIPO DE DATO************************************

    println("Lista de cualquier tipo de dato")
    println("-------------------------------")
    val any = listOf(
        "Caballo",
        Book("Kaiju 8", 7),
        42224,
        98.9,
        true
    )

    val anyRev = reverse(any)

    if (!listOf(true, 98.9, 42224, Book("Kaiju 8", 7), "Caballo").equals(anyRev)) {
        println("Error")
    } else {
        println("Correcto")
    }

    println(anyRev)

}