package org.hacking.nessieproj

import android.annotation.SuppressLint
import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import org.hacking.nessieproj.databinding.CustomerAccountBinding

@SuppressLint("IncorrectAdapter")
class CustomAdapter(private val context: Context, private val dataList: List<CustomerAccount>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class CustomViewHolder(val binding: CustomerAccountBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : CustomerAccountBinding = DataBindingUtil.inflate(layoutInflater, R.layout.customer_account, parent, false)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.customerAccount = dataList.get(position)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}