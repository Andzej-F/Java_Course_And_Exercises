package _5_Numbers;

/*
                    75. Exercises Numbers
1. If you could receive up to eight different types of radio signals
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
on your solution above?

D     0000 1000
A     0000 0001
      ---------
D & A 0000 0000

D     0000 1000
D     0000 1000
      ---------
      0000 1000

D & C
D     0000 1000
C     0000 0100
      ---------
      0000 0000

13 & 8

128 64 32 16 8 4 2 1
  0  0  0  0 1 1 0 1 == 13
  0  0  0  0 1 0 0 0
  ------------------
  0  0  0  0 1 0 0 0 == 8


#   Sygnal  Encoding          421
1    A        000     0
3    C        010     2
4    D        011     3


2. What’s an alternative way you could add 2 + 4 without using “+” symbol?
A: Ex2AltAdd

3. Using only what you’ve learned so far in this course, create a class that
contains 10 lowercase names and has a method that can be called 10 separate
times, each time, returning the next name. If the method is called “next()”,
the first time it’s called, it returns “name1”, the second time “next()” is
called, it returns “name2”, etc.
3.1 Make the next() method capitalize the first letter of each name as it outputs them.
A: NextName

4. Imagine you’ve been given data representing how long items have sat in
a warehouse. Your job is to categorize them by time in the warehouse.
Items can be classified as 0, 1, 2 or 3.
Class 0 = 0 - 89 days
Class 1 = 90-179 days,
Class 2 = 180-269 days,
Class 3 = 270-364 days.

For the given warehouse wait times: 13, 49, 90, 130, 175, 181, 255, 310, 330, 359,
•write a class similar to Exercise 3 above,
•that has a next() method that can be called 10 times
•this method outputs a number representing the classification of each number in
the set of ages above.

Example:
•an item waiting for 5 days would return 0
•an item waiting 92 days would return 1.
A: Warehouse

5. Make a method, next(), that
•can be called 10 times
•generates a random integer between 0 & 10 (non-inclusive).
•keeps a running sum of all random numbers it generates
•return that sum each time
If first time next() is called, it generates 5, and second time it’s called
it generates 3, it should return 8 from the second call - for example.
A: RandomNumSum

6. Write a function that takes a String like “149.32” and formats it as
money for wherever you live. So, if you live in the United States, it would
return “$149.32”, Korea = ₩149, France/EU = 149,32 €, etc.
A: FormatCurrency

7. Write a function that takes a String input of “$12,345.83” and prints
out that value divided by 32.19. It should return $383.53.
A: Exercise7

8. Use printf() to format the following inputs to print out the following outputs
Input                       Output
123456.783                  $123,456.78
-9876.32532                 (9,876.325)
23.19283928394829182        2.319284e+01f
123456                      0000123456
-9876.35532                 -9,876.4

9. How could you format each of the inputs in the table above and store them in String
variables instead of just printing them out directly?

10. Use instances of DecimalFormat to perform the same conversions in the table above.

11. Write a method that takes the String inputs, “37” & “13”, and returns
an integer of their sum, 50.
*/
public class Exercises {
}
