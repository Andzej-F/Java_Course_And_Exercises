package _5_Numbers;
/* 1. If you could receive up to eight different types of radio signals
simultaneously (into your computer & a program you wrote) and you needed
to be able to record which of those eight you received at any given time,
what would be a highly compact (or compressed - using the least amount of
memory or storage) way to record them (using what you learned in this
module)? For example, you could receive signals A + B + C simultaneously,
or A + D, or just G, etc.
A: (Ex1EncodeSygnals) By using 3 bits to encode all 8 possible signals:

e.g.
#   Sygnal  Encoding
1    A        0000 0001     1
2    B        0000 0010     2
3    C        0000 0100     4
4    D        0000 1000     8
5    E        0001 0000     16
6    F        0010 0000     32
7    G        0100 0000     64
8    H        1000 0000     128

A 0000 0001
D 0000 1000
-----------
  0000 1001 == 1+8 == 9

A 0000 0001
B 0000 0010
C 0000 0100
-----------
  0000 0111 == 1 + 2+ 4 == 7
1.1. If you received signals A + D + C simultaneously, how could you
efficiently determine that D was one of the signals you received - based
on your solution above? */

public class EncodeSignals {
  public static void main(String[] args) {
    // Terry's solution
//   Let H  G   F   E   D  C  B  A - be assigned values
//   128  64  32  16  8  4  2  1
    int signalABC = 1 | 2 | 4; // 7
    int signalAD = 1 | 8;// 9
    int signalADC = 1 | 8 | 4;//13
    int signalD = 8;

    // Determine the dignal D
    /* Logical AND of original signal (13) AND 'D' (8) will
     equal 8 IF and only IF 'D' was present in original signal */
    System.out.println((signalADC & signalD) == signalD);// true
  }
}
