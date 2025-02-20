package com.solid.o.good;

public interface Client_I {
    /**
     * Am declarat in interfata metoda comuna "doSomething" pe care
     * o au toti clientii, pentry ca astfel serverul (obiectul instantiat
     * al clasei GoodServer) nu trebuie sa stie ce tip de client primeste, doar ca
     * poate apela metoda definita in interfata.
    */

    void doSomething();
}
