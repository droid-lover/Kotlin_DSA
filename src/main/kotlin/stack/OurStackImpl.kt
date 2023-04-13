package stack

class OurStackImpl <T:Any> : OurStack<T>{

    private val storage = arrayListOf<T>()

    override fun toString() = buildString {
        appendLine("----Top----")
        storage.reversed().forEach {
            appendLine("$it")
        }
        appendLine("-----------")
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
       return if(storage.size == 0){
           null
       }else{
           storage.removeAt(storage.size-1)
       }
    }

    //10,20,30,40
    override fun peek(): T? {
        return storage[storage.size-1]
    }

    override fun size(): Int {
        return storage.size
    }

    override fun isEmpty(): Boolean {
        return storage.isEmpty()
    }
}




