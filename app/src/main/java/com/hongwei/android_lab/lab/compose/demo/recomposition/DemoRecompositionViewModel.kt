package com.hongwei.android_lab.lab.compose.demo.recomposition

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject

@HiltViewModel
class DemoRecompositionViewModel @Inject constructor() : ViewModel() {
    val account: LiveData<DemoAccount> = liveData {
        emit(DemoAccount("Netbank Saver", "Netbank Saver", "$8.83"))
        delay(3000)
        emit(DemoAccount("Hongwei's saver account", "Netbank Saver", "$8.83"))
        delay(2500)
        emit(DemoAccount("Hongwei's saver account", "Netbank Saver", "$3.83"))
        delay(2500)
        emit(DemoAccount("Hongwei's saver account", "Netbank Saver", "-$12.99"))
    }
}