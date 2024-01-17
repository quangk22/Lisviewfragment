package org.o7planning.lisviewfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Myfrag1 extends Fragment {
    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    public Myfrag1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_myfrag1, container, false);
        lv = (ListView) v.findViewById(R.id.list1);
        al = new ArrayList<String>();
        aa = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1, al);
        lv.setAdapter(aa);
        al.add("Bangaluru");
        al.add("Mysore");
        al.add("Pune");
        al.add("Hydarabad");
        al.add("Rajastan");
        al.add("Chennal");

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = al.get(position);
                MainActivity mnl = (MainActivity) getActivity();
                mnl.fl(s);
            }
        });

        return v;
    }
}
