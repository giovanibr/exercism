fun transcribeToRna(dna: String): String {
    var rna = ""
    dna.forEach { c ->
        with(c){
            when {
                equals('C') -> rna = rna + 'G'
                equals('G') -> rna = rna + 'C'
                equals('T') -> rna = rna + 'A'
                equals('A') -> rna = rna + 'U'
            }
        }
    }

    println(rna)
    return rna
}