package org.freedu.recviewb7

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.freedu.recviewb7.databinding.ItemListBinding

class FriendAdapter(
    private val friendList: List<Friend>
) : RecyclerView.Adapter<FriendAdapter.FriendViewHolder>() {

    inner class FriendViewHolder(val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {

        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FriendViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {

        val friend = friendList[position]
        holder.binding.nameTV.text = friend.name
        holder.binding.descriptionTV.text=friend.description
        holder.binding.profileCIV.setImageResource(friend.imageRes)

        holder.binding.root.setOnClickListener {
            val context = holder.binding.root.context
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("name",friend.name)
            intent.putExtra("description",friend.description)
            intent.putExtra("image",friend.imageRes)
            context.startActivity(intent)
        }




    }

    override fun getItemCount(): Int = friendList.size


}