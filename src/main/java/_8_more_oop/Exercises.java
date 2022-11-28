package _8_more_oop;

/*                                  8. More OOP
                                      Exercises
1. Use an Enum to model the days of the week and print them using a loop.
  1.1. Print them with the first letter capitalized (without changing the Enum constants).
  1.2. Alternate between printing the first letter capitalized or whatever letter is approximately
      in the middle of the word. For example: Sunday, monDay, Tuesday, wednEsday, etc.
  1.3. Print 10 randomly-chosen days of the week
A: Exercise1

2. Write code to print the following using only an Enum & loop without using any conditionals
(if/else/switch/etc.)
We eat pot roast on Sunday
We eat spaghetti on Monday
We eat tacos on Tuesday
We eat chicken on Wednesday
We eat meatloaf on Thursday
We eat hamburgers on Friday
We eat pizza on Saturday

  2.1 Do it again but capitalize the meal names too. “pot roast” should become “Pot Roast”.
(No solution provided because you’ve done this before in earlier exercise - but try to do
it without looking at previous work - for practice)
A: Exercise2

3. Write a method that takes the following input String (in bold) and returns the following
output String using an Enum like (print the output):
getMealsForDays(“friday, thursday, monday, saturday, tuesday”)
Output: hamburgers, meatloaf, spaghetti, etc…
A: Exercise3

4. Write a method that takes an input of 1 lowercase letter (and only 1 letter),
like a - b - c - z, etc., and returns that letter’s ordinal position in the alphabet,
i.e. a = 1, b = 2, c = 3… z = 26. Do NOT use any conditionals (if/then/else/switch/etc.).
Do not use an array. Write unit tests to test out the following inputs: a, z, w, f, c, h
- which should return: 1, 26, 23, 6, 3, 8 respectively
A: Exercise4

5. Write a method that does the opposite of #4 - taking a number, 1-26, and returns a
lowercase letter. 1 would return a, 2 = b, 26 = z, etc.
A: Exercise5

6. Write a method that takes the following inputs and returns the corresponding outputs:
8->0, 7->1, 6->2, 5->3, 4->4, 3->5, 2->6, 1->7
A: Exercise6

7. If you modeled a chess board in Java using a two-dimensional array, how could you
convert chess notation, or coordinate notation of chess, to an element in that
two-dimensional array? For example, in the chess board image below, square a8 might map to
array[0][0], and h1 might map to array[7][7]. Make a method that takes an input String of a
chess coordinate and returns array coordinates. This exercise simply builds on the previous
two. Use the following test data:
Input Output
a8 0,0
h1 7,7
g5 6,3
d4 3,4
A: Exercise7


8. Now, let’s do something BIG. Let’s model a game of chess partially. Don’t worry, we won’t
be modeling a full game and calculating the most efficient move. We will model the board
and at least a couple of chess pieces, such as the pawn and knight. If you’re not familiar
with the basics of chess, please read this https://en.wikipedia.org/wiki/Chess#Movement.
One of the places where Object-Oriented Programming really shines best, is in modeling
domains with complex rules or logic. Few games can get as complex as chess. You’ll be
attempting to model how pawns and knights are permitted to move and interact with the
board. I will provide JUnit tests that you can copy into your own project. You will then need
to use TDD to implement the classes referenced in the tests and get the tests passing. For
those of you who want to try modeling these exercises initially without any help at all, you
may want to try not looking at the provided JUnit tests and make up your own based purely
on the descriptions below. The provided tests will show you how I decided to model the
concepts in some ways, though you will not see how their methods were implemented -
that’s left to you.

  8.1. You’ll need to create classes for: ChessBoard & Pawn. Per the JUnit test,
canAddPawn(), write code to allow an instance of the Pawn class to be added to an
instance of the ChessBoard at a square on the board using chess notation (a1, c3, etc.).
Then, assert that the pawn is actually at that location on the board by calling a method
on the board to retrieve a piece by location.

  8.2. Do the same as 8.1 but for a Knight, to get canAddKnight() working. The method you
wrote in 8.1 to add a pawn should also be able to accept a knight. Please be mindful
that you’ll need to utilize Object-Oriented techniques you learned in this section to get
this all working properly.

  8.3. Switching to the JUnit tests in the PawnTest.java file, enable the
pawnCanMoveOneForward() test to pass by implementing the necessary code. This is
where you’ll really begin to try implementing some business (or game) logic. The point
of this test is to simulate creating a pawn and placing it on a square and “asking” it
what are all the valid squares it could theoretically move to. The test will assert that one
of its valid moves is to move forward by one square. These moves do not consider
whether the square may already be occupied. Please be aware that the valid
movements of a piece should always be relative to wherever that piece happens to
start. So, although I provide examples of starting/ending positions for many of the
following exercises, the movements should work consistently no matter where the
pieces start. Moving forward from a2 to a3 is the same as moving from b2 to b3 or e5
to e6, etc. Do not hard-code the movements into your implementing code, in other
words.

  8.4. pawnCanMoveTwoForwardOnFirstMove() - hopefully, this test is obvious from its
name. It asserts that of all the possible moves a pawn could make, if the pawn has
never moved before (this assumes it begins on its standard starting position of a game),
one of its allowed moves is to move two squares forward (again, ignoring possibility of
other pieces in its way).

  8.5. Get test canNotMoveTwoAfterFirstMove() passing. This test asserts that after a pawn
has made its first move, if you “ask” it what its next valid moves are, moving two
squares forward will not be one of its options.

  8.6. Get test canMoveOneDiagonallyRight() passing. This asserts that one of a pawn’s
valid moves is to be able to move diagonally forward and to the right. Though this is
only permitted when the pawn can capture a piece, we won’t factor that in for now.

  8.7. Get test canMoveOneDiagonallyLeft() passing. Same as 8.6 but to the left.

  8.8. Get blackPawnCanMoveForward() passing. Assuming all previous pawn tests were
for a white pawn moving “up” the board, that would mean that a black pawn would
move in the opposite direction on the board. If we tie the direction of movement to the
color of the piece, then this test will assert that the permitted movements of a black
pawn will move “down” the board, towards the white pieces in general. If a black pawn
is on square a7 and move forward (relative to its side of the board) by one square, it
should then be on square a6.

9. Get blackPawnCanMoveTwoForwardOnFirstMove() passing. Just the black pawn
version of 8.4. If pawn was on b7, then it would end up on b5 in this case.
10. Switching to the KnightTest.java file, the first test to get passing is
knightCanMoveNorthEast(). The idea here is to assert that one of the knight’s valid
moves is to move two steps forward (North) and one step right (East) from wherever it’s
beginning. So, if it starts on square c1, it would end on d3. I chose to include knights to
be modeled because their movement is rather odd and considerably different from all
other chess pieces. This may force you to really think about those Object-Oriented
ideas ;-) .
  8.11. knightCanMoveNorthWest() - from c1, knight would end up on b3.
  8.12. knightCanMoveEastNorth() - from c1, knight would end up on e2.
  8.13. knightCanMoveEastSouth() - from c3, knight would end up on e2.
  8.14. knightCanMoveWestNorth() - from c3, knight would end up on a4.
  8.15. knightCanMoveWestSouth() - from c3, knight would end up on a2.
  8.16. knightCanMoveSouthEast() - from c3, knight would end up on d1.
  8.17. knightCanMoveSouthWest() - from c3, knight would end up on b1.
  8.18. blackKnightCanMoveSouthEast() - from d5, knight would end up on c7.

  8.19. Now that you’ve taught your Pawn & Knight classes how they’re permitted to move,
let’s enable them to be moved by the ChessBoard class. Going back to the tests for the
ChessBoard, ChessBoardTest.java file (if you’re going by the provided files), please
implement the ability canMoveC1KnightToD3(). The test will create a ChessBoard and
add a knight at c1. It will assert that the knight is on square c1. Then, it will then
“request” the ChessBoard to move the knight to d3. It will then assert that the knight is
no longer at c1 and that it is now at d3.

  8.20. Per the canNotMoveC1KnightToInvalidSquare(), implement the ability to prevent the
knight from being moved to invalid squares, such as from c1 to d4. In this event, the
knight should simply remain at c1 (for now). Assert that the knight started at c1, then
the attempt to move occurred. Then assert that the knight is NOT at d4 (as requested)
but IS still at c1 in this case.

  8.21. Per the canNotMoveC1KnightToFriendlyOccupiedSquare(), implement the ability to
prevent the knight from being moved to a square that is already occupied by another
chess piece of the same color (a friendly). So, if a knight starts on c1, and there’s a pawn
starting at d3, the knight can not move() to d3 if the knight and pawn are both the same
color.

  8.22. Per the canMoveC1KnightToEnemyOccupiedSquare(), implement the ability to allow
the knight to move to a valid square that is already occupied by an enemy piece (a
piece of the opposite color). Assert that the piece you’re moving is no longer at its
starting position. Assert that it ends up at the destination square. Assert that the enemy
piece has been “captured” by having been moved into an array of white’s captured
pieces.
*/
public class Exercises {
}
