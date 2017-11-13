package helloandroid.br.com.deneb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
