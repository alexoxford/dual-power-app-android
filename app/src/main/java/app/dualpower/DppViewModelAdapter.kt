package app.dualpower

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class DppViewModelAdapter : RecyclerView.Adapter<DppViewHolder>() {

    private val data = emptyList<DppModel>().toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DppViewHolder {
        return DppViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_dpp, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DppViewHolder, position: Int) {
        val item = data[position]
        holder.projectName.text = item.projectName
        holder.description.text = item.description

        Picasso.get().apply {
            setIndicatorsEnabled(true)
            isLoggingEnabled = true
        }
            .load(item.imgUrl)
            .into(holder.projectIcon)
    }

    override fun getItemCount() = data.size

    fun setData(models: List<DppModel>) {
        data.clear()
        data.addAll(models)
    }
}