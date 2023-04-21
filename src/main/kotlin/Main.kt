fun main() {
    fibonacciSequence(15)
    sumNumber(10)
    factorial(16)

}
//Write a program in Kotlin that asks the user to enter a number n
//and then prints the first n numbers of the Fibonacci sequence.
fun fibonacciSequence(number:Int){
    var num = 0
    var num1 = 1
    for (i in 1..number) {
        print("$num ")
        val sum = num + num1
        num =num1
        num1 = sum
    }
    println(num1)

}
//Write a program in Kotlin that asks the user to enter a number n
//and then prints the sum of all even numbers between 1 and n.
fun sumNumber(num:Int){
    var total=0
    for (nums in 0..num){
        if (nums %2==0  ){
            total +=nums
        }
    }
    println(total)
}
//Write a program in Kotlin that asks the user to enter a number n and
//then calculates and prints the factorial of n.
fun factorial(num4:Int){
    var product = 1
    for(x in 1..num4){
        product*=x
    }
    println(product)
}
//Write a program in Kotlin that asks the user to enter a number n and then
//prints all prime numbers between 1 and n.
fun primeNumber(num7:Int){
    var prime = 1
    for(y in 1..num7){
        if(y%2==0)
            prime += y

    }
    println(prime)
}





