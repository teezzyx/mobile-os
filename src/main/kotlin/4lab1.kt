class MoneyBox {
    var money: Int = 0
    var capacity: Int = 1000
    fun PrintCurrentMoney()
    { println("Количество монет в копилке: $money") }
    fun AddMoney()
    {
        println("Введите количество монет, которое вы хотите добавить в копилку: ")
        val add = readln()
        if (money+add.toInt()<capacity)
        { money += add.toInt() }
        else { println("Не вмещается!") }
    }
    fun CheckCapacity() {
        println("Вместимость копилки: $capacity")
        println("Введите количество монет, которое вы хотите добавить в копилку: ")
        val addcheck = readln()
        if (money + addcheck.toInt() < capacity) {
            println("Можно добавить!")
        }
        else {println("Нельзя добавить!")
        }
    }
}
fun main() {
    var k: Int
    val a = MoneyBox()
do {
    println("1. Вывести количество монет в копилке.")
    println("2. Добавить монеты в копилку.")
    println("3. Проверка вместимости копилки.")
    println("4. Выход.")
    k = readln().toInt()
    when (k) {
        1 -> a.PrintCurrentMoney()
        2 -> a.AddMoney()
        3 -> a.CheckCapacity()
    }
} while (k!=4)
}