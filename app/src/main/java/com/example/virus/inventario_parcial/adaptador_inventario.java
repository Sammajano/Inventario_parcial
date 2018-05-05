package com.example.virus.inventario_parcial;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptador_inventario extends RecyclerView.Adapter<adaptador_inventario.ViewHolderInventarios> {

    ArrayList<inventario> lista_inventario;

    public adaptador_inventario(ArrayList<inventario> lista_inventario) {
        this.lista_inventario = lista_inventario;
    }

    public ViewHolderInventarios onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.inventario_list,parent,false);
        return new ViewHolderInventarios(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderInventarios holder, int position) {

            holder.nombre_producto.setText(lista_inventario.get(position).getNombre_producto());
            holder.codigo.setText(lista_inventario.get(position).getCodigo());
           // holder.venta.setText((int) lista_inventario.get(position).getPrecio_venta());
            //holder.costo.setText((int) lista_inventario.get(position).getPrecio_unidad());
            holder.foto.setImageResource(lista_inventario.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return lista_inventario.size();
    }

    public class ViewHolderInventarios extends RecyclerView.ViewHolder {

        TextView nombre_producto,codigo,venta,costo;
        ImageView foto;

        public ViewHolderInventarios(View itemView) {
            super(itemView);

            nombre_producto = itemView.findViewById(R.id.nombre_producto);
            codigo = itemView.findViewById(R.id.codigo);
            foto = (ImageView) itemView.findViewById(R.id.foto);
        }
    }
}
