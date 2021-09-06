package rental_center_application.com.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import rental_center_application.com.R;
import rental_center_application.com.model.Lowestprice;

public class LowestPriceAdapter extends RecyclerView.Adapter<LowestPriceAdapter.LowestpriceViewHolder> {

    Context context;
    List<Lowestprice> lowestpriceList;

    @NonNull
    @Override
    public LowestpriceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflaten.from(context).inflate(R.layout.lowest_row_item, parent, false);
        return new LowestpriceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LowestpriceViewHolder holder, int position) {



        holder.lowestImageView.setImageResource(Integer.parseInt(lowestpriceList.get(position).getImageurl()));
    }

    @Override
    public int getItemCount() {
        //return lowestpriceList.size();
        return 5;
    }

    public static class LowestpriceViewHolder extends RecyclerView.ViewHolder{


        ImageView lowestImageView;
        public LowestpriceViewHolder(@NonNull View itemView) {

            super(itemView);

            lowestImageView = itemView.findViewById(R.id.lowestImage);
        }
    }
}
