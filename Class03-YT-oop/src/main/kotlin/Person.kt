class Person {
    //lateinit dont accept nullable
    lateinit var firstName:String
    lateinit var lastName:String
    constructor(){
        println("First")
    }

    constructor(fname:String,lname:String){
        println("Second")
        this.lastName = lname
        this.firstName = fname
    }

    //What reflection Means?
    //The ability to examine, load, and interact with classes, fields, and methods at runtime is referred to as Kotlin reflection
    //Kotlin reflection is used at runtime to utilize a class and its members, such as properties, methods, and constructors
    //A class's instances can also be utilized to obtain a reference to a class.

    //Kotlin Property References
    //Basically we can get a function reference or call a function similar to .func() in java
    //The class name should also be mentioned with the :: operator if the property belongs to a class

    //Kotlin Class References

    //What this::firstName.isInitialized means?
    //Create a member reference or a class reference
    //U can get the reference to the class of a specific object with the same ::class syntax at runtime
    //Every named function defined can be called as a functional reference, to do, use the :: operator before the function name
    //Can be used with overloaded functions when the expected type is known
    //    fun isOdd(x: Int) = x % 2 != 0
    //    fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"
    //
    //    val numbers = listOf(1, 2, 3)
    //    println(numbers.filter(::isOdd)) // refers to isOdd(x: Int)

    //:: operator pertences to KProperty Class and using this u access the methods from this class
    //And from that moment, u can use some methods that allows to manipulate functions, methods, classes and etc at run time

    fun someRandomFunction(){
        if(this::firstName.isInitialized){
            println("Not Empty Constructor")
            println(this.lastName)
        }
        else{
            println("Empty Constructor")
        }
    }
}