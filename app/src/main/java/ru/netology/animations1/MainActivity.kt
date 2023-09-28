package ru.netology.animations1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import ru.netology.animations1.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById<StatsView>(R.id.statsView).data = listOf(0.25F,0.25F,0.25F,0.25F)

        val view = findViewById<StatsView>(R.id.statsView)
        view.postDelayed({
            view.data = listOf(500F,500F,500F,500F)
        }, 3000)

        view.animate()

    }
}