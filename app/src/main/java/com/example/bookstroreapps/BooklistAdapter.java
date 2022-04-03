package com.example.bookstroreapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BooklistAdapter extends RecyclerView.Adapter<BooklistAdapter.BooklistViewHolder> {

    private ArrayList<ArrayItems> book_list;

    public static  class BooklistViewHolder extends RecyclerView.ViewHolder
    {

        public ImageView movie_images;
        public ImageView movie_rating;
        public TextView movie_title;
        public TextView movie_desc;
        public TextView movie_price;

        public BooklistViewHolder(View itemView)
        {
            super(itemView);

            movie_images = itemView.findViewById(R.id.foto);
            movie_rating = itemView.findViewById(R.id.rating1);
            movie_title = itemView.findViewById(R.id.tv_title);
            movie_desc = itemView.findViewById(R.id.tv_subtitle);
            movie_price = itemView.findViewById(R.id.price);
        }
    }

    public BooklistAdapter(ArrayList<ArrayItems> booklist)
    {
        book_list = booklist;
    }

    @NonNull
    @Override
    public BooklistViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_book_list, parent, false);
        BooklistViewHolder booklistViewHolder = new BooklistViewHolder(view);

        return booklistViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BooklistViewHolder holder, int position) {

        ArrayItems newItems = book_list.get(position);

        holder.movie_images.setImageResource(newItems.getMovie_image());
        holder.movie_rating.setImageResource(newItems.getMovie_rating());
        holder.movie_title.setText(newItems.getMovie_title());
        holder.movie_desc.setText(newItems.getMovie_desc());
        holder.movie_price.setText(newItems.getMovie_price());

    }

    @Override
    public int getItemCount() {
        return book_list.size();
    }
}
