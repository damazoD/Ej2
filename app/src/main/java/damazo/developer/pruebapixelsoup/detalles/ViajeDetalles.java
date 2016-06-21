package damazo.developer.pruebapixelsoup.detalles;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import damazo.developer.pruebapixelsoup.MainActivity;
import damazo.developer.pruebapixelsoup.R;
import damazo.developer.pruebapixelsoup.clases.Viaje;

public class ViajeDetalles extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viaje_detalles);

        Toolbar toolbar=(Toolbar)findViewById(R.id.incTbdetalles);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Folio: 700046179");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager vPager=(ViewPager)findViewById(R.id.viewPager);
        vPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager()));
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setupWithViewPager(vPager);


    }
}
