package com.marciotomazoni.controleganhos.models

data class RegistroDiario(

    val data: String,

    val kmRodados: Double,

    val ganhos: Double,

    val combustivel: Double,

    val outrasDespesas: Double,

    val observacao: String

)