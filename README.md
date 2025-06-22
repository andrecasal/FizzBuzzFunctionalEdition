# FizzBuzzFunctionalEdition

A FizzBuzz implementation using functional programming principles in Java, leveraging streams, predicates, and functional composition.

## About FizzBuzz

FizzBuzz is a classic programming problem used in interviews to test basic programming skills. The rules are:

For numbers 1 through 100:
* If the number is divisible by 3, print "Fizz"
* If the number is divisible by 5, print "Buzz" 
* If the number is divisible by both 3 and 5 (15), print "FizzBuzz"
* Otherwise, print the number

## Programming Paradigm

This implementation demonstrates **functional programming** principles:

- **Immutability**: No mutable state or variables
- **Pure Functions**: Functions without side effects
- **Higher-Order Functions**: Functions that take or return other functions
- **Function Composition**: Building complex behavior from simple functions
- **Declarative Style**: Expressing what to do, not how to do it
- **Stream Processing**: Data flows through transformation pipelines

### Key Functional Features

1. **IntPredicate**: Functional interfaces for divisibility testing
2. **IntFunction**: Mapping numbers to their FizzBuzz representation
3. **Method References**: Clean, readable function references (`System.out::println`)
4. **Lambda Expressions**: Concise function definitions
5. **Stream API**: Functional data processing pipeline
6. **Function Composition**: Combining predicates with `.and()` operations

## Code Structure

```java
// Pure functional predicates
private static final IntPredicate isDivisibleBy3 = n -> n % 3 == 0;
private static final IntPredicate isDivisibleBy5 = n -> n % 5 == 0;
private static final IntPredicate isDivisibleBy15 = isDivisibleBy3.and(isDivisibleBy5);

// Pure mapping function
private static final IntFunction<String> fizzBuzzMapper = n ->
    isDivisibleBy15.test(n) ? "FizzBuzz" :
    isDivisibleBy3.test(n) ? "Fizz" :
    isDivisibleBy5.test(n) ? "Buzz" :
    String.valueOf(n);

// Functional pipeline
IntStream.rangeClosed(1, limit)
    .mapToObj(fizzBuzzMapper)
    .forEach(System.out::println);
```

## Running the Code

```bash
# Compile
javac FizzBuzz.java

# Run
java FizzBuzz
```

## Functional Programming Benefits

- **Composability**: Functions can be easily combined and reused
- **Testability**: Pure functions are easy to test in isolation
- **Readability**: Declarative code expresses intent clearly
- **Parallelization**: Immutable functions work well with parallel streams
- **Debugging**: No hidden state makes reasoning about code easier

## Comparison with Other Editions

This repository is part of a programming paradigm showcase:

1. **[FizzBuzzImperativeEdition](../FizzBuzzImperativeEdition)** - Simple, procedural approach with for loops and if statements
2. **FizzBuzzFunctionalEdition** (this repo) - Functional programming with streams and predicates
3. **[FizzBuzzObjectOrientedEdition](../FizzBuzzObjectOrientedEdition)** - Over-engineered enterprise OOP solution with patterns
4. **[FizzBuzzDeclarativeEdition](../FizzBuzzDeclarativeEdition)** - Configuration-driven, rule-based approach

Each demonstrates different programming paradigms and approaches to solving the same problem.

## Prerequisites

- Java 8 or higher (required for streams and lambda expressions)
- Understanding of functional programming concepts is helpful but not required