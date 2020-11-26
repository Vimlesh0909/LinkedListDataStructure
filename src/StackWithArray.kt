class StackWithArray( no:Int) {
    val MAXLENGTH=100
    var a= arrayOfNulls<Int>(MAXLENGTH)
    var top=-1
init {
    top=no
}
    fun isEmpty():Boolean{
      return top<0
    }
fun push(no: Int){
    if (top>MAXLENGTH)
        println("stack is overlflow")
    else{
        a[++top]=no
    }
}
    fun pop():Int{
        if(top>0)
        {  println("stack is underflow")
            return 0}
        else
            return a[top--]!!
    }
    fun peek():Int{
        if (isEmpty())
            return 0
        else
            return a[top]!!

    }

}
fun main(){
    var stack=StackWithArray(-1)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    println(stack.peek())


}