package siva.com.circularmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
    String arrayname[]={"home","search","notify","settings","gps"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.mipmap.ic_add,R.mipmap.ic_cancel)
                .addSubMenu(Color.parseColor("#258CFF"),R.mipmap.ic_home)
                .addSubMenu(Color.parseColor("#30A400"),R.mipmap.ic_search)
                .addSubMenu(Color.parseColor("#FF4B32"),R.mipmap.ic_notify)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this,"you selected "+arrayname[index],Toast.LENGTH_LONG).show();
                    }
                });

    }
}
