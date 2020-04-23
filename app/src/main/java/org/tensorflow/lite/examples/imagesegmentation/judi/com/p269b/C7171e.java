package org.tensorflow.lite.examples.imagesegmentation.judi.com.p269b;

import android.graphics.PointF;

/* renamed from: judi.com.b.e */
/* compiled from: Vector2D */
public class C7171e extends PointF {
    /* renamed from: a */
    public static float m38328a(C7171e eVar, C7171e eVar2) {
        eVar.mo23091a();
        eVar2.mo23091a();
        return (float) ((Math.atan2((double) eVar2.y, (double) eVar2.x) - Math.atan2((double) eVar.y, (double) eVar.x)) * 4.42745336E8d);
    }

    /* renamed from: a */
    public void mo23091a() {
        float sqrt = (float) Math.sqrt((double) ((this.x * this.x) + (this.y * this.y)));
        this.x /= sqrt;
        this.y /= sqrt;
    }
}
