package org.tensorflow.lite.examples.imagesegmentation.judi.com.p269b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.util.Log;
import judi.com.p268a.C7153c.C7155b;

/* renamed from: judi.com.b.b */
/* compiled from: ImageUtils */
public class C7166b {
    /* renamed from: a */
    public static Bitmap m38306a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, i, i2), null);
        return createBitmap;
    }

    /* renamed from: b */
    public static Bitmap m38309b(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append("  ");
        sb.append(f2);
        sb.append("  and  ");
        sb.append(width);
        sb.append("  ");
        sb.append(height);
        Log.i("testings", sb.toString());
        float f3 = width / height;
        float f4 = height / width;
        if (width > f) {
            float f5 = f * f4;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("if (wd > wr) ");
            sb2.append(f);
            sb2.append("  ");
            sb2.append(f5);
            Log.i("testings", sb2.toString());
            if (f5 > f2) {
                f = f2 * f3;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("  if (he > hr) ");
                sb3.append(f);
                sb3.append("  ");
                sb3.append(f2);
                Log.i("testings", sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" in else ");
                sb4.append(f);
                sb4.append("  ");
                sb4.append(f5);
                Log.i("testings", sb4.toString());
                f2 = f5;
            }
        } else if (height > f2) {
            float f6 = f2 * f3;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  if (he > hr) ");
            sb5.append(f6);
            sb5.append("  ");
            sb5.append(f2);
            Log.i("testings", sb5.toString());
            if (f6 > f) {
                f2 = f * f4;
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(" in else ");
                sb6.append(f6);
                sb6.append("  ");
                sb6.append(f2);
                Log.i("testings", sb6.toString());
                f = f6;
            }
        } else if (f3 > 0.75f) {
            f2 = f * f4;
            Log.i("testings", " if (rat1 > .75f) ");
        } else if (f4 > 1.5f) {
            f = f2 * f3;
            Log.i("testings", " if (rat2 > 1.5f) ");
        } else {
            f2 = f * f4;
            Log.i("testings", " in else ");
        }
        return Bitmap.createScaledBitmap(bitmap, (int) f, (int) f2, false);
    }

    /* renamed from: a */
    public static int m38304a(Context context, int i) {
        float f = (float) i;
        context.getResources();
        return (int) (f * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static Bitmap m38307a(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
        paint.setXfermode(null);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m38305a(Context context, int i, int i2, int i3) {
        Rect rect = new Rect(0, 0, i2, i3);
        Paint paint = new Paint();
        Options options = new Options();
        options.inScaled = false;
        paint.setShader(new BitmapShader(BitmapFactory.decodeResource(context.getResources(), i, options), TileMode.REPEAT, TileMode.REPEAT));
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Config.ARGB_8888);
        new Canvas(createBitmap).drawRect(rect, paint);
        return createBitmap;
    }

    /* renamed from: b */
    public static Bitmap m38308b(Context context, int i) {
        int a = m38304a(context, 150);
        return m38307a(m38305a(context, i, a, a), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), C7155b.circle), a, a, true));
    }
}
