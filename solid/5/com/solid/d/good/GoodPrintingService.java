package com.solid.d.good;

import com.solid.i.ComplexInvoice;
import com.solid.i.Invoice;
import com.solid.i.good.GoodInvoicePrinter_I;

public class GoodPrintingService {
    private GoodInvoicePrinter_I invoicePrinter;
    public GoodPrintingService(GoodInvoicePrinter_I goodInvoicePrinter) {
        this.invoicePrinter = goodInvoicePrinter;
    }

    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }

}
