# 2048-Game

Final project for the Programming Fundamentals 2 class at USI (Universita' della Svizzera Italiana); a replica in JAVA of the famous 2048 game;

2048 is a math game where, by summing numbers you have to reach the sum of 2048.
By starting the game you can decide if start or quit.
If decide to start you must login, inserting the player name.
Done that, by tapping on the screen you officially start playing.
Use the arrows to move the tiles and reach 2048.
If you win a frame appears with compliments, the same if you lose but without compliments.

## Team Members
* RAFFAELE PERRI, PerriRaffaele
* CAGLIANONE FRANCESCO, FrankCaglianone

## Mentor
* Marcilio Diego

## Project Structure
This project is both a Maven project and a BlueJ project.
You can open, compile, test, and run the code within BlueJ
by opening `src/package.bluej`.

You can use Maven to compile, test, and check the code
by running `mvn` in this top-level directory (see below).

You can run the code compiled by Maven from the terminal (see below).

The code is structured into three packages:

* `model` - all the model classes and their tests
* `tui` - text user interface (works in a terminal)
* `gui` - Swing-based graphical user interface (opens a window)

Note that the classes in the `model` package MUST NOT refer to any
classes in the `tui` or `gui` packages.

The classes in the `tui` package must not refer to any classes in the `gui` package.

The classes in the `gui` package must not refer to any classes in the `tui` package.

The classes in the `tui` and `gui` packages SHOULD refer to classes in the `model` package.

The classes in the `model` package need to come with unit tests.
(The classes in the `tui` and `gui` packages do not need to be covered with tests.)

## How build using Maven
In this top-level directory:

```bash
mvn compile
```

## How to run the application
To run the application from outside BlueJ, first build it with Maven.
This generates the compiled classes in the directory `target/classes`.

### Running the TUI
To run this application, with the TUI, from the command line:

```bash
java -cp project-2048-s-game/src tui.Main
```

## Commands
1. "right": to move right
2. "left": to move left
3. "up": to move up
4. "down": to move down

### Running the GUI
To run this application, with the GUI, from the command line:

```bash
java -cp project-2048-s-game/src gui.Main 

```

COMMANDS:
Keys: VK_LEFT, VK_RIGHT, VK_UP, VK_DOWN

### How to run the JUnit tests with Maven

```bash
mvn test
```

### How to run Checkstyle with Maven

```bash
mvn compile
mvn checkstyle:check
```

### How to run PMD with Maven

```bash
mvn compile
mvn pmd:check
```

### How to run PMD's CPD with Maven

```bash
mvn compile
mvn pmd:cpd-check
```

### How to determine test coverage with Maven

```bash
mvn site
```

Then open `target/site/index.html` and find the JaCoCo report.


## License
[MIT License](LICENSE)
