package movil.tfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import movil.tfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    public static final int COLOR_AZUL = 0;
    public static final int COLOR_ROJO = 1;
    public static final int COLOR_AMARILLO = 2;
    public static final int COLOR_VERDE = 3;
    public static final int COLOR_VIOLETA = 4;
    public static final int COLOR_NARANJA = 5;

    TextView txt;
    int color;

    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_color
                , container, false);
        txt = (TextView) v.findViewById(R.id.txt);
        setColor(color);
        return v;
    }

    public void setColor(int color){
        this.color = color;
        if(txt != null) {
            switch (color) {
                case COLOR_AZUL:
                    txt.setText(R.string.azul);
                    txt.setBackgroundResource(R.color.azul);
                    break;
                case COLOR_AMARILLO:
                    txt.setText(R.string.amarillo);
                    txt.setBackgroundResource(R.color.amarillo);
                    break;
                case COLOR_ROJO:
                    txt.setText(R.string.rojo);
                    txt.setBackgroundResource(R.color.rojo);
                    break;
                case COLOR_VIOLETA:
                    txt.setText(R.string.violeta);
                    txt.setBackgroundResource(R.color.violeta);
                    break;
                case COLOR_NARANJA:
                    txt.setText(R.string.naranja);
                    txt.setBackgroundResource(R.color.naranja);
                    break;
                case COLOR_VERDE:
                    txt.setText(R.string.verde);
                    txt.setBackgroundResource(R.color.verde);
                    break;
            }
        }
    }

}
