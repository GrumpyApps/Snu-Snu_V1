package com.grumpy.tot_durch_snusnu.v_01.drawable;

import android.graphics.Color;

import java.io.InputStream;


public class Target extends TileGraphics {
    private int score=1;
    public int getScore() { return score; }

    public Target(int x, int y, InputStream is) {
        super(x, y, is);

        tilePaint.setColor(Color.parseColor("#BF1111"));
    }

    public Target(int x, int y, InputStream is, int score) {
        this(x, y, is);
        this.score = score;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isPassable() {
        return true;
    }
}
