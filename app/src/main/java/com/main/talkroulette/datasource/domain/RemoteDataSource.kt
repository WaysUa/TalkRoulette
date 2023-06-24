package com.main.talkroulette.datasource.domain

import com.main.talkroulette.features.chat.video.data.VideoChatRequest

interface RemoteDataSource {

    fun addVideoChatRequest(videoChatRequest: VideoChatRequest)
}