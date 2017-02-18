package benedsab.treehacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ThresholdActivity extends AppCompatActivity implements ShakeDetector.OnShakeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threshold);

    }

    @Override
    public void onShake(int count) {

    }
}
