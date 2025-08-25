package Area

fun areaOfRectangle(){

    print("Enter the value of lenght: ")
    val lenght = readln().toDoubleOrNull()
    print("Enter the value of width: ")
    val width = readln().toDoubleOrNull()

    if (lenght ==null || width == null){
        println("Invalid Input")
    }
    else{
        val areaRectangle = lenght * width
        println("Area of Rectangle is $areaRectangle cm2")
    }

}