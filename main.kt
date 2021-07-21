import java.util.*

fun main(){
    ReverseDigit()
}
fun ReverseDigit() {
    var randomNum = 348597
    var reversedNum = 0

    while (randomNum != 0){
        val digits = randomNum % 10
        reversedNum = reversedNum * 10 + digits
        randomNum /= 10

    }
    val results : Array<Int> = arrayOf(reversedNum)
    print("The Number 348597 is now Reversed As:")
    println(Arrays.toString(results))

}