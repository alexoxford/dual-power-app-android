package app.dualpower

data class DppModel(
    val projectName: String,
    val imgUrl: String,
    val description: String
) {
    companion object {
        // TODO remove this test method
        fun getTestDppModel(i: Int) = DppModel(
            projectName = "Test Entry #$i",
            imgUrl = "https://picsum.photos/200.jpg?random=$i",
            description = "#$i: This is the description for Test Entry #$i.\n" +
                    "It is multiline."
        )
    }
}