package ch.rydm.app;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(RyDMHealthPlugin.class);
        super.onCreate(savedInstanceState);
        DailyWorker.Companion.schedule(this);
    }
}
