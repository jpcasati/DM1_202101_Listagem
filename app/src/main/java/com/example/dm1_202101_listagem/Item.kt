package com.example.dm1_202101_listagem

import java.io.Serializable

data class Item(
    val id: Int,
    val nome: String,
    val preco: Float
) : Serializable {
}