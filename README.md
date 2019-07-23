# Template project

# Introduction

* This project is based on the giter8 HelloWorld for lagom `sbt new lagom/lagom-java.g8` and broken down step by step.

This project was created using the Lightbend Course Management Tools - open source tools for building step-wise tutorials or demos. 

- Add two new `sbt` commands to select one of the exercises so that `test` or `runAll`
  can be executed for the selected project:
 
  `setActiveExerciseNr <n>`: set exercise with number ‘n’ active and hide all other exercises
  `activateAllExercises`: make all exercises ‘active’ again

This is intended as an introductory walkthrough to Lagom in java.  We will learn:
* How to define an API
* How to implement a service using event sourcing
* How to test a lagom service
* How to stream events asynchronously between services

---

# Prerequisites #

This introduction to Lagom is best suited to developers with some prior experience with Scala.

You will need to have the following installed in order to use this material:
1. JDK 1.8 
2. Intellij Community Edition 2017 or higher
3. Git
4. SBT
5. The intellij scala plugin
*6. A unix compatible shell*

---

### Make Yourself Familiar with Sbt

- Read the first chapters of the [Getting Started Guide](http://www.scala-sbt.org/release/tutorial/index.html)
- Starting `sbt` takes you to a **interactive session**
- Take a look at `build.sbt` and the other `.sbt` files for this course
- Change directory to the `lagom-greetings-java-workshop-dev` directory and start `sbt` as follows:

```scala
$ sbt
man [e] > lagom-mini-workshop > initial-state >
```

---

### man

The `man` command, short for manual, displays the setup instructions (what you are reading now) for the courseware. To view the instructions for the current exercise, use the `e` option. If you are using an IDE, you can also open up the setup instructions (`README.md`) file or the current exercises instructions (`src/test/resources/README.md`) file in your workspace.

```scala
// display the setup instructions
man [e] > lagom-mini-workshop > initial-state > man

// display the instructions for the current exercise
man [e] > lagom-mini-workshop > initial-state > man e
```

---

### course navigation and testing

Navigation through the courseware is possibile with a few `sbt` commands. Also, tests are provided to confirm our solution is accurate. It is important to note that the tests make some assumptions about the code, in particular, naming and scope; please adjust your source accordingly. Following are the available `navigation` commands:

```scala
// show the current exercise
man [e] > lagom-mini-workshop > initial-state > showExerciseId
[INFO] Currently at exercise_000_initial_state

// move to the next exercise
man [e] > lagom-mini-workshop > initial-state > nextExercise
[INFO] Moved to exercise_001_some_exercise

// move to the previous exercise
man [e] > lagom-mini-workshop > some_exercise > prevExercise
[INFO] Moved to exercise_000_initial_state

// Get the answers to the exercise
man [e] > lagom-mini-workshopo > some_exercise > pullSolution
[INFO] Solution for exercise exercise_010_basket_service pulled successfully

// save the current state of an exercise for later retrieval and study
man [e] > lagom-mini-workshop > initial-state > saveState
[INFO] State for exercise exercise_000_initial_state saved successfully

// List previously saved states
man [e] > lagom-mini-workshop > initial-state > savedStates
[INFO] Saved exercise states are available for the following exercise(s):
        exercise_000_initial_state

// Restore a previously saved exercise state
man [e] > lagom-mini-workshop > initial-state > restoreState exercise_000_initial_state
[INFO] Exercise exercise_000_initial_state restored
```

---

### clean

To clean your current exercise, use the `clean` command from your `sbt` session. Clean deletes all generated files in the `target` directory.

```scala
man [e] > lagom-mini-workshop > initial-state > clean
```

---

### compile

To compile your current exercise, use the `compile` command from your `sbt` session. This command compiles the source in the `src/main/scala` directory.

```scala
man [e] > lagom-mini-workshop > initial-state > compile
```

---

### reload

To reload `sbt`, use the `reload` command from your `sbt` session. This command reloads the build definitions, `build.sbt`, `project/.scala` and `project/.sbt` files. Reloading is a **requirement** if you change the build definition files.

```scala
man [e] > lagom-mini-workshop > initial-state > reload
```


---
