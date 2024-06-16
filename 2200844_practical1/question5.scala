object question5{

	def main(args:Array[String])
	{
		var x =  easy(2)+tempo(3)+easy(2);
		println("Total time : ",x);
	}

	 def easy(x:Int):Int=x*8;
	 def tempo(x:Int):Int=x*7;
}