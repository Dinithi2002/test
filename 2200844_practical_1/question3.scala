object question3{
	def main(args:Array[String])
	{
		var x=sphereVolume(5)
		println("Volume of sphere: " + x)
	}
	

	def sphereVolume(r:Double)=(4*math.Pi*r*r*r)/3
}