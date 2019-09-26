class Isogram {
    companion object {
        fun isIsogram(word: String): Boolean {

            val wordArray = word.toLowerCase()
                    .replace("-","")
                    .replace(" ","")
                    .toCharArray()

            if(wordArray.size == wordArray.distinct().size) return true
            return false
        }
    }
}