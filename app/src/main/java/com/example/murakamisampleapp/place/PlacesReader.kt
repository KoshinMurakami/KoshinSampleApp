package com.example.murakamisampleapp.place

import android.content.Context
import com.example.murakamisampleapp.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStream
import java.io.InputStreamReader

class PlacesReader(private val context: Context) {

    // JSONパーサー
    private val gson = Gson()

    // /res/raw/places.jsonの内容を読み取る
    private val inputStream: InputStream
        get() = context.resources.openRawResource(R.raw.places)

    // places.jsonから読み取ったPlaceをリストにして返却する
    fun read(): List<Place> {
        val itemType = object : TypeToken<List<PlaceResponse>>() {}.type
        val reader = InputStreamReader(inputStream)
        return gson.fromJson<List<PlaceResponse>>(reader, itemType).map {
            it.toPlace()
        }
    }
}