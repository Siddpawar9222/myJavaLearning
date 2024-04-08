package M_Java8.C_OptionalClass;

import java.util.Optional;

public class Basic {
     public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null).isPresent());
        System.out.println(Optional.ofNullable("isPawar").isPresent());
        System.out.println(Optional.empty());
      //   System.out.println(Optional.ofNullable().orElse("Optional is null"));
     }
}

/*
-NullPointerException is hectic for developers
-Optional class is a container object used to contain not-null objects , represent an optional value, meaning that the value may or may not be present. The main purpose of the Optional class is to help avoid null pointer exceptions and provide more meaningful ways to handle the presence or absence of a value.
-(IMP)An Optional is typically used for a single value that may or may not be present.


1. **`of(T value)`:**
   Creates an `Optional` containing the specified non-null value. If the value is null, it will throw a `NullPointerException`.
   
2. **`empty()`:**
   Creates an empty `Optional` instance with no value.

3. **`ofNullable(T value)`:**
   Creates an `Optional` containing the specified value, which can be null. If the value is null, it will create an empty `Optional`.

4. **`isPresent()`:**
   Returns `true` if the `Optional` contains a non-null value, otherwise returns `false`.

5. **`ifPresent(Consumer<? super T> action)`:**
   If the `Optional` contains a value, performs the given action on it.

6. **`ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)`:**
   If the `Optional` contains a value, performs the given action on it; otherwise, performs the given emptyAction.

7. **`get()`:**
   Returns the value if present; otherwise, throws a `NoSuchElementException`.

8. **`orElse(T other)`:**
   Returns the value if present; otherwise, returns the specified default value.

9. **`orElseGet(Supplier<? extends T> supplier)`:**
   Returns the value if present; otherwise, returns the value produced by the specified supplier.

10. **`orElseThrow()`:**
    Returns the value if present; otherwise, throws a `NoSuchElementException`.

11. **`orElseThrow(Supplier<? extends X> exceptionSupplier)`:**
    Returns the value if present; otherwise, throws an exception provided by the specified supplier.

12. **`filter(Predicate<? super T> predicate)`:**
    If a value is present, and it satisfies the given predicate, returns an `Optional` containing the value; otherwise, returns an empty `Optional`.

13. **`map(Function<? super T, ? extends U> mapper)`:**
    If a value is present, applies the given mapping function to it and returns an `Optional` containing the result; otherwise, returns an empty `Optional`.

14. **`flatMap(Function<? super T, Optional<U>> mapper)`:**
    If a value is present, applies the given mapping function that returns an `Optional`, and returns the result; otherwise, returns an empty `Optional`.

15. **`equals(Object obj)`:**
    Indicates whether some other object is "equal to" this `Optional`.

16. **`hashCode()`:**
    Returns the hash code value of the `Optional` or zero if it is empty.

17. **`toString()`:**
    Returns a non-empty string representation of the `Optional` if a value is present; otherwise, returns "Optional.empty".

 */