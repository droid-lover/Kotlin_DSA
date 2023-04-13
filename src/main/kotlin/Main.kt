import stack.OurStackImpl

fun main(args: Array<String>) {
//10,20,30,40

    val stack = OurStackImpl<Int>()
    stack.push(10)
    stack.push(20)
    stack.push(30)
    stack.push(40)
    println(stack)
    println("Stack size currently is ${stack.size()}")
    val topElement = stack.peek()
    println("Top element is= $topElement")

    val removedElement = stack.pop()
    println("removedElement is $removedElement")
    println(stack)
    println("Stack size currently is ${stack.size()}")
    val topElementNow = stack.peek()
    println("Top element is= $topElementNow")



}