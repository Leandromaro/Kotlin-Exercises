fun String.unique(): Boolean {
    // O(n) complexity
    val values: MutableMap<Char, Boolean> = emptyMap<Char, Boolean>().toMutableMap()
    this.forEach { w ->
        when {
            values[w] == true -> return false
            else -> values[w] = true
        }
    }
    return true
}
