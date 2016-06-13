package com.grumpy.tot_durch_snusnu.v_01.drawable;

import android.graphics.Color;
import android.graphics.Paint;

import java.io.InputStream;

public class Floor extends TileGraphics {
    private Paint floorPaint = new Paint();

    public Floor(int x, int y, InputStream is) {
        super(x, y, is);

        tilePaint.setColor(Color.parseColor("#149942"));
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isPassable() {
        return true;
    }
}
