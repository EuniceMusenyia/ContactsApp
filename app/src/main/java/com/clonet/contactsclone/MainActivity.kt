package com.clonet.contactsclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.clonet.contactsclone.databinding.ActivityMainBinding
import com.clonet.contactsclone.databinding.ContactListBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = ContactsData("","Eunice","eunice@gmail.com","+254 710365365")
        var contact2 = ContactsData("","Wimmers","wimmers@gmail.com","+254 710486055")
        var contact3 = ContactsData("","Jannisa","janissa@gmail.com","+254 710389563")
        var contact4 = ContactsData("","Gabby","gabby@gmail.com","+254 71678365")
        var contact5 = ContactsData("","Lucas","lucas@gmail.com","+254 71965895")
        var contact6= ContactsData("","Nelson","nelson@gmail.com","+254 71459665")
        var contact7 = ContactsData("","Marie","marie@gmail.com","+254 710374903")
        var contact8 = ContactsData("","Amanda","amanda@gmail.com","+254 720254763")
        var contact9 = ContactsData("","Leon","leo@gmail.com","+254 778405385")
        var contact10 = ContactsData("","Glen","glen@gmail.com","+254 7579496550")
        var contactList = listOf<ContactsData>(contact1,contact2, contact3, contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        var contactsAdapter = ContactsRVAdapter(contactList)
        binding.rvContacts.adapter = contactsAdapter

         }
}