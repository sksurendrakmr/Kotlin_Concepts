package fundamentals

fun main() {
    referentialEquality()
}

fun ifElse() {
    var age = 10;
    if (age > 10) println("Good") else println("Ok!")
    println("Hello!")
}

fun structuralEquality() {
    //structural
    var name1 = "Surendra";
    var name2 = "Surendra"
    println(name1 == name2); //true
    //== -> structural equality
    //!= -> structural inquality
}

fun referentialEquality() {
    var a = 12;
    var b = 12;
    println(a === b); //true
    //numbers, chars, boolean - at runtime represent as primitive
    //=== -> referential equality
    //!== -> referential inequality

    var person1 = Person("Surendra");
    var person2 = Person("Surendra");
    println(person1 === person2) //false
}

class Person(name: String)


fun nullInKotlin() {
    //one of the goal of kotlin type system is to eliminate null reference exception
    var name = "Surendra"; //non-null reference
    name = null; //error
    //non-null reference !== null reference in kotlin

    var name2: String? = "Surendra" //nullable reference-> This will allow name2 to reassign to null
    name2 = null;

    //similar for other type
    var age = 10;
    age = null; //error

    var age1: Int? = 10;
    age1 = null;

    var person1 = Person("Surendra");
    person1 = null //error

    var person2: Person? = Person("Surendra");
    person2 = null;

    var firstName = "Surendra";
    var length = firstName.length; //kotlin gurantee than we will definatly get

    var lastName : String? = "Kumar";
    var length2 = lastName?.length //null or 5
    //If the lastname is null then make length2 = null
    //otherwise give the length

    var length3 = if(lastName != null) lastName.length else 0 //5 or 0
    var length4 = lastName?.substring(0,2)?.length
}

fun elvisOperator(){
    var lastName : String? = "Kumar";
    var length: Int = lastName?.length //error

    //M1
    var length2:Int = if(lastName != null) lastName.length else 0

    //M2-> Kotlin way
    var length3 = lastName?.length ?: 0 //if anything in the left side of elvis operator is null then assign return right side value
    var length4 = lastName?.substring(0,2)?.length ?: 0
}