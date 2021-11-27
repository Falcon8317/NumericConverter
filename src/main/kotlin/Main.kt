fun main() {
    do {
        print("Do you want to convert /from decimal or /to decimal? (To quit type /exit) ")
        val answer = readLine()!!.toString()
        when (answer) {
            "/from" -> {
                print("Enter number in decimal system: ")
                val convertableNumber = readLine()!!.toInt()
                print("Enter target base: ")
                val targetBase = readLine()!!.toInt()

                val hex = Integer.toHexString(convertableNumber)
                val binary = Integer.toBinaryString(convertableNumber)
                val octal = Integer.toOctalString(convertableNumber)

                when (targetBase) {
                    2 -> {
                        println("Conversion result: $binary")
                    }

                    8 -> {
                        println("Conversion result: $octal")
                    }

                    16 -> {
                        println("Conversion result: $hex")
                    }
                }
            }
            "/to" -> {
                print("Enter source number: ")
                val sourceNumber :String = readLine()!!.toString()
                print("Enter source base: ")

                when (readLine()!!.toInt()) {
                    16-> println("Conversion to decimal result: ${java.lang.Long.parseLong(sourceNumber,16)}")
                    8 -> println("Conversion to decimal result: ${java.lang.Long.parseLong(sourceNumber,8)}")
                    2 -> println("Conversion to decimal result: ${java.lang.Long.parseLong(sourceNumber,2)}")
                }
            }
        }
    }while (answer != "/exit")
}