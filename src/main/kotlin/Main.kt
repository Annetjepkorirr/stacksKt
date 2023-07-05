fun main() {
//    val myStack = Stack()
//    println(myStack.peek())
//    println(myStack.isEmpty())
//    myStack.push(34)
//    myStack.push(12)
//    println(myStack.peek())
//    myStack.push(3)
//    myStack.push(7)
//    myStack.pop()  //pop not only removes te item at the top but also return it
//    println(myStack.peek())
//    var x= myStack.pop()
//    var y = myStack.pop()
//    var z = x!!+y!!   //null operator //safe call
//    println(z)

//    println(reverseString("hello"))
    println(reverseWithStack("hello"))

}
//stack
class Stack(){
    var data = mutableListOf<Char>()  //CREATES A Mmutable list to hold the data

    fun push(value: Char){
        data.add(value)   //adding data to our stack
    }

    fun pop():Char?{    //pop removes the last index of a element//making it nullable...if our stack could be empty
        if (data.isEmpty()){
            return null
        }

        var top = data[data.lastIndex]      //accesing the last index
        data.removeAt(data.lastIndex)
        return top

    }
    fun peek():Int?{
        if (data.isEmpty()){
            return null
        }
        return data.lastIndex
    }

    fun isEmpty():Boolean {
            return data.isEmpty()

    }


}

//fun reverseString(str: String):String{  //how to reverse a string
//    var result  = mutableListOf<Char>()
//    for (i in str.lastIndex downTo  0) {
//        result.add(str[i])
//    }
//    return  result.joinToString("")
//}

// how to reverse a string using stack

fun  reverseWithStack(str: String):String{
    val stack = Stack()
    for (character in str){
        stack.push(character)
    }
    val result = mutableListOf<Char>()
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    return result.joinToString("")

}
//DataStructures
//Queue
//linked list