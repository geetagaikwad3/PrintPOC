package com.example.printpoc;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityPrint extends AppCompatActivity {

    PrinterService printerService =null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printerService = new IMinPrinterService();
        printerService.initPrinter();
        printerService.print(" Hello Toshiba !!");
    }

}
