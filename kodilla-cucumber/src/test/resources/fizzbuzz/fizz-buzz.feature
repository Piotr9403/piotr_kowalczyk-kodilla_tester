Feature: Fizz Buzz
  Scenario Outline: The number is divisible by 3, is divisible by 5, is divisible by 3 and 5, or is not divisible by 3 or 5
    Given number is <number>
    When I check its divisibility by three and five
    Then I should get a message <answer>
    Examples:
      | number | answer |
      | 6 | "Fizz" |
      | 15 | "FizzBuzz" |
      | 7 | "None" |
      | 10 | "Buzz" |