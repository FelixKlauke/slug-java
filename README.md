# slug-java
Java implementation of my interpreted programming language SLUG (Simple Language).

The language is currently under heavy development and syntax and other language related things may change. 

Feature and bug-fix requests are welcome.

# Build Status
|             	| Build Status                                                                                                                                              	| Test Code Coverage                                                                                                                                               	|
|-------------	|-----------------------------------------------------------------------------------------------------------------------------------------------------------	|------------------------------------------------------------------------------------------------------------------------------------------------------------------	|
| Master      	| [![Build Status](https://travis-ci.org/FelixKlauke/slug-java.svg?branch=master)](https://travis-ci.org/FelixKlauke/slug-java) 	| [![codecov](https://codecov.io/gh/FelixKlauke/slug-java/branch/master/graph/badge.svg)](https://codecov.io/gh/FelixKlauke/slug-java) 	|
| Development 	| [![Build Status](https://travis-ci.org/FelixKlauke/slug-java.svg?branch=dev)](https://travis-ci.org/FelixKlauke/slug-java)    	| [![codecov](https://codecov.io/gh/FelixKlauke/slug-java/branch/dev/graph/badge.svg)](https://codecov.io/gh/FelixKlauke/slug-java)    	|

# Features

- [X] Basic structure
- [X] Functions
- [X] Variables (int, string, bool)
- [X] Scopes
- [X] Boolean expression (myInt == otherInt, "test" == "test", 4 > 3)
- [X] Conditionals (if, for, while)
- [X] Internal functions (WriteLine, ReadLine, Random, etc.)
- [X] Function calls
- [X] Function parameters
    - [ ] Default values for parameters
- [ ] Classes
    - [ ] New instance creation
    - [ ] Member variables
    - [ ] Auto member variable constructor
- [X] Inline string variables (string s = "Hello $myOtherString", WriteLine("Your rank is $rank with a score of $score"))
- [ ] Inline string expression evaluation (string s = "Number is ${2 + 9}")

# Example GuessIt game

The GuessIt game is a simple CLI game where the user needs to guess a random generated number from 1-100. If the guessed number is too small, the game prints that and the other way around until the correct number has been found.

![slug-guess-it](docs/images/slug-guess-it.png)


# TDD (Test Driven Development)

The goal is to get as near as possible to a 100% test coverage and to test every feature while it is being developed.

### License

Licensed under the  Apache License, Version 2.0.
