package com.example;
public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append((char) (((ch + shift - 65) % 26) + 65));
            } else if (Character.isLowerCase(ch)) {
                result.append((char) (((ch + shift - 97) % 26) + 97));
            } else {
                result.append(ch); 
            }
        }
        return result.toString();
    }

    // Adding the main method so it can be run from the terminal
    public static void main(String[] args) {
        String originalText = "Hello World";
        int shiftKey = 3;
        String encryptedText = encrypt(originalText, shiftKey);
        
        System.out.println("Original: " + originalText);
        System.out.println("Encrypted: " + encryptedText);
    }
}