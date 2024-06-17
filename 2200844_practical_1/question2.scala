object question2{

	def main(args:Array[String])
	{
		var x= fahrenheit(35)
		println("Temperature : "+ x)	
	}

	def fahrenheit(cTemp:Double)=(cTemp*1.8000)+32.00
}