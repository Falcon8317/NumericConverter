fun main() {
    print("Enter number in decimal system: ")
    val convertableNumber = readLine()!!.toInt()
    print("Enter target base: ")
    val targetBase = readLine()!!.toInt()

    val hex = Integer.toHexString(convertableNumber)
    val binary = Integer.toBinaryString(convertableNumber)
    val octal = Integer.toOctalString(convertableNumber)

    when (targetBase) {
        2 -> {
            print("Conversion result: $binary")
        }

        8 -> {
            print("Conversion result: $octal")
        }

        16 -> {
            print("Conversion result: $hex")
        }
    }
}