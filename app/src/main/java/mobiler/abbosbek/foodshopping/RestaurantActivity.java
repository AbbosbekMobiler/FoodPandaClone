package mobiler.abbosbek.foodshopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import mobiler.abbosbek.foodshopping.adapters.AllRestaurantAdapter;
import mobiler.abbosbek.foodshopping.adapters.ExclusiveAdapter;
import mobiler.abbosbek.foodshopping.adapters.OfferAdapter;
import mobiler.abbosbek.foodshopping.model.AllRestaurantModel;
import mobiler.abbosbek.foodshopping.model.ExclusiveModel;
import mobiler.abbosbek.foodshopping.model.OfferModel;

public class RestaurantActivity extends AppCompatActivity {

    RecyclerView recyclerViewOffers;
    List<OfferModel> offerModels;
    OfferAdapter offerAdapter;

    RecyclerView recyclerViewExclusive;
    List<ExclusiveModel> exclusiveModels;
    ExclusiveAdapter exclusiveAdapter;

    RecyclerView recyclerViewAllRestaurant;
    List<AllRestaurantModel> allRestaurantModels;
    AllRestaurantAdapter allRestaurantAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        getAllRestaurantData();
        getOffers();
        getAllExclusiveData();
    }

    private void getAllExclusiveData() {
        recyclerViewExclusive = findViewById(R.id.rec_exc);
        recyclerViewExclusive.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        exclusiveModels = new ArrayList<>();
        exclusiveModels.add(new ExclusiveModel(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food4));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food4));

        exclusiveAdapter = new ExclusiveAdapter(exclusiveModels);
        recyclerViewExclusive.setAdapter(exclusiveAdapter);
    }

    private void getAllRestaurantData() {

        recyclerViewAllRestaurant = findViewById(R.id.rec_all_res);
        recyclerViewAllRestaurant.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerViewAllRestaurant.setHasFixedSize(true);

        allRestaurantModels = new ArrayList<>();
        allRestaurantModels.add(new AllRestaurantModel(R.drawable.food4));
        allRestaurantModels.add(new AllRestaurantModel(R.drawable.food3));
        allRestaurantModels.add(new AllRestaurantModel(R.drawable.food2));
        allRestaurantModels.add(new AllRestaurantModel(R.drawable.food1));
        allRestaurantModels.add(new AllRestaurantModel(R.drawable.food4));
        allRestaurantModels.add(new AllRestaurantModel(R.drawable.food3));
        allRestaurantModels.add(new AllRestaurantModel(R.drawable.food2));
        allRestaurantModels.add(new AllRestaurantModel(R.drawable.food1));

        allRestaurantAdapter = new AllRestaurantAdapter(allRestaurantModels);
        recyclerViewAllRestaurant.setAdapter(allRestaurantAdapter);
    }

    private void getOffers() {
        recyclerViewOffers = findViewById(R.id.rec_offer);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewOffers.setHasFixedSize(true);

        offerModels = new ArrayList<>();
        offerModels.add(new OfferModel(R.drawable.img15));
        offerModels.add(new OfferModel(R.drawable.img16));
        offerModels.add(new OfferModel(R.drawable.img19));
        offerModels.add(new OfferModel(R.drawable.img18));

        offerAdapter = new OfferAdapter(offerModels);
        recyclerViewOffers.setAdapter(offerAdapter);
    }
}