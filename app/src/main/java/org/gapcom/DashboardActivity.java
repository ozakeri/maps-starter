package org.gapcom;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.gapcom.activity.APIOkHttp;
import org.gapcom.activity.APIRetrofit;
import org.gapcom.activity.APIVolley;
import org.gapcom.activity.AddMarker;
import org.gapcom.activity.Cache;
import org.gapcom.activity.ChangeCameraBearing;
import org.gapcom.activity.ChangeCameraTilt;
import org.gapcom.activity.ChangeStyle;
import org.gapcom.activity.DatabaseLayer;
import org.gapcom.activity.DrawLine;
import org.gapcom.activity.DrawPolygon;
import org.gapcom.activity.AddLabel;
import org.gapcom.activity.MarkerClustering;
import org.gapcom.activity.OnlineLayer;
import org.gapcom.activity.POILayer;
import org.gapcom.activity.RemoveMarker;
import org.gapcom.activity.Routing;
import org.gapcom.activity.Search;
import org.gapcom.activity.TrafficLayer;
import org.gapcom.activity.UserLocation;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView appVersion = findViewById(R.id.app_version);
        appVersion.setText(String.format("نسخه %s", BuildConfig.VERSION_NAME));
    }

    public void goToMarkerClusteringActivity(View view) {
        Intent intent = new Intent(this, MarkerClustering.class);
        startActivity(intent);
    }

    public void goToAddMarkerActivity(View view) {
        Intent intent = new Intent(this, AddMarker.class);
        startActivity(intent);
    }

    public void goToDrawLineActivity(View view) {
        Intent intent = new Intent(this, DrawLine.class);
        startActivity(intent);
    }

    public void goToDrawPolygonActivity(View view) {
        Intent intent = new Intent(this, DrawPolygon.class);
        startActivity(intent);
    }

    public void goToChangeCameraTiltActivity(View view) {
        Intent intent = new Intent(this, ChangeCameraTilt.class);
        startActivity(intent);
    }

    public void goToChangeCameraBearingActivity(View view) {
        Intent intent = new Intent(this, ChangeCameraBearing.class);
        startActivity(intent);
    }

    public void goToChangeStyleActivity(View view) {
        Intent intent = new Intent(this, ChangeStyle.class);
        startActivity(intent);
    }

    public void goToUserLocationActivity(View view) {
        Intent intent = new Intent(this, UserLocation.class);
        startActivity(intent);
    }

    public void goToTrafficLayerActivity(View view) {
        Intent intent = new Intent(this, TrafficLayer.class);
        startActivity(intent);
    }

    public void goToOnlineLayerActivity(View view) {
        Intent intent = new Intent(this, OnlineLayer.class);
        startActivity(intent);
    }

    public void goToPOILayerActivity(View view) {
        Intent intent = new Intent(this, POILayer.class);
        startActivity(intent);
    }

    public void goToDatabaseLayerActivity(View view) {
        Intent intent = new Intent(this, DatabaseLayer.class);
        startActivity(intent);
    }

    public void goToAPIRetrofitActivity(View view) {
        Intent intent = new Intent(this, APIRetrofit.class);
        startActivity(intent);
    }

    public void goToAPIVolleyActivity(View view) {
        Intent intent = new Intent(this, APIVolley.class);
        startActivity(intent);
    }

    public void goToAPIOkHttpActivity(View view) {
        Intent intent = new Intent(this, APIOkHttp.class);
        startActivity(intent);
    }

    public void goToCacheActivity(View view) {
        Intent intent = new Intent(this, Cache.class);
        startActivity(intent);
    }

    public void goToLabelActivity(View view) {
        Intent intent = new Intent(this, AddLabel.class);
        startActivity(intent);
    }

    public void goToRemoveMarkerActivity(View view) {
        Intent intent = new Intent(this, RemoveMarker.class);
        startActivity(intent);
    }

    public void goToRoutingActivity(View view) {
        Intent intent = new Intent(this, Routing.class);
        startActivity(intent);
    }

    public void goToSearchActivity(View view) {
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }

    public void openNeshanLink(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.neshan.org/")));
    }

    public void openGithubLink(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/NeshanMaps/android-neshan-maps-starter")));
    }
}
