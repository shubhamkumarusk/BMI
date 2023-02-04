package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncal.setOnClickListener{
            if (!edthightft.text.toString().equals("") && !edthightin.text.toString().equals("")
                && !edtweight.text.toString().equals("")
            ) {

                val wt=(edtweight.text.toString()).toDouble()
                val hf=(edthightft.text.toString()).toDouble()
                val hi=(edthightin.text.toString()).toDouble()

                val totali=(hf*12)+hi
                val totalm=totali*0.0254

                val bmi=wt/(totalm*totalm)
                txtresult.text="${bmi.toInt()}"


                if (bmi>25) {
                    Toast.makeText(this@MainActivity, "You are overweight", Toast.LENGTH_SHORT).show()
                    txthealth.text="You are OverWeight"
                    LLmain.setBackgroundColor(resources.getColor(R.color.red))


                } else if (bmi<18.5) {
                    Toast.makeText(this@MainActivity, "You are Underweight", Toast.LENGTH_SHORT).show()
                    txthealth.text="You are UnderWeight"
                    LLmain.setBackgroundColor(resources.getColor(R.color.red))


                } else {
                    Toast.makeText(this@MainActivity, "Congratulations !! Your are Healthy", Toast.LENGTH_SHORT).show()
                    txthealth.text="Congratulations !! Your are Healthy"

                    LLmain.setBackgroundColor(resources.getColor(R.color.green))






                }



            }
            else {
                Toast.makeText(this@MainActivity, "Please fiil Up all the required fields", Toast.LENGTH_SHORT).show()
            }
        }


    }
}