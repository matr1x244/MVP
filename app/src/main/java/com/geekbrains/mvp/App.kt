package com.geekbrains.mvp

import android.app.Application
import com.geekbrains.mvp.data.RepoImpl
import com.geekbrains.mvp.presenter.BasePresenter
import com.geekbrains.mvp.presenter.MainPresenter

class App : Application() {

    //Переменные для наших компонентов
    val presenter: BasePresenter by lazy { MainPresenter(RepoImpl()) }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
    //Здесь у нас экземпляр нашего класса Application через который у нас будет доступ к нашим компонентам
    companion object {
        lateinit var instance: App
            private set
    }
}
