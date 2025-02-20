package com.solid.i.good;

import com.solid.i.Invoice;

public class SomeOtherGoodInvoicePrinter implements SomeOtherGoodInvoicePrinter_I{
    @Override
    public void someOtherPrintMethod(Invoice invoice) {
        System.out.println("Other Print Method");
    }
}
