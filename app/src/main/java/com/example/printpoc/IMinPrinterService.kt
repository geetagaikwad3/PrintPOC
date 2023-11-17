package com.example.printpoc;

import android.graphics.Bitmap;

import com.imin.printerlib.IminPrintUtils;

public class IMinPrinterService implements PrinterService {


    private IminPrintUtils iminPrintUtils;

    @Override
    public void initPrinter() {

        iminPrintUtils = IminPrintUtils.getInstance(MainApplication.getContext());

        // iminPrintUtils.resetDevice();
       // iminPrintUtils.initPrinter(IminPrintUtils.PrintConnectType.USB);
        iminPrintUtils.initPrinter(IminPrintUtils.PrintConnectType.SPI);
    }

    @Override
    public void deInitPrinter() {

    }

    @Override
    public void print(String content) {
        iminPrintUtils.printText(content, 1);
        iminPrintUtils.printAndFeedPaper(100);
        iminPrintUtils.partialCut();
    }

    @Override
    public void printBitamp(Bitmap content) {
        iminPrintUtils.printBMPBitmap(content);
    }
}
