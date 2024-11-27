<h1>Lexer and Parser for simple language</h1>

This project implements a lexer and parser for simple programming language using Java CUP and JFlex. 
The lexer tokenizes the input source code, and the parser processes these tokens to execute or
analyze the program.

<h3>Project structure:</h3>

  * Lexer: Uses JFlex to tokenize the source code into symbols
  * Parser: Built using Java CUP, processes the tokenizes input to produce results or errors.
  * Main program: Used to combine Lexer and Parser to process input file

<h3>Example:</h3>
  <ul><li>Input should be inside (written) in the input file that is being accepted as the command line argument when running the program</li></ul>
  
  <strong>Input:</strong>
  ```
  x = 1
  print x
  scope {
   x = 2
   print x
   scope {
     x = 3
     y = x
     print x
     print y
   }
   print x
   print y
  }
  print x
```

  <strong>Output:</strong>
  ```
  1
  2
  3
  3
  2
  null
  1
  Parsing completed.
```


<h3>Prerequisites:</h3>
<ul>
  <li> Java 8 or newer</li>
  <li> JFlex</li>
  <li> Java CUP</li>
  <li> Linux</li>
</ul>

<h3>Getting started:</h3>

1. Clone the repo to your local machine:
    
  ```
  git clone https://github.com/marko1684/language_interpreter
  cd language_interpreter
  ```

2. Install dependencies:
   - Download and install [JFlex](https://www.jflex.de/).
   - Download and install [Java CUP](http://www.cs.princeton.edu/~appel/modern/java/CUP/).

3. Generate the Lexer and Parser
  ```
  jflex Lexer.flex
  java -jar java-cup.jar parser.cup
  ```

4. Compile the project
  ```
  javac *.java
  ```

5. Run the program
  ```
  java Main example.txt
  ```

