fun main() {
    collatz(27)
}

public fun collatz(input: Int): String {
    var number = input
    println(number)
    while (number > 1) {
        number = if (number % 2 == 0) number / 2 else number * 3 + 1
        println(number)
    }  
    return number.toString()
}
