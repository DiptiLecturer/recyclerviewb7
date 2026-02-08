package org.freedu.recviewb7

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import org.freedu.recviewb7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var friendAdapter: FriendAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val friendList = listOf<Friend>(
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.personeone),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.personthree),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.persontwo),


            )
        friendAdapter = FriendAdapter(friendList)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = friendAdapter
        }
    }


}