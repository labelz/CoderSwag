package Adepter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.arach.coderswag.Model.Category
import com.example.arach.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoriesView: View
        val holder: ViewHolder
        if (convertView == null) {
            holder = ViewHolder()
            categoriesView = LayoutInflater.from(context).inflate(R.layout.activity_category_list, null)
            holder.categoryImage = categoriesView.findViewById(R.id.categoryImage)
            holder.categoryName = categoriesView.findViewById(R.id.categoryName)
            categoriesView.tag = holder
        } else {

            holder = convertView.tag as ViewHolder
            categoriesView = convertView
        }

        var category = categories[position]
        var resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
//        println(resourceId)
        holder.categoryName?.text = category.title

        return categoriesView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder() {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}