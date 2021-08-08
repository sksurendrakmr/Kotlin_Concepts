/*

Everything in Kotlin is an Object.Hence we can call methods and properties
in these.

If we want to change the variable value then we should
use var otherwise we should use val.

We cannot define two variables with same name in the same scope.

If we don't define any type to variables, kotlin(compiler) try its best to
figure out what is the variable types and implicitly assign the type to
that specific variables.

Once we have variables with val keyword, we cannot reassign the value.
Useful when the value never change or we not expect to change, then we can verify and enforce
that through the compiler.
* */
fun mutableVariables(){
    var fullName = "Surendra Kumar"
    println(fullName)

    fullName="Suri Kumar"
    println(fullName)

    fullName=""
    println(fullName)

    //properties of the String variables
    println(fullName.isEmpty())
    var age =30
    age=32
    println(age)
}

fun readOnlyVariables(){
    val fullName = "Surendra Kumar" //we are creating readOnly variable i.e we can only assign it once.
    println(fullName)
    println(fullName::class) //checking what class the value belongs to.
//    fullName="Suri Kumar" //Error: val cannot be reassign
}

fun defineTypesExplicitlyInVariables(){
    val fullName:String = "Surendra Kumar"
//    val age:Int = "30" //Error: Type mismatch
    val age:Int = 30
}


fun kotlinNumberTypes(){
    //Lowest number types is a byte.
    val myByte:Byte=8 //8-bit signed integer
    //Short
    val myShort:Short = 16 //16-bit signed integer
    //Int
    val myInt:Int = 32 //32-bit signed integer
    //Long
    val myLong:Long = 64 //64-bit signed integer
    //Decimal
    val myFloat:Float = 32.00F //32-bit  floating point number
    val myDouble:Double = 64.00 //64-bit floating point number

    println(myByte.toDouble()::class)
    println(myByte.toLong()::class)

    val bigLong:Long = 1_000_000 //Equals to one millions
    println(bigLong)

    val newInt = myInt.plus(12)
    println(newInt)
}

fun kotlinStringTypes(){
    /*
    For String -> Double Quotes
    For character -> Single Quotes
    In Kotlin, Character are 16-bit Unicode Character
    * */

    var fullName = "Surendra Kumar"
    println(fullName.length)
    println(fullName.lowercase())
    println(fullName.lowercase())

    val firstName="Surendra" //In Kotlin, string is represented with double quotes
    //Char - If we work with character (Single character representation)
    val c:Char = 'x' //In kotlin, we have to define character with single quote

    //Some Built in Character
    var tabCharacter:Char = '\t' //Tab character
    var newLineCharacter:Char = '\n'
    var backSlashCharacter:Char = '\\'

    //Single Character String (However String is going to be larger in memory than character)
    var singleCharacterString:String="y"

    //String in multiple lines
//    var message = "Hello, \nMy name is Surendra.\nHey!"
    var message1 = """
        Hello,
        My name is Surendra
    """.trimIndent()

    var message2 = """
        Hello,
        My name is Surendra
    """.replaceIndent("abc-|-")

    //trimMargin by default check for pipes(|).
    var message = """
        >>>Hello,
        >>>My name is Surendra
    """.trimMargin(">>>") //remove prefix and new line which is at the beginning
    println(message)

    //String templates
    var name="Surendra"
    var age=23
    println("Hello $name. Your age is $age and Yor name is ${name.length} character longs")
}
fun kotlinBooleanTypes(){
    var isBlank:Boolean = false
    println(isBlank)
    println(isBlank.not()) //inverse value of isBlank
    isBlank = "".isBlank()
    println(isBlank)
}

fun kotlinBuiltInTypes(){
    kotlinNumberTypes()
    kotlinStringTypes()
    kotlinBooleanTypes()
}


fun main(){
    mutableVariables()
    readOnlyVariables()
    defineTypesExplicitlyInVariables()
    kotlinBuiltInTypes()
}