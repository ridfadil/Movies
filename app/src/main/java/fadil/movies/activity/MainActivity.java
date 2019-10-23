package fadil.movies.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import fadil.movies.R;

    public class MainActivity extends AppCompatActivity {
        Button tdata,ldata,edata,hdata;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            tdata = (Button) findViewById(R.id.tdata);
            ldata = (Button) findViewById(R.id.ldata);
            hdata = (Button) findViewById(R.id.hdata);
            edata = (Button) findViewById(R.id.edata);

            tdata.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this,TambahDataActivity.class);
                    startActivity(i);
                }
            });

            edata.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i= new Intent(MainActivity.this,EditDataActivity.class);
                    startActivity(i);
                }
            });

            ldata.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i= new Intent(MainActivity.this,LihatDataActivity.class);
                    startActivity(i);
                }
            });

            hdata.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i= new Intent(MainActivity.this,HapusDataActivity.class);
                    startActivity(i);
                }
            });

        }
    }
