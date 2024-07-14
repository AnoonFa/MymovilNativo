Variables

Variables de Valor (`val`)
En Kotlin, `val` se utiliza para declarar variables cuyo valor no puede ser modificado después de ser asignado. Estas son conocidas como variables inmutables. Por ejemplo, `name` es una variable de valor que se inicializa con "Esteban" y se imprime en la consola. Usar `val` es una buena práctica cuando se desea garantizar la inmutabilidad, mejorando así la legibilidad y seguridad del código.

val name = "Esteban" // Variable cuyo valor no puede cambiar
println(name)


Variables de Referencia (`var`)
Las variables declaradas con `var` son mutables, es decir, su valor puede cambiar durante la ejecución del programa. En el ejemplo, `age` se inicializa con el valor 15, se imprime, se cambia a 26 y se vuelve a imprimir. Usar `var` es útil cuando se necesita modificar el valor de una variable, pero se debe usar con cuidado para evitar efectos secundarios no deseados.

var age = 15 // Variable cuyo valor puede cambiar
println(age)
age = 26 // Se cambia el valor de `age`
println(age)

Variables Nulas
Kotlin soporta variables que pueden contener valores nulos, indicadas con un signo de interrogación (?) al tipo de dato. En el ejemplo, `car` es una variable de tipo `String?` que inicialmente es nula, luego se le asigna "Carro rojo" y se imprime. El manejo seguro de nulos en Kotlin ayuda a evitar errores comunes de null pointer exceptions.

var car: String? = null // Variable que puede ser nula
println(car)
car = "Carro rojo" // Se asigna un valor no nulo
println(car)


Tipos de Datos

Tipos de Datos Básicos
Kotlin tiene varios tipos de datos básicos como `Int`, `Float`, `Double`, `Char`, `String` y `Boolean`. Por ejemplo, se puede declarar un `Float` agregando una `F` al final del número.

val pi: Float = 3.1416F // Se especifica el tipo de dato `Float`
println(pi)


Tipos de Datos Complejos
Kotlin también soporta tipos de datos más complejos como listas, conjuntos y mapas.

Listas
Una lista es una colección de elementos que puede ser inmutable (`List`) o mutable (`MutableList`). Por ejemplo, `numbers` es una lista inmutable y `mutableNumbers` es una lista mutable.

val numbers: List<Int> = listOf(1, 2, 3) // Lista inmutable
println(numbers)

val mutableNumbers: MutableList<Int> = mutableListOf(1, 2, 3) // Lista mutable
mutableNumbers.add(4) // Se agrega un elemento a la lista mutable
println(mutableNumbers)


Conjuntos
Un conjunto (`Set`) es una colección de elementos únicos, que puede ser inmutable (`Set`) o mutable (`MutableSet`). Por ejemplo, `uniqueNumbers` es un conjunto inmutable y `mutableUniqueNumbers` es un conjunto mutable.

val uniqueNumbers: Set<Int> = setOf(1, 2, 3) // Conjunto inmutable
println(uniqueNumbers)

val mutableUniqueNumbers: MutableSet<Int> = mutableSetOf(1, 2, 3) // Conjunto mutable
mutableUniqueNumbers.add(4) // Se agrega un elemento al conjunto mutable
println(mutableUniqueNumbers)


Mapas
Un mapa (`Map`) es una colección de pares clave-valor, que puede ser inmutable (`Map`) o mutable (`MutableMap`). Por ejemplo, `map` es un mapa inmutable y `mutableMap` es un mapa mutable.

val map: Map<String, Int> = mapOf("one" to 1, "two" to 2) // Mapa inmutable
println(map)

val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2) // Mapa mutable
mutableMap["three"] = 3 // Se agrega un par clave-valor al mapa mutable
println(mutableMap)


Arrays
Los arrays son colecciones de elementos de un tipo específico y tienen un tamaño fijo. Por ejemplo, `array` es un array de enteros.

val array: Array<Int> = arrayOf(1, 2, 3, 4, 5) // Array de enteros
println(array.joinToString()) // Se imprime el array como una cadena de texto


Lambdas y Funciones Anónimas
Las lambdas son funciones sin nombre que pueden ser definidas y ejecutadas más tarde. Las funciones anónimas son similares a las lambdas pero tienen una estructura similar a las funciones normales, solo que sin nombre. Por ejemplo, `sum` es una lambda que toma dos enteros y devuelve su suma.

val sum = { a: Int, b: Int -> a + b } // Lambda que suma dos enteros
println(sum(3, 4)) // Se ejecuta la lambda de suma


Constantes

Companion Object
En Kotlin, los `companion objects` dentro de una clase permiten declarar constantes y funciones que pueden ser accedidas directamente a través del nombre de la clase sin necesidad de crear una instancia. Las constantes dentro de un `companion object` se declaran con `const val`, indicando que son inmutables y se evalúan en tiempo de compilación.

class Constants {
    companion object {
        const val MAX_AGE: Int = 100
        const val PI: Double = 3.141592653589793
        const val GREETING: String = "Hello, World!"
        const val INITIAL: Char = 'A'
        const val IS_ACTIVE: Boolean = true

        fun hello() {
            println("Hello from companion object!")
        }
    }
}


Constantes a Nivel de Objeto Top-Level
Las constantes top-level se declaran fuera de cualquier clase u objeto y se pueden acceder de manera global. Estas constantes también se declaran con `const val` y son evaluadas en tiempo de compilación.

const val MAX_HEIGHT: Int = 200
const val GOLDEN_RATIO: Float = 1.6180339887f
const val WELCOME_MESSAGE: String = "Welcome to Kotlin"
const val FIRST_LETTER: Char = 'K'
const val IS_ENABLED: Boolean = false


Uso de Constantes
Las constantes pueden ser usadas tanto desde un `companion object` como desde el nivel top-level. 

fun main() {
    // Uso de constantes a nivel de objeto (companion object)
    println(Constants.MAX_AGE)
    println(Constants.PI)
    println(Constants.GREETING)
    println(Constants.INITIAL)
    println(Constants.IS_ACTIVE)
    Constants.hello()

    // Uso de constantes top-level
    println(MAX_HEIGHT)
    println(GOLDEN_RATIO)
    println(WELCOME_MESSAGE)
    println(FIRST_LETTER)
    println(IS_ENABLED)
}


Variables Opcionales y Nulas

Variables Opcionales (nullable)
Estas variables pueden contener valores nulos y se declaran agregando un signo de interrogación (?) al tipo de dato. Son útiles cuando no se sabe si se tendrá un valor o un nulo.

var nullableString: String? = null
println(nullableString) // Imprime null
nullableString = "Kotlin"
println(nullableString) // Imprime "Kotlin"

var nullableFloat: Float? = null
println(nullableFloat) // Imprime null
nullableFloat = 3.14F
println(nullableFloat) // Imprime 3.14


Operaciones Seguras con Variables Opcionales
Kotlin proporciona varios operadores para manejar valores nulos de forma segura.

Operador de Llamada Segura (?.)
Permite llamar a métodos o acceder a propiedades de una variable opcional sin lanzar una excepción si la variable es nula.

val length: Int? = nullableString?.length
println(length) // Imprime la longitud o null


Operador Elvis (?:)
Proporciona un valor por defecto si la variable opcional es nula.

val lengthOrDefault: Int = nullableString?.length ?: 0
println(lengthOrDefault) // Imprime la longitud o 0


 Operador de Aserción No Nula (!!. )
Convierte una referencia opcional en una referencia no opcional, lanzando una excepción si el valor es nulo.

val nonNullLength: Int = nullableString!!.length
println(nonNullLength) // Imprime la longitud o lanza una excepción


 Verificación de Nulabilidad
Uso de estructuras de control para manejar valores nulos.

if (nullableString != null) {
    println(nullableString.length) // Imprime la longitud
} else {
    println("nullableString is null") // Imprime un mensaje
}


 Ejemplo  de Uso de Variables Opcionales y Nulas

fun main() {
    // Variables Opcionales y Nulas

    // 1. Variables Opcionales (nullable)
    var nullableString: String? = null // Variable de tipo String que puede ser nula
    println(nullableString) // Imprime null
    nullableString = "Kotlin" // Se cambia el valor a