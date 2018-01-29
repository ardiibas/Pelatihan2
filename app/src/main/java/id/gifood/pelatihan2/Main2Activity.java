package id.gifood.pelatihan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ListView listView;

    String[] kontak = {"Budi", "Agus", "Mulya", "Bimo", "Slamet"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.simple_list);

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, kontak
        );

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Main2Activity.this, kontak[+i], Toast.LENGTH_SHORT).show();
            }
        });


    }
}
