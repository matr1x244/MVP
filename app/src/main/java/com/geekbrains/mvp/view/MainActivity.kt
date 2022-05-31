package com.geekbrains.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.geekbrains.mvp.App
import com.geekbrains.mvp.R
import com.geekbrains.mvp.entity.Profile
import com.geekbrains.mvp.presenter.BasePresenter

class MainActivity : AppCompatActivity(), MainActivityContract {

    //Создаем переменную под наш презентер
    private lateinit var presenter: BasePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Инициализируем наш презентер уже созданным презентером из класса App
        presenter = App.instance.presenter
        //Передаем в презентер ссылку на наше активити
        presenter.attach(this)

        btn()
    }

    private fun btn() {
        val btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            presenter.getDataFromRepository()
        }
    }

    override fun showData(profile: Profile) {
        val textView: TextView = findViewById(R.id.name)
        textView.text = profile.name
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}