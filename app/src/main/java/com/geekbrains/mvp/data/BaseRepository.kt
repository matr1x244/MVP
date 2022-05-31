package com.geekbrains.mvp.data

import com.geekbrains.mvp.entity.Profile

interface BaseRepository {

    fun getData(): Profile
}