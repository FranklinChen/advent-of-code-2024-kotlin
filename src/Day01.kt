fun main() {
    fun part1(input: List<String>): Int {
        // Parse the input into two lists, v0 and v1.
        val white = "\\s+".toRegex()
        val (v0, v1) = input.map { line ->
            line.split(white).map { it.toInt() }.let { it[0] to it[1] }
        }.unzip()

        // Sort both lists.
        val sortedV0 = v0.sorted()
        val sortedV1 = v1.sorted()

        return sortedV0.zip(sortedV1).sumOf { (n0, n1) -> kotlin.math.abs(n0 - n1) }
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // Test if implementation meets criteria from the description, like:
    //check(part1(listOf("test_input")) == 1)

    // Or read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 11)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
