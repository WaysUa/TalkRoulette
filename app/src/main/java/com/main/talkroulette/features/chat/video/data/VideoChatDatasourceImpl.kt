package com.main.talkroulette.features.chat.video.data

import com.main.talkroulette.datasource.domain.RemoteDataSource
import com.main.talkroulette.features.chat.video.domain.VideoChatDatasource

class VideoChatDatasourceImpl(
    private val remoteDataSource: RemoteDataSource
) : VideoChatDatasource {

    override fun addVideoChatRequest(videoChatRequest: VideoChatRequest) {
        TODO("Not yet implemented")
    }
}