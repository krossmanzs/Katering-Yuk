package com.krossmanzs.kateringyuk.data

import com.krossmanzs.kateringyuk.R

data class Food (
    var name: String,
    var detail: String,
    var price: String,
    var photo: Int = 0,
    var rating: Int = R.drawable.one_star
        )