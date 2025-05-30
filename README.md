# DelI-cious Sandwich Ordering App

Welcome to **DelI-cious**, a Java-based console application that allows users to create custom sandwich orders, add sides like drinks and chips, and generate a receipt. This app demonstrates basic object-oriented programming, user input handling, file writing, and control structures in Java.

---

## 🚀 Features

* Intuitive text-based menu system
* Build custom sandwiches with bread, meats, cheese, toppings, sauces, and size options
* Add drinks and chips to your order
* Checkout and generate a timestamped receipt saved to the `receipt/` directory

---

## 📁 Project Structure

```
DelI-cious/
├── Main.java          # Entry point of the application
├── HomeScreen.java    # Displays the main menu and navigates user choices
├── Order.java         # Handles ordering, checkout, and receipt creation
├── Sandwich.java      # Builds and stores sandwich details
├── Sides.java         # Handles drinks and chips logic
└── receipt/           # Folder where order receipts are saved
```

---

## 💡 How to Run

1. Compile all Java files:

```bash
javac *.java
```

2. Run the application:

```bash
java Main
```

---

## 📝 Notes

* Receipts are saved in the `receipt/` folder. Make sure this folder exists or is created by the program.
* Inputs must follow instructions (e.g., comma-separated lists for sandwich ingredients).
* Drinks and chips each have simple flat-rate costs defined in the `Sides` class.

---

## 📜 Example Receipt Format

```
Bread type: White size: 8
Toasted: true
Meats: [Ham, Bacon]
Cheeses: [Cheddar, Swiss]
Toppings: [Lettuce, Tomato]
Sauces: [Mayo]
...
Total: $11.50
```

---

## 🛠️ Future Improvements

* Improve input validation and error messages
* Add price breakdown per item in receipt
* Support multiple orders per session
* GUI version with Swing or JavaFX

---

Made with JAVA by \Preston Panom

