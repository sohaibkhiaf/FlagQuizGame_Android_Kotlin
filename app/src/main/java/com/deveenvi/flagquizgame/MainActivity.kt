package com.deveenvi.flagquizgame

import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.deveenvi.flagquizgame.databinding.ActivityMainBinding

private const val GAME : String = "GAME_FRAG"
private const val ARCH : String = "ARCH_FRAG"
private var selected : String? = null

class MainActivity : AppCompatActivity() {

    private var lastBackPressedTime : Long = 0
    private val exitInterval : Int = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(true) {

                override fun handleOnBackPressed() {
                    val currentTime = System.currentTimeMillis()

                    if ( (currentTime - lastBackPressedTime ) < exitInterval){
                        finishAffinity()
                    }else {
                        lastBackPressedTime = currentTime
                        Toast.makeText(
                            this@MainActivity,
                            getText(R.string.main_press_back).toString(),
                            Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        )

        if (selected == GAME || selected == null) {
            openGameFragment()
            selected = GAME
            binding.ivGameButton.setImageDrawable(getDrawable(R.drawable.icon_controller_selected))
            binding.ivDiscoverButton.setImageDrawable(getDrawable(R.drawable.icon_flag))
        }

        binding.ivGameButton.setOnClickListener {
            // open game fragment
            if (selected != GAME) {
                openGameFragment()
                selected = GAME
                binding.ivGameButton.setImageDrawable(getDrawable(R.drawable.icon_controller_selected))
                binding.ivDiscoverButton.setImageDrawable(getDrawable(R.drawable.icon_flag))
            }
        }

        binding.ivDiscoverButton.setOnClickListener {
            // open discover fragment
            if (selected != ARCH) {
                openDiscoverFragment()
                selected = ARCH
                binding.ivGameButton.setImageDrawable(getDrawable(R.drawable.icon_controller))
                binding.ivDiscoverButton.setImageDrawable(getDrawable(R.drawable.icon_flag_selected))
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

}

