package io.github.boogiemonster1o1

object BruteForcede {
	def main(args: Array[String]): Unit = {
		var total = 0
		var matches = 0
		for (a <- 0 until 365) {
			for (b <- 0 until 365) {
				for (c <- 0 until 365) {
					for (d <- 0 until 365) {
						if (!(a == b || a == c || a == d || b == c || b == d || c == d)) {
							matches += 1
						}
						total += 1
					}
				}
			}
		}
		print("Percent: " + (matches.toDouble / total.toDouble))
	}
}
