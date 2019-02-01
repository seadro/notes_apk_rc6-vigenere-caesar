package com.seadro.notesx.crypto;

import java.security.PublicKey;


/// enkripsi Vigenere Cipher

public class VigenereCipher {

    public String encrypt( String line,String keyword) {
        String result = "";
        int offset;
        int j = 0, shift;
        for (int i = 0; i < line.length(); i++) {
            shift = ((int) keyword.charAt(j)) - 97;
            j++;
            j %= keyword.length();
            offset = ((int) line.charAt(i) + shift) % 256;
            result += (char) (offset);
        }
        return result;
    }

    public String decrypt(  String line,String keyword) {
        String result = "";
        int offset;
        int j = 0, shift;
        for (int i = 0; i < line.length(); i++) {
            shift = ((int) keyword.charAt(j)) - 97;
            j++;
            j %= keyword.length();
            offset = ((int) line.charAt(i) - shift) % 256;
            if (offset < 0) {
                offset += 256;
            }
            result += (char) (offset);
        }
        return result;
    }
}
