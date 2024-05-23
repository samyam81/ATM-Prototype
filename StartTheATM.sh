#!/bin/bash

cd /c/Users/Asus/OneDrive/Documents/Projects/ATM

javac Splash.java

if [ $? -eq 0 ]; then
    echo "Compilation successful. Running Splash..."
    
    # Run Splash
    java Splash
else
    echo "Compilation failed."
fi
