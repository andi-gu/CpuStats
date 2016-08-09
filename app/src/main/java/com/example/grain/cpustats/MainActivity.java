package com.example.grain.cpustats;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    private boolean mServiceMaybeRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);




    }

    public boolean  onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_preview,menu);
        return true;
}


    public boolean onPrepareOptionsMenu(Menu menu) {

        // サービス状態によってmenu変更
        {
            final MenuItem item = menu.findItem(R.id.menu_start_service);
            if (item != null) {
                item.setVisible(!mServiceMaybeRunning);
            }
        }
        {
            final MenuItem item = menu.findItem(R.id.menu_stop_service);
            if (item != null) {
                item.setVisible(mServiceMaybeRunning);
            }
        }

        return super.onPrepareOptionsMenu(menu);
    }
}
