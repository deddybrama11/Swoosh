package com.bram.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bram.swoosh.Model.Player
import com.bram.swoosh.R
import com.bram.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you ..."

    }
}