package rental_center_application.com;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import rental_center_application.com.adapter.LowestPriceAdapter;
import rental_center_application.com.model.Lowestprice;


public class MainActivity extends AppCompatActivity {

   RecyclerView lowestRecyclerView;
   LowestPriceAdapter lowestPriceAdapter;
   List<Lowestprice> lowestpriceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lowestRecyclerView = findViewById(R.id.lowestRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        lowestRecyclerView.setLayoutManager(layoutManager);
        lowestPriceAdapter = new LowestPriceAdapter(this, dataList);
        lowestRecyclerView.setAdapter();

    }
}