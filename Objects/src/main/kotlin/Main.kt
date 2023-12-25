package ru.megaland

import javafx.scene.chart.Axis

fun main() {
//    createObject()

//    val newObject = getCoordinates(x = 21, y = 78)
//    println("${newObject.x}, ${newObject.y}")
//
//    val newObject2 = getCoordinates(x = 23, y = 99)
//    println("${newObject2.x}, ${newObject2.y}")

    val newObject = object {
        val x = 2
    }

    newObject.x

}

private fun getCoordinates(x: Int, y: Int) = object {
    val x: Int = x * 2
    val y: Int = y * 2
}

fun createObject() {
    val object1 = object {
        val first = "String"
        var second = 0

        override fun toString(): String {
            return "$first $second"
        }
    }

    println(object1)
    object1.second = 2
    println(object1)
}

