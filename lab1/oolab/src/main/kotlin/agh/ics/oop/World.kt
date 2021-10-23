package agh.ics.oop


fun run2(list: List<Direction>){
    list.forEach { way ->
        when(way){
            Direction.FORWARD -> println("Animal moves forward.")
            Direction.BACKWARD -> println("Animal moves backwards.")
            Direction.RIGHT -> println("Animal turns right.")
            Direction.LEFT -> println("Animal turns left.")
        }
    }
}

fun convertListOfStringToEnumDirection(list: List<String>): List<Direction>{
    val myList: MutableList<Direction> = mutableListOf()
    list.forEach { word ->
        when (word){
            "f" -> myList.add(Direction.FORWARD)
            "b" -> myList.add(Direction.BACKWARD)
            "l" -> myList.add(Direction.LEFT)
            "r" -> myList.add(Direction.RIGHT)
        }
    }
    return myList
}


fun main(args: Array<String>) {
    val list = args.asList()
    val myEnums = convertListOfStringToEnumDirection(list)

    println("system started")
    run2(myEnums)
    println("system stopped")
}