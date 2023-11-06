class ExtendedStack : ArrayList<Int>() {
    fun push(value: Int) {
        this.add(value)
    }
    fun pop(): Int {
        if (this.size > 0) {
            return super.removeAt(this.size - 1)
        } else {
            throw NoSuchElementException()
        }
    }
    fun add() {
        if (this.size >= 2) {
            val top1 = pop()
            val top2 = pop()
            push(top1 + top2)
        }
    }
    fun subtract() {
        if (this.size >= 2) {
            val top1 = pop()
            val top2 = pop()
            push(top2 - top1)
        }
}
    fun multiply() {
        if (this.size >= 2) {
            val top1 = pop()
            val top2 = pop()
            push(top1 * top2)
        }
    }
    fun divide() {
        if (this.size >= 2) {
            val top1 = pop()
            val top2 = pop()
            if (top1 != 0) {
                push(top2 / top1)
            } else {
                throw ArithmeticException("Division by zero")
            }
        }
    }
}
fun main() {
    val stack = ExtendedStack()
    stack.push(5)
    stack.push(3)
    // stack.add() // Результат: 5 + 3 = 8
   // stack.multiply() // Результат: 5 * 3 = 15
    stack.push(2)
    stack.push(0)
    // Деление на ноль, выбросит исключение: ArithmeticException
    println("Результат вычислений: ${stack.pop()}")
}
