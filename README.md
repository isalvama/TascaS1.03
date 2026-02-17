# Tasca S1 03

## Description

This is a project created for academic purposes. More specifically, it is created to complete the exercises included in the third Topic (Collections) of IT ACADEMY Java & Spring specialization phase.
The indicated exercises are designed to understand how Java Collections work, focusing on the behavior of `ArrayList`, `HashSet`, and the use of `Iterators`.


## Techonologies

- Java
- Maven


## Project Structure
```
TascaS1.03/
src/
└── main/
    └── java/
       └── first_level/
            └── exercise1/
                ├── FirstExMain.java
                └── Month.java
            └── exercise2/
                └── SecondExMain.java
            └── exercise3/
                ├── CountriesAndCapitalData.java
                ├── FileReading.java
                ├── Game.java
                ├── GameProgram.java
                └── ThirdExMain.java
        └── second_level/
            └── exercise1And2/
                ├── Main.java
                ├── NameCompare.java
                └── Restaurant.java
```

## Installation

1. Clone the repository: `git clone https://github.com/isalvama/TascaS1.03.git`
2. Navigate to the project directory: `cd java`
3. Compile the project using Maven: `mvn clean compile`
4. Run the application using: `mvn exec:java -Dexec.mainClass="first_level.exercise1.FirstExMain"`


## Concepts covered

- Implementation and manipulation of `ArrayList` and ordered insertion using index-based methods in `List`.
- Conversion between different collection types (from `ArrayList` to `HashSet`).
- Understanding the uniqueness property of `HashSet` (avoiding duplicates).
- Iterating through collections using `for-each` loops and `Iterator` objects. 
- Usage of `ListIterator` for bidirectional traversal of lists: positioning the iterator cursor at a specific index (`list.size()`) and handling the `hasPrevious()` and `previous()` methods of the `ListIterator` interface.
- Use of `HashMap` to store and retrieve key-value pairs (Country-Capital).
- File I/O operations using `BufferedReader` and `FileReader`, using try-with-sources structure to throw `IOException` and its handling during file operations and data parsing and cleaning (String `split`, `trim`, and formatting).
- Overriding `equals()` and `hashCode()` to define object uniqueness in Set collections.
- Implementation of the `Comparable` interface for natural ordering and using `Collections.sort()` to order objects based on custom criteria.



## First Level

### Exercise 1: Month management with ArrayList and HashSet

#### Month class

`Month` is a basic class designed to store the name of a month. It includes a constructor to initialize the name and an override of the `toString()` method to provide a clear string representation of the object when it is printed or displayed in a collection.

#### FirstExMain class

This is the main class that demonstrates the use of Java Collections. The execution logic follows these steps:

1.  **ArrayList Creation**: An `ArrayList` is instantiated and populated with 11 `Month` objects. The month "August" is intentionally omitted at first to demonstrate ordered insertion later.
2.  **Specific Position Insertion**: Using the `add(int index, E element)` method, the "August" object is inserted at its correct chronological position (index 7), showing how `ArrayList` maintains the order of elements.
3.  **HashSet Conversion**: The program converts the `ArrayList` into a `HashSet` through the `convertMonthArrayListToHashSet` method. This illustrates how `HashSet` removes the ordering but focuses on element uniqueness.
4.  **Duplicate Testing**: An attempt is made to add a duplicate "August" object to the `HashSet`. This part of the code demonstrates that `HashSet` does not allow duplicate entries, maintaining only one instance of the object.
5.  **Iteration Methods**: The class showcases two different ways to traverse the collection:
    *   **For-each loop**: A simple and readable way to iterate through the `HashSet`.
    *   **Iterator**: A more explicit way to traverse the collection using the `hasNext()` and `next()` methods, which is the standard approach for many collection types in Java.


### Exercise 2: List reversal using ListIterator

#### SecondExMain class

This class demonstrates how to traverse a list in reverse order using a specialized iterator called `ListIterator`. The logic implemented follows these steps:

1.  **List Initialization**: A first list (`listA`) is created using `List.of()`, containing a sequence of integers.
2.  **Empty List Creation**: A second `ArrayList` (`listB`) is instantiated to store the elements that will be extracted from the first list.
3.  **ListIterator Configuration**: A `ListIterator<Integer>` is created for `listA`. Crucially, the iterator is initialized by passing `listA.size()` as a parameter, which places the cursor at the very end of the list instead of the beginning.
4.  **Reverse Traversal**: Using a `while` loop combined with `listIterator.hasPrevious()`, the program checks if there are elements before the current cursor position.
5.  **Element Migration**: Inside the loop, `listIterator.previous()` retrieves the preceding element and adds it to `listB`. This effectively populates the second list with the elements of the first one in reverse order (e.g., from `[1, 2, 3, 4]` to `[4, 3, 2, 1]`).
6.  **Results Display**: Finally, both lists are printed to the console to verify that the original order of `listA` remains intact and `listB` contains the reversed sequence.


### Exercise 3: Countries and Capitals Game

#### CountriesAndCapitalsData class
This class acts as a data container. It stores the information loaded from the text file in two different structures:
- A `HashMap<String, String>` for quick lookup of a capital given a country name.
- An `ArrayList<String>` containing only the country names, which facilitates the selection of a random country for the game questions.

#### Game class
A simple model (POJO) used to store the state of a single game session, including the `userName` and the final `points` achieved by the player.

#### GameMachine class
This class contains the core logic of the game within the `program()` method. 
The program:
1.  Requests the player's name and initializes a `Game` object.
2.  Reads the data from the external file with `loadCountries()` method: it uses `BufferedReader` to read the `countries.txt` file line by line. Each line is split into two parts using a whitespace delimiter; the first part is treated as the country and the second as the capital. The method enters the data in the class attributes.
3.  Runs a loop of **10 rounds** where a country is chosen randomly.
4.  Standardizes the user's input (ensuring the first letter is capitalized) to compare it with the correct value in the `HashMap`.
5.  Updates the score and finally records the game results in the list attribute of `playedGames`.

#### ThirdExMain class
The entry point for this exercise. It simply instances `GameMachine` and triggers the `program()` method to start the interactive console application.


## Second Level

### Exercise 1: Restaurant uniqueness and sorting

#### Restaurant class

`Restaurant` is the core model for this level. To meet the exercise requirements, it implements the following logic:
- **Uniqueness**: The `equals()` and `hashCode()` methods have been overridden. This ensures that two `Restaurant` objects are considered identical only if they have the same **name** AND the same **punctuation**. This is crucial for the correct behavior of the `HashSet`.

#### NameCompare class

`NameCompare` is a specialized class that implements the `Comparator` interface. Unlike the natural order defined within the `Restaurant` class, this class provides an external and more complex sorting strategy:
- **Primary Sort**: It first compares the **names** of the restaurants alphabetically.
- **Secondary Sort (Tie-breaker)**: If two restaurants have the exact same name, it uses their **punctuation** as a second criteria.
- **Sorting Logic**: The punctuation comparison is implemented in descending order (comparing `rest2` against `rest1`), ensuring that if names are identical, the highest-rated restaurant appears first.

This class allows the `ArrayList` to be sorted using `Collections.sort(list, new NameCompare())`, offering more flexibility than the standard `Comparable` implementation.

#### Main class

The main execution class demonstrates how to manage collections of custom objects:
1.  **Duplicate Prevention (Ex 1)**: Several `Restaurant` objects are created, including some with the same name and punctuation. When added to a `HashSet`, the set uses the overridden `hashCode` and `equals` methods to ensure that no two restaurants with the same attributes are stored, effectively filtering out duplicates.
2.  **Sorting (Ex 2)**: Since `HashSet` does not maintain any specific order, the program converts the `HashSet` into an `ArrayList`.
3.  **Natural Order**: By calling `Collections.sort()`, the program utilizes the `compareTo` logic defined in the `Restaurant` class to sort the list by alphabetic and ascending rating order.
4.  **Verification**: The results are printed before and after sorting to confirm that duplicates were removed and the final list is properly ordered.