package app.dualpower

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val projectName: TextView = itemView.findViewById(R.id.project_name)
    val projectIcon: ImageView = itemView.findViewById(R.id.project_icon)
    val description: TextView = itemView.findViewById(R.id.short_description)
}