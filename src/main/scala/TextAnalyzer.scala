object TextAnalyzer {
  def main(args: Array[String]): Unit = {
    println("Enter your text (type 'exit' to finish):")

    var inputLines = List[String]()
    var line = ""

    do {
      line = scala.io.StdIn.readLine()
      if (line != "exit") inputLines ::= line
    } while (line != "exit")

    val text = inputLines.reverse.mkString("\n")
    val words = text.split("\\s+").filter(_.nonEmpty)
    val chars = text.toCharArray

    println(s"Lines: ${inputLines.length}")
    println(s"Words: ${words.length}")
    println(s"Characters: ${chars.length}")
  }
}
