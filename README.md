# Xiaomckedou233's Paper Plugin Template for Kotlin
The simple plugin template using kotlin.

## Usage
**Plugin Development**:
* Please read the [Paper Documentation](https://docs.papermc.io/paper/1.20/dev) for general plugin development help.

**Using the template**
* Click the big green `Use this template` button to clone the template to your GitHub.
* Replace relevant information in the files
    * `build.gradle.kts`
        * `group`
        * `version`
    * `src/main/resources/plugin.yml`
        * basically everything in there
    * `README.md`
        * Can't forget this! It's what your reading now!
* Once set up in your IDE of choice, you will probably want to build your plugin. Here are a few options
    * You can use `gradlew shadowJar` to run from the command line.
    * You can create a build configuration in your IDE with the gradle commands `shadowJar`.