package com.example.printpoc

import android.app.Application
import android.content.Context

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        context = this
        printerService = IMinPrinterService()
        printerService!!.initPrinter()
    }

    companion object {
        var context: Context? = null
            private set
        var printerService: PrinterService? = null
            private set
    }
}