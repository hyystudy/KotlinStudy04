package practice

interface Clickable{
    fun click()
    fun showOff() = println("I'm clickable")
}

interface Focusable{
    fun setFocus(focus: Boolean) = println("I ${if (focus) "got" else "lost"} focus")

    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable{
    override fun showOff() {
        super<Clickable>.showOff()
        //super<Focusable>.showOff()
    }

    override fun click() {
        println("I was clicked")
    }
}

//open 修饰的类 可以有子类
open class RichButton : Clickable{
    //重写的接口 或者基类的成员 默认也是open的 如果不想被子类重写可以加上final修饰符
    override final fun click() {

    }

    //这个函数是final 的不能在子类中重写 默认就是final的 如果不加修饰符的话
    final fun disable(){}

    //这个函数是open  的不能在子类中重写
    open fun animate(){

    }

}

class ThirdButton : RichButton(){
    override fun animate() {
        super.animate()
    }
}


abstract class Animated {
    //抽象方法 可以没有方法体 默认是open的 子类必须重写
    abstract fun animate()

    //抽象类中的非抽象函数默认也是final的
    open fun stopAnimating(){

    }

    final fun animateTwice(){

    }
}


internal open class TalkativeButton : Focusable{
    private fun yell() = println("Hey!")

    protected fun whisper() = println("Let's talk!")
}


internal fun TalkativeButton.giveSpeech(){
  // yell()

}