package com.sf.udcw2.adapter

import android.content.Context
import android.widget.ArrayAdapter
import android.widget.Filter
import androidx.annotation.LayoutRes
import androidx.annotation.NonNull

/**
 * بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ
 * Created By Fahmi on 22/02/21
 */

class MaterialSpinnerAdapter<String>(context: Context, layout: Int, var values: Array<String>) :
    ArrayAdapter<String>(context, layout, values) {
    private val filterThatNothing = object: Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val results = FilterResults()
            results.values = values
            results.count = values.size
            return results
        }
        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            notifyDataSetChanged()
        }
    }

    override fun getFilter(): Filter {
        return filterThatNothing
    }
}