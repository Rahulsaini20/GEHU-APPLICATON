package com.example.finalgehuapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.finalgehuapp.R;

import java.util.ArrayList;


public class homeFragment extends Fragment {

    private ImageView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageSlider imageSlider = view.findViewById(R.id.slider);
        //list
        ArrayList<SlideModel>slideModels=new ArrayList<>();
        slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/home/gehu-dehradun.jpg", ScaleTypes.FIT));
    slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/Image-Galleries/carousel/academics.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/Image-Galleries/HeaderFiles/Architecture/architecture-1.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/Image-Galleries/HeaderFiles/CS/ubuntu-lab-01.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/Image-Galleries/HeaderFiles/CS/mac-lab.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/Image-Galleries/schools/soe/cse/facilities/cisco-lab/cisco-lab3.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/Image-Galleries/schools/soe/cse/facilities/ubuntu-lab/ubuntu-lab-2.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/Image-Galleries/HeaderFiles/international.jpg", ScaleTypes.FIT));

        slideModels.add(new SlideModel("https://www.gehu.ac.in/content/dam/gehu/Image-Galleries/HeaderFiles/gehu-aerial-view.jpg", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);

                map=view.findViewById(R.id.mapid);
                map.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openMap();
                    }

                    private void openMap() {
                        Uri uri= Uri.parse("geo:0,0?q=Graphic Era Hill University Dehradun");
                        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                        onClick(view);
                    }
                });
        return view;
    }
}