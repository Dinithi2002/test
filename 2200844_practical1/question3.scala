object question3{
	def main(args:Array[String])
	{
		var x=sphereVolume(5);
		println("Volume of sphere: ",x);
	}
	

	var (pi:Double)=3.14;
	def sphereVolume(r:Double)=(4*pi*r*r*r)/3;
}