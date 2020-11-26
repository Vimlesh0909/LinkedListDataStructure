class StackWithLinkedList {
    var rootnode:Node?=null
    inner class Node(value:Any?){
        var next:Node?=null
        var data:Any?=value
    }
    fun isEmpty():Boolean{
        return rootnode==null
    }

    fun push(value: Any?){
        var newNode:Node?=Node(value)
        if (rootnode==null)
            rootnode=newNode
else
        {
            var temp=rootnode
            rootnode=newNode
            newNode?.next=temp
        }
    }
    fun pop():Any?{
        var popped=Integer.MIN_VALUE
        //underflow case
        if (rootnode==null)
           println("no element")
        else
        {  popped = rootnode!!.data as Int
          rootnode=rootnode?.next}
                  return popped
    }

    fun peek():Any?{
        if (rootnode==null)
            return null
        else
            return rootnode?.data
    }
}

fun main(){
    var stack=StackWithLinkedList()
    stack.push(1)
    stack.push(2)
    stack.push(33)
    stack.push(44)
    stack.push(55)
    println(stack.peek())
    println(stack.pop())
    println(stack.peek())
}