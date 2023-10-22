#!/bin/bash

# Update the package repository
echo "Updating package repository..."
sudo apt update

# Install OpenJDK 17
echo "Installing OpenJDK 17..."
sudo apt install -y openjdk-17-jdk

# Verify the installation
echo "Verifying the installation..."
java --version
javac --version

# Set JAVA_HOME for user {YOUR USER NAME HERE}
echo "Setting JAVA_HOME for {YOUR USER NAME HERE}..."
echo "export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64" >> /home/{YOUR USER NAME HERE}/.bashrc
source /home/{YOUR USER NAME HERE}/.bashrc

echo "Installation complete!"

