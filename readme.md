# Project Documentation

Author: Matthew Festa

# Problem-Solving Lifecycle:

# 1. Describe the problem:

This program will take the user input of two positive integers
and determine the least common multiple (LCM) and the greatest common factor (GCF)
of the two numbers. In addition, the program must determine if either number is
a prime number or if either number is a ‘perfect’ number and output the above
information to the user.

Four methods will be used to achieve the goals of the program.

1. A method that takes two positive integers as input and returns the least
   common multiple. The least common multiple of two positive integers (a, b) is
   the smallest positive integer that is perfectly divisible by both a and b.

2. A method that takes two positive integers as input and returns the greatest
   common factor. The greatest common factor of two positive integers (a, b) is
   the largest positive integer that can divide evenly into both a and b.

3. A method that takes a single integer as input and returns a true/false flag.
   If the number is prime, the method should return true, otherwise it should
   return false. A prime number is a positive integer greater than 1, that has
   only 2 factors, 1 and the number itself.

4. A method that takes a single integer as input and returns a true/false flag.
   If the number is ‘perfect’, the method should return true, otherwise it should
   return false. A ‘perfect’ number is a positive integer that is equal to the
   sum of its positive divisors, excluding the number itself.

The program output should look like this:

Example 1:
Enter the first positive integer:
5
Enter the second positive integer:
6
The least common multiple (LCM) of 5 and 6 is: 30
The greatest common factor (GCF) of 5 and 6 is: 1
5 is a prime number.
6 is NOT a prime number.
5 is NOT a perfect number.
6 is a perfect number.

Example 2: (Looping until both numbers positive)
Enter the first positive integer:
-9
Enter the second positive integer:
54
Enter the first positive integer:
9
Enter the second positive integer:
-54
Enter the first positive integer:
9
Enter the second positive integer:
54
The least common multiple (LCM) of 9 and 54 is: 54
The greatest common factor (GCF) of 9 and 54 is: 9
9 is NOT a prime number.
54 is NOT a prime number.
9 is NOT a perfect number.
54 is NOT a perfect number.

Example 3:
Enter the first positive integer:
7
Enter the second positive integer:
11
The least common multiple (LCM) of 7 and 11 is: 77
The greatest common factor (GCF) of 7 and 11 is: 1
7 is a prime number.
11 is a prime number.
7 is NOT a perfect number.
11 is NOT a perfect number.



# 2. Analyze the problem:

a. What are the inputs?
i. The first positive integer (a).
ii. The second positive integer (b).


b. What are the outputs that should made by the solution to the problem?
i. If a negative integer is entered, the program will loop until the number
is positive.  
ii. The first output will be the least common multiple (LCM) of the first and
second positive integers.
iii. The second output will be the greatest common factor (GCF) of the first and
second positive integers.
iv. The next output will determine if either integer is a prime number.
v. The last output will determine if either integer is a perfect number.

c. How are the inputs and outputs related?
i. The least common multiple (LCM) of two positive integers (a, b) is
the smallest positive integer that is perfectly divisible by both a and b.    
ii. The greatest common factor of two positive integers (a, b) is
the largest positive integer that can divide evenly into both a and b.
iii. A prime number is a positive integer greater than 1, that has
only 2 factors, 1 and the number itself.
iv. A ‘perfect’ number is a positive integer that is equal to the
sum of its positive divisors, excluding the number itself.

d. Are there any constraints on the input?
i. The integers must be non-negative integers.
ii. If negative integers are inputted, they will be looped until they reach their
positive integer equivalents.

# 3. Design the algorithm to solve the problem
      a. Prompt user for the first integer (a).
            1. If integer is negative, loop the input until its positive integer
            equivalent is reached. 
      b. Prompt user for the second integer (b).
            1. If integer is negative, loop the input until its positive integer
            equivalent is reached. 
      c. In the least common multiple method (int): loop through the multiples of both 
        integers (a) and (b) until the smallest possible integer that is perfectly
        disivisble by (a) and (b), the LCM.
            1. Return the LCM.
      d. In the greatest common factor method (int): loop through the factors of both 
        integers (a) and (b) until the largest possible integer that can divide
        evenly into both (a) and (b), the GCF.
            1. Return the GCF.
      e. In the prime number method (boolean): loop through to check if the number is 
        divisible by any number in the given range. If integer a or 
        b is divisible, the isPrime flag is set to false, and we break out of the
        loop. If a or b isn't divisible by any number, flag is true and num is a 
        prime number. 
            1. If input a is (not) a prime number, output that it is (not) 
            a prime number.
            2. If input b is (not) a prime number, output that it is (not) 
            a prime number.
      g. In the perfect number method (boolean): loop through the factors of 
        integer a and b and add them.  If the sum of all factors is the same as
        integer a or b, then the isPerfect flag is set to true and the number is
        perfect. If not, the flag is set to false and the number is not perfect. 
            1. If input a is (not) a perfect number, output that it is (not) a perfect number.
            2. If input b is (not) a perfect number, output that it is (not) a perfect number.


# 4. Test the correctness of algorithm using a trace:

| Integer One | Integer Two | Expected LCM | Tested LCM | Expected GCF | Tested GCF | Expected Prime          | Tested Prime            | Expected Perfect         | Tested Perfect           |
|-------------|:-----------:|--------------|-----------:|:------------:|------------|-------------------------|-------------------------|--------------------------|--------------------------|
| 2           |      4      | 4            |          4 |      2       | 2          | 2: true / 4: false      | 2: true / 4: false      | 2: false / 4: false      | 2: false / 4: false      |
| 5           |      6      | 30           |         30 |      1       | 1          | 5: true / 6: false      | 5: true / 6: false      | 5: false / 6: true       | 5: false / 6: true       |
| 9           |     54      | 54           |         54 |      9       | 9          | 9: false / 54: false    | 9: false / 54: false    | 9: false / 54 false      | 9: false / 54 false      |
| 7           |     11      | 77           |         77 |      1       | 1          | 7: true / 11: true      | 7: true / 11: true      | 7: false / 11: false     | 7: false / 11: false     |
| 101         |     50      | 5050         |       5050 |      1       | 1          | 101: true / 50: false   | 101: true / 50: false   | 101: false / 50: false   | 101: false / 50: false   |
| 27          |     14      | 378          |        378 |      1       | 1          | 27: false / 14: false   | 27 false / 14: false    | 27: false / 14: false    | 27: false / 14: false    |
| 1985        |    1987     | 3944195      |    3944195 |      1       | 1          | 1985: false / 1987 true | 1985: false / 1987 true | 1985: false / 1987 false | 1985: false / 1987 false |
| 15          |     17      | 255          |        255 |      1       | 1          | 15: false / 17: true    | 15: false / 17: true    | 15: false / 17: false    | 15: false / 17: false    |
| 22          |     30      | 330          |        330 |      2       | 2          | 22: false / 30: false   | 22: false / 30: false   | 22: false / 30: false    | 22: false / 30: false    |
| 12          |     21      | 84           |         84 |      3       | 3          | 21: false / 12: false   | 21: false / 12: false   | 21: false / 12: false    | 21: false / 12: false    |