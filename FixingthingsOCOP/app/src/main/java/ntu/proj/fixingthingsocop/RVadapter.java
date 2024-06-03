//package ntu.proj.fixingthingsocop;
//
//import android.annotation.SuppressLint;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class RVadapter extends RecyclerView.Adapter {
//
//    List<Testing> dataSource;
//
//    public RVadapter(List<Testing> dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    //
//    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//
//        public int position;
//        TextView aaa;
//
//
//        public ItemViewHolder(@NonNull View itemView) {
//            super(itemView);
//            itemView.setOnClickListener(this);
//       //    aaa =  itemView.findViewById(R.id.rcv);
//
//        }
//
//        @Override
//        public void onClick(View v) {
//
//            //vitri
//            int vitri = getItemCount();
//            //lục nguồn dữ liệu
//           Testing testingClicked =  dataSource.get(vitri);
//           //vidu
//
//
//        }
//    }
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.hihihaha,parent,false);
//
//        ItemViewHolder viewHolder = new ItemViewHolder(v);
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
//
//        ItemViewHolder viewHolder = (ItemViewHolder) holder;
//        viewHolder.position = position;
//
//        Testing testing = dataSource.get(position);
//        ((ItemViewHolder) holder).aaa.setText(testing.ID);
//
//
//    }
//
//
//    @Override
//    public int getItemCount() {
//
//        return dataSource.size();
//    }
//}


