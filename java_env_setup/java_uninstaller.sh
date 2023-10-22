#!/bin/bash

# Uninstall OpenJDK 17
echo "Uninstalling OpenJDK 17..."
sudo apt purge -y openjdk-17-jdk

# Remove any residual packages that were installed with OpenJDK 17 but are no longer used
echo "Autoremoving orphaned packages..."
sudo apt autoremove -y

# Remove the JAVA_HOME setting from .bashrc of user niuniu
echo "Removing JAVA_HOME setting from niuniu's .bashrc..."
sed -i '/export JAVA_HOME=\/usr\/lib\/jvm\/java-17-openjdk-amd64/d' /home/niuniu/.bashrc

# Clean the apt cache
echo "Cleaning the apt cache..."
sudo apt clean

# Inform user
echo "Thorough cleanup complete!"

