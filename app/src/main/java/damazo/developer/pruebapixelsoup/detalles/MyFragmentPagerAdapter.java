package damazo.developer.pruebapixelsoup.detalles;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Dámazo on 05/06/2016.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private int NUM_PAG=3;
    String[] tabs=new String[]{"Detalles","Acciones","*Otros"};

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fr=FragmentAcciones.newInstance();
        switch (position){
            case 0:
                fr=FragmentDetalles.newInstance();
                break;
            case 1:
                fr=FragmentAcciones.newInstance();
                break;
            case 2:
                fr=FragmentAcciones.newInstance();
                break;
        }
        return fr;
    }

    @Override
    public int getCount() {
        return NUM_PAG ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
