package com.systemfailed.calculatorapp.ui.calculator

sealed class Action {
    data class Number(val number: Int): Action()
    data object Clear: Action()
    data object Delete: Action()
    data class Operation(val  operation: CalculatorOperation): Action()
    data object Calculate: Action()
    data object Decimal: Action()
}