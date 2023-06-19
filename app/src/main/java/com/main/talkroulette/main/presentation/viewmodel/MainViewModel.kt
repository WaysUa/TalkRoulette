package com.main.talkroulette.main.presentation.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.main.talkroulette.main.data.Screen
import com.main.talkroulette.main.domain.Init
import com.main.talkroulette.main.presentation.communication.Communication
import com.main.talkroulette.main.presentation.communication.NavigationCommunication
import com.main.talkroulette.main.presentation.core.NavigationStrategy

class MainViewModel(
    private val navigationCommunication: NavigationCommunication.Mutable
) : ViewModel(), Init, Communication.Observe<NavigationStrategy> {

    override fun init(isFirstRun: Boolean) {
        if (isFirstRun) {
            navigationCommunication.map(NavigationStrategy.Replace(Screen.VideoChatScreen))
        }
    }

    override fun observe(owner: LifecycleOwner, observer: Observer<NavigationStrategy>) {
        navigationCommunication.observe(owner, observer)
    }
}