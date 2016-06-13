package com.grumpy.tot_durch_snusnu.v_01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainGameActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String level=getIntent().getExtras().getString("level");

        gameView = new GameView(this, level);
        setContentView(gameView);
    }


}
