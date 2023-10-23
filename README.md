# Java with ChatGPT

This repository showcases a journey of creating Java code from scratch using OpenAI's ChatGPT given the [exercise prompt](Exercise.md). The repository includes setup scripts for Java environment (Linux) and the actual Java code, which represents an animal hierarchy. For a detailed understanding of the conversation and the requirements that led to this code, you can refer to the [ChatGPT Conversation](https://chat.openai.com/share/d9b5cbd9-c9be-4322-85a3-59b5194af631).

## Repository Structure

### Java Environment Setup (`java_env_setup/`)

Contained within this directory are setup scripts for your Java environment on Linux:

- `java_installer.sh`: Script to install Java.
- `java_uninstaller.sh`: Script to uninstall Java.

### Java Code

The `animal_class.java` file contains the Java classes resulting from the [exercise prompt](Exercise.md) shared with ChatGPT. It showcases the design of an animal hierarchy with the superclass `Animal` and its subclass `Dog`.

## Getting Started

1. **Setting up the Java Environment (Linux)**:
   Navigate to the `java_env_setup/` directory and run the `install_java.sh` script:
   
   ```bash
   cd java_env_setup/
   chmod +x java_installer.sh
   ./java_installer.sh

2. **Run the code**:
    Build the class, then run the test:

    ```bash
    javac animal_class.java
    java Test
    ```
