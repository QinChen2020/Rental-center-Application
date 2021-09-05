package rental_center_application.com.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import rental_center_application.com.model.Lowestprice;

public class LowestPriceAdapter extends RecyclerView.Adapter<LowestPriceAdapter.LowestPriceViewHolder>{

    Context context;
    List<Lowestprice> LowestPriceList;

    @NonNull
    @Override
    public LowestPriceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LowestPriceViewHolder lowestPriceViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return LowestPriceList.size();
    }

    public static class LowestPriceViewHolder extends RecyclerView.ViewHolder{

        public LowestPriceViewHolder(@NonNull View itemView){
            super(itemView);
        }


    }
}
