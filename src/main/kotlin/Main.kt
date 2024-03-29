import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    println("введите первое число")
    val a = input.nextInt()  //ввод первого числа
    println("введите второе число")
    val b = input.nextInt()
    println("введите третье число")
    val c = input.nextInt()
    summa(a,b,c )
}
fun summa(a:Int, b:Int, c:Int) {
    println("сумма трех чисел составляет")
    println(a+b+c)
}