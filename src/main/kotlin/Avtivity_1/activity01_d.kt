



//Create an application that will accept 5 monetary amounts.
//After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//The total of the 5  input will be divided by the answer in the second question input.


fun main() {
    var amount1: Int? = null
    var amount2: Int? = null
    var amount3: Int? = null
    var amount4: Int? = null
    var amount5: Int? = null

    logger.info("Enter Amount:")
    amount1 = readLine()?.toInt()
     amount2 = readLine()?.toInt()
    amount3 = readLine()?.toInt()
    amount4 = readLine()?.toInt()
    amount5 = readLine()?.toInt()
    logger.info("Divide the value by how many?")

    var sum = amount1!! + amount2!! + amount3!! + amount4!! + amount5!!
    logger.info{sum/amount2}





}

































