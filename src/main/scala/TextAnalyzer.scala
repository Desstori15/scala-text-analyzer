object TextAnalyzer {
  def main(args: Array[String]): Unit = {
    println("Enter your text line by line (type 'exit' to finish):")

    var inputLines = List[String]()
    var continue = true

    while (continue) {
      val line = scala.io.StdIn.readLine()
      if (line.toLowerCase == "exit") {
        continue = false
      } else {
        inputLines = line :: inputLines
      }
    }

    val text = inputLines.reverse.mkString("\n")
    val words = text.split("\\s+").filter(_.nonEmpty)
    val chars = text.toCharArray

    println(s"\nLines: ${inputLines.length}")
    println(s"Words: ${words.length}")
    println(s"Characters: ${chars.length}")
  }
}
