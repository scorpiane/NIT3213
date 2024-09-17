# Final Assignment

## Overview

The Final Assignment is an Android application that showcases a login system, a dashboard with images and details, and a detail view for selected items. The app uses Retrofit for network operations, Hilt for dependency injection, and follows modern Android development practices.

## Features

- **Login Screen:** Allows users to log in using credentials.
- **Dashboard:** Displays a horizontal list of images with titles fetched from a remote API.
- **Detail View:** Shows detailed information about an item when selected from the dashboard.

## Architecture

- **MVVM Pattern:** Separates the application's logic into Model, View, and ViewModel layers.
- **Dependency Injection:** Uses Hilt for managing dependencies.
- **Networking:** Uses Retrofit for making API calls.

## Dependencies

- [Retrofit](https://square.github.io/retrofit/) - Type-safe HTTP client for Android and Java.
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - Dependency injection library for Android.
- [Gson](https://github.com/google/gson) - JSON serialization/deserialization library.

## Setup

1. **Clone the Repository:**

    git clone https://github.com/scorpiane/NIT3213.git
    cd Final_Assignment


2. **Open the Project:**
   - Open the project in Android Studio.

3. **Install Dependencies:**
   - Sync the project with Gradle files to download the necessary dependencies.

4. **Configure API:**
   - Ensure that the API base URL in `NetworkModule` is correctly set.

## Usage

1. **Run the Application:**
   - Connect an Android device or start an emulator.
   - Run the application from Android Studio.

2. **Login:**
   - Enter your username and password on the login screen.

3. **Navigate:**
   - After a successful login, you'll be taken to the dashboard where you can view a list of items.
   - Click on an item to see its detailed view.

## API Endpoints

- **Login:** `POST /sydney/auth` - Authenticates a user and returns a keypass.
- **Dashboard:** `GET /dashboard/art` - Retrieves a list of entities for the dashboard.

## Testing

### Unit Tests

Unit tests are provided to ensure the correctness of various components, including:

- **API Service:** Tests API calls and responses.
- **ViewModel:** Tests ViewModel logic and state management.

To run unit tests, use the following command:
./gradlew test
