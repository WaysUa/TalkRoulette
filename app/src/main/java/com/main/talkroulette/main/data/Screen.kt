package com.main.talkroulette.main.data

import com.main.talkroulette.core.data.BaseFragment
import com.main.talkroulette.features.chat.video.presentation.ui.VideoChatFragment

sealed class Screen {

    abstract fun fragment(): Class<out BaseFragment<*>>

    object VideoChatScreen : Screen() {
        override fun fragment(): Class<out BaseFragment<*>> = VideoChatFragment::class.java
    }
}