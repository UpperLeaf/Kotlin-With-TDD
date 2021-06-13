import java.lang.IllegalArgumentException

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