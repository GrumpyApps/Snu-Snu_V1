package com.grumpy.tot_durch_snusnu.v_01.drawable;

import android.graphics.Color;

import java.io.InputStream;

public class Wall extends TileGraphics {

    public Wall(int x, int y, InputStream is) {
        super(x, y, is);

        tilePaint.setColor(Color.parseColor("#5F3900"));
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isPassable() {
        return false;
    }
}
