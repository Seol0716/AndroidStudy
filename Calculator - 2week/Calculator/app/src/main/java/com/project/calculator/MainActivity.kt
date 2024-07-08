package com.project.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var calculator_editText: TextView
    private lateinit var resultText : TextView
    private val calculator = Calculator(listOf())
    private var ischecked : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //계산과정
        calculator_editText = findViewById(R.id.calculation_edit)

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
                calculator.getClear()
                calculator_editText.text = ""
            }
            calculator.addExpressionNumber('0')
             calculator_editText.text = calculator.expression
        }

        button1.setOnClickListener(View.OnClickListener { //SAM
            if(ischecked == true){
                calculator.getClear()

                calculator_editText.text = ""
            }

            calculator_editText.text = calculator.addExpressionNumber('1')
        })

        button2.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                calculator.getClear()
                calculator_editText.text = ""
            }
            calculator_editText.text = calculator.addExpressionNumber('2')
        })

        button3.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                calculator.getClear()

                calculator_editText.text = ""
            }
            calculator_editText.text = calculator.addExpressionNumber('3')
        })

        button4.setOnClickListener(View.OnClickListener {
            if(ischecked){
                calculator.getClear()
                calculator_editText.text = ""
            }
            calculator_editText.text = calculator.addExpressionNumber('4')
        })

        button5.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                calculator.getClear()
                calculator_editText.text = ""
            }
            calculator_editText.text = calculator.addExpressionNumber('5')
        })

        button6.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                calculator.getClear()

                calculator_editText.text = ""
            }
            calculator_editText.text = calculator.addExpressionNumber('6')
        })

        button7.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                calculator.getClear()

                calculator_editText.text = ""
            }
            calculator_editText.text = calculator.addExpressionNumber('7')
        })

        button8.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                calculator.getClear()
                calculator_editText.text = ""
            }
            calculator_editText.text = calculator.addExpressionNumber('8')
        })

        button9.setOnClickListener(View.OnClickListener {
            if(ischecked == true){
                calculator.getClear()
                calculator_editText.text = ""
            }
            calculator_editText.text = calculator.addExpressionNumber('9')
        })

        add_btn.setOnClickListener(View.OnClickListener {
            calculator_editText.text = calculator.getCalcultorOpertion("+").toString()
        })

        min_btn.setOnClickListener(View.OnClickListener {
            calculator_editText.text = calculator.getCalcultorOpertion("-").toString()
        })

            divid_btn.setOnClickListener(View.OnClickListener {
                calculator_editText.text = calculator.getCalcultorOpertion("/").toString()
            })

            mul_btn.setOnClickListener(View.OnClickListener {
                calculator_editText.text = calculator.getCalcultorOpertion("*").toString()
            })

            //결과
            var result: Button = findViewById(R.id.resultbtn)
            result.setOnClickListener(View.OnClickListener {
                calculator_editText.text = calculator.result.toString()
//            resultText.text = model.getOperation().toString()
                calculator.getClear()
                ischecked = true
            })


            val clear: Button = findViewById(R.id.clear)

            clear.setOnClickListener(View.OnClickListener {

                calculator.getClear()
//            resultText.text = ""
                calculator_editText.text = ""
            })


    }

}




