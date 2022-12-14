package kr.ac.hallym.prac03_hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.CleartextNetworkViolation
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kr.ac.hallym.prac03_hw3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        findViewById<Button>(R.id.one).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("1")
        }
        findViewById<Button>(R.id.two).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("2")
        }
        findViewById<Button>(R.id.three).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("3")
        }
        findViewById<Button>(R.id.four).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("4")
        }
        findViewById<Button>(R.id.five).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("5")
        }
        findViewById<Button>(R.id.six).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("6")
        }
        findViewById<Button>(R.id.seven).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("7")
        }
        findViewById<Button>(R.id.eight).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("8")
        }
        findViewById<Button>(R.id.nine).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("9")
        }
        findViewById<Button>(R.id.zero).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append("0")
        }
        findViewById<Button>(R.id.dot_Btn).setOnClickListener{
            findViewById<TextView>(R.id.text_input).append(".")
        }
        findViewById<Button>(R.id.clr_Btn).setOnClickListener{
            findViewById<TextView>(R.id.text_input).setText(null)
        }
        findViewById<Button>(R.id.percent_Btn).setOnClickListener{
            findViewById<TextView>(R.id.text_input).setText(null)
        }
        findViewById<Button>(R.id.div_Btn).setOnClickListener{
            findViewById<TextView>(R.id.text_input).setText(null)
        }
        findViewById<Button>(R.id.mul_Btn).setOnClickListener{
            findViewById<TextView>(R.id.text_input).setText(null)
        }
        findViewById<Button>(R.id.sub_Btn).setOnClickListener{
            findViewById<TextView>(R.id.text_input).setText(null)
        }
        findViewById<Button>(R.id.add_Btn).setOnClickListener{
            findViewById<TextView>(R.id.text_input).setText(null)
        }
        findViewById<Button>(R.id.equl_Btn).setOnClickListener{
            findViewById<TextView>(R.id.text_input).setText(null)
        }
    }
}


