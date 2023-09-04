fun main(args: Array<String>) {
    //Lateinit is used to non-nullable var and says to the compiler that the var is going to be initialized after the moment
    //that the object is created
    //val declara uma variável imutável e var declara uma variável mutável, por isso o compilador detectou que você tentou mudar o valor de algo que não pode.
    // Parece que já sabe isso. Mas tem uma pegadinha.
    var person = Person("a","b")
    person.someRandomFunction()
}