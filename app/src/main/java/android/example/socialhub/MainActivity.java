package android.example.socialhub;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button fb,wh,ins,lnk,ut,tw,gm,qr,cr,snp,wiki,red,sk,md,bn;
    ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb=findViewById(R.id.facebook);
        wh=findViewById(R.id.whatsapp);
        ins=findViewById(R.id.instagram);
        lnk=findViewById(R.id.linkedin);
        ut=findViewById(R.id.utube);
        tw=findViewById(R.id.twitter);
        gm=findViewById(R.id.gmail);
        qr=findViewById(R.id.quora);
        cr=findViewById(R.id.chrome);
        snp=findViewById(R.id.snapchat);
        wiki=findViewById(R.id.wikipedia);
        red=findViewById(R.id.reddit);
        sk=findViewById(R.id.skype);
        md=findViewById(R.id.medium);
        bn=findViewById(R.id.bing);


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faceb();
            }
        });
        wh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whats();
            }
        });
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insta();
            }
        });
        lnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link();
            }
        });
        ut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utube();
            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twit();
            }
        });
        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gmail();
            }
        });
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qra();
            }
        });
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrome();
            }
        });
        snp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snap();
            }
        });
        wiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wiki();
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                red();
            }
        });
        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skype();
            }
        });
        md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                med();
            }
        });
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bing();
            }
        });


    }
    private void faceb(){
//        dialog();
        Intent fb = new Intent(MainActivity.this,Social.class);
        fb.putExtra("url","https://www.facebook.com/");
        startActivity(fb);
    }
    private void whats(){
        Intent wht = new Intent(MainActivity.this,Social.class);
        wht.putExtra("url","https://www.whatsapp.com/");
        startActivity(wht);
    }
    private void insta(){
        Intent ins = new Intent(MainActivity.this,Social.class);
        ins.putExtra("url","https://www.instagram.com/");
        startActivity(ins);
    }
    private void link(){
        Intent lnk = new Intent(MainActivity.this,Social.class);
        lnk.putExtra("url","https://www.linkedin.com/");
        startActivity(lnk);
    }
    private void utube(){
        Intent u = new Intent(MainActivity.this,Social.class);
        u.putExtra("url","https://www.youtube.com/");
        startActivity(u);
    }
    private void twit(){
        Intent tw = new Intent(MainActivity.this,Social.class);
        tw.putExtra("url","https://twitter.com/");
        startActivity(tw);
    }
    private void gmail(){
        Intent g = new Intent(MainActivity.this,Social.class);
        g.putExtra("url","https://mail.google.com/");
        startActivity(g);
    }
    private void qra(){
        Intent qr = new Intent(MainActivity.this,Social.class);
        qr.putExtra("url","https://www.quora.com/");
        startActivity(qr);
    }
    private void chrome(){
        Intent ch = new Intent(MainActivity.this,Social.class);
        ch.putExtra("url","https://www.google.com/chrome/");
        startActivity(ch);
    }
    private void snap(){
        Intent snp = new Intent(MainActivity.this,Social.class);
        snp.putExtra("url","https://www.snapchat.com/");
        startActivity(snp);
    }
    private void wiki(){
        Intent w = new Intent(MainActivity.this,Social.class);
        w.putExtra("url","https://www.wikipedia.org/");
        startActivity(w);
    }
    private void red(){
        Intent r = new Intent(MainActivity.this,Social.class);
        r.putExtra("url","https://www.redditinc.com/");
        startActivity(r);
    }
    private void skype(){
        Intent sk = new Intent(MainActivity.this,Social.class);
        sk.putExtra("url","https://www.skype.com/en/");
        startActivity(sk);
    }
    private void med(){
        Intent md = new Intent(MainActivity.this,Social.class);
        md.putExtra("url","https://medium.com/");
        startActivity(md);
    }
    private void bing(){
        Intent bg = new Intent(MainActivity.this,Social.class);
        bg.putExtra("url","https://www.bing.com/");
        startActivity(bg);
    }

//    private void dialog(){
//        progress=new ProgressDialog(MainActivity.this);
//        progress.setMessage("Loading....");
//        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//        progress.setProgress(0);
//        progress.show();
//        progress.setCancelable(true);
//
//    }

}
