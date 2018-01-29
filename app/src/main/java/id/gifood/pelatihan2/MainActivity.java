package id.gifood.pelatihan2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonA, buttonB, button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA = findViewById(R.id.btn_sms);
        buttonB = findViewById(R.id.btn_telp);
        button1 = findViewById(R.id.btn_simple);
        button2 = findViewById(R.id.btn_custom);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent tak langsung
                Intent intentA = new Intent(Intent.ACTION_VIEW,
                        Uri.fromParts("sms", "085329135757", null));
                startActivity(intentA);
            }
        });

        buttonB.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_telp :
                // Intent Langsung
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.fromParts("tel", "085329135757", null)));
                break;

            case R.id.btn_simple :
                Intent intent1 = new Intent(MainActivity.this,
                        Main2Activity.class);

                startActivity(intent1);
                break;

            case R.id.btn_custom :
                Intent intent2 = new Intent(MainActivity.this,
                        Main3Activity.class);

                startActivity(intent2);
                break;
        }
    }
}
