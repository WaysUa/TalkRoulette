package com.main.talkroulette.features.chat.video.presentation.ui

import android.os.Bundle
import android.view.View
import com.main.talkroulette.core.data.BaseFragment
import com.main.talkroulette.databinding.FragmentVideoChatBinding
import com.main.talkroulette.features.chat.video.presentation.viewmodel.VideoChatViewModel

class VideoChatFragment : BaseFragment<VideoChatViewModel>() {

    override val viewModelClass: Class<VideoChatViewModel> = VideoChatViewModel::class.java
    override val binding by lazy { FragmentVideoChatBinding.inflate(layoutInflater) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}