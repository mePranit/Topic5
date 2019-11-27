package com.example.topic5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.contactsViewHolder>{

     Context mContexts;
     List <Contacts>contactsList;

    public ContactsAdapter( Context mContexts,List<Contacts> contactsList) {
        this.contactsList = contactsList;
        this.mContexts=mContexts;

    }

    @NonNull
    @Override
    public contactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_image,parent,false);
        return new contactsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull contactsViewHolder holder, int position) {
        Contacts contacts=contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getImageID());
        holder.txtName.setText(contacts.getName());
        holder.txtaddress.setText(contacts.getAddress());

    }

    @Override
    public  int getItemCount()
    {
        return contactsList.size();
    }

    public class contactsViewHolder extends RecyclerView.ViewHolder{
        TextView txtName,txtaddress;
        ImageView imgProfile;

        public contactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.imageView);
            txtaddress=itemView.findViewById(R.id.textView2);
            txtName=itemView.findViewById(R.id.textView);
        }
    }

}
