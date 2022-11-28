package cw_nov;

/* Description
An infinite number of shelves are arranged one above
the other in a staggered fashion. The cat can jump up
to 3 shelves at the same time: from shelf 1 to shelf 2
or 4 (the cat cannot climb on the shelf directly above
its head), according to the illustration:

                 ┌────────┐
                 │-6------│
                 └────────┘
┌────────┐
│------5-│
└────────┘  ┌─────► OK!
            │    ┌────────┐
            │    │-4------│
            │    └────────┘
┌────────┐  │
│------3-│  │
BANG!────┘  ├─────► OK!
  ▲  |\_/|  │    ┌────────┐
  │ ("^-^)  │    │-2------│
  │ )   (   │    └────────┘
┌─┴─┴───┴┬──┘
│------1-│
└────────┘
Input
Start and finish shelf numbers (always positive integers, finish no smaller than start)

Task
Find the minimum number of jumps to go from start to finish

Example
Start 1, finish 5, then answer is 2 (1 => 4 => 5 or 1 => 2 => 5) */

public class CatJump {
  public static int solution(int start, int finish) {

    int distance = finish - start;
    int result;

    if (distance >= 3) {
      return distance / 3 + distance % 3;
    } else {
      result = distance;
    }

    /* Other solution:
     public class Kata {
        public static int solution(int start, int finish) {
          int diff = (finish - start);
          return diff/3 + diff % 3;
        }
     }
     */

    return result;
  }

  public static void main(String[] args) {
    System.out.println(solution(1, 5));// 2
    System.out.println(solution(1, 7));// 2
    System.out.println(solution(1, 3));// 2
    System.out.println(solution(1, 4));// 1
  }
}

/*
187 - .189

 */