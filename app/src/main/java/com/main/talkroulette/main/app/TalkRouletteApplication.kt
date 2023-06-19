package com.main.talkroulette.main.app

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.main.talkroulette.core.sl.Core
import com.main.talkroulette.core.sl.ProvideViewModel
import com.main.talkroulette.core.sl.ViewModelsFactory
import com.main.talkroulette.main.sl.DependencyContainer

class TalkRouletteApplication : Application(), ProvideViewModel {
    private lateinit var viewModelsFactory: ViewModelsFactory
    private lateinit var dependencyContainer: DependencyContainer.Base

    override fun onCreate() {
        super.onCreate()
        dependencyContainer = DependencyContainer.Base(core = Core.Base())
        viewModelsFactory = ViewModelsFactory(dependencyContainer)
    }

    override fun <T : ViewModel> provideViewModel(clazz: Class<T>, owner: ViewModelStoreOwner): T {
        return ViewModelProvider(owner, viewModelsFactory)[clazz]
    }
}