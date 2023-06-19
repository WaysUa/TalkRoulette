package com.main.talkroulette.main.sl

import com.main.talkroulette.core.sl.Core
import com.main.talkroulette.core.sl.Module
import com.main.talkroulette.main.presentation.viewmodel.MainViewModel

class MainModule(private val core: Core) : Module<MainViewModel> {

    override fun viewModel() = MainViewModel(
        navigationCommunication = core.provideNavigation()
    )
}