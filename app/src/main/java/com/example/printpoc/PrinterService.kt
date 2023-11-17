package com.example.printpoc

import android.graphics.Bitmap

interface PrinterService {
    fun initPrinter()
    fun deInitPrinter()
    fun print(content: String?)
    fun printBitamp(content: Bitmap?)
}