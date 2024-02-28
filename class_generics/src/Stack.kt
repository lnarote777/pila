/**
 * Clase que implementa una pila genérica.
 * @param T el tipo de elementos contenidos en la pila.
 */
class Stack<T>{

    private val elements = mutableListOf<T>()

    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     * @return El elemento en la cima de la pila, o null si la pila está vacía.
     */
    fun top(): T?{
        return if (!isEmpty()){
            elements[elements.size - 1]
        }else{
            null
        }
    }

    /**
     * Agrega un elemento a la cima de la pila.
     * @param element El elemento a agregar.
     */
    fun push(element: T){
        elements.add(element)
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     * @return El elemento en la cima de la pila, o null si la pila está vacía.
     */
    fun pop(): T?{
        return if(!isEmpty()){
            elements.removeAt(elements.size - 1)
        }else{
            null
        }
    }

    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false de lo contrario.
     */
    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }


}

/**
 * Función para invertir una lista utilizando una pila.
 * @param list La lista a invertir.
 * @return Una lista con los elementos invertidos.
 */
fun <T> reverse(list: List<T>): MutableList<T> {
    val stack = Stack<T>()
    val reverse = mutableListOf<T>()

    for (element in list){
        stack.push(element)
    }

    while (!stack.isEmpty()){
        val element = stack.top()

        if (element != null) {
            reverse.add(element)
            stack.pop()
        }else{
            break
        }
    }

    return reverse

}


