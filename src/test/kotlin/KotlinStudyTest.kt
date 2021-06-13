import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

class KotlinStudyTest {

    @Test
    fun consolePrintTest() {
        println("Hello World!")
    }

    @Test
    fun sumTest() {
        assertEquals(3, sum(1, 2))
        assertEquals(5, sum(1, 4))
    }

    @Test
    fun ifIsExpression() {
        val first = 3;
        val second = 5;
        val big = if (first < second) second else first
        assertEquals(second, big);
    }

    @Test
    fun typeInferenceTest() {
        val integer = 3
        val character = 'a'
        val str = "string"

        assertTrue(integer::class == Int::class)
        assertTrue(character::class == Char::class)
        assertTrue(str::class == String::class)
    }

    @Test
    fun valueLazyInitializeTest() {
        val message: String
        val third = 3;
        val five = 5;

        if (third < five) {
            message = "Five"
        } else {
            message = "Third"
        }
        assertEquals("Five", message)
    }

    @Test
    fun stringTemplateTest() {
        val name = "UpperLeaf"
        val greetingMessage = "Hello! $name"
        assertEquals("Hello! UpperLeaf", greetingMessage)

        val noneGreetingMessage = "Hello! \$name"
        assertEquals("Hello! " + '$' + "name", noneGreetingMessage)

        val greetingMessage2 = "Hello! ${1 + 2 * 10}"
        assertEquals("Hello! 21", greetingMessage2)
    }

    @Test
    fun personTest() {
        val person =  Person("name", 20, "nickname1");

        assertEquals("name", person.name)
        assertEquals(20, person.age)
        assertEquals("nickname1", person.nickname)

        person.nickname = "nickname2"

        assertEquals("nickname2", person.nickname)
    }

    @Test
    fun customPropertyTest() {
        val square1 = Square(4, 4)
        assertTrue(square1.isSquare)
        val square2 = Square(5, 4)
        assertFalse(square2.isSquare)
    }

    @Test
    fun enumColorTest() {
        var blue = Color.BLUE;
        assertEquals(255, blue.b)
        assertEquals(0, blue.r)
        assertEquals(0, blue.g)

        var red = Color.RED;
        assertEquals(255, red.r)
        assertEquals(0, red.g)
        assertEquals(0, red.b)
    }

    @Test
    fun matchWhenColorTest() {
        assertEquals("warm", getWarmth(Color.RED))
        assertEquals("cold", getWarmth(Color.BLUE))
    }

    @Test
    fun matchWhenMixTest() {
        assertEquals("orange", mixColor(Color.RED, Color.BLUE))
        assertEquals("orange", mixColor(Color.BLUE, Color.RED))
    }

    @Test
    fun numExpressionAndEvaluateTest() {
        val three = Num(3)
        val five = Num(5)

        assertEquals(3, eval(three))
        assertEquals(5, eval(five))
    }

    @Test
    fun sumExpressionAndEvaluateTest() {
        val three = Num(3)
        val five = Num(5)
        val result = sumExpression(three, five)
        val result2 = sumExpression(result, five)

        assertEquals(8, eval(result))
        assertEquals(13, eval(result2))
    }
}
