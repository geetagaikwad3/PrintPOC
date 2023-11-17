package com.example.printpoc;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {


    private static Context context;
    private static PrinterService printerService;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

        printerService = new IMinPrinterService();
        printerService.initPrinter();
    }

    public static PrinterService getPrinterService()
    {
        return printerService;
    }

}
