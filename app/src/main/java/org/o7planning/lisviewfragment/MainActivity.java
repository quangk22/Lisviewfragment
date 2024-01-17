package org.o7planning.lisviewfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Myfrag1 myfrag1 = new Myfrag1();
        getSupportFragmentManager().beginTransaction().add(R.id.frame1, myfrag1).commit();
    }
    public void fl(String s) {
        Myfrag2 myfrag2 = new Myfrag2();
        Bundle b2 = new Bundle();
        b2.putString("s", s);
        myfrag2.setArguments(b2);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1, myfrag2).commit();
    }
}