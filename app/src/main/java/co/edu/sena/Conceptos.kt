package co.edu.sena


fun main() {
    //Variables

    // 1. Variables de Valor (val)
    val name = "Esteban" // Variable que el valor no puede cambiar
    println(name)

    // 2. Variables de Referencia (var)
    var age = 15 //Variable que el valor si puede cambiar
    println(age)
    age = 26 // se cambia el valor de año
    println(age)

    // 3. Variables Nulas
    var car: String? = null // El valor de la variable de dato string puede ser nula
    println(car)
    car = "Carro rojo" // se cambia el valor a uno que no es nulo que es carro rojo
    println(car)

    // 4. Tipos de Datos Básico (Int, Float, Double, Char, String, Boolean)
    // Para poner el tipo de dato que quieres solo tienes que poner" nombre_variable : Dato_deseado ="
    // Flotantes
    // se muestra este para enseñar que al float se le agrega F/f al final del numero
    val pi: Float = 3.1416F
    println(pi)

    // 5. Tipos de Datos Complejos
    // Listas (List)
    val numbers: List<Int> = listOf(1, 2, 3) //coleccion de elementos que pueden cambiar
    println(numbers)

    //mutable List
    val mutableNumbers: MutableList<Int> = mutableListOf(1, 2, 3)
    mutableNumbers.add(4)// conjunto que puede mutar, en este caso agregando un elemento

    // Conjuntos (Set)
    val uniqueNumbers: Set<Int> = setOf(1, 2, 3)//coleccion de elementos que no pueden cambiar y son unicos
    println(uniqueNumbers)

    //mutable Set
    val mutableUniqueNumbers: MutableSet<Int> = mutableSetOf(1, 2, 3)
    mutableUniqueNumbers.add(4) // conjunto que puede mutar, en este caso agregando un elemento

    // Mapas (Map)
    val map: Map<String, Int> = mapOf("one" to 1, "two" to 2) //coleccion de pares clave-valor donde una clave es unica y se asigna a uno o muchos valores
    println(map)

    //mutable Map
    val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
    mutableMap["three"] = 3 // conjunto que puede mutar, en este caso asignando una clave a un valor

    // 6. Arrays
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)//coleccion de elementos que pueden guardar diferentes valores al mismo tiempo
    println(array.joinToString())

    // 7. Lambdas y Funciones Anónimas
    //Las Lambdas es una funcions sin nombre que puede estar dentro de otra y ser ejecutada mas tarde
    // Las Funciones Anonimas es similar a las Lambdas pero su estructura es parecida a una funcion normal solo que sin nombre
    val sum = { a: Int, b: Int -> a + b }
    println(sum(3, 4))//hace una funcion de suma

}

//Constantes

// Companion object
// Constantes a nivel de objeto (en un objeto 'companion' dentro de una clase)
class Constants {
    companion object {// las variables que estan contenidas en este companion object pueden ser llamadas directamente atraves del nombre de la clase
// El const usado antes de val se usan para declarar constantes en timpo de compilacion, son inmutables y se puede acceder a ellas sin una instancia
        const val MAX_AGE: Int = 100
        const val PI: Double = 3.141592653589793
        const val GREETING: String = "Hello, World!"
        const val INITIAL: Char = 'A'
        const val IS_ACTIVE: Boolean = true

        fun hello() {// se crea funcion dentro de la clase para que si se necesita la funcion solo necesite acceder por el nombre de la clase
            println("Hello from companion object!")
        }
    }
}

// Constantes a nivel de objeto top-level (fuera de cualquier clase)
// A estas constantes se puede acceder de manera global y tiene que estar fuera de don de se declaran las clases u objetos
const val MAX_HEIGHT: Int = 200
const val GOLDEN_RATIO: Float = 1.6180339887f
const val WELCOME_MESSAGE: String = "Welcome to Kotlin"
const val FIRST_LETTER: Char = 'K'
const val IS_ENABLED: Boolean = false

fun main() {
    // Uso de constantes a nivel de objeto (companion object)
    println(Constants.MAX_AGE) // Se llaman las constantes ingresando el nombre de la clase y depues la constante que deseas
    println(Constants.PI)
    println(Constants.GREETING)
    println(Constants.INITIAL)
    println(Constants.IS_ACTIVE)
    Constants.hello() // Llamando a una función

    // Uso de constantes top-level
    println(MAX_HEIGHT) // solo se llaman asi sin ninguna clase ni objeto
    println(GOLDEN_RATIO)
    println(WELCOME_MESSAGE)
    println(FIRST_LETTER)
    println(IS_ENABLED)
}

fun main() {
    // Variables Opcionales y Nulas

    // 1. Variables Opcionales (nullable) Estas pueden see nulas

    var nullableString: String? = null // Variable de tipo String que puede ser nula
    println(nullableString) // Imprime null
    nullableString = "Kotlin" // Se cambia el valor a uno que no es nulo
    println(nullableString) // Imprime "Kotlin"

    var nullableFloat: Float? = null // Variable de tipo Float que puede ser nula
    println(nullableFloat) // Imprime null
    nullableFloat = 3.14F // Se cambia el valor a uno que no es nulo
    println(nullableFloat) // Imprime 3.14


    // 2. Variables Nulas (también son opcionales porque pueden ser nulas)

    //Estas comienzan con un valor nulo que despues puede ser cambiado

    var nulleableString: String? = null // Variable de tipo String que puede ser nula
    println(nulleableString) // Imprime null
    nulleableString = "Hello, Kotlin!" // Se cambia el valor a uno que no es nulo
    println(nulleableString) // Imprime "Hello, Kotlin!"

    var nulleableFloat: Float? = null // Variable de tipo Float que puede ser nula
    println(nulleableFloat) // Imprime null
    nulleableFloat = 1.618F // Se cambia el valor a uno que no es nulo
    println(nulleableFloat) // Imprime 1.618

    // Operaciones Seguras con Variables Opcionales

    // 1. Operador de Llamada Segura (?.) Permite llamar a métodos o acceder a propiedades de una variable opcional sin lanzar una excepción si la variable es null
    val length: Int? = nullableString?.length // Devuelve la longitud si nullableString no es nula
    println(length) // Imprime la longitud o null si nullableString es null

    // 2. Operador Elvis (?:) Proporciona un valor por defecto si la variable opcional es null
    val lengthOrDefault: Int = nullableString?.length ?: 0 // Devuelve la longitud o 0 si nullableString es null
    println(lengthOrDefault) // Imprime la longitud o 0

    // 3. Operador de Aserción No Nula (!!) Convierte una referencia opcional en una referencia no opcional, lanzando una excepción si el valor es null
    val nonNullLength: Int = nullableString!!.length // Lanza una excepción si nullableString es null
    println(nonNullLength) // Imprime la longitud si nullableString no es null, de lo contrario lanza una excepción

    // 4. Verificación de Nulabilidad Uso de estructuras de control para manejar valores nulos.
    if (nullableString != null) {
        println(nullableString.length) // Imprime la longitud si nullableString no es null
    } else {
        println("nullableString is null") // Imprime un mensaje si nullableString es null
    }
}



