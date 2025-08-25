package Area

fun areaOfTriangle(){

    print("Enter the value of height: ")
    val height = readln().toDoubleOrNull()
    print("Enter the value of width: ")
    val width = readln().toDoubleOrNull()

    if (height == null || width == null){
        print("Invalid Input")
    }
    else{
        val areaTriangle = (height * width)/2
        println("Area of Triangle is $areaTriangle cm2")
    }

}