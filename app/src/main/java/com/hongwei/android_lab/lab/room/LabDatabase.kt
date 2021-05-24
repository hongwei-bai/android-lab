package com.hongwei.android_lab.lab.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [EventEntity::class], version = 1)
@TypeConverters(value = [Converters::class])
abstract class LabDatabase : RoomDatabase() {
    abstract fun eventDao(): EventDao
}