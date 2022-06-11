package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.myapplication.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in tugu0km and move the camera
        LatLng tugu0km = new LatLng(-0.897139, 119.868777);
        LatLng tuguperdamaian = new LatLng(-0.856105, 119.911900);
        // Add marker to map
        mMap.addMarker(new MarkerOptions().position(tugu0km).title("Marker in Tugu 0 KM")
                .snippet("Ini adalah Tugu 0 KM"));
        mMap.addMarker(new MarkerOptions().position(tuguperdamaian).title("Marker in Tugu Perdamaian")
                .snippet("Ini adalah Tugu Perdamaian"));

        mMap.addPolyline(new PolylineOptions().add(
                tugu0km,
                new LatLng(-0.892335, 119.870086),
                new LatLng(-0.886872, 119.871130),
                new LatLng(-0.880429, 119.872610),
                new LatLng(-0.873802, 119.874509),
                new LatLng(-0.874160, 119.877241),
                new LatLng(-0.870633, 119.877752),
                new LatLng(-0.870790, 119.886820),
                new LatLng(-0.870297, 119.887217),
                new LatLng(-0.852112, 119.891954),
                new LatLng(-0.853669, 119.897133),
                new LatLng(-0.853828, 119.899130),
                new LatLng(-0.853672, 119.899599),
                new LatLng(-0.853843, 119.902760),
                new LatLng(-0.854234, 119.903469),
                new LatLng(-0.854231, 119.904026),
                new LatLng(-0.853745, 119.905212),
                new LatLng(-0.854112, 119.906440),
                new LatLng(-0.853319, 119.906441),
                new LatLng(-0.853299, 119.907092),
                new LatLng(-0.854197, 119.908969),
                new LatLng(-0.856514, 119.910946),
                new LatLng(-0.856305, 119.911457),
                new LatLng(-0.856525, 119.912116),
                tuguperdamaian
                ).width(10)
                 .color(Color.BLUE)
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLng(tugu0km));
    }
}