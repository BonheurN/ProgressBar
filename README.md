ProgressBar Application
Overview
This project is a simple Java Swing application that demonstrates the implementation of a graphical progress bar (JProgressBar). The application displays a progress bar that fills up from 0% to 100% over time, providing a visual representation of progress. This project is ideal for learning about basic Swing components and multi-threading with Thread.sleep().

Features
Swing UI: The application uses Java's Swing framework to create a GUI window.
Dynamic Progress Bar: A JProgressBar element fills gradually, simulating progress in an application.
Custom Styling:
Progress bar uses the Consolas font with bold styling.
The progress bar text is painted and updates in real-time to display the percentage.
Custom foreground color for the progress bar (red in this case).
Code Breakdown
Main Components:
JProgressBar: This is the main component that displays the progress. It starts with an initial value of 50 and gradually progresses to 100%.

Progress Fill Method:

The method Fill() is responsible for incrementing the value of the progress bar from 0 to 100.
It pauses for 50ms between increments using Thread.sleep(), simulating progress over time.
Customization:
Font and Color:

The progress bar uses the Consolas font in bold, with a size of 20 for clear visibility.
The progress bar is styled with a red foreground to make the progress stand out.
Layout and Dimensions:

The layout is null, allowing precise control over component placement.
The progress bar is placed within a window of size 500x500px.
Main Class:
ProgressBar:
Inherits from JFrame to create the main application window.
Implements ChangeListener but currently does not handle any change events directly (which can be extended in the future).
Requirements
Java Version: Ensure you have JDK 8 or above installed.

<img width="363" alt="ProgressBar" src="https://github.com/user-attachments/assets/9b969c17-a95c-4e34-838c-62545f3616d5">
