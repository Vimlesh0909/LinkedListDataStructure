

fun createLinkedList(){
    var head:Node?=Node(1)
    var first:Node?=Node(2)
    var second:Node?=Node(3)
    head?.next=first
    first?.next=second
    second?.next=null
    while(head!=null){
        println(head.toString())
        head=head.next

    }

}

fun main(){
//    createLinkedList()
    var l=MyLinkedList()
    l=l.createLinkedList(1,l)
   l= l.createLinkedList(2,l)
    l= l.createLinkedList(3,l)
    l=l.createLinkedList(4,l)
    l=l.createLinkedList(5,l)
    l=l.createLinkedList(6,l)
//    l=l.reverseLinkedList(l)
//    l.printLinkedList(l)
//   l= l.deleteAtIndex(2,l)
//
//    l.printLinkedList(l)
//    l=l.addAtIndex(5,0,l)
    l.printLinkedList(l)
//    l=l.reverseLinkedList(l)
//    l.printLinkedList(l)
//    println("lenght is${l.head?.let { l.getcountByRec(it) }}")
//    println(l.isElementPresent(21,l))
//    println(l.isElementPresentByRecur(l.head,11))
//    println(l.getMiddleNode(l.head)?.value)
//    println(l.getNoOfTimesGivenIntOccurs(l.head,2))
//    println(l.isLinkedListPalindrome(l.head))
//
    l=l.reverseLinkedListInGivenSizeGrups(l,3)
    l.printLinkedList(l)
}
