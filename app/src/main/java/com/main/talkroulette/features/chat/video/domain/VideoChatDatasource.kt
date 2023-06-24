package com.main.talkroulette.features.chat.video.domain

import com.main.talkroulette.features.chat.video.data.VideoChatRequest

interface VideoChatDatasource {
    fun addVideoChatRequest(videoChatRequest: VideoChatRequest)
}