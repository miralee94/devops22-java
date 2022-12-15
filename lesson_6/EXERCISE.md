# Exercise 6

## Instructions

This exercise are a `Group Exercise`, you can hand it in once for each team. The main goal for the mini project is to practice unit testing in java.

### `Exercise` Maven archetype [No hand in]

You don't have to hand in this exercise, it's mainly here to make sure you can run maven.

```bash
# Make sure maven works
mvn --version

# This command will create a new folder, named by the artifactId
mvn archetype:generate -DarchetypeGroupId="org.apache.maven.archetypes" -DarchetypeArtifactId="maven-archetype-quickstart" -DarchetypeVersion="1.4"

# You should get a generated java project
mvn install
# it should print BUILD SUCCESS

# Then also try mvn test
mvn test 

# it should print BUILD SUCCESS, some metrics and further up you should see [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```

### `Mini project` Junit

In this mini project you should work as a small team of 3-4 persons. I expect everyone to commit code in the project.

1. One person in your team should fork the repository [devops21_java_junit](https://gitlab.com/robert-alfwar/devops21_java_junit)
2. Give the other team members access to your forked repository
3. Create a NAMES.md file with all team members username, first and last name.
4. In your root repository workspace run:

    ```bash
    mvn archetype:generate -Dfilter="junit5"
    # Select uk.co.markg.archetypes:java11-junit5

    # groupId is i.e se.nackademin
    # artifactId is what you name your project, it will create a folder with this name
    # version could be default 1.0-SNAPSHOT
    # package se.nackademin

    # You can move all files out of the created folder if you want them in the root of your project
    ```

5. Read further instructions in your forked repository devops21_java_junit [README](https://gitlab.com/robert-alfwar/devops21_java_junit/-/blob/main/README.md)

### Extra Extensions [Optional]

If you have completed the mini project you can try out some extras.

* Add a coverage plugin to maven, check the links file for JaCoCo. Properly configured it will add a check that your project has good enough coverage, it will also generate a site report in html where you can browse your coverage. See LINK.md
* Try to write some mocks with Mockito. See LINK.md
* Add hamcrest matchers

## Hand in instructions

This is a group exercise so make sure that all members of the team has committed something to the code.

* [ ] Write a NAMES.md file that contains the full name of all team members
* [ ] Create a merge request from the fork against the upstream project (the one you forked from devops21_java_junit)
* [ ] Provide a screenshot of a successful test run
