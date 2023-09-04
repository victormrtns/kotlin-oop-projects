class Person {
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

    fun someRandomFunction(){
        if(this::firstName.isInitialized){
            println("Not Empty Constructor")
        }
        else{
            println("Empty Constructor")
        }
    }
}