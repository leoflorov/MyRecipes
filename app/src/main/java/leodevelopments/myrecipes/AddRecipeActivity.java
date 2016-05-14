package leodevelopments.myrecipes;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class AddRecipeActivity extends Activity {



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.addrecipe_layout, null);
    }
        String[] categoriesSpinner = {"Салаты", "Супы", "Вторые блюда", "Напитки", "Десерты", "Курица", "Рыба", "Мясо", "Праздники"};
    {

        setContentView(R.layout.addrecipe_layout);
            Spinner spinner = (Spinner) findViewById(R.id.select_cat_spinner);
            // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,categoriesSpinner);
            // Определяем разметку для использования при выборе элемента
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            // Применяем адаптер к элементу spinner
            spinner.setAdapter(adapter);
        }
    }