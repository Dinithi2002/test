object que2{
    def main(args:Array[String]){
        var a: Int = 2
        var b: Int = 3
        var c: Int = 4
        var d: Int = 5
        var k: Float = 4.3f

        printf(" --b * a + c * d--  =  ")
        b -= 1
        println(b * a + c * d)
        d -= 1

        
        printf("\na++               = ")
        println(a)
        a += 1

        
        //Assume g=10
        printf("\n-2 * (g - k) + c  = ")
        println(-2 * (10 - k) + c)

    
        printf("\nc = c++           = ")
        println(c)
        c += 1

    
        printf("\nc = ++c * a++     = ")
        c += 1
        println(c * a)
        a += 1
    }
}

   