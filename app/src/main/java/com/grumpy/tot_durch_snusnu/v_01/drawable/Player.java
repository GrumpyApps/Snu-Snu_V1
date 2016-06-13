package com.grumpy.tot_durch_snusnu.v_01.drawable;

import android.graphics.Color;

import java.io.InputStream;

public class Player extends MovableTileGraphics {

    public Player(int x, int y, InputStream is) {
        super(x, y, is);

        tilePaint.setColor(Color.parseColor("#F0CC00"));
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isPassable() {
        return false;
    }
}
