package com.project.calculator

import android.util.Log

class Calculator(expression: List<String>) {
    private val _expression = expression.toMutableList()
    val expression: String get() =  _expression.toList().joinToString("")

    private val operations = listOf<Char>('+', '-','/', '*')

    val result: Int  get() {

        //+,-
        //연산자 출력
        val currentOperations = expression.filter {
            operations.contains(it)
        }

        //숫자 출력
        //0,1,2,3
        val numbers = expression.split(Regex("[+\\-*/]"))
        Log.d("test", "numbers : ${numbers}")
        var sum = 0

        // 0 -> 1 1 -> 2 2 ->3
        numbers.forEachIndexed { index, s ->
            if (index != numbers.lastIndex) {
                when (currentOperations[index]) {

                    '+' -> {
                        sum += if(index== 0) {
                            s.toInt() + numbers[1].toInt()
                        } else {
                            numbers[index + 1].toInt()
                        }
                    }

                    '-' -> {
                        sum += if(index== 0) {
                            s.toInt() - numbers[1].toInt()
                        } else {
                            -(numbers[index + 1].toInt())
                        }
                    }

                    '*' -> {
                        sum += if(index== 0) {
                            s.toInt() * numbers[1].toInt()
                        } else {
                            numbers[index + 1].toInt()
                        }
                    }

                    '/' -> {
                        sum += if(index== 0) {
                            s.toInt() / numbers[1].toInt()
                        } else {
                            numbers[index + 1].toInt()
                        }
                    }
                }
            }
        }
        return sum
    }

    //결과값 출력
//    fun getCalculatorResult() : Double {
//
//        when(Text.equals("+")) {
//
//            else ->
//
//        }
//    }

    //번호 텍스트 출력
    fun addExpressionNumber(calculatorNumber : Char) : String{
        if(!calculatorNumber.toString().last().isDigit()) {
            throw IllegalArgumentException("입력값이 잘못되었습니다")
        }
        Log.d("test", "입력값 : ${calculatorNumber.toString()}")

        _expression.add(calculatorNumber.toString())
        return expression
        }

    //연산자 텍스트 출력
    fun getCalcultorOpertion(Calculator_Operation : String) : String {
        _expression.add(Calculator_Operation)
        return expression
    }

    fun getClear() {
        _expression.clear()
    }

}