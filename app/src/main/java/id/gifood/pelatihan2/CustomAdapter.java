package id.gifood.pelatihan2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import id.gifood.pelatihan2.R;

/**
 * Created by Ibas on 28/01/2018.
 */

public class CustomAdapter extends ArrayAdapter<String>{
    Activity context;
    String[] name;
    Integer[] photo;

    public CustomAdapter(Activity context, String[] name,
                         Integer[] photo){
        super(context, R.layout.my_list, name);

        this.context = context;
        this.name = name;
        this.photo = photo;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(
                R.layout.my_list, null, true
        );

        ImageView gambar = view.findViewById(R.id.gambar);
        TextView nama = view.findViewById(R.id.nama);
        TextView deskripsi = view.findViewById(R.id.deskripsi);

        nama.setText(name[position]);
        deskripsi.setText("Deskripsi dari " + name[position]);
        gambar.setImageResource(photo[position]);

        return view;
    }
}
