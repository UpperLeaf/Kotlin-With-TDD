import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun sum (a : Int, b : Int) : Int = a + b

fun getWarmth(color: Color) : String = when(color) {
    Color.RED -> "warm"
    Color.BLUE -> "cold"
}

fun mixColor(color1: Color, color2: Color) : String = when(setOf(color1, color2)) {
    setOf(Color.RED, Color.BLUE) -> "orange"
    else -> throw IllegalArgumentException("")
}

fun eval(expression: Expression) : Int = when (expression) {
    is Num -> expression.num
    is Sum -> eval(expression.expression1) + eval(expression.expression2)
    else -> throw IllegalArgumentException("")
}

fun sumExpression(expression1 : Expression, expression2: Expression) = Sum(expression1, expression2)

fun fizzbuzz(value: Int) : String = when {
    value % 15 == 0 -> "fizzbuzz"
    value % 3 == 0 -> "fizz"
    value % 5 == 0 -> "buzz"
    else -> value.toString()
}

fun isLetter(c : Char) : Boolean = c in 'a'..'z' || c in 'A'..'Z'

fun isDigit(c : Char) : Boolean = c in '0'..'9'

fun parseInt(str : String) : Int = try {
    Integer.parseInt(str)
}catch (e : NumberFormatException) {
    -1
}
