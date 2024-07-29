import scala.io.StdIn._

object StudentRecordManager {
  
  def main(args: Array[String]): Unit = {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }

  // Function to get student information, validate, and return a tuple
  def getStudentInfo: (String, Int, Int, Double, Char) = {
    val name = readLine("Enter student's name: ")
    val marks = readLine("Enter student's marks: ").toInt
    val totalMarks = readLine("Enter total possible marks: ").toInt
    
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case n if n >= 90 => 'A'
      case n if n >= 75 => 'B'
      case n if n >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  // Function to print student record
  def printStudentRecord(studentInfo: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = studentInfo
    println(s"Name: $name")
    println(s"Marks: $marks")
    println(s"Total Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  // Function to validate input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0) {
      (false, Some("Marks must be a positive integer"))
    } else if (totalMarks <= 0) {
      (false, Some("Total marks must be a positive integer"))
    } else if (marks > totalMarks) {
      (false, Some("Marks cannot exceed total marks"))
    } else {
      (true, None)
    }
  }
  // Function to get student info with retry until valid data is provided
  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'F')
    
    while (!isValid) {
      try {
        val name = readLine("Enter student's name: ")
        val marks = readLine("Enter student's marks: ").toInt
        val totalMarks = readLine("Enter total possible marks: ").toInt
        
        val validation = validateInput(name, marks, totalMarks)
        if (validation._1) {
          val percentage = (marks.toDouble / totalMarks) * 100
          val grade = percentage match {
            case p if p >= 90 => 'A'
            case p if p >= 75 => 'B'
            case p if p >= 50 => 'C'
            case _ => 'D'
          }
          studentInfo = (name, marks, totalMarks, percentage, grade)
          isValid = true
        } else {
          println(s"Invalid input: ${validation._2.get}")
        }
      } catch {
        case e: NumberFormatException =>
          println("Invalid input: Marks and total possible marks must be integers.")
      }
    }
    
    studentInfo
  }
}
