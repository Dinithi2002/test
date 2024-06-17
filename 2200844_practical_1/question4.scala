object question4{
	def main(args:Array[String])
	{
		var x=totCost(60);
		println("Total cost : " + x)
	}

	def price(n:Int)=n*24.95
	def discount(n:Int)=price(n)*0.4
	def shipping(n:Int)=if(n<50) n*3 else ((50*3)+(n-50)*0.75)
	def totCost(n:Int)=price(n)+shipping(n)-discount(n)

}