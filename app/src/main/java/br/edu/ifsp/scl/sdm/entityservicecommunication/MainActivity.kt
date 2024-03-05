package br.edu.ifsp.scl.sdm.entityservicecommunication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.scl.sdm.entityservicecommunication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)
        with (amb) {
            mainTb.apply {
                getString(R.string.app_name).also { setTitle(it) }
                setSupportActionBar(this)
            }
            incrementBt.setOnClickListener {

            }
        }
    }
}