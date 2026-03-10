package dam.exer_vl

data class LibraryMember(
    val name: String,
    val membershipId: String,
    val borrowedBooks: MutableList<String> = mutableListOf()
)

class Library(val name: String) {
    private val books = mutableListOf<Book>()

    companion object { // companion object =~ static
        private var totalBooksAdded = 0

        fun getTotalBooksCreated(): Int {
            return totalBooksAdded
        }
    }

}