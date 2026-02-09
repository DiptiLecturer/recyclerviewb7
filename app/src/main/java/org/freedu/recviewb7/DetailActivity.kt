package org.freedu.recviewb7

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.freedu.recviewb7.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val description =intent.getStringExtra("description")
        val image = intent.getIntExtra("image",0)

        binding.detailNameTV.text=name
        binding.detailDescriptionTV.text=description
        binding.detailsImageView.setImageResource(image)

    }
}