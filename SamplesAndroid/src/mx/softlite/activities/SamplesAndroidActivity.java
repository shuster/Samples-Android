package mx.softlite.activities;

import mx.softlite.R;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class SamplesAndroidActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        
        // Create an Intent to launch an Activity for the Tab
        intent = new Intent().setClass(this, GridViewActivity.class);
        spec = tabHost.newTabSpec("gridView").setIndicator("Grid View", res.getDrawable(R.drawable.ic_tab_noticias)).setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, LinerLayoutActivity.class);
        spec = tabHost.newTabSpec("linerLayot").setIndicator("Liner Layout").setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, ListViewActivity.class);
        spec = tabHost.newTabSpec("lisView").setIndicator("List View").setContent(intent);
        tabHost.addTab(spec);
//        
//        intent = new Intent().setClass(this, RelativeLayoutActivity.class);
//        spec = tabHost.newTabSpec("relativeLayout").setIndicator("Relative Layout").setContent(intent);
//        tabHost.addTab(spec);
//        
//        intent = new Intent().setClass(this, TableLayoutActivity.class);
//        spec = tabHost.newTabSpec("tableLayout").setIndicator("Table Layout").setContent(intent);
//        tabHost.addTab(spec);
        
        tabHost.setCurrentTab(0);
    }
}