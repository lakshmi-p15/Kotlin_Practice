fun main(){
    val hobbiesArray = arrayOf("Kotlin", "Android", "DS");
    val hobbiesList = mutableListOf("Java", "Android", "Algorithms & DS");
    val languagesMap = mutableMapOf(1 to "Python", 2 to "Java", 3 to "Kotlin")

    println(hobbiesArray[0])
    println(hobbiesArray.size)
    println(hobbiesArray.get(2))

    for(hobby in hobbiesArray){
        println(hobby)
    }

    hobbiesArray.forEach { hobby ->
        println(hobby)
    }
    hobbiesArray.forEachIndexed { index, hobby ->
        println("$index -> $hobby")
    }

    println(hobbiesList[0])
    println(hobbiesList.size)

    hobbiesList.add(1, "Kotlin")
    hobbiesList.forEach{ hobby ->
        println(hobby)
    }

    languagesMap[4] = "Json"
    languagesMap.forEach{ (key, value) ->
        println("$key -> $value")
    }
}