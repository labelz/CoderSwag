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
        categoriesView = LayoutInflater.from(context).inflate(R.layout.activity_category_list, null)
        val categoryImage: ImageView = categoriesView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoriesView.findViewById(R.id.categoryName)
        var category = categories[position]
        var resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)
        categoryName.text = category.title

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
}