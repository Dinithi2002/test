object question4{
    def main(args:Array[String]){
        var input =List(1,2,3,4,5,6,7,8,9,10)
        var result=evenSum(input)
        println("Sum of even numbers = "+result)
    }

    def evenSum(num:List[Int]):Int=num match{
        case Nil => 0
        case head :: tail => if(head%2 == 0) head+evenSum(tail)
        else evenSum(tail)
       
    }

}