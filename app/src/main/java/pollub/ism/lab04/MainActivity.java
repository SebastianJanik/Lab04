package pollub.ism.lab04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button przycisk, przycisk2, przycisk3,
            przycisk4, przycisk5, przycisk6,
            przycisk7, przycisk8, przycisk9;
    private Character gracz = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przycisk = (Button) findViewById(R.id.button);
        przycisk2 = (Button) findViewById(R.id.button2);
        przycisk3 = (Button) findViewById(R.id.button3);
        przycisk4 = (Button) findViewById(R.id.button4);
        przycisk5 = (Button) findViewById(R.id.button5);
        przycisk6 = (Button) findViewById(R.id.button6);
        przycisk7 = (Button) findViewById(R.id.button7);
        przycisk8 = (Button) findViewById(R.id.button8);
        przycisk9 = (Button) findViewById(R.id.button9);
        gracz = 'O';
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("przycisk", przycisk.getText().toString());
        outState.putString("przycisk2", przycisk2.getText().toString());
        outState.putString("przycisk3", przycisk3.getText().toString());
        outState.putString("przycisk4", przycisk4.getText().toString());
        outState.putString("przycisk5", przycisk5.getText().toString());
        outState.putString("przycisk6", przycisk6.getText().toString());
        outState.putString("przycisk7", przycisk7.getText().toString());
        outState.putString("przycisk8", przycisk8.getText().toString());
        outState.putString("przycisk9", przycisk9.getText().toString());
        outState.putChar("gracz", gracz);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        przycisk.setText(savedInstanceState.getString("przycisk"));
        przycisk2.setText(savedInstanceState.getString("przycisk2"));
        przycisk3.setText(savedInstanceState.getString("przycisk3"));
        przycisk4.setText(savedInstanceState.getString("przycisk4"));
        przycisk5.setText(savedInstanceState.getString("przycisk5"));
        przycisk6.setText(savedInstanceState.getString("przycisk6"));
        przycisk7.setText(savedInstanceState.getString("przycisk7"));
        przycisk8.setText(savedInstanceState.getString("przycisk8"));
        przycisk9.setText(savedInstanceState.getString("przycisk9"));
        gracz = savedInstanceState.getChar("gracz");
    }

    public void nowaAktywnosc(Activity aktywnosc){
        Intent intencja = new Intent(this, MainActivity.class);
        finish();
        startActivity(intencja);
    }

    public int czyWygrana(){
        if(przycisk.getText() == przycisk2.getText() && przycisk2.getText() == przycisk3.getText() && !"".equals(przycisk.getText())) {
            if("X".equals(przycisk.getText()))
                return 1;
            else
                return 2;
        }
        if(przycisk4.getText() == przycisk5.getText() && przycisk5.getText() == przycisk6.getText() && !"".equals(przycisk4.getText())) {
            if("X".equals(przycisk4.getText()))
                return 1;
            else
                return 2;
        }
        if(przycisk7.getText() == przycisk8.getText() && przycisk8.getText() == przycisk9.getText() && !"".equals(przycisk7.getText())) {
            if("X".equals(przycisk7.getText()))
                return 1;
            else
                return 2;
        }
        if(przycisk.getText() == przycisk4.getText() && przycisk4.getText() == przycisk7.getText() && !"".equals(przycisk.getText())) {
            if("X".equals(przycisk.getText()))
                return 1;
            else
                return 2;
        }
        if(przycisk2.getText() == przycisk5.getText() && przycisk5.getText() == przycisk8.getText() && !"".equals(przycisk2.getText())) {
            if("X".equals(przycisk2.getText()))
                return 1;
            else
                return 2;
        }
        if(przycisk3.getText() == przycisk6.getText() && przycisk6.getText() == przycisk9.getText() && !"".equals(przycisk3.getText())) {
            if("X".equals(przycisk3.getText()))
                return 1;
            else
                return 2;
        }
        if(przycisk.getText() == przycisk5.getText() && przycisk5.getText() == przycisk9.getText() && !"".equals(przycisk.getText())) {
            if("X".equals(przycisk.getText()))
                return 1;
            else
                return 2;
        }
        if(przycisk3.getText() == przycisk5.getText() && przycisk5.getText() == przycisk7.getText() && !"".equals(przycisk3.getText())) {
            if("X".equals(przycisk3.getText()))
                return 1;
            else
                return 2;
        }
        if(!"".equals(przycisk.getText()) && !"".equals(przycisk2.getText()) && !"".equals(przycisk3.getText())
        && !"".equals(przycisk4.getText()) && !"".equals(przycisk5.getText()) && !"".equals(przycisk6.getText())
        && !"".equals(przycisk7.getText()) && !"".equals(przycisk8.getText()) && !"".equals(przycisk9.getText()))
            return 3;
        return 0;
    }

    public void kliknieciePrzycisku(View widok) {
        switch (widok.getId()) {
            case R.id.button:
                if("".equals(przycisk.getText()))
                    przycisk.setText(znak(gracz));
                break;
            case R.id.button2:
                if("".equals(przycisk2.getText()))
                    przycisk2.setText(znak(gracz));
                break;
            case R.id.button3:
                if("".equals(przycisk3.getText()))
                    przycisk3.setText(znak(gracz));
                break;
            case R.id.button4:
                if("".equals(przycisk4.getText()))
                    przycisk4.setText(znak(gracz));
                break;
            case R.id.button5:
                if("".equals(przycisk5.getText()))
                    przycisk5.setText(znak(gracz));
                break;
            case R.id.button6:
                if("".equals(przycisk6.getText()))
                    przycisk6.setText(znak(gracz));
                break;
            case R.id.button7:
                if("".equals(przycisk7.getText()))
                    przycisk7.setText(znak(gracz));
                break;
            case R.id.button8:
                if("".equals(przycisk8.getText()))
                    przycisk8.setText(znak(gracz));
                break;
            case R.id.button9:
                if("".equals(przycisk9.getText()))
                    przycisk9.setText(znak(gracz));
                break;
        }
        if(czyWygrana() == 1) {
            Toast.makeText(this, "Wygrał X", Toast.LENGTH_LONG).show();
            nowaAktywnosc(this);
        }
        if(czyWygrana() == 2) {
            Toast.makeText(this, "Wygrał O", Toast.LENGTH_LONG).show();
            nowaAktywnosc(this);
        }
        if(czyWygrana() == 3) {
            Toast.makeText(this, "Remis", Toast.LENGTH_LONG).show();
            nowaAktywnosc(this);
        }
    }

    public void zmienGracza(Character gracz){
        if (this.gracz == 'O')
            this.gracz = 'X';
        else
            this.gracz = 'O';
    }
    public String znak(Character gracz){
        if(gracz == 'O'){
            zmienGracza(this.gracz);
            return  "O";
        } else {
            zmienGracza(this.gracz);
            return  "X";
        }
    }
}