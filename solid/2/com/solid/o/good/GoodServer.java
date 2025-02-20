package com.solid.o.good;

import com.solid.o.bad.BadClient;

public class GoodServer {
    /**
     * GoodServer poate trata orice tip de client care implementeaza interfata  fara
     * a stii detalii despre clientul specific.
     */
    public void reactToClient(Client_I client) {
        client.doSomething();
    }
}
