package com.geekbrains.mvp.data

import com.geekbrains.mvp.entity.Profile

class RepoImpl : BaseRepository {

    override fun getData(): Profile {
        return Profile(0,"Илья")
    }
}