package com.example.p;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvNazwa = findViewById(R.id.tvNazwaProduktu);

        // --- MIEJSCE NA TWÓJ KOD ---

        // ZADANIE 4: Pobierz Intent i wyciągnij z niego przekazaną nazwę produktu (String)
        // Pamiętaj o użyciu tego samego klucza co w MainActivity!
        Intent intent = getIntent();
        String nazwaProduktu = intent.getStringExtra("PRODUKT_NAZWA");

        // ZADANIE 5: Ustaw tekst w TextView (tvNazwa.setText(...))
        if (nazwaProduktu != null) {
            tvNazwa.setText(nazwaProduktu);
        }

        // ---------------------------
    }
}
