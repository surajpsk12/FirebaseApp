

# 📱 PhoneBook App

A modern and fully functional **Android PhoneBook App** built using **MVVM architecture**, **Firebase Realtime Database**, **Firestore**, **WorkManager**, **Navigation Component**, and **Data Binding**.

This app allows users to add, update, delete, and sync contacts in real-time — with a clean, responsive UI and robust background processing support.

---

## 🚀 Features

- 📇 Add, update, and delete contacts
- 🔄 Sync contact data in **real-time** using Firebase Realtime Database and Firestore
- 🧭 Seamless screen transitions with Navigation Component
- 📲 Dynamic and clean UI using Data Binding
- 📋 Efficient contact listing using RecyclerView + ViewHolder
- ⚙️ Background data sync using WorkManager
- 📦 Follows **MVVM** design pattern for scalable and maintainable code

---

## 🛠️ Tech Stack

| Layer         | Tools & Technologies |
|---------------|---------------------|
| Architecture  | MVVM                |
| Backend       | Firebase Realtime DB, Firestore |
| Background    | WorkManager         |
| Navigation    | Jetpack Navigation Component |
| UI            | XML, Data Binding   |
| Language      | Java                |
| Data Display  | RecyclerView        |

---

## 📂 Project Structure

```

PhoneBookApp/
│
├── model/              # Contact data classes
├── view/               # Activities, Fragments, Layouts
├── viewmodel/          # LiveData + ViewModel logic
├── repository/         # Firebase and Firestore logic
├── utils/              # Constants and helper classes
└── worker/             # WorkManager background task setup

````

---

## 🔧 How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/PhoneBookApp.git


2. **Open the project in Android Studio**

3. **Set up Firebase:**

   * Add `google-services.json` in your `/app` directory
   * Enable Firebase Realtime Database and Firestore from the Firebase Console
   * Set up read/write rules as needed for development

4. **Build and run the app** on emulator or physical device

---


## ✅ Future Improvements

* 🔍 Search functionality for contacts
* 🖼️ Profile pictures support using Firebase Storage
* 🗑️ Swipe to delete with undo
* 🌙 Dark mode support
* 🔔 Local notifications for background updates

---

## 🙌 Acknowledgements

* Jetpack Libraries: ViewModel, LiveData, Navigation, WorkManager
* Firebase for Realtime Database and Firestore
* Android Official Documentation

---

## 📬 Contact

**Made with ❤️ by [Suraj Kumar](https://www.linkedin.com/in/surajpsk12)**
Feel free to connect, give feedback, or suggest improvements!

---

```
