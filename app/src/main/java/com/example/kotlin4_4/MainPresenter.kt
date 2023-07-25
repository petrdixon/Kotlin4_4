package com.example.kotlin4_4

import moxy.MvpPresenter

class MainPresenter (val converter: Converter) : MvpPresenter<MainView>() { // converter это Model
    override fun onFirstViewAttach() { // работает только при запуске приложения/первом присоединении View
    }
    override fun attachView(view: MainView?) { // работает при запуске приложения и поворотах экрана/при каждом присоединении View
        super.attachView(view)
    }
    fun startConvert(){
        val textStatus = converter.convertJpgToPng() // запускаю конвертацию файла
        viewState.displayStatus(textStatus) // показываю статус конвертации на экране

        println("test")
    }


}
