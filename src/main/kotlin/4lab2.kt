class Queue<T> {
    private val queue = mutableListOf<T>()
    // Возвращает размер очереди
    fun size(): Int {
        return queue.size
    }
    // Проверяет, пуста ли очередь
    fun is_empty(): Boolean {
        return queue.isEmpty()
    }
    // Добавляет элемент в конец очереди
    fun add(element: T) {
        queue.add(element)
    }
    // Вытаскивает элемент из начала очереди и возвращает его
    fun pop(): T? {
        if (queue.isEmpty()) {
            return null // Если очередь пуста, возвращаем null
        }
        return queue.removeAt(0)
    }
}
fun main() {
    val q = Queue<Int>()
    q.add(1)
    q.add(2)
    q.add(3)
    println("Размер очереди: ${q.size()}")
    println("Пуста ли очередь: ${q.is_empty()}")
    val firstElement = q.pop()
    println("Первый элемент из очереди: $firstElement")
    println("Размер очереди после извлечения элемента: ${q.size()}")
}