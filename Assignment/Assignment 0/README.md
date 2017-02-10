This is the classical example for Software Test books and courses. Write a triangle program with a GUI or CLI (in any programming language) that accepts three integers, a, b, and c, as input that represent the sides of a triangle. The integers a, b, and c must satisfy the following conditions:
C1: 1 <= a <= 50
C2: 1 <= b <= 50
C3: 1 <= c <= 50
C4: a < b+c
C5: b < a+c
C6: c < a+b

If an input value fails any of the conditions c1, c2, or c3, the program notes this with an output message.

If values of a, b, and c satisfy conditions c1, c2, and c3, one of the four mutually exclusive outputs is given:

1. Equilateral.
2. Isosceles.
3. Scalene.
4. If any of conditions c4, c5, and c6 is not met, the program output is NotATriangle.
