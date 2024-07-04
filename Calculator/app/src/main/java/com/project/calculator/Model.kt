package com.project.calculator

class Model {

    private var value1 : Double = 0.0
    private var value2 : Double = 0.0
    private var operation : String = ""

    fun setModel(num1 : Double, num2 : Double, op : String){
        value1 = num1
        value2 = num2
        operation = op
    }

    fun getOperation() : Double {

        return when(operation){

            "+" -> value1 + value2
            "-" -> value1 - value2
            "*" -> value1 * value2
            "/" -> value1 / value2

            else -> 0.0
        }
    }

    fun getClear() {
        value1 = 0.0
        value2 = 0.0
        operation = ""
    }

}