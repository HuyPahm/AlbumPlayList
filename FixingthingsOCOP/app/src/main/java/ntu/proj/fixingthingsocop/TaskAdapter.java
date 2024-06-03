package ntu.proj.fixingthingsocop;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private List<Task> taskList;

    public TaskAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = taskList.get(position);
        holder.bind(task);
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    static class TaskViewHolder extends RecyclerView.ViewHolder {

        private TextView ID, Huyen, TenSP, PhanLoai, TenChuSX, LoaiHinh, DiaChi, TenDD, SDT, SHS, NamCN;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            ID = itemView.findViewById(R.id.task_item_ID);
            Huyen = itemView.findViewById(R.id.task_item_Huyen);
            TenSP = itemView.findViewById(R.id.task_item_TenSP);
            PhanLoai = itemView.findViewById(R.id.task_item_PhanLoai);
            TenChuSX = itemView.findViewById(R.id.task_item_TenChuSX);
            LoaiHinh = itemView.findViewById(R.id.task_item_LoaiHinh);
            DiaChi = itemView.findViewById(R.id.task_item_DiaChi);
            TenDD = itemView.findViewById(R.id.task_item_TenDD);
            SDT = itemView.findViewById(R.id.task_item_SDT);
            SHS = itemView.findViewById(R.id.task_item_SHS);
            NamCN = itemView.findViewById(R.id.task_item_NamCN);
        }

        public void bind(Task task) {
            ID.setText(task.ID);
            Huyen.setText(task.Huyen);
            TenSP.setText(task.TenSP);
            PhanLoai.setText(task.PhanLoai);
            TenChuSX.setText(task.TenChuSX);
            LoaiHinh.setText(task.LoaiHinh);
            DiaChi.setText(task.DiaChi);
            TenDD.setText(task.TenDD);
            SDT.setText(task.SDT);
            SHS.setText(task.SHS);
            NamCN.setText(task.NamCN);
        }
    }
}
