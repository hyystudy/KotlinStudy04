package practice

import javax.naming.Context
import javax.swing.text.AttributeSet

open class MyView{
    constructor(ctx : Context){
        //some code
    }

    constructor(ctx: Context, attributes: AttributeSet){}
}

class MyButton : MyView{
    constructor(ctx: Context) : super(ctx){

    }

    constructor(ctx: Context, attributes: AttributeSet) : super(ctx, attributes){

    }
}


interface Student{
    val name: String
}

class PrivateStudent(override val name: String) : Student

class SubscribingUser(val email: String) : Student{
    override val name: String
        get() = email.substringBefore("@")
}

class FacebookUser(val countId: Int) : Student{
    override val name: String = countId.toString()

}

interface Teacher{
    val email: String
    val nickname: String
    get() = email.substringBefore("@")
}


class UserTwo(val name: String){
    var address: String = "unspecified"
    set(value: String) {
        println("""
            Address was changed for $name
            "$field" -> "$value"
        """.trimIndent())
        field = value
    }
}

class LengthCounter{
    var counter: Int = 0
    private set

    fun addWord(word: String){
        counter += word.length
    }
}