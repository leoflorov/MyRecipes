package leodevelopments.myrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class AddRecipeActivity extends Activity {

    String[] categoriesSpinner = {"Салаты", "Супы", "Вторые блюда", "Напитки", "Десерты", "Курица", "Рыба", "Мясо", "Праздники"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addrecipe_layout);


            // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categoriesSpinner);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            Spinner spinner = (Spinner) findViewById(R.id.spinner);
            spinner.setAdapter(adapter);
        spinner.setPrompt("Категории рецептов");
        spinner.setSelection(2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Position =" + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        }
    }
