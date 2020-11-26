class CircularQueueWithArray(s:Int) {
    var front=-1
    var rear=-1
    var size=0

    init {
        size=s

    }
    var qArray= arrayOfNulls<Int>(size)
    fun isEmpty():Boolean=front==-1
    fun isFull():Boolean {
       return rear==size-1 && front==0||rear==(front-1)%(size-1)
    }
    fun enQueue(value:Int){
        if (isEmpty())
        {
            front=0
            rear=0
            qArray[rear]=value
        }
        else if(isFull()){
            print("queue is full")
        }
        else{
            qArray[++rear]=value
        }
    }
fun deQueue(){
    if (isEmpty())
    {
        print("queue is empty")
    }
    else {
        var temp=qArray[front++]
    }
}
   fun getFront()=if (isEmpty())-1 else qArray[front]
}
fun main(){
    var cirQ=CircularQueueWithArray(10)
    cirQ.enQueue(1)
    cirQ.enQueue(2)
    cirQ.enQueue(3)
    println(cirQ.getFront())
    cirQ.deQueue()
    println(cirQ.getFront())
}