package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CaesarCipherTest {

    @Test
    public void testEncryptStandardShift() {
        // Shifting "HELLO" by 3 should result in "KHOOR"
        String original = "HELLO";
        String expected = "KHOOR"; 
        String actual = CaesarCipher.encrypt(original, 3);
        
        assertEquals(expected, actual);
    }

    @Test
    public void testEncryptWithLowercaseAndSpaces() {
        // Shifting lowercase with a space
        String original = "hello world";
        String expected = "khoor zruog"; 
        String actual = CaesarCipher.encrypt(original, 3);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWrapAroundAlphabet() {
        // Shifting "XYZ" by 3 should wrap back around to "ABC"
        String original = "XYZ";
        String expected = "ABC"; 
        String actual = CaesarCipher.encrypt(original, 3);
        
        assertEquals(expected, actual);
    }
}