package com.systemfailed.calculatorapp.ui.calculator

sealed class CalculatorOperation (val symbol: String){
    data object Add: CalculatorOperation("+")
    data object Subtract: CalculatorOperation("-")
    data object Multiply: CalculatorOperation("x")
    data object Divide: CalculatorOperation("/")
}