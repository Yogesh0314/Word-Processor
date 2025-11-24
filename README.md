# Project Summary

Word Processor is a lightweight desktop text editor written in Java
using Swing. It provides a main text area with font selection, color
selection, adjustable font size, and basic RTF export. The project
demonstrates organizing UI components, handling events, and separating
concerns using helper classes for maintainability and testing.

## Features

-   **Text Editing**: Basic rich-text editing using `JTextPane`.
-   **Font Selection**: Choose between Monospaced, Serif, and Sans Serif
    with adjustable size.
-   **Color Selection**: Change text color using a simple color palette.
-   **Save to File**: Export content as RTF using editor kits and
    `FileOutputStream`.
-   **Simple Swing UI**: Single-window design with manual component
    layout (bounds).

## What I Learned

1.  **Java Swing UI fundamentals** -- Using `JPanel`, `JTextPane`,
    `JButton`, `JComboBox`, `JSlider`, and `JLabel`.
2.  **Event handling** -- Implementing `ActionListener` and wiring UI
    listeners.
3.  **Separation of concerns** -- Classes like `SaveContent`,
    `ColorManagement`, `FontManagement`, and `Display`.
4.  **Fonts and colors** -- Applying `Font` and `Color` changes at
    runtime.
5.  **File I/O basics** -- Using `JFileChooser`, `FileOutputStream`, and
    `BufferedOutputStream`.
6.  **Document model** -- Working with `StyledDocument` and editor kits.
7.  **Debugging & compilation** -- Fixing imports, method mismatches,
    syntax errors.
8.  **Code hygiene** -- Understanding Java generics (e.g.,
    `JComboBox<String>`).
9.  **Soft skills** -- Planning features, improving UI layout,
    incremental testing.

## Technologies Used

1.  Java (JDK 8+)
2.  Swing GUI Toolkit
3.  AWT
4.  StyledDocument & EditorKit
5.  RTF export / File I/O

## Future Improvements

-   Add Undo/Redo
-   Add support for opening existing files
-   Add text alignment options
-   Improve layout using BorderLayout, BoxLayout, or GridBagLayout
