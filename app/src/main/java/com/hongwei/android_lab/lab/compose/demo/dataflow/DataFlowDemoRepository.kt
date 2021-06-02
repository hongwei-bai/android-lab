package com.hongwei.android_lab.lab.compose.demo.dataflow

import io.reactivex.Observable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class DataFlowDemoRepository @Inject constructor() {
    private val channel = Channel<String>()

    val accountNameFlow = channel.consumeAsFlow()

    init {
        GlobalScope.launch(Dispatchers.IO) {
            startQuery()
        }
    }

    private suspend fun startQuery() {
        delay(3000)
        channel.send("Netbank Saver from Flow")
        delay(3000)
        channel.send("Netbank Saver from Flow 2")
        delay(3000)
        channel.send("Netbank Saver from Flow 3")
    }

    fun getAccountNameFromRxJava(): Observable<String> =
        Observable.create {
            Thread.sleep(3000)
            it.onNext("Netbank Saver from Rx")
            Thread.sleep(3000)
            it.onNext("Netbank Saver from Rx 2")
            Thread.sleep(3000)
            it.onNext("Netbank Saver from Rx 3")
            it.onComplete()
        }
}