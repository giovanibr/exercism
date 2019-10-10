object Hamming {

    fun compute(strand1: String = "", strand2: String = ""): Int {
        require(strand1.length == strand2.length) { "left and right strands must be of equal length." }

        val pair: List<Pair<Char, Char>> = strand1.toCharArray().zip(strand2.toCharArray())
        println(pair)

        var hamming = 0

        pair.forEach {
            if (!(it.first == it.second))
                hamming++
        }

        return hamming
    }
}