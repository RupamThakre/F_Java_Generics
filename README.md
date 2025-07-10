# [F] Core Java - Generics
Core Java Generics Concepts
Topics :

1. Intro
2. Why Generics - To enforce compile-time type safety and avoid type casting.
3. Generic class
4. Generic Interface
5. Bounded Type Parameters
6. Generics in Enum
7. Generics Constructor
8. Generic Method
9. Wildcards in Generics
10. Type Erasure
11. Generic in Exceptions

What happens if you don’t use generics?
- You risk ClassCastException at runtime.

What are bounded type parameters?
- <T extends Number> to restrict to subclasses of Number.

What’s the use of wildcards like ? extends T or ? super T?
- Useful for reading/writing from collections with unknown but compatible types.