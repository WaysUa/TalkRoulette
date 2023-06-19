package com.main.talkroulette.main.sl

import androidx.lifecycle.ViewModel
import com.main.talkroulette.core.sl.Core
import com.main.talkroulette.core.sl.Module
import com.main.talkroulette.features.chat.video.presentation.viewmodel.VideoChatViewModel
import com.main.talkroulette.features.chat.video.sl.VideoChatModule

interface DependencyContainer {

    fun <T : ViewModel> module(clazz: Class<T>): Module<*>

    class Error : DependencyContainer {
        override fun <T : ViewModel> module(clazz: Class<T>): Module<*> {
            throw IllegalStateException("no module found for $clazz")
        }
    }

    class Base(
        private val core: Core,
        private val dependencyContainer: DependencyContainer = Error()
    ) : DependencyContainer {

        override fun <T : ViewModel> module(clazz: Class<T>): Module<*> = when (clazz) {
            VideoChatViewModel::class.java -> VideoChatModule(core)
            else -> dependencyContainer.module(clazz)
        }
    }
}
