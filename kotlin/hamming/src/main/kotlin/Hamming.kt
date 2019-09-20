class Hamming {
    companion object {
        fun compute(strand1: String = "", strand2: String = "") : Int {

            if(strand1.length != strand2.length) throw IllegalArgumentException("left and right strands must be of equal length.")

            var hamming = 0

            strand1.toCharArray().forEachIndexed { i, c ->
                if(!c.equals(strand2.toCharArray()[i])) hamming++
            }

            return hamming

        }
    }
}