package ntu.proj.myapplication;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVadapter extends RecyclerView.Adapter {

    List<Task> datasource;

    public RVadapter(List<Task> datasource) {

        this.datasource = datasource;
    }


    public class TaskItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvTenOCOP;
        TextView tvsocua;

        public int position;

        public TaskItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvTenOCOP =  itemView.findViewById(R.id.textViewTenOCOP);

            tvsocua  = itemView.findViewById(R.id.textView2);
        }

        @Override
        public void onClick(View v) {
            //lay vi tri
            int vtClicked = getAdapterPosition();
            //lục ở nguồn dữ liệu
           Task taskclicked =  datasource.get(vtClicked);
           // xử lý

            Toast.makeText(v.getContext(), "vừa thêm dữ liệu" + taskclicked.getID(), Toast.LENGTH_LONG).show();

        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item,parent,false);
       TaskItemViewHolder viewHolder = new TaskItemViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        TaskItemViewHolder viewHolder = (TaskItemViewHolder) holder;
        viewHolder.position = position;
        Task task = datasource.get(position);
        ((TaskItemViewHolder) holder).tvTenOCOP.setText(task.getID());
        ((TaskItemViewHolder) holder).tvsocua.setText(task.getSDT());
    }

    @Override
    public int getItemCount() {

        return datasource.size();

    }
}
