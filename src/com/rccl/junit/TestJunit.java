package com.rccl.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestJunit {
   @Test
   public void testAdd() {
      String str= "Test";
      assertEquals("Test",str);
   }
}
