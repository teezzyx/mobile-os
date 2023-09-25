fun main(){
    val table = Array(2) { Array(2) { 0 } }
    table[0] = arrayOf(150, 140, 135, 180, 202, 250)
    table[1] = arrayOf(27, 25, 24, 32, 40, 56 )
    val min = 1000;
    var minsotr = min;
    var pob1 = 0;
    var pob2 = 0;
    var pob3 = 0;

    table[1].forEachIndexed { index, element ->
        if (element<30)
        {
            if (table[0][index]<=minsotr)
            {
                minsotr=table[0][index]
                pob1 = index
            }
        }
        else if (element in 31..49) {
            if (table[0][index] <= minsotr) {
                minsotr = table[0][index]
                pob2 = index
            }
        }
        else {
                if (table[0][index] <= minsotr) {
                    minsotr = table[0][index]
                    pob3 = index
                }
            }
        }
    println("В категории до 30 лет победил сотрудник №$pob1, " +"время: " + table[0][pob1]+ ", возраст: " + table[1][pob1])
        println("В категории от 30 до 50 лет победил сотрудник №$pob2, " +"время: " + table[0][pob2]+ ", возраст: " + table[1][pob2])
        println("В категории от 50 лет победил сотрудник №$pob3, " +"время: " + table[0][pob3]+ ", возраст: " + table[1][pob3])
}