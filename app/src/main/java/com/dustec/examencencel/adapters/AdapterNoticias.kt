package com.dustec.examencencel.adapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dustec.examencencel.models.NewsBean
import com.dustec.examencencel.R
import kotlinx.android.synthetic.main.card_news.view.*

class AdapterNoticias : RecyclerView.Adapter<AdapterNoticias.VH>() {

    var items:List<NewsBean> = listOf()
    set(value){
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_news,parent, false)
        return VH(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val noticia = items[position]
        holder.tvTitNews.text = noticia.titulo.toString()
        holder.tvTextoNews.text = noticia.texto.toString()
        holder.tvURLNews.text = noticia.urlWeb.toString()
    }

    class VH (vista: View) : RecyclerView.ViewHolder(vista) {
        val tvTitNews = vista.tvTitNews
        val tvTextoNews = vista.tvTextoNews
        val tvURLNews = vista.tvURLNews
    }
}