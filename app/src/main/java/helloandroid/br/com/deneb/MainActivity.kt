package helloandroid.br.com.deneb
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import helloandroid.br.com.deneb.DebugActivity

class MainActivity : DebugActivity(){
    private val context: Context get() = this
    override fun onCreate(icicle: Bundle?){
        super.onCreate(icicle)
        setContentView(R.layout.activity_main)
        btLogin.setOnClickListener { onClickLogin() }
    }
    fun onClickLogin(){
        val login = getTextString(R.id.tLogin)
        val senha = getTextString(R.id.tSenha)
        if ("viktor" == login && "12345" == senha){
            val intent = Intent(context, BemVindoActivity::class.java)
            val params = Bundle()
            params.putString("nome", "Viktor Rocha")
            intent.putExtras(params)
            startActivity(intent)

        } else {
            toast("Login e senha incorretos")
        }

    }



}
