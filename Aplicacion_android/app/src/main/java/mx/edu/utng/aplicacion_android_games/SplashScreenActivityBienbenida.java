package mx.edu.utng.aplicacion_android_games;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

/**
 * Creado por Juan Gabriel Carrillo Avalos.
 */
public class SplashScreenActivityBienbenida extends Activity {

    private static final long SPLASH_SCREEN_DELAY=1000;//Duracion
    //metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.acceder_layout);

        initComponents();
    }

    private void initComponents() {

        String username= getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.txv_usuario_ent);
        tv.setText(username);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent().setClass(SplashScreenActivityBienbenida.this, ListaActividad.class));
                finish();
            }
        };

        Timer timer=new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

}
