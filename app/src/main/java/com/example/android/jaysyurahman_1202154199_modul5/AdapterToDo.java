package com.example.android.jaysyurahman_1202154199_modul5;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jaysyurahman on 25/03/2018.
 */

public class AdapterToDo extends RecyclerView.Adapter<AdapterToDo.TodoViewholder>{

    private ArrayList<ModelToDo> list;

    public AdapterToDo(ArrayList<ModelToDo> list) {
        this.list = list;
    }


    @Override
    public TodoViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_todo, parent, false);
        return new TodoViewholder(view);
    }

    @Override
    public void onBindViewHolder(TodoViewholder holder, int position) {
        ModelToDo item = list.get(position);
        holder.bindTo(item);
    }

    @Override
    public int getItemCount() {
        return list.size()>0?list.size():0;
    }

    class TodoViewholder extends RecyclerView.ViewHolder{

        private TextView lblToDoName, lblToDoDesc, lblToDoPrior;
        private ModelToDo currTodo;
        private CardView mCardView;

        public TodoViewholder(View itemView) {
            super(itemView);
            lblToDoName=(TextView)itemView.findViewById(R.id.lblTodoNama);
            lblToDoDesc=(TextView)itemView.findViewById(R.id.lblTodoDesc);
            lblToDoPrior=(TextView)itemView.findViewById(R.id.lblTodoPrior);
            mCardView=(CardView)itemView.findViewById(R.id.todoCardView);

            SharedPreferences pref = itemView.getContext().getSharedPreferences("pref",0);
            String colored = pref.getString("shapeColorTXT","#FFFFFF");
            mCardView.setCardBackgroundColor(Color.parseColor(colored));
        }

        public void bindTo(ModelToDo todoModel){
            currTodo = todoModel;
            //lblTodoID.setText(""+currTodo.getId());
            lblToDoName.setText(currTodo.getName());
            lblToDoDesc.setText(currTodo.getDescription());
            lblToDoPrior.setText(""+currTodo.getPriority());
        }
    }
}
