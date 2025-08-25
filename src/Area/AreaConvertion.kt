package Area

fun areaConvertion(){

   println("Find area for what????")
    val areaList = listOf("Circle", "Triangle", "Square", "Rectange", "Cone")

    println(areaList.sorted().joinToString("\n"))
    println("Exit")

    while (true){
        print("Find Area of ")
        val input = readln().trim().lowercase().replaceFirstChar{ it.uppercase() }

        when(input){
            "Circle" ->{
                areaOfCircle()
                break
            }
            "Cone" ->{
                areaOfCone()
                break
            }
            "Rectangle" ->{
                areaOfRectangle()
                break
            }
            "Square" ->{
                areaOfSquare()
                break
            }
            "Triangle" ->{
                areaOfTriangle()
                break
            }
            "Exit" -> {
                println("Exiting the Area Menu")
                break
            }
            else -> {
                println("Invalid Input: $input")
                println("Try again")
                print("Find Area of ")
            }
        }

    }

}