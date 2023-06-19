package com.main.talkroulette.core.sl

import com.main.talkroulette.main.presentation.communication.NavigationCommunication
import com.main.talkroulette.main.presentation.core.DispatchersList

interface Core : ProvideNavigation {

    fun provideDispatchers(): DispatchersList

    class Base : Core {

        private val navigationCommunication = NavigationCommunication.Base()

        private val dispatchersList by lazy {
            DispatchersList.Base()
        }

        override fun provideDispatchers() = dispatchersList
        override fun provideNavigation() = navigationCommunication
    }
}

interface ProvideNavigation {
    fun provideNavigation(): NavigationCommunication.Mutable
}