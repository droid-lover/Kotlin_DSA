import java.util.*

fun main(){
    println(isValid("[({})]"))
    println(isValid("()"))
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    val bracketsMap = hashMapOf(')' to '(' , '}' to '{' ,']' to '[')

    for(char in s){
        if(bracketsMap.contains(char)){
            // ) } ]
            if(!stack.isEmpty() && stack.peek() == bracketsMap.get(char) ){
                stack.pop()
            }else {
                return false
            }
        } else {
            // ( { [
            stack.push(char)
        }
    }

    return stack.isEmpty()











}