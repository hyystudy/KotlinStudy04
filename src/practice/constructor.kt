package practice

//简单明了的类声明
class User(val name : String)//被括号围起来的语句是主构造方法

//还可以这样子声明
class User1 constructor(_name : String){
    val name : String
    init {
        name = _name
    }
}


//再次简化
class User2(_name: String){
    val name = _name
}

//最后
class User3(val name: String)

//构造方法默认值
class User4(val name: String, val isStudent : Boolean = false)

open class TextView

//虽然TextView 空构造方法 但必须显式调用父类构造方法 所以必须加括号
class EditText : TextView()