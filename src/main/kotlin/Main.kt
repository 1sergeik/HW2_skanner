import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    println("введите первое число")
    val a = input.nextInt()  //ввод первого числа
    println("введите второе число")
    val b = input.nextInt()  //ввод второго числа
    println("введите третье число")
    val c = input.nextInt()  //ввод третьего числа
    summa(a,b,c )
}
fun summa(a:Int, b:Int, c:Int) {
    println("сумма трех чисел составляет")
    println(a+b+c)   // суммирование и печать в консоль
}