package p256e.p258b;

import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.b.b */
/* compiled from: CompatUtils */
public class C6978b {

    /* renamed from: a */
    private static final AtomicInteger f24487a = new AtomicInteger(15000000);

    /* renamed from: a */
    public static void m36371a(Display display, DisplayMetrics displayMetrics, Point point) {
        if (17 <= VERSION.SDK_INT) {
            display.getRealMetrics(displayMetrics);
            display.getRealSize(point);
        }
        if (14 <= VERSION.SDK_INT) {
            display.getMetrics(displayMetrics);
            try {
                point.x = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(display, new Object[0])).intValue();
                point.y = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(display, new Object[0])).intValue();
            } catch (Exception unused) {
                display.getSize(point);
            }
        } else {
            display.getMetrics(displayMetrics);
            display.getSize(point);
        }
    }
}
