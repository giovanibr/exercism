class Raindrops {

    companion object {
        fun convert(a: Int): String {
            var conversion = ""
            if (a.rem(3) == 0) conversion = "Pling"
            if (a.rem(5) == 0) conversion = "${conversion}Plang"
            if (a.rem(7) == 0) conversion = "${conversion}Plong"
            if(conversion.isBlank()) conversion = a.toString()
            return conversion
        }
    }
}