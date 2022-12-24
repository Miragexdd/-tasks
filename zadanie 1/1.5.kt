import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    var A= scanner.nextInt()
    var B= scanner.nextInt()
    println("Старое значение A $A. Старое значение B $B")
    val c = B
    B = A
    A = c
    println("Новое занчение A $A. Новое занчение B $B")//значитс мы берем число 2 засовываем его в буферную переменную ну и потом победа
}