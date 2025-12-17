package com.deveenvi.flagquizgame

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.deveenvi.flagquizgame.database.CountryDatabase
import com.deveenvi.flagquizgame.database.DatabaseInitializer
import kotlinx.coroutines.Runnable

class SplashActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())
    private lateinit var runnable : Runnable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // initialize countries db
        val db = CountryDatabase.getDatabase(this)
        val countryDao = db.countryDao()
        DatabaseInitializer().initializeDatabase(countryDao, lifecycleScope)

        runnable = Runnable {

            // open main activity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        handler.postDelayed(runnable, 2000)

    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable)
    }
}