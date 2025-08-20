import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Lista de itens para comprar
    private val listaCompras = listOf(
        "Pão",
        "Leite",
        "Ovos",
        "Arroz",
        "Feijão",
        "Frutas",
        "Verduras",
        "Carne",
        "Sabonete",
        "Shampoo"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        criarListaCompras()
    }

    private fun criarListaCompras() {
        val container = findViewById<View>(R.id.containerLista) as LinearLayout
        
        for (item in listaCompras) {
            val textView = TextView(this).apply {
                text = "• $item"
                textSize = 18f
                setPadding(0, 8, 0, 8) // Espaçamento entre os itens
            }
            container.addView(textView)
        }
    }
}
