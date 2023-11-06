class Person(val name: String, val surname: String, var qualification: Int = 1) {
    fun getInfo(): String {
        return "Имя: $name, Фамилия: $surname, Квалификация: $qualification"
    }
    operator fun component1() = name
    operator fun component2() = surname

    fun sayGoodbye() {
        println("До свидания, мистер $name $surname")
    }
}
fun main() {
    val person1 = Person("Иван", "Иванов", 3)
    val person2 = Person("Петр", "Петров", 2)
    val person3 = Person("Анна", "Сидорова")
    println("Информация о сотрудниках:")
    println(person1.getInfo())
    println(person2.getInfo())
    println(person3.getInfo())
    val weakestLink = if (person1.qualification <= person2.qualification && person1.qualification <= person3.qualification) {
        person1
    } else if (person2.qualification <= person1.qualification && person2.qualification <= person3.qualification) {
        person2
    } else {
        person3
    }
    weakestLink.sayGoodbye()
}
