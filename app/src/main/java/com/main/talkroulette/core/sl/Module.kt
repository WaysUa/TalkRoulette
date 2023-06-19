package com.main.talkroulette.core.sl

import androidx.lifecycle.ViewModel

interface Module<T : ViewModel> {
    fun viewModel(): T
}
