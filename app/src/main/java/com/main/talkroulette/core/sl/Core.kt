package com.main.talkroulette.core.sl

import com.main.notelink.main.presentation.DispatchersList

interface Core {

    fun provideDispatchers(): DispatchersList

    class Base : Core {

        private val dispatchersList by lazy {
            DispatchersList.Base()
        }

        override fun provideDispatchers() = dispatchersList
    }
}
