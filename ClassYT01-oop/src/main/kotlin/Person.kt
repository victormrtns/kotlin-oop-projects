class Person{

    var firstName:String
    lateinit var Zap:String
    constructor(name:String)
    {
        firstName = name
    }
    constructor(name:String, zap:String)
    {
        Zap = zap.length.toString()
        firstName = name
    }

    //First form
    //Here we have a primary constructor
    //class Person(firstname:String,lastname:String)
    //var firstName: String = firstname;
    //var lastName: String = lastname;
    //var Age: Int = age;

    //U can use a default initializr for a empty constructor
    //Person(_firstName: String = "UNKNOWN", _age: Int = 0)
    // the output:
    //    First Name = Joe
    //    Age = 25
    //
    //    person2 is instantiated
    //    First Name = Jack
    //    Age = 0
    //
    //    person3 is instantiated
    //    First Name = UNKNOWN
    //    Age = 0

    //Second Form
    //U can use a secondary constructor
    //In case, we can use with inheritance to a constructor, but we have to use super before the constructor that we want to "copy"
    //    class Log {
    //        constructor(data: String) {
    //            // code
    //        }
    //        constructor(data: String, numberOfData: Int) {
    //            // code
    //        }
    //    }
    //
    //     class AuthLog: Log {
    //            constructor(data: String): super(data) {
    //                // code
    //            }
    //            constructor(data: String, numberOfData: Int): super(data, numberOfData) {
    //                // code
    //            }
    //        }



}