package com.example.joker.androidtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    ArrayList<Movie> movieArrayList;
    Context context;
    ClickListner clickListner;






//    public class ViewHolder extends RecyclerView.ViewHolder {
//        public TextView name,detail,heroName;
//
//        public ImageView image;
//
//
//
//
//        public ViewHolder(View view) {
//            super(view);
//            name = (TextView) view.findViewById(R.id.name);
//            detail = (TextView) view.findViewById(R.id.detail);
//
////            image =(ImageView) view.findViewById(R.id.image);
//        }
//    }



    public MovieAdapter(Context context, ArrayList<Movie> movieArrayList) {
        this.movieArrayList = movieArrayList;
        this.context = context;

        clickListner = (ClickListner) context;




    }


    public MovieAdapter(List<Movie> MoviesList) {
        this.movieArrayList = (ArrayList<Movie>) MoviesList;
    }

    //TODO 7: Complete the @Override methods accordingly by inflating list_item.xml as layout of list.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View View = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);


        return null;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie movie = movieArrayList.get(position);
        holder.nameTextView.setText(movie.getName());




    }


    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        ImageView heroImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            //TODO 8 get the reference of nameTextView and heroImageView using itemView

                         nameTextView= (TextView)itemView.findViewById(R.id.name);
            heroImageView= (ImageView) itemView.findViewById(R.id.heroImage);




        }

        public void bind(final int position) {

            //TODO 9 Set title to nameTextView using moveiArrayList and position

            Movie movie = movieArrayList.get(position);
            nameTextView.setText(movie.getName());

            //TODO 10 set image using glide
            //example Glide.with(context).load(getImage(my_drawable_image_name)).into(heroImageView);
            String imageName = getImageName(position);
            //write you code below this




            heroImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    clickListner.onClick(position);

                }
            });

        }

        private String getImageName(int position) {

            switch (position) {
                case 0:
                    return "batman.jpeg";
                case 1:
                    return "deadpool.jpeg";
                case 2:
                    return "doctor_strange.jpeg";
                case 3:
                    return "iron_man.jpeg";
                case 5:
                    return "spiderman.jpeg";
                case 6:
                    return "thor.jpeg";
                default:
                    return null;
            }

        }

        public int getImage(String imageName) {

            return context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
        }

    }
}
