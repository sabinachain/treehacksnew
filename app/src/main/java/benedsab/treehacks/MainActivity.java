package benedsab.treehacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
public static String SHAKE_THRESHOLD = "com.benedsab.treehacks.threshold";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!getSharedPreferences("threshhold", MODE_PRIVATE).contains(SHAKE_THRESHOLD)){

        }
    }
}
