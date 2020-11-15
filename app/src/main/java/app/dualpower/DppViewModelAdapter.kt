package app.dualpower

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DppViewModelAdapter : RecyclerView.Adapter<DppViewHolder>() {

    private val data = emptyList<DppViewModel>().toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DppViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DppViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = data.size
}