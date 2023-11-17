package com.example.printpoc

import android.graphics.Bitmap
import com.imin.printerlib.IminPrintUtils
 class IMinPrinterService : PrinterService {
    private var iminPrintUtils: IminPrintUtils? = null
    override fun initPrinter() {
        iminPrintUtils = IminPrintUtils.getInstance(MainApplication.context)

        // iminPrintUtils.resetDevice();
        // iminPrintUtils.initPrinter(IminPrintUtils.PrintConnectType.USB);
        iminPrintUtils!!.initPrinter(IminPrintUtils.PrintConnectType.SPI)
    }

    override fun deInitPrinter() {}
     override fun print(content: String?) {
         iminPrintUtils!!.printText(content, 1)
         iminPrintUtils!!.printAndFeedPaper(100)
         iminPrintUtils!!.partialCut()
     }

     override fun printBitamp(content: Bitmap?) {
         iminPrintUtils!!.printBMPBitmap(content)
     }


}