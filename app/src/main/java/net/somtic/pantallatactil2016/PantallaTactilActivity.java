package net.somtic.pantallatactil2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class PantallaTactilActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView entrada = (TextView)findViewById(R.id.TextViewEntrada);
        entrada.setOnTouchListener(this);
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        TextView salida = (TextView) findViewById(R.id.TextViewSalida);
        float presion = motionEvent.getPressure();
        float tam = motionEvent.getSize();
        salida.append("\nPresión: " + presion + "\n" + "Tamaño: " + tam + "\n");
        salida.append("\n" + motionEvent.toString()+"\n" );
        return true;
    }
}
