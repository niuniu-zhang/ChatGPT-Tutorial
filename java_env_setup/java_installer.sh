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

# Set JAVA_HOME for user niuniu
echo "Setting JAVA_HOME for niuniu..."
echo "export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64" >> /home/niuniu/.bashrc
source /home/niuniu/.bashrc

echo "Installation complete!"

