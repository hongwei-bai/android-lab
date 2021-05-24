package com.hongwei.android_lab.lab.repository

import com.hongwei.android_lab.lab.room.EventDao
import javax.inject.Inject

class EventRepository @Inject constructor(
    private val eventDao: EventDao
) {
    fun test() {
        val dbResult = eventDao.getEvent("test")
    }
}