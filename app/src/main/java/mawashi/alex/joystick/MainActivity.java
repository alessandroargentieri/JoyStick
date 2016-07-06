package mawashi.alex.joystick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView joyP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        joyP = (ImageView) findViewById(R.id.joypad);


        findViewById(R.id.joystick).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int X = (int) event.getX();
                int Y = (int) event.getY();

                int x=0;
                int y=0;

                if(X>333)
                    x=3;
                else if(X>167)
                    x=2;
                else
                    x=1;

                if(Y>333)
                    y=3;
                else if(Y>167)
                    y=2;
                else
                    y=1;

                if(x==1 && y==1){
                    try {
                        joyP.setImageResource(R.drawable.staedyupleft);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }else if(x==1 && y==2){
                    try {
                        joyP.setImageResource(R.drawable.staedyleft);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }else if(x==1 && y==3){
                    try {
                        joyP.setImageResource(R.drawable.steadydownleft);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }else if(x==2 && y==1){
                    try {
                        joyP.setImageResource(R.drawable.steadyup);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }else if(x==2 && y==2){
                    try {
                        joyP.setImageResource(R.drawable.steady);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }else if(x==2 && y==3){
                    try {
                        joyP.setImageResource(R.drawable.steadydown);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }else if(x==3 && y==1){
                    try {
                        joyP.setImageResource(R.drawable.staedyupright);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }else if(x==3 && y==2){
                    try {
                        joyP.setImageResource(R.drawable.steadyright);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }else if(x==3 && y==3){
                    try {
                        joyP.setImageResource(R.drawable.steadydownright);
                    }catch(Exception e){Log.e("ERRORJOYSTICK","ERRORJOYSTICK: " + e.toString());}
                }

                int eventaction = event.getAction();

                switch (eventaction) {
                    case MotionEvent.ACTION_DOWN:

                        try {

                            //joyP.setImageResource(R.drawable.staedyleft);
                         //   LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(ninjaSprite.getWidth(), ninjaSprite.getHeight());
                         //   layoutParams.setMargins(X, Y, 0, 0);
                         //   ninjaSprite.setLayoutParams(layoutParams);
                        }catch(Exception e){
                            Log.d("COLORE", "COLORE INESISTENTE");
                        }
                       // Toast.makeText(MainActivity.this, "X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                       // Log.d("MOTION DOWN", "MOTION DOWN " + X + ", " + Y);
                        // isTouch = true;
                        break;

                    case MotionEvent.ACTION_MOVE:
                        // Toast.makeText(MainActivity.this, "MOVE "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                        //joyP.setImageResource(R.drawable.staedyupright);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Toast.makeText(MainActivity.this, "ACTION_UP "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                        Log.d("MOTION UP", "MOTION UP " + X + ", " + Y);
                        joyP.setImageResource(R.drawable.steady);

                        break;
                }
                return true;
            }
        });

    }//end of on-create
}
