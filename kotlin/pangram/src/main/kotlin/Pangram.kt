class Pangram{

    companion object{

        var alphabet = "abcdefghijklmnopqrstuvwxyz"

        fun isPangram(sentence:String): Boolean{

            var s_alphabet = ""

            alphabet.toCharArray().forEach {
                if(sentence.toLowerCase().contains(it))
                    s_alphabet = s_alphabet.plus(it)
            }

            if(alphabet.equals(s_alphabet)) return true
            return false
        }
    }
}
