package be.cetic.rtsgen.console

import java.io.File

import be.cetic.rtsgen.Main.{generate, config2Results}
import be.cetic.rtsgen.config.Configuration
import org.joda.time.format.DateTimeFormat
import spray.json._

import scala.io.Source

object Main
{
   def main(args: Array[String]): Unit =
   {
      val content = Source .fromFile(new File(args(0)))
         .getLines()
         .mkString("\n")

      val dtf = DateTimeFormat.forPattern("YYYY-MM-dd HH:mm:ss.SSS")

      val config = Configuration(content.parseJson)

      println("date;series;value")

      generate(config2Results(config)) foreach (e => println(dtf.print(e._1) + ";" + e._2 + ";" + e._3))
   }
}
