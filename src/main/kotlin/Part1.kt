import java.io.File

fun main(args: Array<String>) {
  val values = File("./src/main/resources/part1Input.txt")
    .readLines()
    .map { it.windowed(8,8).map { it.toInt(2) } }

  values
    .map { findPassLetter(it) }
    .map { it.toChar() }
    .joinToString("")
    .let { println(it) }
}

fun findPassLetter(row: List<Int>): Int {
  var index = row.dropWhile { it >= row.size }.first()
  while (index < row.size) {
   index = row[index]
  }
  return index
}
