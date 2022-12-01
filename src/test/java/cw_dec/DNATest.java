package cw_dec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNATest {

  @Test
  public void test() {
    assertEquals("TAACG", DNA.makeComplement("ATTGC"));
    assertEquals("CATA", DNA.makeComplement("GTAT"));
    assertEquals("CATA", DNA.makeComplement("GTAT"));
  }

}