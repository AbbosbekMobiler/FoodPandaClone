package mobiler.abbosbek.foodshopping.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

import mobiler.abbosbek.foodshopping.R;
import mobiler.abbosbek.foodshopping.model.SliderData;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterViewHolder> {

    private final List<SliderData> mSliderItems;

    public SliderAdapter(Context context, ArrayList<SliderData> mSliderItems) {
        this.mSliderItems = mSliderItems;
    }

    @Override
    public SliderAdapterViewHolder onCreateViewHolder(ViewGroup parent) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_layout,null);

        return new SliderAdapterViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterViewHolder viewHolder, int position) {

        final SliderData sliderData = mSliderItems.get(position);

        Glide.with(viewHolder.itemView)
                .load(sliderData.getImgUrl())
                .fitCenter()
                .into(viewHolder.imageViewBackground);

    }

    @Override
    public int getCount() {
        return mSliderItems.size();
    }

    static public class SliderAdapterViewHolder extends ViewHolder {
        View itemView;
        ImageView imageViewBackground;

        public SliderAdapterViewHolder(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.myImage);
            this.itemView = itemView;
        }
    }
}
