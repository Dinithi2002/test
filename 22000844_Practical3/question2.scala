object question2{
    def main(args:Array[String]){
        var input=List("Hi","Apple","Teacher","programming","languages")
        val result=filterLength(input)
        println("Strings that have a length greater than 5 :  "+result)

    }

    def filterLength(sample: List[String]):List[String] =sample match{
        case Nil=>Nil
        case head::tail => if(head.length>5) head :: filterLength(tail)
        else filterLength(tail)
    
    }
}


