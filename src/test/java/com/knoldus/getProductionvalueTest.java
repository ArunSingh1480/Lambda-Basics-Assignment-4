package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class getProductionvalueTest {
    getProductionvalue testbed=new getProductionvalue();
    @org.junit.jupiter.api.Test
    void validRange() {

        long test1=testbed.Range(1L,4L);
        Assertions.assertEquals(24L,test1);
    }
    @Test
    void equalRange()
    {
        long test2=testbed.Range(2L,2L);
        Assertions.assertEquals(2L,test2);
    }

    @Test
    void inRange(){
        long test3= testbed.Range(0,1L);
        Assertions.assertEquals(0,test3);
    }
}