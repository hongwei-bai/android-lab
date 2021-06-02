package com.hongwei.android_lab.lab.compose.demo.dataflow

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DataFlowDemoViewModel @Inject constructor(
    repository: DataFlowDemoRepository
) : ViewModel() {
    val accountName: LiveData<String> = liveData {
        delay(3000)
        emit("Netbank Saver")
        delay(3000)
        emit("Netbank Saver 2")
        delay(3000)
        emit("Netbank Saver 3")
    }

    val accountNameFromFlow: LiveData<String> = repository.accountNameFlow.asLiveData()

    val accountNameFromRx: MutableLiveData<String> = MutableLiveData()

    init {
        repository.getAccountNameFromRxJava()
            .subscribeOn(Schedulers.io())
            .subscribe({
                accountNameFromRx.postValue(it)
            }, {

            })
    }
}