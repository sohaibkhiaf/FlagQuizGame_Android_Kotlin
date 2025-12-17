package com.deveenvi.flagquizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.deveenvi.flagquizgame.database.CountryDatabase
import kotlinx.coroutines.launch

class GameFragment : Fragment() {

    // views declaration
    private lateinit var nextButtonTv : TextView
    private lateinit var messageTv : TextView
    private lateinit var qFlagIv : ImageView

    // options
    private lateinit var option1Tv : TextView
    private lateinit var option1CorrectIv : ImageView
    private lateinit var option1WrongIv : ImageView

    private lateinit var option2Tv : TextView
    private lateinit var option2CorrectIv : ImageView
    private lateinit var option2WrongIv : ImageView

    private lateinit var option3Tv : TextView
    private lateinit var option3CorrectIv : ImageView
    private lateinit var option3WrongIv : ImageView

    private lateinit var option4Tv : TextView
    private lateinit var option4CorrectIv : ImageView
    private lateinit var option4WrongIv : ImageView

    private lateinit var option5Tv : TextView
    private lateinit var option5CorrectIv : ImageView
    private lateinit var option5WrongIv : ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // questioned flag initialization
        qFlagIv = view.findViewById(R.id.gameFragment_iv_flag)

        // options initialization
        option1Tv = view.findViewById(R.id.gameFragment_tv_option1)
        option1CorrectIv = view.findViewById(R.id.gameFragment_iv_option1Correct)
        option1WrongIv = view.findViewById(R.id.gameFragment_iv_option1Wrong)
        option2Tv = view.findViewById(R.id.gameFragment_tv_option2)
        option2CorrectIv = view.findViewById(R.id.gameFragment_iv_option2Correct)
        option2WrongIv = view.findViewById(R.id.gameFragment_iv_option2Wrong)
        option3Tv = view.findViewById(R.id.gameFragment_tv_option3)
        option3CorrectIv = view.findViewById(R.id.gameFragment_iv_option3Correct)
        option3WrongIv = view.findViewById(R.id.gameFragment_iv_option3Wrong)
        option4Tv = view.findViewById(R.id.gameFragment_tv_option4)
        option4CorrectIv = view.findViewById(R.id.gameFragment_iv_option4Correct)
        option4WrongIv = view.findViewById(R.id.gameFragment_iv_option4Wrong)
        option5Tv = view.findViewById(R.id.gameFragment_tv_option5)
        option5CorrectIv = view.findViewById(R.id.gameFragment_iv_option5Correct)
        option5WrongIv = view.findViewById(R.id.gameFragment_iv_option5Wrong)

        // next button initialization
        nextButtonTv = view.findViewById(R.id.gameFragment_tv_nextButton)

        // message text
        messageTv = view.findViewById(R.id.gameFragment_tv_message)

        generateQuestion()

        nextButtonTv.setOnClickListener {
            resetOptions()
            generateQuestion()
            nextButtonTv.visibility = View.INVISIBLE
        }

    }

    private fun resetOptions() {
        messageTv.text = getText(R.string.game_choose)

        option1Tv.setBackgroundResource(R.drawable.normal_option_bg)
        option1Tv.setTextColor(requireContext().getColor( R.color.black))
        option1CorrectIv.visibility = View.GONE
        option1WrongIv.visibility = View.GONE

        option2Tv.setBackgroundResource(R.drawable.normal_option_bg)
        option2Tv.setTextColor(requireContext().getColor( R.color.black))
        option2CorrectIv.visibility = View.GONE
        option2WrongIv.visibility = View.GONE

        option3Tv.setBackgroundResource(R.drawable.normal_option_bg)
        option3Tv.setTextColor(requireContext().getColor( R.color.black))
        option3CorrectIv.visibility = View.GONE
        option3WrongIv.visibility = View.GONE

        option4Tv.setBackgroundResource(R.drawable.normal_option_bg)
        option4Tv.setTextColor(requireContext().getColor( R.color.black))
        option4CorrectIv.visibility = View.GONE
        option4WrongIv.visibility = View.GONE

        option5Tv.setBackgroundResource(R.drawable.normal_option_bg)
        option5Tv.setTextColor(requireContext().getColor( R.color.black))
        option5CorrectIv.visibility = View.GONE
        option5WrongIv.visibility = View.GONE
    }

    private fun generateQuestion() {

        val db = CountryDatabase.getDatabase(requireContext())
        val countryDao = db.countryDao()

        lifecycleScope.launch {

            // retrieve 3 random countries
            val c1 = countryDao.getRandomCountry()
            val c2 = countryDao.getRandomCountry(c1.id)
            val c3 = countryDao.getRandomCountry(c1.id, c2.id)
            val c4 = countryDao.getRandomCountry(c1.id, c2.id, c3.id)
            val c5 = countryDao.getRandomCountry(c1.id, c2.id, c3.id, c4.id)
            val countries = listOf(c1, c2, c3, c4, c5)

            // select questioned flag country
            val qCountry = countries.random()

            // retrieve questioned flag
            val flagResID = resources.getIdentifier(qCountry.flag, "drawable",
                requireContext().packageName)
            if (flagResID != 0) {
                qFlagIv.setImageResource(flagResID)
            }

            // set options text
            option1Tv.text = c1.name
            option2Tv.text = c2.name
            option3Tv.text = c3.name
            option4Tv.text = c4.name
            option5Tv.text = c5.name

            option1Tv.setOnClickListener {
                option1Tv.setBackgroundResource(R.drawable.pressed_option_bg)
                option1Tv.setTextColor(requireContext().getColor( R.color.white))
                if (qCountry.id == c1.id) {
                    option1CorrectIv.visibility = View.VISIBLE
                    nextButtonTv.visibility = View.VISIBLE
                    messageTv.visibility = View.GONE
                }else {
                    option1WrongIv.visibility = View.VISIBLE
                    messageTv.text = getText(R.string.game_try_again)
                }
            }
            option2Tv.setOnClickListener {
                option2Tv.setBackgroundResource(R.drawable.pressed_option_bg)
                option2Tv.setTextColor(requireContext().getColor( R.color.white))
                if (qCountry.id == c2.id) {
                    option2CorrectIv.visibility = View.VISIBLE
                    nextButtonTv.visibility = View.VISIBLE
                    messageTv.visibility = View.GONE
                }else {
                    option2WrongIv.visibility = View.VISIBLE
                    messageTv.text = getText(R.string.game_try_again)
                }
            }
            option3Tv.setOnClickListener {
                option3Tv.setBackgroundResource(R.drawable.pressed_option_bg)
                option3Tv.setTextColor(requireContext().getColor( R.color.white))
                if (qCountry.id == c3.id) {
                    option3CorrectIv.visibility = View.VISIBLE
                    nextButtonTv.visibility = View.VISIBLE
                    messageTv.visibility = View.GONE
                }else {
                    option3WrongIv.visibility = View.VISIBLE
                    messageTv.text = getText(R.string.game_try_again)
                }
            }
            option4Tv.setOnClickListener {
                option4Tv.setBackgroundResource(R.drawable.pressed_option_bg)
                option4Tv.setTextColor(requireContext().getColor( R.color.white))
                if (qCountry.id == c4.id) {
                    option4CorrectIv.visibility = View.VISIBLE
                    nextButtonTv.visibility = View.VISIBLE
                    messageTv.visibility = View.GONE
                }else {
                    option4WrongIv.visibility = View.VISIBLE
                    messageTv.text = getText(R.string.game_try_again)
                }
            }
            option5Tv.setOnClickListener {
                option5Tv.setBackgroundResource(R.drawable.pressed_option_bg)
                option5Tv.setTextColor(requireContext().getColor( R.color.white))
                if (qCountry.id == c5.id) {
                    option5CorrectIv.visibility = View.VISIBLE
                    nextButtonTv.visibility = View.VISIBLE
                    messageTv.visibility = View.GONE
                }else {
                    option5WrongIv.visibility = View.VISIBLE
                    messageTv.text = getText(R.string.game_try_again)
                }
            }

            messageTv.visibility = View.VISIBLE
            nextButtonTv.visibility = View.GONE
        }


    }

}