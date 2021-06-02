package com.hongwei.android_lab.lab.compose.demo.dataflow

import androidx.lifecycle.asLiveData
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class DataFlowDemoPresenter @Inject constructor(
    repository: DataFlowDemoRepository
) {
    val accountNameFlow = repository.accountNameFlow.asLiveData()

    val accountNameRxObservable = repository.getAccountNameFromRxJava()
        .subscribeOn(Schedulers.io())
}