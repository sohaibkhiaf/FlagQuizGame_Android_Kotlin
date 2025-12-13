package com.example.flagquizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class GameFragment : Fragment() {

    // views declaration
    private lateinit var nextButton_tv : TextView
    private lateinit var chooseAnswer : TextView
    private lateinit var qFlag_iv : ImageView

    // options
    private lateinit var option1_tv : TextView
    private lateinit var option1Correct_iv : ImageView
    private lateinit var option1Wrong_iv : ImageView

    private lateinit var option2_tv : TextView
    private lateinit var option2Correct_iv : ImageView
    private lateinit var option2Wrong_iv : ImageView

    private lateinit var option3_tv : TextView
    private lateinit var option3Correct_iv : ImageView
    private lateinit var option3Wrong_iv : ImageView

    // initialization of shared preferences manager
    private lateinit var spm : SharedPreferencesManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // shared preferences initialization
        spm = SharedPreferencesManager(requireContext())

        // questioned flag initialization
        qFlag_iv = view.findViewById(R.id.gameFragment_iv_flag)

        // options initialization
        option1_tv = view.findViewById(R.id.gameFragment_tv_option1)
        option1Correct_iv = view.findViewById(R.id.gameFragment_iv_option1Correct)
        option1Wrong_iv = view.findViewById(R.id.gameFragment_iv_option1Wrong)
        option2_tv = view.findViewById(R.id.gameFragment_tv_option2)
        option2Correct_iv = view.findViewById(R.id.gameFragment_iv_option2Correct)
        option2Wrong_iv = view.findViewById(R.id.gameFragment_iv_option2Wrong)
        option3_tv = view.findViewById(R.id.gameFragment_tv_option3)
        option3Correct_iv = view.findViewById(R.id.gameFragment_iv_option3Correct)
        option3Wrong_iv = view.findViewById(R.id.gameFragment_iv_option3Wrong)

        // next button initialization
        nextButton_tv = view.findViewById(R.id.gameFragment_tv_nextButton)

        // message text
        chooseAnswer = view.findViewById(R.id.gameFragment_tv_chooseAnswer)

        generateQuestion()

        nextButton_tv.setOnClickListener {
            resetOptions()
            generateQuestion()
            nextButton_tv.visibility = View.INVISIBLE
        }

    }

    private fun resetOptions() {
        option1_tv.setBackgroundResource(R.drawable.normal_option_bg)
        option1_tv.setTextColor(requireContext().getColor( R.color.black))
        option1Correct_iv.visibility = View.GONE
        option1Wrong_iv.visibility = View.GONE

        option2_tv.setBackgroundResource(R.drawable.normal_option_bg)
        option2_tv.setTextColor(requireContext().getColor( R.color.black))
        option2Correct_iv.visibility = View.GONE
        option2Wrong_iv.visibility = View.GONE

        option3_tv.setBackgroundResource(R.drawable.normal_option_bg)
        option3_tv.setTextColor(requireContext().getColor( R.color.black))
        option3Correct_iv.visibility = View.GONE
        option3Wrong_iv.visibility = View.GONE
    }

    private fun generateQuestion() {

        // retrieve 3 random countries
        val c1 = spm.getRandomCountry()
        val c2 = spm.getRandomCountry(c1.id)
        val c3 = spm.getRandomCountry(c1.id, c2.id)
        val countries = listOf(c1, c2, c3)

        // select questioned flag country
        val qCountry = countries.random()

        // retrieve questioned flag
        val flagResID = resources.getIdentifier(qCountry.flag, "drawable",
            requireContext().packageName)
        if (flagResID != 0) {
            qFlag_iv.setImageResource(flagResID)
        }else {
            Toast.makeText(requireContext(), "flag resource id = 0", Toast.LENGTH_SHORT).show()
        }

        // set options text
        option1_tv.text = c1.name.toString()
        option2_tv.text = c2.name.toString()
        option3_tv.text = c3.name.toString()

        option1_tv.setOnClickListener {
            option1_tv.setBackgroundResource(R.drawable.pressed_option_bg)
            option1_tv.setTextColor(requireContext().getColor( R.color.white))
            if (qCountry.id == c1.id) {
                option1Correct_iv.visibility = View.VISIBLE
                nextButton_tv.visibility = View.VISIBLE
                chooseAnswer.visibility = View.GONE
            }else {
                option1Wrong_iv.visibility = View.VISIBLE
            }
        }
        option2_tv.setOnClickListener {
            option2_tv.setBackgroundResource(R.drawable.pressed_option_bg)
            option2_tv.setTextColor(requireContext().getColor( R.color.white))
            if (qCountry.id == c2.id) {
                option2Correct_iv.visibility = View.VISIBLE
                nextButton_tv.visibility = View.VISIBLE
                chooseAnswer.visibility = View.GONE
            }else {
                option2Wrong_iv.visibility = View.VISIBLE
            }
        }
        option3_tv.setOnClickListener {
            option3_tv.setBackgroundResource(R.drawable.pressed_option_bg)
            option3_tv.setTextColor(requireContext().getColor( R.color.white))
            if (qCountry.id == c3.id) {
                option3Correct_iv.visibility = View.VISIBLE
                nextButton_tv.visibility = View.VISIBLE
                chooseAnswer.visibility = View.GONE
            }else {
                option3Wrong_iv.visibility = View.VISIBLE
            }
        }

        chooseAnswer.visibility = View.VISIBLE
        nextButton_tv.visibility = View.GONE

    }

}