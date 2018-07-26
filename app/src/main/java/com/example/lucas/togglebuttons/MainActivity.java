package com.example.lucas.togglebuttons;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    private ToggleButton botaoToggle;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoToggle = (ToggleButton) findViewById(R.id.toggleButton_id);
        textoExibicao = (TextView) findViewById(R.id.mostrar_id);

        botaoToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textoExibicao.setText("");
                if(isChecked){
                    textoExibicao.setText(botaoToggle.getText());
                }else{
                    textoExibicao.setText(botaoToggle.getText());
                }
            }
        });

    }
}
