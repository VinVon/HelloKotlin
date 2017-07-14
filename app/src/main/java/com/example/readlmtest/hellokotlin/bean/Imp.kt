package com.example.readlmtest.hellokotlin.bean

/**
 * Created by raytine on 2017/7/13.
 */
interface Imp {
    fun f() { print("B") } // 接口成员默认就是“open”的
    fun b() { print("b") }
}