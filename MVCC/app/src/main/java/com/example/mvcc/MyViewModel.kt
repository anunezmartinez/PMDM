package com.example.mvcc

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    // definimos la ronda actual
    val ronda = MutableLiveData<Int>()

    // inicializamos variables cuando instanciamos
    init {
        ronda.value = 1
    }

    /**
     * añadimos uno a la var ronda
     */
    fun sumarRonda() {
        // añadimos uno a la ronda
        // tenemos que chequear si es null
        // lo podemos hacer con un 'if'
        ronda.value = ronda.value?.plus(1)

    }
}