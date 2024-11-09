This is coding practice repo.

I'm covering java basic concepts here like stream, lambda, etc

Here are some challenging problems to practice using Java's Stream API, ranging from filtering and mapping to more complex operations:

1. Filtering and Mapping
   Given a list of integers, find all even numbers, square them, and collect the results in a list.
   From a list of strings, extract the unique words, convert them to uppercase, and store them in a list.
2. Finding Max and Min with Streams
   Given a list of Employee objects with attributes like name, age, and salary, find the employee with the highest and lowest salary.
   Find the longest string in a list of strings, using streams.
3. Grouping and Partitioning
   Given a list of Person objects with age and name, group them by age.
   Partition a list of integers into two groups: numbers that are prime and those that are not.
4. Flat Mapping
   Given a list of lists of integers, flatten it into a single list of integers, filter out duplicates, and sort them.
   Given a list of Book objects, each having a list of authors, return a unique list of authors.
5. Reducing with Streams
   Sum up the salaries of all employees in a list.
   From a list of integers, find the product of all elements greater than 5 using reduce.
6. Creating Custom Collectors
   Implement a custom collector to return the sum of squared numbers in a list.
   Write a collector to collect strings from a list into a single comma-separated string, but only include strings that are not empty.
7. Parallel Stream Challenges
   Given a large list of numbers, calculate the factorial of each using parallel streams and analyze the performance difference compared to sequential streams.
   Sort a list of strings based on length using parallel streams and compare performance against sequential processing.
8. Performance and Optimization
   Given a large list of random numbers, find the first 100 even numbers, but stop the computation once 100 are found, using limit and filter optimally.
   Write a function to check if any string in a large list starts with a specific prefix, using short-circuiting (findFirst or anyMatch) to optimize the search.
9. Exception Handling in Streams
   Handle checked exceptions within stream operations. For example, read lines from a list of file paths and handle exceptions if a file doesn’t exist.