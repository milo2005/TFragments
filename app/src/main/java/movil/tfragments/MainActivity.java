package movil.tfragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import movil.tfragments.fragments.ColorFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        ColorFragment color1 = (ColorFragment) fm.findFragmentById(R.id.color1);
        ColorFragment color2 = (ColorFragment) fm.findFragmentById(R.id.color2);

        color1.setColor(ColorFragment.COLOR_ROJO);
        color2.setColor(ColorFragment.COLOR_VERDE);



    }
}
