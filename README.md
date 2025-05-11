- Mantoan Matteo 2101085
- De Fina Giuseppe 2113187

# Note to the professor

### Collaboration and CI Workflow
Although the project was relatively small, we devoted considerable attention to designing an efficient CI workflow. This proved to be a non-trivial decision, as the simplicity of the project offered multiple valid approaches, but not a perfect one.

We began by pushing an initial commit to the develop branch containing the logic for converting the numbers 1 to 3 (without printing capabilities). This allowed us to parallelize our work: one team member focused on number conversion while the other worked on ASCII-art printing. Feature development proceeded in numerical blocks (e.g., 101–500), and integration into the development branch was permitted as soon as the feature for a block was complete. The only constraint was that conversion had to precede printing. We rotated roles throughout the project to ensure both contributors had experience with both parts.

### Development Approach

We developed the project following a Test-Driven Development (TDD) methodology. Each time a new test was written, we committed it—even before the test passed. Subsequent commits were then focused on making the test pass. To maintain clarity in the issue tracking process, we adopted a custom label system to mark the status of each issue; the meaning of each label is documented below.

### Testing Strategy

Initially, we tested numbers 1 to 6 manually. However, we quickly realized that manually validating all cases up to 1000 would be inefficient. As a result, we adopted an alternative strategy: we wrote two Python scripts that automatically generate test parameters. These scripts rely on the roman Python library, which we assumed to be functionally correct, to produce the expected Roman numeral representations.

### Code Coverage Note
Please note that the code coverage badge on the GitHub README may not display correctly due to limitations in GitHub’s Markdown rendering. To view the accurate coverage metrics, it is recommended to click on the badge, which links to the full report.

### Additional Features
Beyond the required specifications, we implemented a few enhancements:
- A command-line interface (CLI) application that accepts an integer and prints the corresponding Roman numeral in ASCII-art format.
- A code formatter (spotless) that enforces consistent code style by formatting the code at build time.
- A test coverage threshold: the build process is configured to fail if test coverage falls below 85%, providing an extra safeguard in continuous integration.


---

# integer-to-roman

A basic Java utility to convert integer numbers (1 to 1000) to Roman numbers, featuring ASCII-arts 😎

### Develop
[![Coverage Status](https://coveralls.io/repos/github/mntmtt/integer-to-roman/badge.svg?branch=develop)](https://coveralls.io/github/mntmtt/integer-to-roman?branch=develop)
[![CI](https://github.com/mntmtt/integer-to-roman/actions/workflows/build-and-test.yml/badge.svg?branch=develop)](https://github.com/mntmtt/integer-to-roman/actions/workflows/build-and-test.yml)

### Main
[![Coverage Status](https://coveralls.io/repos/github/mntmtt/integer-to-roman/badge.svg?branch=main)](https://coveralls.io/github/mntmtt/integer-to-roman?branch=main)
[![CI](https://github.com/mntmtt/integer-to-roman/actions/workflows/build-and-test.yml/badge.svg?branch=main)](https://github.com/mntmtt/integer-to-roman/actions/workflows/build-and-test.yml)

## Usage example

```
$ java -jar target/roman-number-1.0.jar 38
ooooooo  ooooo ooooooo  ooooo ooooooo  ooooo oooooo     oooo ooooo ooooo ooooo 
 `8888    d8'   `8888    d8'   `8888    d8'   `888.     .8'  `888' `888' `888' 
   Y888..8P       Y888..8P       Y888..8P      `888.   .8'    888   888   888  
    `8888'         `8888'         `8888'        `888. .8'     888   888   888  
   .8PY888.       .8PY888.       .8PY888.        `888.8'      888   888   888  
  d8'  `888b     d8'  `888b     d8'  `888b        `888'       888   888   888  
o888o  o88888o o888o  o88888o o888o  o88888o       `8'       o888o o888o o888o
```

## Issue labels

- `category:`
    - `bug`
    - `feature`

- `status:` the status of the issue
    - `todo` the issue has been published, not yet assigned.
    - `assigned` the issue is assigned, the test commit has not been published.
    - `tests-written` there are one or more commits containing the tests, but they are not passing yet.
    - `development` the minimum amount of code to pass the tests is being written by the assignee.
    - `done` the tests are passing, the code is waiting to be released.
