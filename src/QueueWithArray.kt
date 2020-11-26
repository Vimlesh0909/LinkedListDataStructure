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
    fun enqueue(value:Any?){
        if (isfull())return
        else
        {
            q[++rear]=value
        }
    }
    fun qequeue(){
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
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    println(queue.getFront())
    queue.qequeue()
    println(queue.getFront())
}