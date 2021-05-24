package com.hongwei.android_lab.lab.rx3

import android.util.Log
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.schedulers.Schedulers

class Rx3Test {
    fun testMergeCompletables() {
        val c1 = Completable.create {
            Log.d("bbbb", "c1 start...")
            Thread.sleep(2000)
            Log.d("bbbb", "c1 finish")
        }.subscribeOn(Schedulers.io())

        val c2 = Completable.create {
            Log.d("bbbb", "c2 start...")
            Thread.sleep(3000)
            Log.d("bbbb", "c2 finish")
        }.subscribeOn(Schedulers.io())

//        c1.mergeWith(c2).subscribe {
//            Log.d("bbbb", "concatWith finish")
//        }
        val decisionId: String? = null//"123"
        c1.run {
            decisionId?.let {
                mergeWith(c2)
            } ?: this
        }.subscribe {
            Log.d("bbbb", "concatWith finish")
        }
    }
}