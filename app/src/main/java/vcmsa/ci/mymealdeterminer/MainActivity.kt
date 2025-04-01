package vcmsa.ci.mymealdeterminer

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val rbMorning = findViewById<RadioButton>(R.id.rbMorning)
        val rbMidmorning = findViewById<RadioButton>(R.id.rbMidMorning)
        val rbAfternoon = findViewById<RadioButton>(R.id.rbAfternoon)
        val rbMidAfternoon = findViewById<RadioButton>(R.id.rbMidafternoon)
        val rbDinner = findViewById<RadioButton>(R.id.rbDinner)
        val rbAfterdinner = findViewById<RadioButton>(R.id.rbAfterdinner)
        val rgTimeofday = findViewById<RadioGroup>(R.id.rgTimeofday)
        val btnDetermine = findViewById<Button>(R.id.btnDetermine)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val txtResults = findViewById<TextView>(R.id.txtResults)


        btnDetermine.setOnClickListener {

            val selectedTimeofday = findViewById<RadioButton>(rgTimeofday.checkedRadioButtonId)


            if (selectedTimeofday. id == R.id.rbMorning )
            {
                txtResults.text = "Breakfast: eggs and bacon"
            }
            else if(selectedTimeofday. id == R.id.rbMidMorning)
            {
                txtResults.text = "Snack: yogurt with berries"
            }

            else if (selectedTimeofday. id == R.id.rbAfternoon)
            {
                txtResults.text = "Lunch: sandwich"
            }

            else if(selectedTimeofday. id == R.id.rbMidafternoon)
            {
                txtResults.text = "Snack: fruits"
            }

            else if (selectedTimeofday. id == R.id.rbDinner)
            {
                txtResults.text = "Main course: Pasta"
            }

            else if(selectedTimeofday. id == R.id.rbAfterdinner)
            {
                txtResults.text = "Dessert: ice cream"
            }

            println("$txtResults")
        }
        btnReset.setOnClickListener {
            txtResults.text = ""
            rgTimeofday.clearCheck()

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}