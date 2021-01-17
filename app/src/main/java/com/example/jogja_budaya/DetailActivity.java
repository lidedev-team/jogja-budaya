package com.example.jogja_budaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_KEYWORD = "KEYWORD";
    private TextView card1;
    private TextView card2;
    private TextView card3;
    private TextView card4;
    private TextView card5;
    private TextView card6;

    private ImageView btAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();

        btAlert = (ImageView) findViewById(R.id.btn_exit);
        btAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        TextView title = findViewById(R.id.detail_title);
        TextView description = findViewById(R.id.detail_description);
        ImageView image = findViewById(R.id.image_card);

        TextView item1 = findViewById(R.id.item1);
        TextView item2 = findViewById(R.id.item2);
        TextView item3 = findViewById(R.id.item3);
        TextView item4 = findViewById(R.id.item4);
        TextView item5 = findViewById(R.id.item5);
        TextView item6 = findViewById(R.id.item6);

        String keyword = getIntent().getStringExtra(EXTRA_KEYWORD);

        switch (keyword) {
            case "tari" :
                title.setText("Tari Adat Yogyakarta");
                description.setText("Tarian adat Jogja yang isitmewa dan klasik");
                image.setImageResource(R.drawable.tari);

                item1.setText("Tari Rara Ngigel");
                item2.setText("Tari Golek Ayun2");
                item3.setText("Tari Kumbang");
                item4.setText("Tari Arjuna Wiwaha");
                item5.setText("Tari Satrio Watang");
                item6.setText("Tari Klono Rojo");

                item1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"tari1");
                        startActivity(i);
                    }
                });

                item2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"tari2");
                        startActivity(i);
                    }
                });

                item3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"tari3");
                        startActivity(i);
                    }
                });

                item4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"tari4");
                        startActivity(i);
                    }
                });

                item5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"tari5");
                        startActivity(i);
                    }
                });

                item6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"tari6");
                        startActivity(i);
                    }
                });
                break;

            case "makanan" :
                title.setText("Makanan Lokal Jogja");
                description.setText("Beberapa jenis makanan lokal yang ada di jogja");
                image.setImageResource(R.drawable.makanan);

                item1.setText("Gudeg");
                item2.setText("Bakpia");
                item3.setText("Oseng Mercon");
                item4.setText("Krecek");
                item5.setText("Bakmi Jawa");
                item6.setText("Walang Goreng");

                item1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"makanan1");
                        startActivity(i);
                    }
                });

                item2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"makanan2");
                        startActivity(i);
                    }
                });

                item3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"makanan3");
                        startActivity(i);
                    }
                });

                item4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"makanan4");
                        startActivity(i);
                    }
                });

                item5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"makanan5");
                        startActivity(i);
                    }
                });

                item6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(DetailActivity.this,ContentActivity.class);
                        i.putExtra(EXTRA_KEYWORD,"makanan6");
                        startActivity(i);
                    }
                });
                break;
        }


    }

    private void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Keluar dari aplikasi?");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Klik Ya untuk keluar!")
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        finish();
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}