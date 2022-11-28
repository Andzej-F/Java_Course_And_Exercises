package _7_Testing_Code;

/*                              Testing
                               Exercises
1. Use TDD to write tests and a SUT (system under test - the actual
implementing class) for a method that takes a String input and outputs
that same String with every other letter uppercase. For example, if you
enter “cat”, it returns “cAt”. If you enter “apple”, it returns “aPpLe”.
You should end up with two classes - a class with the new method in it,
and a class for the unit tests that test your new method. Your test class
should contain as many test methods as necessary to test the proper implementation.
A: Exercise1

2. Use TDD to write tests for a method that can take a String input like:
“Billy, Bob, 1234 Big St., Big City, California, 90210”
And return an Object representing that person. You can name your class
Exercise2 or Person or whatever you like. To test this easily, you’ll
need to have the IDE generate an equals() & hashcode() method in your
class that models a Person (you’ll learn more about that in a later section).
To do so, you can right click on an empty line within your class and
select, “Generate…” and click “Next” every time (probably will be three times)
followed by “Finish”. You’ll now be able to continue with your test(s).
A: Person

  2.1 Modify your method to accept a String like:
“Billy, Bob, 1234 Big St., Big City, California, 90210 | Joe,Smith,5678 Little St.,
Little City, New York, 20109”
Your new method should return an array of Objects that model a Person. You should
reuse the same Person class you used before (whatever you named it). The text input
should separate the details of people by the pipe symbol ‘ | ’. There should be
no limit on the number of people details you can pass in on one String. In the
example String above, I present only two people, but you could keep adding a |
symbol and more people details and you should get back an array with that many
people objects in it. Try to reuse what you already did for the first part of this
exercise and just build on top of it.

3. Use TDD to write a program that takes a String of two words and creates a
“spoonerism” of them. A spoonerism is when the first letters or phonemes of two
words are transposed. An example would be “crushing blow” -> “blushing crow” or
“my bad” -> “by mad”. Use these examples for test use-cases:

BEFORE                SPOONERIZED
Crushing blow         Blushing Crow
Sound bite            Bound site
Flat cap              Cat flap
Sad ballad            Bad sallad
Master plan           Plaster man
Trail snacks          Snail tracks
Sound bite            Bound site

3.1. Can you make it work regardless of capitalization? (No example solution done for
this one - you’re on your own kid :-) )
*/

public class Exercises {
}
