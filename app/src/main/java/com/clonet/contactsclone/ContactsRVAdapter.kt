package com.clonet.contactsclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.clonet.contactsclone.databinding.ActivityMainBinding
import com.clonet.contactsclone.databinding.ContactListBinding

class ContactsRVAdapter(var contactList: List<ContactsData>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding =ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var contact =contactList[position]
        holder.binding.tvName.text =contact.name
        holder.binding.tvEmail.text =contact.email
        holder.binding.tvNumber.text=contact.number
    }

    override fun getItemCount(): Int {
       return contactList.size
    }
}

class ContactsViewHolder(var binding: ContactListBinding):RecyclerView.ViewHolder(binding.root)