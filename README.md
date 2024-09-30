# Othello Game - University Project

This project is a Java implementation of the game Othello (also known as Reversi). This game was developed as part of a university assignment for the University of Toronto's CSC207 course.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributors](#contributors)

## Overview
Othello is a strategy board game for two players. The players take turns placing disks on the board, with their designated color face up.
When a player places a disk, all opponent disks that are in a straight line (horizontal, vertical, or diagonal) and bounded by the placed disk and another disk of the current player's color are flipped to the current player's color.
The objective of the game is to have the majority of disks turned to display your color when the last disk is placed.

## Features
- **Different Game Modes:** 
  - Human vs Random (Computer)
  - Random vs Greedy (Computer)
  - Random vs Random
- **Player Types:**
  - Human Player
  - Random Player
  - Greedy Player
- **Comprehensive Game Logic:** 
  - Move validation
  - Turn management
  - Game state management (checking for win/loss conditions)
  - Board setup and updates


### OthelloControllerHumanVSRandom
Controls a game of Othello between a human player and a random player.

### OthelloControllerHumanVSHuman
2 Player Mode.

### OthelloControllerHumanVSGreedy
Controls a game of Othello between a human player and a Greedy player.

### OthelloControllerRandomVSGreedy
Runs a simulation to find the probability of Random Player or Greedy Player winning when they play against eachother

### OthelloControllerRandomVSRandom
Runs a simulation between Random Player and another Random Player. They both should have roughly the same chance of winning.

## Project Structure

### Models
- **Othello.java:** The main game logic, handling the overall game including turns, moves, and game state.
- **OthelloBoard.java:** Represents the game board state and includes methods for updates and move validation.
- **Move.java:** Represents a move in the game, encapsulating details such as the board position and player making the move.

### Players
- **PlayerHuman.java:** Handles input and actions for a human player.
- **PlayerRandom.java:** Implements a player that makes moves randomly.
- **PlayerGreedy.java:**  Implements a player that chooses the best move out of all the available moves. The best move is defined to be the one that flips the most tockens.

## Contributors
- **Patrick Gaied**

This project was developed as part of the coursework for CSC207 at the University of Toronto.
