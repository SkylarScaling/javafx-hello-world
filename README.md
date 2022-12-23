# javafx-hello-world
This repo is a template for quickly creating a JavaFX UI Application, including the ability to easily create a standalone executable that can be run on Windows (and other platforms using the maven install and jpackage utility, but currently no script exists for that build process. I would like to use Ansible for a cross-platform solution...)

## IDE-Based Application Development

In your IDE, the application can be run ad-hoc by executing the [LauncherMain](src/main/java/com/wheezy/template/LauncherMain.java) class as a Java Application.

A runnable jar can be created by running the _maven install_ task against the top level [pom.xml](pom.xml).


## Creating the Application Executable
This repository attempts to make building a self-contained application executable from your JavaFX application simple and fast.

### Dependencies
The application build and runtime components of this repo have some baseline dependencies.

[OpenJDK 15+](https://openjdk.org/projects/jdk/) - Java Runtime and Dev Kit \
[Apache Maven 3.6+](https://maven.apache.org/download.cgi) - Maven Build Tool \
[jpackage](https://docs.oracle.com/en/java/javase/19/jpackage/packaging-overview.html) - Included with OpenJDK, Application Packaging Tool \
[WiX v3+](https://wixtoolset.org/docs/wix3/) - Required as a dependency of jpackage on Windows

### Creating the Executable
#### Windows
Simply execute the [build-windows-executable.bat](build-windows-executable.bat) batch script to create an application executable that will be placed under _install-artifacts_ :

```
> build-windows-executable.bat
```

#### Other Operating Systems
This repository uses maven and jpackage to create the platform-specific executable, so you should be able to port the [build-windows-executable.bat](build-windows-executable.bat) process for 
your desired platform by executing the equivalent commands natively. The output of jpackage will be an executable that is compatible with whatever platform it is compiled on.

```
$ < maven install >
$ < copy artifacts to desired location >
$ < execute jpackage against the target artifacts >
```