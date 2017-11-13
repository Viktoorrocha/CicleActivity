package helloandroid.br.com.deneb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class DebugActivity : AppCompatActivity(){
    private val TAG = "Placas"
    //Nome da classe sem pacote
    private val className: String
    get(){
        val s = javaClass.name
        return s.substring(s.lastIndexOf("."))
    }

    override fun onCreate(icicle: Bundle?){
        super.onCreate(icicle)
        Log.d(TAG, className + ".onCreate() Chamado: " + icicle)
    }
    override fun onStart(){
        super.onStart()
        Log.d(TAG, className + ".onStart() Chamado.")
    }
    override fun onRestart(){
        super.onRestart()
        Log.d(TAG, className + ".onRestart() Chamado")
    }
    override  fun onResume(){
        super.onResume()
        Log.d(TAG, className + ".onResume() Chamado")
    }
    override fun onPause(){
        super.onPause()
        Log.d(TAG, className + ".onPause() Chamado")
    }
    override fun onSaveInstanceState(outState: Bundle){
        super.onSaveInstanceState(outState)
        Log.d(TAG, className + ".onSaveInstanceState() chamado")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, className + ".onDestroy() Chamado")
    }
}

