package benedsab.treehacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.IBinder;

public class TremorHandlerService extends Service implements SensorEventListener {
    int mStartMode;
    IBinder mBinder;
    private float mAccel;       // acceleration w/o gravity
    private float mAccelCurrent;// acceleration w/ gravity
    private float mAccelLast;   // prev. acceleration w/ gravity

    private SensorManager mSensorManager;

    public TremorHandlerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return START_REDELIVER_INTENT;
    }

    // Based on Matthew Wiggins' code under Apache 2.0
    private static final int FORCE_THRESHOLD = 350;
    private static final int TIME_INTERVAL = 1;
    private static final int TIME_MEASURE = 1000;
    private static final int SHAKE_TIMEOUT = 500;
    private static final int SHAKE_DURATION = 1000;
    private static final int SHAKE_COUNT = 3;

    private SensorManager mSensorMgr;
    private float mLastX=-1.0f, mLastY=-1.0f, mLastZ=-1.0f;
    private long mLastTime;
    private Context mContext;
    private int mShakeCount = 0;
    private long mLastShake;
    private long mLastForce;


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];


    }
}
