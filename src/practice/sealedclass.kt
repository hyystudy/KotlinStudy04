package practice

sealed class Expr{
    class Num(val int: Int) : Expr()
    class Sum(val left : Expr, val right : Expr) : Expr()
}

fun eval(expr: Expr) : Int = when(expr){
    is Expr.Num -> expr.int;
    is Expr.Sum -> eval(expr.left) + eval(expr.right)
}