import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    println("введите первое число:")
    val a = input.nextInt()  //input first number
    println("введите второе число:")
    val b = input.nextInt()  //input second number
    println("введите третье число:")
    val c = input.nextInt()  //input third numbr
    summa(a,b,c )
}
fun summa(a:Int, b:Int, c:Int) {
    val summa_= a + b + c //calculate sum of three numbers
    println("Сумма чисел = $summa_")  //print sum of three numbers
}