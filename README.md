# Basic eCommerce App

## Overview
This project is a basic eCommerce Android application that displays a list of items using a `RecyclerView`. Users can view items and interact with them. The app includes automated UI tests using Espresso to ensure the functionality of the `RecyclerView` and item interactions.

## Objectives
- **Display Items:** Use a `RecyclerView` to list items available in the store.
- **Item Interaction:** Allow users to click on items to view more details or take action.
- **UI Testing:** Validate that the `RecyclerView` is displayed and that item interactions work as expected.

## Technologies Used
- **Android SDK:** The core platform for building the Android app.
- **Java/Kotlin:** Programming languages used to develop the app and tests.
- **Espresso:** A powerful Android UI testing framework for writing reliable and concise tests.
- **RecyclerView:** A flexible view for providing a limited window into a large data set.

## Test Cases

### 1. Test `RecyclerView` Display
- **Purpose:** Verifies that the `RecyclerView` displaying the list of items is visible on the screen.
- **Process:** The test checks if the `RecyclerView` with the specified ID is displayed.

### 2. Test `RecyclerView` Item Click
- **Purpose:** Ensures that an item in the `RecyclerView` can be clicked and highlights the selected item.
- **Process:** The test performs a click action on an item at position 2 in the `RecyclerView` and changes the background color of the item to indicate selection.
