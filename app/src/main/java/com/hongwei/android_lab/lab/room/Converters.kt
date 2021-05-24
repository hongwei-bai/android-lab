package com.hongwei.android_lab.lab.room

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

object Converters {
    @TypeConverter
    fun fromStringToPlayerEntity(value: String?): PlayerEntity? {
        val playerEntityType: Type = object : TypeToken<PlayerEntity?>() {}.type
        return Gson().fromJson(value, playerEntityType)
    }

    @TypeConverter
    fun fromPlayerEntity(playerEntity: PlayerEntity?): String? {
        val gson = Gson()
        return gson.toJson(playerEntity)
    }

    // List<PlayerEntity>
    @TypeConverter
    fun fromStringToPlayerEntityList(value: String?): List<PlayerEntity>? {
        val listType: Type = object : TypeToken<List<PlayerEntity>?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromPlayerEntityList(list: List<PlayerEntity>?): String? {
        val gson = Gson()
        return gson.toJson(list)
    }

    // List<String>
    @TypeConverter
    fun fromStringToList(value: String?): List<String>? {
        val listType: Type = object : TypeToken<List<String>?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromList(list: List<String>?): String? {
        val gson = Gson()
        return gson.toJson(list)
    }
}