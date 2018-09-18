package org.hacking.nessieproj

import android.annotation.SuppressLint
import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import org.hacking.nessieproj.databinding.PizzaDataBinding
import org.hacking.nessieproj.models.Merchant

@SuppressLint("IncorrectAdapter")
class PizzaListAdapter(private val context: Context, private var dataList: List<Merchant>?) :
        RecyclerView.Adapter<PizzaListAdapter.CustomViewHolder>() {

    class CustomViewHolder(val binding: PizzaDataBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : PizzaDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.pizza_data, parent, false)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        dataList?.let {
            holder.binding.pizza = it[position]
        }
    }

    override fun getItemCount(): Int {
        return dataList?.let {
            it.size
        } ?: kotlin.run {
            0
        }
    }
}