package com.example.dm1_202101_listagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro_item.*

class CadastroItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_item)

        btnSalvar.setOnClickListener {

            val item =
                Item(edtId.text.toString().toInt(), edtNome.text.toString(), edtPreco.text.toString().toFloat())

            intent.putExtra("item", item)

            setResult(1, intent)

            finish()

        }

    }
}