package com.main.talkroulette.features.chat.video.sl

import com.main.talkroulette.core.sl.Core
import com.main.talkroulette.core.sl.Module
import com.main.talkroulette.features.chat.video.presentation.viewmodel.VideoChatViewModel

class VideoChatModule(private val core: Core) : Module<VideoChatViewModel> {
    override fun viewModel(): VideoChatViewModel {
        return VideoChatViewModel()
    }
}