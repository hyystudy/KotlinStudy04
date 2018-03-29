package practice

import java.io.Serializable

interface State : Serializable

interface View{
    fun getCurrentState() : State
    fun restoreState(state: State){}
}


class ButtonTwo : View{
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }
    //这个类与Java中的静态嵌套类类似
    class ButtonState : State{
        fun showOff() = println("ButtonState")
    }

}

class Outer{
    //这个类与Java中的非静态嵌套类类似
    inner class Inner{
        fun getOuterReference() : Outer = this@Outer

    }
}