package mobiler.abbosbek.foodshopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import mobiler.abbosbek.foodshopping.adapters.CategoryAdapter;
import mobiler.abbosbek.foodshopping.adapters.LaysAdapter;
import mobiler.abbosbek.foodshopping.adapters.SliderAdapter;
import mobiler.abbosbek.foodshopping.adapters.TeaCoffeeAdapter;
import mobiler.abbosbek.foodshopping.model.CategoryModel;
import mobiler.abbosbek.foodshopping.model.SliderData;
import mobiler.abbosbek.foodshopping.model.SnackModel;
import mobiler.abbosbek.foodshopping.model.TeaModel;

public class PandaMartActivity extends AppCompatActivity {

    RecyclerView recyclerViewCategory;
    List<CategoryModel> categoryModels;
    CategoryAdapter categoryAdapter;

    RecyclerView recyclerViewTea;
    List<TeaModel> teaModels;
    TeaCoffeeAdapter teaCoffeeAdapter;

    RecyclerView recyclerViewLays;
    List<SnackModel> snackModels;
    LaysAdapter laysAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panda_mart);

        getSlider();
        getCategory();

        getTeaCoffee();

        getLays();

    }

    private void getLays() {
        recyclerViewLays = findViewById(R.id.rec_snack);
        recyclerViewLays.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerViewLays.setHasFixedSize(true);

        snackModels = new ArrayList<>();
        snackModels.add(new SnackModel(R.drawable.lays1));
        snackModels.add(new SnackModel(R.drawable.lays2));
        snackModels.add(new SnackModel(R.drawable.lays3));
        snackModels.add(new SnackModel(R.drawable.lays4));
        snackModels.add(new SnackModel(R.drawable.lays1));
        snackModels.add(new SnackModel(R.drawable.lays2));
        snackModels.add(new SnackModel(R.drawable.lays3));
        snackModels.add(new SnackModel(R.drawable.lays4));

        laysAdapter = new LaysAdapter(snackModels);
        recyclerViewLays.setAdapter(laysAdapter);

    }

    private void getTeaCoffee() {
        recyclerViewTea = findViewById(R.id.rec_tea);
        recyclerViewTea.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewTea.setHasFixedSize(true);

        teaModels = new ArrayList<>();
        teaModels.add(new TeaModel(R.drawable.nes1));
        teaModels.add(new TeaModel(R.drawable.nes2));
        teaModels.add(new TeaModel(R.drawable.nes3));
        teaModels.add(new TeaModel(R.drawable.nes4));
        teaModels.add(new TeaModel(R.drawable.nes1));
        teaModels.add(new TeaModel(R.drawable.nes2));
        teaModels.add(new TeaModel(R.drawable.nes3));
        teaModels.add(new TeaModel(R.drawable.nes4));
        teaCoffeeAdapter = new TeaCoffeeAdapter(teaModels);
        recyclerViewTea.setAdapter(teaCoffeeAdapter);

    }

    private void getCategory() {

        recyclerViewCategory = findViewById(R.id.recycler_cat);
        recyclerViewCategory.setLayoutManager(new GridLayoutManager(this,2, RecyclerView.HORIZONTAL,false));
        recyclerViewCategory.setHasFixedSize(true);

        categoryModels = new ArrayList<>();
        categoryModels.add(new CategoryModel(R.drawable.cat1));
        categoryModels.add(new CategoryModel(R.drawable.cat2));
        categoryModels.add(new CategoryModel(R.drawable.cat1));
        categoryModels.add(new CategoryModel(R.drawable.cat2));
        categoryModels.add(new CategoryModel(R.drawable.cat1));
        categoryModels.add(new CategoryModel(R.drawable.cat2));
        categoryModels.add(new CategoryModel(R.drawable.cat1));
        categoryModels.add(new CategoryModel(R.drawable.cat2));

        categoryAdapter = new CategoryAdapter(categoryModels);
        recyclerViewCategory.setAdapter(categoryAdapter);
    }

    private void getSlider() {
        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        SliderView sliderView = findViewById(R.id.slider);

        sliderDataArrayList.add(new SliderData(R.drawable.food1));
        sliderDataArrayList.add(new SliderData(R.drawable.food3));
        sliderDataArrayList.add(new SliderData(R.drawable.food2));
        sliderDataArrayList.add(new SliderData(R.drawable.food4));
        sliderDataArrayList.add(new SliderData(R.drawable.food1));
        sliderDataArrayList.add(new SliderData(R.drawable.food3));
        sliderDataArrayList.add(new SliderData(R.drawable.food2));
        sliderDataArrayList.add(new SliderData(R.drawable.food4));

        SliderAdapter adapter = new SliderAdapter(this,sliderDataArrayList);

        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sliderView.setSliderAdapter(adapter);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();
    }
}