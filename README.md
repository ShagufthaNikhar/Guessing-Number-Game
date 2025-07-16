# 🎯 Number Guessing Game – Java Console Project

A simple **number guessing game** developed in Java using basic programming constructs like loops, conditionals, user input, and random number generation.

---

## 🕹️ How the Game Works

- The computer randomly selects a number between **1 and 100**
- The user tries to guess it
- After each guess, the program gives hints:
  - "Too high"
  - "Too low"
- The game continues until the user guesses correctly
- After a win, the user can **choose to play again**

---

## 💡 Features

- Input validation
- Random number generation using `java.util.Random`
- Friendly console messages
- Tracks number of attempts
- Option to play multiple rounds

---

## 📂 File

| File Name              | Description                      |
|------------------------|----------------------------------|
| `NumberGuessingGame.java` | Java source code for the game   |

---

## ✅ Sample Output

```bash
=== Welcome to the Number Guessing Game! ===

I've picked a number between 1 and 100. Try to guess it!
Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 63
🎉 Congratulations! You guessed the number in 3 attempts.
Do you want to play again? (yes/no): no
Thanks for playing! Goodbye.

