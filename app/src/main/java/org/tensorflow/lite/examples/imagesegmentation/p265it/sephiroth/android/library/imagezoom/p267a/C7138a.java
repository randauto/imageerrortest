package p265it.sephiroth.android.library.imagezoom.p267a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: it.sephiroth.android.library.imagezoom.a.a */
/* compiled from: FastBitmapDrawable */
public class C7138a extends Drawable {

    /* renamed from: a */
    protected Bitmap f26117a;

    /* renamed from: b */
    protected Paint f26118b;

    /* renamed from: c */
    protected int f26119c;

    /* renamed from: d */
    protected int f26120d;

    public int getOpacity() {
        return -3;
    }

    public C7138a(Bitmap bitmap) {
        this.f26117a = bitmap;
        if (this.f26117a != null) {
            this.f26119c = this.f26117a.getWidth();
            this.f26120d = this.f26117a.getHeight();
        } else {
            this.f26119c = 0;
            this.f26120d = 0;
        }
        this.f26118b = new Paint();
        this.f26118b.setDither(true);
        this.f26118b.setFilterBitmap(true);
    }

    public void draw(Canvas canvas) {
        if (this.f26117a != null && !this.f26117a.isRecycled()) {
            canvas.drawBitmap(this.f26117a, 0.0f, 0.0f, this.f26118b);
        }
    }

    public void setAlpha(int i) {
        this.f26118b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f26118b.setColorFilter(colorFilter);
    }

    public int getIntrinsicWidth() {
        return this.f26119c;
    }

    public int getIntrinsicHeight() {
        return this.f26120d;
    }

    public int getMinimumWidth() {
        return this.f26119c;
    }

    public int getMinimumHeight() {
        return this.f26120d;
    }
}
