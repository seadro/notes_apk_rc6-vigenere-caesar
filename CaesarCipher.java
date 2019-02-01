package com.seadro.notesx.crypto;



/// enkripsi caesar cipher

public class CaesarCipher {

    public   String encrypt(String plainText, int shiftKey)
    {

        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition =(int) plainText.charAt(i);
            int keyVal = ( charPosition+shiftKey)  ;
            char replaceVal = (char) keyVal;
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public   String decrypt(String cipherText, int shiftKey)
    {

        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition =(int) cipherText.charAt(i);
            int keyVal = (charPosition-shiftKey  )  ;
            char replaceVal = (char) keyVal;
            plainText += replaceVal;
        }
        return plainText;
    }
}
