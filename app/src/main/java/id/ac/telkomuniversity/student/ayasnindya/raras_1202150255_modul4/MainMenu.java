package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void tampilNama(View view) {
        Intent pindah = new Intent(getApplicationContext(),ListNamaMahasiswa.class);
        startActivity(pindah);
    }
    public void cariGambar (View view) {
        Intent a = new Intent(getApplicationContext(),CariGambar.class);
        startActivity(a);
    }
}
