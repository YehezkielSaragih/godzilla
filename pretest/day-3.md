#### **Optional (Choose the correct answer):**

1. Which of the following creates an immutable list in Kotlin?

   - a) `arrayOf(1, 2, 3)`
   **- b) `listOf(1, 2, 3)`**
   - c) `mutableListOf(1, 2, 3)`
   - d) `setOf(1, 2, 3)`

2. What is the purpose of a coroutine in Kotlin?

   - a) To manage multiple threads
   **- b) To handle asynchronous programming efficiently**
   - c) To suspend functions indefinitely
   - d) To manage Android lifecycle events

3. Which activity lifecycle method is called when the activity is visible but not yet interactive?

   - a) `onCreate()`
   - b) `onResume()`
   **- c) `onStart()`**
   - d) `onPause()`

4. In Android UI, which ViewGroup arranges its children in a single direction (either horizontal or vertical)?

   - a) `RelativeLayout`
   - b) `ConstraintLayout`
   **- c) `LinearLayout`**
   - d) `FrameLayout`

5. What keyword is used to define a suspending function in Kotlin?
   - a) `async`
   - b) `launch`
   **- c) `suspend`**
   - d) `defer`

---

#### **Short Answer:**

6. What is the difference between `listOf()` and `mutableListOf()` in Kotlin?
- listOf() membuat list immutable (hanya-baca, tidak bisa menambah/menghapus elemen).
- mutableListOf() membuat list mutable (bisa menambah, menghapus, atau mengubah elemen).
7. How does `onDestroy()` differ from `onStop()` in the Android activity lifecycle?
- onStop() dipanggil ketika activity tidak lagi terlihat (user membuka activity lain atau menekan tombol Home), tapi objek activity masih ada di memori.
- onDestroy() dipanggil ketika activity akan dihapus sepenuhnya dari memori (user menutup app atau sistem memaksa kill activity).
8. What is the advantage of using coroutines over threads in Kotlin?
Coroutines ringan dan efisien untuk pemrograman asynchronous, sedangkan thread lebih berat dan memakan lebih banyak memori.
9. How can you prevent memory leaks in Android when handling configuration changes like screen rotation?
- Gunakan ViewModel, LiveData, atau retain fragment untuk mempertahankan data.
- Hindari menyimpan referensi Activity/View dalam objek yang bertahan lama.
10. Explain the difference between `View` and `ViewGroup` in Android.
- View adalah elemen UI tunggal (Button, TextView).
- ViewGroup adalah container yang menampung beberapa View atau ViewGroup lain dan mengatur layout-nya (LinearLayout, ConstraintLayout).
11. How does a `RecyclerView` differ from a `ListView` in Android UI components?
- RecyclerView lebih fleksibel, efisien, dan mendukung view recycling dengan LayoutManager.
- ListView lebih sederhana, tapi kurang efisien dan terbatas kustomisasinya.
12. What is the role of `onResume()` in the Android lifecycle?
onResume() dipanggil ketika activity terlihat dan interaktif
13. What is the purpose of `launch` in Kotlin coroutines?
launch bertujuan untuk memulai coroutine baru tanpa memblok thread berjalan dan mengembalikan Job untuk mengelola lifecycle-nya.
14. What is `LiveData` in Android, and why is it useful?
LiveData adalah data holder yang dapat diobservasi, aware terhadap lifecycle, otomatis memperbarui UI saat data berubah, dan mencegah memory leak.
15. What is the `ViewModel` class used for in Android?
- Menyimpan data terkait UI yang bertahan saat konfigurasi berubah (rotasi layar).
- Memisahkan logika UI dari logika data, menjaga arsitektur tetap bersih.
---

#### **Yes/No Questions:**

16. Can `setOf()` store duplicate elements in Kotlin? **No**

17. Is it possible to use coroutines with Android’s lifecycle-aware components like `LiveData`? **Yes**

18. Does the Android `onCreate()` method get called every time an activity becomes visible? **No**

19. Can a `ConstraintLayout` position elements relative to each other in Android? **Yes**

20. Are `RecyclerView` and `SwipeRefreshLayout` both advanced Android UI components? **Yes**

---

#### **Correct the Code (with Reasons for Correction):**

21. **Incorrect code:**
    ```kotlin
    val myList = listOf(1, 2, 3)
    myList.add(4)
    ```
    **Corrected code**
    ```kotlin
    // use mutable for changeable var
    val myList = mutableListOf(1, 2, 3) 
    myList.add(4)
    ```
---

22. **Incorrect code:**
    ```kotlin
    fun myCoroutine() {
        delay(1000L)
        println("Coroutine executed")
    }
    ```
    **Corrected code**
    ```kotlin
    // delay can only be called in suspend func
    suspend fun myCoroutine() {
        delay(1000L)
        println("Coroutine executed")
    }
    ```

---

23. **Incorrect code:**
    ```kotlin
    override fun onCreate() {
        super.onCreate()
        setContentView(R.layout.activity_main)
    }
    ```
    **Corrected code**
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    ```

---

24. **Incorrect code:**
    ```kotlin
    val map = mapOf(1 to "One", 2 to "Two")
    map[3] = "Three"
    ```
    **Corrected code**
    ```kotlin
    // use mutable for changeable var
    val map = mutableMapOf(1 to "One", 2 to "Two")
    map[3] = "Three"
    ```

---

25. **Incorrect code:**
    ```kotlin
    val view = findViewById<Button>(R.id.button)
    view.setOnClickListener {
        Log.d("Click", "Button clicked")
    }
    ```
    **Corrected code**
    ```kotlin
    val view = findViewById<Button>(R.id.button)
    view?.setOnClickListener {
        Log.d("Click", "Button clicked")
    }
    ```

---

### **Story-based Question (with Failed Code)**

#### **Story:**

You are developing an Android app for managing tasks. Each task has a title and a description. The app should allow users to add tasks and display the list of tasks in a `RecyclerView`. However, the app crashes when you try to display the list of tasks.

Here’s the failed code:

```kotlin
class TaskAdapter(private val taskList: List<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.itemView.findViewById<TextView>(R.id.taskTitle).text = task.title
        holder.itemView.findViewById<TextView>(R.id.taskDescription).text = task.description
    }

    override fun getItemCount() = taskList.size
}

data class Task(val title: String, val description: String)
```

**Corrected code**
```kotlin
class TaskAdapter(private val taskList: List<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(val binding: TaskItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = TaskItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.binding.taskTitle.text = task.title
        holder.binding.taskDescription.text = task.description
    }

    override fun getItemCount() = taskList.size
}
```

---
