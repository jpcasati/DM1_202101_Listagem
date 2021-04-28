package com.example.dm1_202101_listagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var itens = arrayListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        atualizarLista()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.menu_novo_item) {
//            startActivity(Intent(this, CadastroItem::class.java))
            startActivityForResult(Intent(this, CadastroItem::class.java), 1)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == 1) {
            itens.add(data!!.getSerializableExtra("item") as Item)
            atualizarLista()
        }
    }

    fun atualizarLista() {
        val adp = ArrayAdapter(this, android.R.layout.simple_list_item_1, itens)

        lstItem.adapter = adp
    }

}