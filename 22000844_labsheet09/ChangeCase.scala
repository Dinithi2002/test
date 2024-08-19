object ChangeCase{
  def main(args: Array[String]): Unit={

    println(formatNames("Benny")(toUpper));
    println(formatNames("Niroshan")(name => toUpper(name.take(2)) + name.drop(2)));
    println(formatNames("Saman")(toLower));
    println(formatNames("Kumara")(name => toUpper(name.take(1)) + toLower(name.drop(1).dropRight(1)) + toUpper(name.takeRight(1))));
  }

  def toUpper(x: String): String={
    x.toUpperCase;
  }

  def toLower(x: String): String={
    x.toLowerCase;
  }

  def formatNames(name: String)(func: String => String): String={
    func(name);
  }
}
