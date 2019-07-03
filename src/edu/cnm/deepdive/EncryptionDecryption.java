package edu.cnm.deepdive;

public class EncryptionDecryption {

  public String printEncoded () {


    String decodedString = "we found a treasure!";
    int length = decodedString.length();

    StringBuilder stringBuilderDecoded = new StringBuilder(decodedString);

    for (int i = 0; i < length; i++) {
      char c = stringBuilderDecoded.charAt(i);

      switch (c) {
        case 'a':
          stringBuilderDecoded.setCharAt(i, 'b');
          break;
        case 'b':
          stringBuilderDecoded.setCharAt(i, 'c');
          break;
        case 'c':
          stringBuilderDecoded.setCharAt(i, 'd');
          break;
        case 'd':
          stringBuilderDecoded.setCharAt(i, 'e');
          break;
        case 'e':
          stringBuilderDecoded.setCharAt(i, 'f');
          break;
        case 'f':
          stringBuilderDecoded.setCharAt(i, 'g');
          break;
        case 'g':
          stringBuilderDecoded.setCharAt(i, 'h');
          break;
        case 'h':
          stringBuilderDecoded.setCharAt(i, 'i');
          break;
        case 'i':
          stringBuilderDecoded.setCharAt(i, 'j');
          break;
        case 'j':
          stringBuilderDecoded.setCharAt(i, 'k');
          break;
        case 'k':
          stringBuilderDecoded.setCharAt(i, 'l');
          break;
        case 'l':
          stringBuilderDecoded.setCharAt(i, 'm');
          break;
        case 'm':
          stringBuilderDecoded.setCharAt(i, 'n');
          break;
        case 'n':
          stringBuilderDecoded.setCharAt(i, 'o');
          break;
        case 'o':
          stringBuilderDecoded.setCharAt(i, 'p');
          break;
        case 'p':
          stringBuilderDecoded.setCharAt(i, 'q');
          break;
        case 'q':
          stringBuilderDecoded.setCharAt(i, 'r');
          break;
        case 'r':
          stringBuilderDecoded.setCharAt(i, 's');
          break;
        case 's':
          stringBuilderDecoded.setCharAt(i, 't');
          break;
        case 't':
          stringBuilderDecoded.setCharAt(i, 'u');
          break;
        case 'u':
          stringBuilderDecoded.setCharAt(i, 'v');
          break;
        case 'v':
          stringBuilderDecoded.setCharAt(i, 'w');
          break;
        case 'w':
          stringBuilderDecoded.setCharAt(i, 'x');
          break;
        case 'x':
          stringBuilderDecoded.setCharAt(i, 'y');
          break;
        case 'y':
          stringBuilderDecoded.setCharAt(i, 'z');
          break;
        case 'z':
          stringBuilderDecoded.setCharAt(i, 'a');
          break;
      }

    }

    return stringBuilderDecoded.toString();

  }


}
