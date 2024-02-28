/**
 * A generic stack implementation.
 *
 * @param T the type of elements stored in the stack
 */
class Stack<T>{

    private val elements = mutableListOf<T>()

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top element of the stack, or `null` if the stack is empty
     */
    fun top(): T?{
        return if (!isEmpty()){
            elements[elements.size - 1]
        }else{
            null
        }
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param element the element to push onto the stack
     */
    fun push(element: T){
        elements.add(element)
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the top element of the stack, or `null` if the stack is empty
     */
    fun pop(): T?{
        return if(!isEmpty()){
            elements.removeAt(elements.size - 1)
        }else{
            null
        }
    }

    /**
     * Checks if the stack is empty.
     *
     * @return `true` if the stack is empty, `false` otherwise
     */
    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }


}

/**
 * Reverses the given list using a stack.
 *
 * @param list the list to be reversed
 * @return a new list containing the elements of the original list in reverse order
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


