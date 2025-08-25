import Angle.angleConverter
import Area.areaConvertion


fun HomeConverter() {

    println("Welcome To Unit Converter Console")
    val homeList = listOf("Angle", "Area", "Currency", "Exit")
    println(homeList.joinToString("\n"))
    println("Choose an option(What you wanted to converter): ")

    while (true) {
        val input = readln().lowercase().trim().replaceFirstChar { it.uppercase()}
        when (input) {
            "Angle" -> {
                angleConverter()
                break
            }
        "Area" -> {
            areaConvertion()
            break
        }
//        "Currency" ->
//        "Density" ->
//        "Energy" ->
//        "Force" ->
//        "Lenght" ->
//        "Mass" ->
//        "Power" ->
//        "Pressure" ->
//        "Speed" ->
//        "Temperature" ->
//        "Time" ->
//        "Volume" ->
          "Exit" -> {
           println("Exiting the Project")
           break
          }
            else -> {
                println("Invalid Input $input")
                println("Try Again...")
            }
        }
    }
}