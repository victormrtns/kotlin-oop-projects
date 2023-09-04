class Person {
    var firstname: String? = null;
    var lastname: String? = null;
    constructor(){
        println("primary constructor")
    }
    constructor(sampleParameter:Int):this(){
        println("secondary constructor")
    }

    constructor(sampleParameter:Int, zap:Int):this(sampleParameter){
        println("third constructor")
    }


    init {
        println("This init is called in the same time of the creation of the object")
    }

    init {
        println("secondary INIT")
    }

    init {
        println("third INIT")
    }
}