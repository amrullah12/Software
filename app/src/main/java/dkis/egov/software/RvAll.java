package dkis.egov.software;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RvAll extends RecyclerView.Adapter<RvAll.ViewHolder> {
    Context context;
    List<Model> aktifList;

    public RvAll(Context context, List<Model> aktifList) {
        this.context = context;
        this.aktifList = aktifList;
    }

    @NonNull
    @Override
    public RvAll.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RvAll.ViewHolder holder, int position) {
        holder.namaAplikasi.setText(aktifList.get(position).getNama_aplikasi());
        holder.Deskripsi.setText(aktifList.get(position).getDeskripsi());
        holder.Pengguna.setText(aktifList.get(position).getPengguna());
        holder.Url.setText(aktifList.get(position).getUrl());
        holder.aktif.setText(aktifList.get(position).getAktif());
    }

    @Override
    public int getItemCount() {
        return aktifList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaAplikasi, Deskripsi, Pengguna, Url, aktif;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaAplikasi = itemView.findViewById(R.id.idNama);
            Deskripsi = itemView.findViewById(R.id.idDeskripsi);
            Pengguna = itemView.findViewById(R.id.idPengguna);
            Url = itemView.findViewById(R.id.idUrl);
            aktif = itemView.findViewById(R.id.idAktif);
        }
    }
}
