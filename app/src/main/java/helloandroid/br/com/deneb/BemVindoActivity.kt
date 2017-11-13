package helloandroid.br.com.deneb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import  helloandroid.br.com.deneb.DebugActivity

class BemVindoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)
        val textview = findViewById<TextView>(R.id.text)
        //Args
        val args = intent.extras
        val nome = args.getString("nome")
        textview.text = "$nome, seja bem-vindo."
    }
}
