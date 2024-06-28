package com.codewithomkar.omkartestassement


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private var users: List<User1> = listOf()

    fun setUsers(users: List<User1>) {
        this.users = users
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_use, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user1 = users[position]
        holder.bind(user1)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val avatar: ImageView = itemView.findViewById(R.id.avatar)
        private val firstName: TextView = itemView.findViewById(R.id.firstName)
        private val lastName: TextView = itemView.findViewById(R.id.lastName)
        private val email: TextView = itemView.findViewById(R.id.email)

        fun bind(user: User1) {
            firstName.text = user.first_name
            lastName.text = user.last_name
            email.text = user.email
            Glide.with(itemView.context).load(user.avatar).into(avatar)
        }
    }
}