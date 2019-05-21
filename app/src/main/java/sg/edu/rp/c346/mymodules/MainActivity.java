package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAnd;
    TextView tviPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAnd = findViewById(R.id.tvAndroid);
        tviPad = findViewById(R.id.tviPad);

        tvAnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Description", "Module Code: C346 \nModule Name: Android Programming \nAcademic Year: 2018 \nSemester: 1 \nModule Credit: 4 \nVenue: W66M");
                startActivity(intent);
            }
        });

        tviPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Description", "Module Code: C349 \nModule Name: iPad Programming \nAcademic Year: 2018 \nSemester: 1 \nModule Credit: 4 \nVenue: W66H");
                startActivity(intent);
            }
        });




    }
}
