fun main() {
    val numbers: Array<Int> = arrayOf(1, 43, -50, 4, -3, 49)
    var sum: Int = 0
    if (numbers.indexOfFirst { it < 0 } < numbers.indexOf(numbers.min())) {
        for (number in numbers) {
            if (numbers.indexOf(number) % 2 == 0) {
                sum += number
            } else {
                println("Нечётный индекс: $number")
            }
        }
    } else {
        for (number in numbers) {
            if (numbers.indexOf(number) % 2 != 0) {
                sum += number
            } else {
                println("Чётный индекс: $number")
            }
        }
    }
    println("Ответ: $sum")
}