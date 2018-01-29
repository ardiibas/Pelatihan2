package id.gifood.pelatihan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    ListView customList;

    String[] nama = {
            "Kontak 1",
            "Kontak 2",
            "Kontak 3",
            "Kontak 4",
            "Kontak 5",
            "Kontak 6",
            "Kontak 7",
            "Kontak 8",
            "Kontak 9",
            "Kontak 10"
    };

    Integer[] foto = {
            R.drawable.gb1,
            R.drawable.gb2,
            R.drawable.gb3,
            R.drawable.gb4,
            R.drawable.gb5,
            R.drawable.gb6,
            R.drawable.gb7,
            R.drawable.gb8,
            R.drawable.gb9,
            R.drawable.gb10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        customList = findViewById(R.id.cutom_list);

        CustomAdapter adapter = new CustomAdapter(
                this, nama, foto
        );

        customList.setAdapter(adapter);
    }
}
