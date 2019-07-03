package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncryptionDecryptionTest {

  EncryptionDecryption encryptionDecryption = new EncryptionDecryption();



  @Test
  void printEncoded() {
    assertEquals("dv ulfmw z givzhfiv!", encryptionDecryption.printEncoded());


  }
}