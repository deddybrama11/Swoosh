package com.bram.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.bram.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btn_getStarted.setOnClickListener {
            val leaguIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leaguIntent)
        }
    }
}