package cw_dec;

import java.util.Locale;

/*
 source: https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells
and carries the "instructions" for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA
In DNA strings, symbols
"A" and "T" are complements of each other, as
"C" and "G".
Your function receives one side of the
DNA (string, except for Haskell); you need to return the other
complementary side. DNA strand is never empty or there is no
DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA" */
public class DNA {
  public static String makeComplement(String dna) {
    char[] letters = dna.toUpperCase().toCharArray();
    String newWord = "";

    for (char letter : letters) {
      letter = switch (letter) {
        case 'A' -> 'T';
        case 'T' -> 'A';
        case 'C' -> 'G';
        case 'G' -> 'C';
        default -> ' ';
      };
      newWord += letter;
    }
    return newWord;
  }

  public static void main(String[] args) {
    System.out.println(DNA.makeComplement("ATTGC"));
    System.out.println(DNA.makeComplement("GTAT"));
  }
}
