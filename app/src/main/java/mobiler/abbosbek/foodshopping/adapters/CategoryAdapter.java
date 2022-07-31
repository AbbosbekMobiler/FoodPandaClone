package mobiler.abbosbek.foodshopping.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

import mobiler.abbosbek.foodshopping.R;
import mobiler.abbosbek.foodshopping.model.CategoryModel;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    List<CategoryModel> list;
    public CategoryAdapter(List<CategoryModel> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.roundedImageView.setImageResource(list.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static public class ViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView roundedImageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            roundedImageView = itemView.findViewById(R.id.cat_img);
        }
    }
}
