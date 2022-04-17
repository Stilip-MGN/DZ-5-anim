package studio.stilip.animationdz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            supportFragmentManager.beginTransaction().setCustomAnimations(
                R.anim.bottom_in,
                R.anim.bottom_out,
                R.anim.bottom_in,
                R.anim.bottom_out
            )
                .replace(R.id.container_fragment, AnimationFragment()).addToBackStack("null")
                .commit()
        }
    }
}