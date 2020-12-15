package com.genesyscharactersheetapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CharacteristicFragment extends Fragment {

    public CharacteristicFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView characteristicRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_characteristic, container, false);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 6);
        characteristicRecycler.setLayoutManager(layoutManager);
        return characteristicRecycler;

    }

    public static final Characteristic[] characteristics = new Characteristic[6];

    public void FillCharacteristicArr(Characteristic[] characteristicsArr){
        String[] XMLCharArr = getResources().getStringArray(R.array.Characteristics);

        for (int i = 0; i < XMLCharArr.length; i++){
            characteristicsArr[i] = new Characteristic(XMLCharArr[i]);
        }
    }

}