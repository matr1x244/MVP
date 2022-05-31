package com.geekbrains.mvp.presenter

import com.geekbrains.mvp.view.MainActivity

interface BasePresenter {

    fun attach(activity: MainActivity)

    fun detach()

    fun getDataFromRepository()

}