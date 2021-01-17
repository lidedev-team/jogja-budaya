package com.example.jogja_budaya;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    WebView youtube;
    public static final String EXTRA_KEYWORD = "KEYWORD";
    private ImageView btAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        getSupportActionBar().hide();

        btAlert = (ImageView) findViewById(R.id.btn_exit);
        btAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        TextView title = findViewById(R.id.content_title);
        TextView description = findViewById(R.id.content_description);
        TextView sumber = findViewById(R.id.content_sources);

        String keywords = getIntent().getStringExtra(EXTRA_KEYWORD);
        String videoid = null;

        switch (keywords) {
            case "tari1" :
                title.setText("Rara Ngigel");
                description.setText(R.string.tari_rara_ngigel);
                sumber.setText(R.string.tari_rara_ngigel_sumber);
                videoid = "uy4CNBormy8";
                break;

            case "tari2" :
                title.setText("Golek Ayun-ayun");
                description.setText(R.string.tari_golek_ayun);
                sumber.setText(R.string.tari_golek_ayun_sumber);
                videoid = "t2V2HXJDHjE";
                break;
            case "tari3" :
                title.setText("Tari Kumbang");
                description.setText(R.string.tari_kumbang);
                sumber.setText(R.string.tari_kumbang_sumber);
                videoid = "SxXem9BplO0";
                break;

            case "tari4" :
                title.setText("Tari Arjuna Wiwaha");
                description.setText(R.string.tari_arjuna_wiwaha);
                sumber.setText(R.string.tari_arjuna_wiwaha_sumber);
                videoid = "WL1IE3zLtRY";
                break;
                
            case "tari5" :
                title.setText("Tari Satrio Watang");
                description.setText(R.string.tari_satrio_watang);
                sumber.setText(R.string.tari_satrio_watang_sumber);
                videoid = "3konpgK240U";
                break;
                
            case "tari6" :
                title.setText("Tari Klono Rojo");
                description.setText(R.string.tari_klono_rojo);
                sumber.setText(R.string.tari_klono_rojo_sumber);
                videoid = "C_kv--qCzU8";
                break;

            case "makanan1" :
                title.setText("Gudeg Jogja");
                description.setText(R.string.makanan_gudeg);
                sumber.setText(R.string.makanan_gudeg_sumber);
                videoid = "kekpx3BV6gk";
                break;

            case "makanan2" :
                title.setText("Bakpia");
                description.setText(R.string.makanan_bakpia);
                sumber.setText(R.string.makanan_bakpia_sumber);
                videoid = "0KCM8oVQ5Q4";
                break;

            case "makanan3" :
                title.setText("Oseng Mercon");
                description.setText(R.string.makanan_oseng);
                sumber.setText(R.string.makanan_oseng_sumber);
                videoid = "0d1Ya7tbFfI";
                break;

            case "makanan4" :
                title.setText("Krecek");
                description.setText(R.string.makanan_krecek);
                sumber.setText(R.string.makanan_krecek_sumber);
                videoid = "Oe9JUVh1e-A";
                break;

            case "makanan5" :
                title.setText("Bakmi Jawa");
                description.setText(R.string.makanan_bakmi);
                sumber.setText(R.string.makanan_bakmi_sumber);
                videoid = "pnPVDZKuyUY";
                break;

            case "makanan6" :
                title.setText("Walang Goreng");
                description.setText(R.string.makanan_walang);
                sumber.setText(R.string.makanan_walang_sumber);
                videoid = "k8ep8HolYFE";
                break;
        }

        WebView youtube = findViewById(R.id.wv_youtube);

        youtube.setWebViewClient(new WebViewClient());
        youtube.setWebChromeClient(new WebChromeClient());
        youtube.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        youtube.getSettings().setJavaScriptEnabled(true);
        youtube.getSettings().setPluginState(WebSettings.PluginState.ON);
        youtube.getSettings().setDefaultFontSize(18);

        String kodeHTML = "<head></head><body>" + "<iframe style=\" border-radius:10px \" width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/" + videoid +"\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>" + "</body>";
        youtube.loadData(kodeHTML,"text/html; charset=utf-8",null);

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