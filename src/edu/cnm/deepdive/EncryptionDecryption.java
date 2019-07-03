package edu.cnm.deepdive;

public class EncryptionDecryption {

  public void printEncoded () {

    String encodedString = "we found a treasure!";
    int length = encodedString.length();

    StringBuilder stringBuilderEncoded = new StringBuilder(encodedString);

    for (int i = 0; i < length; i++) {
      char c = stringBuilderEncoded.charAt(i);

      switch (c) {
        case 'a':
          stringBuilderEncoded.setCharAt(i, 'b');
          break;
        case 'b':
          stringBuilderEncoded.setCharAt(i, 'c');
          break;
        case 'c':
          stringBuilderEncoded.setCharAt(i, 'd');
          break;
        case 'd':
          stringBuilderEncoded.setCharAt(i, 'e');
          break;
        case 'e':
          stringBuilderEncoded.setCharAt(i, 'f');
          break;
        case 'f':
          stringBuilderEncoded.setCharAt(i, 'g');
          break;
        case 'g':
          stringBuilderEncoded.setCharAt(i, 'h');
          break;
        case 'h':
          stringBuilderEncoded.setCharAt(i, 'i');
          break;
        case 'i':
          stringBuilderEncoded.setCharAt(i, 'j');
          break;
        case 'j':
          stringBuilderEncoded.setCharAt(i, 'k');
          break;
        case 'k':
          stringBuilderEncoded.setCharAt(i, 'l');
          break;
        case 'l':
          stringBuilderEncoded.setCharAt(i, 'm');
          break;
        case 'm':
          stringBuilderEncoded.setCharAt(i, 'n');
          break;
        case 'n':
          stringBuilderEncoded.setCharAt(i, 'o');
          break;
        case 'o':
          stringBuilderEncoded.setCharAt(i, 'p');
          break;
        case 'p':
          stringBuilderEncoded.setCharAt(i, 'q');
          break;
        case 'q':
          stringBuilderEncoded.setCharAt(i, 'r');
          break;
        case 'r':
          stringBuilderEncoded.setCharAt(i, 's');
          break;
        case 's':
          stringBuilderEncoded.setCharAt(i, 't');
          break;
        case 't':
          stringBuilderEncoded.setCharAt(i, 'u');
          break;
        case 'u':
          stringBuilderEncoded.setCharAt(i, 'v');
          break;
        case 'v':
          stringBuilderEncoded.setCharAt(i, 'w');
          break;
        case 'w':
          stringBuilderEncoded.setCharAt(i, 'x');
          break;
        case 'x':
          stringBuilderEncoded.setCharAt(i, 'y');
          break;
        case 'y':
          stringBuilderEncoded.setCharAt(i, 'z');
          break;
        case 'z':
          stringBuilderEncoded.setCharAt(i, 'a');
          break;
      }

    }



  }

}
