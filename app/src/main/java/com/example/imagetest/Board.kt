package com.example.imagetest

import java.io.Serializable

data class Board(
    var userId : String,
    var title : String,
    var content : String,
    var category : Int,
    var deadline : String
)
