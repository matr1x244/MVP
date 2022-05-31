package com.geekbrains.mvp.presenter

import com.geekbrains.mvp.data.BaseRepository
import com.geekbrains.mvp.view.MainActivity
import com.geekbrains.mvp.view.MainActivityContract

class MainPresenter(private val baseRepo: BaseRepository) : BasePresenter {

    //Здесь будет ссылка на наше активити
    private var activity: MainActivityContract? = null

    //Этот метод буде вызыватся в активити и в параметр будет передеваться ссылка на активити через this
    override fun attach(activity: MainActivity) {
        this.activity = activity
    }

    override fun detach() {
        activity = null
    }

    override fun getDataFromRepository() {
        val data = baseRepo.getData()
        activity?.showData(data)
    }
}