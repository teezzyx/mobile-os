import kotlin.math.ln

fun main() {
    print("Введите температуру, ᴼC: ")
    val temp = readln()
    val t : Double = temp.toDouble()
    print("Введите относительную влажность (0..1), %: ")
    val humidity = readln()
    val h : Double = humidity.toDouble()
    val a = 17.27
    val b = 237.7
    val lg : Double = ((a * t)/(b + t)) + ln(h)
    val res = (b * lg)/(a - lg)
    println("Ответ: $res")
}