package viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    fun compararTextos(texto1: String, texto2: String): Boolean {
        return texto1 == texto2
    }
}
