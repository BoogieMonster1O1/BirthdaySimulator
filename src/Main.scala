package io.github.boogiemonster1o1

import scala.collection.mutable.ListBuffer

object Main {
	def main(args: Array[String]): Unit = {
		val people: Int = 45
		val total = 10000
		val percents = ListBuffer.empty[Double]
		val expected1 = 94.0
		val expected2 = 93.4
		for (_ <- 0 until 100) {
			var successes = 0
			for (_ <- 0 until total) {
				val birthdays = (0 until people).map(_ => scala.util.Random.nextInt(365))
				if (birthdays.distinct.size != birthdays.size) {
					successes += 1
				}
			}
			percents.addOne(successes.toDouble / total * 100.0)
		}
		val deviations1 = percents.map(_ - expected1)
		val deviations2 = percents.map(_ - expected2)
		val average1 = deviations1.sum / deviations1.size
		val average2 = deviations2.sum / deviations2.size
		println(s"Average Deviation 94.0%: $average1")
		println(s"Average Deviation 93.4%: $average2")
	}
}
