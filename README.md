# java-while-loop-guessing-game

A console-based number guessing game built in Java, designed to explore the depth of `while` loops through progressive phases of complexity.

## Overview

The player attempts to guess a randomly generated number between 1 and 100 within a limited number of attempts. The game features input validation, hints, and a replay system — all implemented exclusively using `while` and `do-while` loops.

## Features

- Random number generation every round
- 7 attempt limit per round
- High / low hints after each guess
- Input validation with out-of-range detection
- Replay system without restarting the program

## What I Learned

| Phase | Concept |
|---|---|
| 1 | Basic `while` loop with a sentinel condition |
| 2 | Counter-controlled loops and `Random` |
| 3 | Nested `while` for input validation |
| 4 | `do-while` for replay logic and `String` comparison |

## Getting Started

### Prerequisites
- Java JDK 8 or higher

### Running the game

```bash
javac Main.java
java Main
```

## Gameplay

```
Guess a number from 1-100
Enter a number: 50
Too low, guess higher
Enter a number: 75
Too high, guess lower
Enter a number: 67
Good job! You guessed the number!
Would you like to continue playing? (y/n)
```

## Constraints

This project was built with the following self-imposed rules:
- No `for` loops — only `while` and `do-while`
- No external libraries — only `java.util.Scanner` and `java.util.Random`
- Single file, single `main` method

## Roadmap

- [ ] Phase 5 — rewrite replay loop as `while (true)` with `break`
- [ ] Phase 6 — scoreboard tracking wins, losses, and total guesses
- [ ] Difficulty modes (easy / medium / hard)
- [ ] Hot/cold proximity hints

## License

MIT
