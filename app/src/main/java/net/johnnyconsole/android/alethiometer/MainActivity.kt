package net.johnnyconsole.android.alethiometer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivRedHand1.rotation = 180f
        ivRedHand1.translationY = 0f
        ivRedHand1.animate()
            .translationY((2.5*168).toFloat())
            .setInterpolator(LinearInterpolator())
            .start()

        ivRedHand2.rotation = 45f
        ivRedHand2.translationY = 0f
        ivRedHand2.translationX = 0f
        ivRedHand2.animate()
            .translationY(168/2.5.toFloat())
            .translationX(4.6.toFloat()*30)
            .setInterpolator(LinearInterpolator())
            .start()
        ivRedHand3.rotation = 315f
        ivRedHand3.translationY = 168/2.5.toFloat()
        ivRedHand3.translationX = 0f
        ivRedHand3.animate()
            .translationY(168/2.5.toFloat())
            .translationX((-4.6).toFloat() *30)
            .setInterpolator(LinearInterpolator())
            .start()
    }

    private fun rotateHand(hand: ImageView, symbol: Int) {
        //TODO: Find angles for center of all symbols on the alethiometer
        //TODO: Figure out how to calculate translations from new angle and write this function
    }
}