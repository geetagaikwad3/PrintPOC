package com.example.printpoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivityPrint : AppCompatActivity() {
    var printerService: PrinterService? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printerService = IMinPrinterService()
        printerService!!.initPrinter()
        printerService!!.print(" Hello Toshiba !!")
    }
}