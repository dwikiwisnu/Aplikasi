package com.example.uas_pemogramanandroiddwiki

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.RemoteViews.RemoteCollectionItems
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uas_pemogramanandroiddwiki.databinding.ActivityMainBinding
import com.example.uas_pemogramanandroiddwiki.db.NoteRoomDatabase
import com.example.uas_pemogramanandroiddwiki.model.Note
import com.example.uas_pemogramanandroiddwiki.databinding.ActivityRoomBinding

class RoomActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRoomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRoomBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Cek apakah data sudah dimasukkan sebelumnya
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val isDataInserted = sharedPreferences.getBoolean("isDataInserted", false)

        if (!isDataInserted) {
            // Jika belum dimasukkan, maka masukkan data dan simpan status ke shared preferences
            addDummyData()
            sharedPreferences.edit().putBoolean("isDataInserted", true).apply()
        }

        // Menampilkan data dari database ke dalam RecyclerView
        getNotesDate()

        binding.floatingAdd.setOnClickListener {
            startActivity(Intent(this, EditActivity::class.java))
        }
    }

    private fun addDummyData() {
        val database = NoteRoomDatabase.getDatabase(application)
        val dao = database.getNoteDao()

        // Membuat 50 data dan memasukkannya ke dalam database
        // Data dummy
        val dummyDataList = listOf(
            Note(
                title = "2169700044",
                body = "Dwiki Wisnu Aji",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700042",
                body = "Wita Dwiyanti",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700013",
                body = "Anna Silvana",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700012",
                body = "Ratu Nurul Fauziah",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700018",
                body = "Meli Ai Hayati Rahmah",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700024",
                body = "Harys Hakim Kurniawan",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700022",
                body = "Toibul Khoiri",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700028",
                body = "Firman Tegar",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "200000"
            ),
            Note(
                title = "2169700041",
                body = "Ilham Rizky Ramadhan",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700039",
                body = "Ersa Putra Riano",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700038",
                body = "Kosmara",
                nilai = "80",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700037",
                body = "Siti Muslihah",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700036",
                body = "Lina Faujiah",
                nilai = "90",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700035",
                body = "Yusuf Ardiansyah",
                nilai = "40",
                keterangan = "Tidak Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700030",
                body = "Lulu Fauziyah",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700029",
                body = "Chandra Yulistianto",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700008",
                body = "Lukman Muhamad Syamil",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700014",
                body = "Adi Suharyadi",
                nilai = "70",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700015",
                body = "Dani Ramadon",
                nilai = "50",
                keterangan = "Tidak Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700019",
                body = "Duta Rizky Darmawan",
                nilai = "90",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700020",
                body = "Wahyu Hidayat",
                nilai = "70",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700021",
                body = "Riska Yulinar",
                nilai = "90",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700025",
                body = "Gilang Pramudya Asega",
                nilai = "70",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700027",
                body = "Tapan Nurzaman Malik",
                nilai = "70",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700001",
                body = "Salsa Dwiyanti",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700004",
                body = "Yeni Nuraeni",
                nilai = "80",
                keterangan = "lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700005",
                body = "Tiara Agustin",
                nilai = "90",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700006",
                body = "Listiani Lesveva Setiawan",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2169700007",
                body = "Sendi Rahman Huda",
                nilai = "100",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
            Note(
                title = "2069700002",
                body = "Tomi Riki Saputra",
                nilai = "60",
                keterangan = "Lulus",
                jumlahsks = "21",
                hargasks = "20000"
            ),
        )

        // Menambahkan data ke dalam database
        for (dummyNote in dummyDataList) {
            dao.insert(dummyNote)
        }
    }


    private fun getNotesDate() {
        val database = NoteRoomDatabase.getDatabase(application)
        val dao = database.getNoteDao()
        val listItems = arrayListOf<Note>()
        listItems.addAll(dao.getAll())
        setupRecyclerView(listItems)
    }

    private fun setupRecyclerView(listItems: ArrayList<Note>) {
        binding.recycleViewMain.apply {
            adapter = NoteAdapter(listItems, object : NoteAdapter.NoteListener {
                override fun OnItemClicked(note: Note) {
                    val intent = Intent(this@RoomActivity, EditActivity::class.java)
                    intent.putExtra(EditActivity().EDIT_NOTE_EXTRA, note)
                    startActivity(intent)
                }
            })

            layoutManager = LinearLayoutManager(this@RoomActivity)
        }
    }

    override fun onResume() {
        super.onResume()
        getNotesDate()
    }
}