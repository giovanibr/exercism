fun twofer(vararg names: String): String{
    if(names.isNotEmpty())
        return "One for ${names[0]}, one for me."
    return "One for you, one for me."
}