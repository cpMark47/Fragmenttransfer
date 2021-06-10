package com.akshaycp.fragmenttransfer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_a#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_a extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<TransferModes> transferModes;

    public Fragment_a() {
        // Required empty public constructor
    }

    public static Fragment_a newInstance(String param1, String param2) {
        Fragment_a fragment = new Fragment_a();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager((new LinearLayoutManager((getContext()))));
        transferModes = new ArrayList<>();

        TransferModes ob1 = new TransferModes("abc");
        TransferModes ob2 = new TransferModes("def");
        TransferModes ob3 = new TransferModes("ghi");

        transferModes.add(ob1);
        transferModes.add(ob2);
        transferModes.add(ob3);

        recyclerView.setAdapter(new MyAdapter(transferModes));


        return  view;


    }
}