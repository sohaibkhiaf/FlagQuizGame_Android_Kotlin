package com.example.flagquizgame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flagquizgame.databinding.ActivityMainBinding

private const val GAME : String = "GAME_FRAG"
private const val ARCH : String = "ARCH_FRAG"
private var selected : String? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spManager = SharedPreferencesManager(this)
        spManager.initializeCountries()

        if (selected == GAME || selected == null) {
            openGameFragment()
            selected = GAME
            binding.ivGameButton.setColorFilter(getColor(R.color.black))
            binding.ivDiscoverButton.setColorFilter(getColor(R.color.white))
        }

        binding.ivGameButton.setOnClickListener {
            // open game fragment
            if (selected != GAME) {
                openGameFragment()
                selected = GAME
                binding.ivGameButton.setColorFilter(getColor(R.color.black))
                binding.ivDiscoverButton.setColorFilter(getColor(R.color.white))
            }
        }

        binding.ivDiscoverButton.setOnClickListener {
            // open archive fragment
            if (selected != ARCH) {
                openDiscoverFragment()
                selected = ARCH
                binding.ivGameButton.setColorFilter(getColor(R.color.white))
                binding.ivDiscoverButton.setColorFilter(getColor(R.color.black))
            }
        }

    }


    private fun openGameFragment () {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_fragmentLayout, GameFragment())
            .commit()
    }

    private fun openDiscoverFragment () {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_fragmentLayout, DiscoverFragment())
            .commit()
    }


    /* TODO
    * 5 options not just 3
    * complete countries list
    * launcher activity using handler (shows logo, initializes shared preferences)
    * exit dialog when user clicks back button
    * try again. message when the user chooses a wrong answer
    * */
}

