# SOSC 2 - Coding Puzzle Challenge Solutions

## Overview
This repository contains Java solutions for the Round 2 coding puzzle challenge with three problems that generate clues for a final key.

## Problem Solutions

### Problem 1 - Grid Transform
- **Algorithm**: Read 5x5 grid and rotation directions
- **Process**: Apply R (right) or L (left) rotations row by row
- **Output**: Sum of ASCII values of central row (index 2)
- **File**: `Problem1.java`

### Problem 2 - Multi-Pass String Process
- **Algorithm**: Four sequential transformations on input string
- **Steps**: 
  1. Reverse string
  2. Remove every 3rd character (1-indexed)
  3. Shift each character's ASCII value by +2
  4. Count vowels in result
- **File**: `Problem2.java`

### Problem 3 - State Sequence Simulation
- **Algorithm**: 4-state transition system (0→1→2→3)
- **Rules**:
  - Even numbers: advance one state per iteration
  - Prime numbers: jump directly to DONE state (3)
  - Odd composite: stuck, no advancement
- **Output**: Count of numbers reaching DONE state
- **File**: `Problem3.java`

## Final Key Generation
Format: `<hex_of_clue1>-<clue2_repeated_clue3_times>`

Run `FinalKey.java` to automatically solve all problems and generate the final key.

## Usage
```bash
# Compile all Java files
javac *.java

# Run individual problems
java Problem1
java Problem2  
java Problem3

# Generate final key
java FinalKey
```

## Logic Explanation
- **Grid Transform**: Matrix manipulation with character rotations
- **String Processing**: Sequential character-level transformations
- **State Machine**: Rule-based transitions with termination counting

The final key combines all clues using hexadecimal conversion and string repetition.