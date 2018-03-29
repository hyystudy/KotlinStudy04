import practice.Button
import practice.ButtonTwo
import practice.LengthCounter
import practice.UserTwo

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()

    ButtonTwo.ButtonState().showOff()

    val hyy = UserTwo("hyy")
    hyy.address = "beijing"
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hyy!")
    println(lengthCounter.counter)
}