package com.project.calculator

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import org.w3c.dom.Text
import java.io.Console

class MainActivity : AppCompatActivity() {
    private lateinit var editText: TextView
    private val model = Model()
    private var ischecked : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //테스트 코드
        editText = findViewById(R.id.calculation_edit)

        val button0 = findViewById<MaterialButton>(R.id.button0)
        var button1 = findViewById<MaterialButton>(R.id.button1)
        var button2 = findViewById<MaterialButton>(R.id.button2)
        var button3 = findViewById<MaterialButton>(R.id.button3)
        var button4 = findViewById<MaterialButton>(R.id.button4)
        var button5 = findViewById<MaterialButton>(R.id.button5)
        var button6 = findViewById<MaterialButton>(R.id.button6)
        var button7 = findViewById<MaterialButton>(R.id.button7)
        var button8 = findViewById<MaterialButton>(R.id.button8)
        var button9 = findViewById<MaterialButton>(R.id.button9)

        val add_btn = findViewById<Button>(R.id.add_btn)
        val min_btn = findViewById<Button>(R.id.subtractButton)
        val divid_btn = findViewById<Button>(R.id.divideButton)
        val mul_btn = findViewById<Button>(R.id.multiplyButton)


        button0.setOnClickListener{

            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
             editText.append("0").toString()
        }

        button1.setOnClickListener(View.OnClickListener { //SAM
            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
            editText.append("1").toString()
        })

        button2.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
            editText.append("2").toString()
        })

        button3.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
            editText.append("3").toString()
        })

        button4.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
            editText.append("4").toString()
        })

        button5.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
            editText.append("5").toString()
        })

        button6.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
            editText.append("6").toString()
        })

        button7.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
            editText.append("7").toString()
        })

        button8.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                model.getClear()
                //                resultText.text = ""
            }
            editText.append("8").toString()
        })

        button9.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                model.getClear()
//                resultText.text = ""
            }
            editText.append("9").toString()
        })

        add_btn.setOnClickListener(View.OnClickListener {
            editText.append("+").toString()
                })

        min_btn.setOnClickListener(View.OnClickListener {
            editText.append("-").toString()

                  })

        divid_btn.setOnClickListener(View.OnClickListener {
            editText.append("/").toString()
        })

        mul_btn.setOnClickListener(View.OnClickListener {
            editText.append("*").toString()
        })


        //결과
        var result: Button = findViewById(R.id.resultbtn)
        result.setOnClickListener(View.OnClickListener {

            var value1: Double = 0.0
            var value2: Double = 0.0
            var operator: String = ""

            value1 = editText.text.substring(0, 1).toDouble()
            operator = editText.text.substring(1, 2)
            value2 = editText.text.substring(2, 3).toDouble()

            model.setModel(value1,value2,operator)

//            resultText.text = model.getOperation().toString()
            model.getClear()
            editText.text = ""
            ischecked = true
        })


        val clear : Button = findViewById(R.id.clear)

        clear.setOnClickListener(View.OnClickListener {

            model.getClear()
//            resultText.text = ""
            editText.text = ""
        })
    }
}



