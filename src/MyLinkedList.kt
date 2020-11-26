import java.util.*

class MyLinkedList {
    var head:Node?=null
    var tail:Node?=null
    var lengh=0
    inner class Node(value: Any?){
        var value=value
        var next:Node?=null
    }
    fun createLinkedList(value: Any?, myLinkedList: MyLinkedList):MyLinkedList{
var newNode=Node(value)
        if(myLinkedList.head==null)myLinkedList.head=newNode
        else{
var lastNode=myLinkedList.head
            while(lastNode?.next!=null){
                lastNode=lastNode?.next
            }
            lastNode?.next=newNode
        }
        return myLinkedList
    }
    fun printLinkedList(myLinkedList: MyLinkedList){
        var head=myLinkedList.head
        while (head!=null){
            println(head.value)
            head=head.next
        }
    }
    fun addAtHead(value: Any?){
        val newNode=Node(value)
        var h=head
        newNode.next=h
        head=newNode
        if(h==null)tail=newNode
        lengh++
    }
    fun addAtTail(value: Any?){
        val newNode=Node(value)
        var h=head
        while (h?.next!=null){
            h=h?.next
        }
        h=newNode
       newNode.next=null
        tail=newNode
        lengh++
    }
    fun addAtIndex(value: Any?, index: Int, myLinkedList: MyLinkedList):MyLinkedList{
        val newNode=Node(value)
        var h=myLinkedList.head
        var counter=0
//        if(index<0||index>lengh)return myLinkedList
        while (counter!=index){
            h=h?.next
            counter++
        }
       newNode.next=h?.next
        h?.next=newNode
        lengh++
        return myLinkedList
    }
fun deleteAtIndex(index: Int, myLinkedList: MyLinkedList):MyLinkedList{
    var curr=myLinkedList.head
    var pre=myLinkedList.head
    var counter=0
    while (index!=counter){
        pre=curr
        curr=pre?.next
        counter++
            }
    pre?.next=curr?.next

return myLinkedList
}
fun getlenght():Int{

    var counter=0
    while(head?.next!=null){
        counter++
    }
    return counter
}
fun reverseLinkedList(myLinkedList: MyLinkedList?):MyLinkedList{
    var current:Node?=myLinkedList?.head
    var pre:Node?=null
    var next: Node?
//    var l=getlenght()
    while(current?.next!=null){
        next= current.next
        current.next =pre
        pre=current
        current=next
    }
    current!!.next=pre
    pre=current
    myLinkedList?.head=pre
    return myLinkedList!!
}
fun getcountByRec(node: Node?): Int {
    if(node==null)return 0
    return 1+getcountByRec(node?.next)
}
fun isElementPresent(value: Any?, linkedList: MyLinkedList):Boolean{
    var h=linkedList.head
    while (h!!.next!=null){
        if(h.value==value)
            return true
        h=h.next
    }
    return false
}
fun isElementPresentByRecur(node: Node?, value: Any?):Boolean{
    if(node==null)
        return false
    if(node?.value==value)return true
    return isElementPresentByRecur(node?.next, value)
}
fun getMiddleNode(node: Node?):Node?{
    var slowPointer=node
    var fastPointer=node
    while (fastPointer?.next!=null){
        slowPointer=slowPointer?.next
        fastPointer=fastPointer.next?.next
    }
    return slowPointer
}
    fun getNoOfTimesGivenIntOccurs(node: Node?, n: Int):Int?{
        var head=node
       var count=0
        while(head!=null){
            if(head?.value==n)
                count++
            head=head?.next
        }
        return count
    }
    fun detectLoopIntheLinkedListAndReturnLengthOfLoop(node: Node?):Int{
        var slowPointer=node
        var fastPointer=node?.next
        var count=0
        if(node?.next==null)return 0
        while(slowPointer?.next!=fastPointer?.next)
        {
            slowPointer=slowPointer?.next
            fastPointer=fastPointer?.next?.next
        }
        slowPointer=node
        fastPointer=fastPointer?.next
        while (slowPointer?.next!=fastPointer?.next)
        {
            slowPointer=slowPointer?.next
            fastPointer=fastPointer?.next
        }
        fastPointer?.next=null
        while (slowPointer!=null){
            count++
            slowPointer=slowPointer.next
        }
        return count
    }
fun isLinkedListPalindrome(node: Node?):Boolean{
    var head=node
    var stack=Stack<Any?>()
    while(head!=null){
        stack.push(head?.value)
        head=head.next
    }
    head=node
    while(head!=null)
    {
        var i=stack.pop()
        if(head.value!=i)
            return false
        head=head.next
    }
    return true
}
    companion object{
        private lateinit var isInstance:MyLinkedList

        fun get():MyLinkedList{
         return if(::isInstance.isInitialized) isInstance else
              MyLinkedList()
        }
    }
   fun reverseLinkedListInGivenSizeGrups(myLinkedList: MyLinkedList?, size: Int):MyLinkedList{
       var current=myLinkedList?.head;
       var next:Node?=null
       var pre:Node?=null
       var counter=0
       var length=6
       var head=myLinkedList?.head;

main1@while (true){
       while (counter<=size){
          next=current?.next
           current?.next=pre
           pre=current
           current=next
           counter++
       }
if(length<counter){
    current?.next=pre
    pre=current
    myLinkedList?.head=pre
    break@main1
}
    else{
    length-=counter
    counter=0
    }
    pre=head
}



       //       head=myLinkedList?.head
return myLinkedList!!
   }

}