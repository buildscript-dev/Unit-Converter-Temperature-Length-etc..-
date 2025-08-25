
fun startMenu(){
    val startMenuList = listOf("Start", "Option", "Exit")
    var currentIndex = 0
    var running = true

    while (running){
    //clear screen
        print("\u001b[H\u001b[2J")
        System.out.flush()


        // Print menu with arrow
        startMenuList.forEachIndexed { index, item ->
            if (index == currentIndex) {
                println(" -> $item")
            } else {
                println("    $item")
            }
        }


        print("Use W (up), S (down), Enter to select: ")
        val input = readLine()

        when(input?.lowercase()){
            "w" -> if (currentIndex >0) currentIndex--
            "s" -> if (currentIndex < startMenuList.size - 1) currentIndex++
            ""-> {
                when (startMenuList[currentIndex]) {
                "Start" -> HomeConverter()
                "Option" -> println("Opening Option")
                "Exit" ->{
                 println("Exiting...")
                 running = false
             }
                }
                if (running){
                    println("Press Enter to continue...")
                    readLine()
                }
            }
        }
    }
}

