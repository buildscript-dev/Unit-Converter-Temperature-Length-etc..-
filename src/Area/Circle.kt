package Area

import kotlin.math.pow

fun areaOfCircle(){
    val pi = 3.14
    print("Enter the value of radius: ")
    val r = readln().toDoubleOrNull()

    if (r == null){
        println("Invalid Value of radius(r)")
    }
        else{
        val areaCicle = pi*r.pow(2)
        println("Area of Circle is $areaCicle cm2")
        }


}