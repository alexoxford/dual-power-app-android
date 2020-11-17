package app.dualpower

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DppViewModel {
    private val projectName = MutableLiveData<String>("")
    private val imgUrl = MutableLiveData<String>("")
    private val description = MutableLiveData<String>("")

    fun projectName(): LiveData<String> = projectName
    fun imgUrl(): LiveData<String> = imgUrl
    fun description(): LiveData<String> = description

    // TODO remove this test method
    fun populateForTestingOnly(i: Int) {
        projectName.value = "Test Entry #$i"
        imgUrl.value = "https://picsum.photos/200.jpg"
        description.value = "#$i: This is the description for Test Entry #$i." +
                "It is multiline." +
                "🤯🤯🤯"
    }
}