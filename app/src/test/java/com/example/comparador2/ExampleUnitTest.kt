import org.junit.Assert.*
import org.junit.Test
import viewmodel.MyViewModel

class MyViewModelTest {

    @Test
    fun compararTextos_textosIguales_retornaTrue() {
        val viewModel = MyViewModel()
        val resultado = viewModel.compararTextos("Hola", "Hola")
        assertTrue(resultado)
    }

    @Test
    fun compararTextos_textosDiferentes_retornaFalse() {
        val viewModel = MyViewModel()
        val resultado = viewModel.compararTextos("Hola", "Mundo")
        assertFalse(resultado)
    }
}
