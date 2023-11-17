package com.example.printpoc;

import android.graphics.Bitmap;

public interface PrinterService {

    void initPrinter();
    void deInitPrinter();
    void print(String content);
    void printBitamp(Bitmap content);
}
