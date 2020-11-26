class QueueWithLinkedList {
    var size=0
    var front:Qnode?=null
    var rear:Qnode?=null
    inner class Qnode(value: Any?){
        var next:Qnode?=null
        var data=value
    }
    fun isEmpty():Boolean=rear==null
    fun enQueue(value: Any?){
        var temp=Qnode(value)
        if(isEmpty())
        {
          this.rear=temp
          this.front=temp
        }
        else{
            this.rear?.next=temp
            rear=rear?.next
        }
    }
    fun deQueue(){
        if (isEmpty())
            return
        else {
            var temp=this.front
            this.front=this.front?.next
        }
        if(this.front==null)
            this.rear=null

    }
    fun getFront():Any?=this.front?.data
    fun getRear():Any?=this.rear?.data
}
fun main(){
    var queue=QueueWithLinkedList()
    queue.enQueue(1)
    queue.enQueue(2)
    queue.enQueue(3)
    queue.enQueue(4)
    println(queue.getFront())
    println(queue.getRear())
    queue.deQueue()
    println(queue.getFront())

}