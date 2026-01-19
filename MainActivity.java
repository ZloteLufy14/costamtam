package com.example.p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Przygotowanie danych (prosta tablica lub lista Stringów)
        String[] produkty = {"Chleb", "Mleko", "Jajka", "Masło", "Ser", "Szynka", "Pomidory"};

        // 2. Konfiguracja Adaptera
        // Używamy gotowego layoutu systemowego 'simple_list_item_1'
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                produkty
        );

        // 3. Podpięcie adaptera do ListView
        ListView listView = findViewById(R.id.listaProduktow);
        listView.setAdapter(adapter);

        // 4. Obsługa kliknięcia w element listy
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Ta metoda wykonuje się po kliknięciu w wiersz.
                // 'position' to numer klikniętego wiersza (0, 1, 2...)

                // Pobieramy nazwę klikniętego produktu
                String kliknietyProdukt = produkty[position];

                // --- MIEJSCE NA TWÓJ KOD ---

                // ZADANIE 1: Utwórz Intent prowadzący do DetailActivity
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                // ZADANIE 2: Przekaż kliknięty produkt (zmienna 'kliknietyProdukt') do Intentu
                // Użyj klucza np. "PRODUKT_NAZWA"
                intent.putExtra("PRODUKT_NAZWA", kliknietyProdukt);

                // ZADANIE 3: Uruchom aktywność
                startActivity(intent);

                // ---------------------------

                // Dla celów testowych (zanim napiszesz Intent), możesz odkomentować tosta:
                // Toast.makeText(MainActivity.this, "Wybrano: " + kliknietyProdukt, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
