package com.hongwei.android_lab.map.room

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "event")
data class EventEntity(
    @PrimaryKey
    val name: String,

    @Embedded
    val result: ResultEntity,

    val players: List<PlayerEntity> = emptyList()
)

@Entity
data class ResultEntity(
    val win: Boolean,
    val score: String
)

@Entity
data class PlayerEntity(
    val name: String,
    val age: Int,
    val number: Int
)