package Area

import kotlin.math.pow
import kotlin.math.sqrt

fun areaOfCone(){
    val pi = 3.14
    print("Enter the value of radius: ")
    val r = readln().toDoubleOrNull()

    print("Enter the value of height: ")
    val h = readln().toDoubleOrNull()

    if (r == null || h == null){
        println("Invalid Value")
    }
    else {
        val areaCone = pi*r*(r+ sqrt(h.pow(2) + r.pow(2)))
        println("Area of Cone is $areaCone cm3")
    }


}