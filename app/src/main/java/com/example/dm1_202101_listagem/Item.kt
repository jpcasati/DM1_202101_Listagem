package com.example.dm1_202101_listagem

import java.io.Serializable

data class Item(
    val id: Int,
    val nome: String,
    val preco: Float
) : Serializable {

    override fun toString(): String {

        val str = "ID: "+id+" - NOME: "+nome+" - PREÇO: R$"+preco
        return str

    }

}