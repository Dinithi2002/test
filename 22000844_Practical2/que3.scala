object que3{
    def main(args:Array[String]){

        var sal=income(40,30)
        println("Takehome salary = "+ sal)
    }

    def normal(nHours:Int)=nHours*250
    def ot(oHours:Int)=oHours*58
    def tax(nHours:Int,oHours:Int)=(normal(nHours)+ot(oHours))*0.12
    def income(nHours:Int,oHours:Int)=(normal(nHours)+ot(oHours))-tax(nHours,oHours:Int)
}