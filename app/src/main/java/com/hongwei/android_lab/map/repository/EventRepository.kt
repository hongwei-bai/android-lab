package com.hongwei.android_lab.map.repository

import com.hongwei.android_lab.map.room.EventDao
import javax.inject.Inject

class EventRepository @Inject constructor(
    private val eventDao: EventDao
) {
    fun test() {
        val dbResult = eventDao.getEvent("test")
    }
}