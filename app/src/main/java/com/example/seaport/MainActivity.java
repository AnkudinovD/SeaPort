package com.example.seaport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private Port rentalPort = new Port("Аренда площадей порта", 170_000);
    private ShipService serviceRepair = new ShipService("Обслуживание морских портов", 125, 3_500);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.outputText);
        int monthIncome = rentalPort.monthIncome() + serviceRepair.monthIncome();

        String message = "Итоговая выручка порта за месяц: " + monthIncome + " монет.";
        output.setText(message);
    }
}