package rental_center_application.com.adapter;


import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Objects;

import rental_center_application.com.model.Lowestprice;

public class LowestPriceAdapter extends RecyclerView.Adapter<LowestPriceAdapter.LowestPriceViewHolder>{
    Context context;
    List<Lowestprice> LowestPriceList;

    @NonNull
    @Override
    public LowestPriceViewHolder onCreateViewHolder(@NonNull  viewGroup parent, int viewType) {
        return null;
    }

    @NonNull
    @Override
    public LowestPriceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LowestPriceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount (){
        return LowestPriceList.();
    }

    public static class LowestPriceViewHolder extends RecyclerView.ViewHolder {

        public LowestPriceViewHolder(@NonNull View itemView) {
            super(Objects.requireNonNull(itemView));

        }
    }

}