class QueueWithArray(capacity:Int) {
    var front=0
    var rear=-1
    var size=0
    var cap=capacity
    var q= arrayOfNulls<Any?>(cap)
    fun isfull():Boolean{
         return size==this.cap
    }
    fun isEmpty():Boolean{
        return front==-1
    }
    fun enQueue(value:Any?){
        if (isfull())return
        else
        {
            q[++rear]=value
        }
    }
    fun deQueue(){
        if (isEmpty())return
        else{
            q[++front]
        }
    }
 fun getFront():Any?{
     return if (isEmpty()) null else q[front]
 }
    fun getRear():Any?{
        return if (isEmpty()) null else q[rear]
    }
}

fun main(){
    var queue=QueueWithArray(100)
    queue.enQueue(1)
    queue.enQueue(2)
    queue.enQueue(3)
    queue.enQueue(4)
    println(queue.getFront())
    queue.deQueue()
    println(queue.getFront())
}