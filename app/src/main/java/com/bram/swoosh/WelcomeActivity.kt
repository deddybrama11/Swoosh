package com.bram.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btn_getStarted.setOnClickListener {
            val leaguIntent = Intent(this,LeagueActivity::class.java)
            startActivity(leaguIntent)
        }
    }
}