package movil.tfragments;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import movil.tfragments.adapters.ColorAdapter;
import movil.tfragments.fragments.ColorFragment;

public class PagerActivity extends AppCompatActivity {

    ViewPager pager;
    List<Fragment> data;
    ColorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        pager = (ViewPager) findViewById(R.id.pager);

        ColorFragment azul =  new ColorFragment();
        azul.setColor(ColorFragment.COLOR_AZUL);

        ColorFragment amarillo =  new ColorFragment();
        amarillo.setColor(ColorFragment.COLOR_AMARILLO);

        ColorFragment rojo =  new ColorFragment();
        rojo.setColor(ColorFragment.COLOR_ROJO);

        ColorFragment verde =  new ColorFragment();
        verde.setColor(ColorFragment.COLOR_VERDE);

        ColorFragment violeta =  new ColorFragment();
        violeta.setColor(ColorFragment.COLOR_VIOLETA);

        ColorFragment naranja =  new ColorFragment();
        naranja.setColor(ColorFragment.COLOR_NARANJA);

        data = new ArrayList<>();
        data.add(azul);
        data.add(rojo);
        data.add(amarillo);
        data.add(verde);
        data.add(violeta);
        data.add(naranja);

        adapter =  new ColorAdapter(getSupportFragmentManager(), data);

        pager.setAdapter(adapter);

    }
}
