package Area

import kotlin.math.pow

fun areaOfSquare(){

    print("Enter the value of a side: ")
    val side = readln().toDoubleOrNull()

    if (side == null){
        print("Invalid Input")
    }
    else{
        val areaSquare = side.pow(4)
        println("Area of Square is $areaSquare cm2")
    }


}