package org.tensorflow.lite.examples.imagesegmentation.judi.com.p269b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p064v7.widget.AppCompatImageView;
import android.util.DisplayMetrics;
import android.util.Log;

import androidx.appcompat.widget.AppCompatImageView;

import judi.com.p268a.C7153c.C7155b;

/* renamed from: judi.com.b.d */
/* compiled from: ShaderView */
public class C7170d extends AppCompatImageView {

    /* renamed from: m */
    private static final String f26252m = "d";

    /* renamed from: a */
    int f26253a;

    /* renamed from: b */
    int f26254b;

    /* renamed from: c */
    private Paint f26255c;

    /* renamed from: d */
    private Bitmap f26256d;

    /* renamed from: e */
    private int f26257e;

    /* renamed from: f */
    private Context f26258f;

    /* renamed from: g */
    private boolean f26259g = false;

    /* renamed from: h */
    private boolean f26260h = false;

    /* renamed from: i */
    private boolean f26261i = false;

    /* renamed from: j */
    private int f26262j;

    /* renamed from: k */
    private Paint f26263k = null;

    /* renamed from: l */
    private Bitmap f26264l = null;

    public C7170d(Context context) {
        super(context);
        mo23088a(context);
    }

    /* renamed from: a */
    public void mo23088a(Context context) {
        this.f26258f = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f26262j = displayMetrics.widthPixels;
        this.f26253a = C7166b.m38304a(context, 150);
        this.f26254b = C7166b.m38304a(context, 75);
        this.f26256d = BitmapFactory.decodeResource(context.getResources(), C7155b.circle1);
        this.f26256d = Bitmap.createScaledBitmap(this.f26256d, this.f26253a, this.f26253a, true);
        this.f26264l = C7166b.m38308b(context, C7155b.tbg1);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f26260h && this.f26263k != null) {
            if (this.f26261i) {
                canvas.drawBitmap(this.f26264l, 0.0f, 0.0f, null);
                canvas.drawCircle((float) this.f26254b, (float) this.f26254b, (float) this.f26254b, this.f26263k);
                if (this.f26259g) {
                    canvas.drawRect((float) (this.f26254b - this.f26257e), (float) (this.f26254b - this.f26257e), (float) (this.f26254b + this.f26257e), (float) (this.f26254b + this.f26257e), this.f26255c);
                } else {
                    canvas.drawCircle((float) this.f26254b, (float) this.f26254b, (float) this.f26257e, this.f26255c);
                }
                canvas.drawBitmap(this.f26256d, 0.0f, 0.0f, null);
                return;
            }
            canvas.drawBitmap(this.f26264l, (float) (this.f26262j - this.f26253a), 0.0f, null);
            canvas.drawCircle((float) (this.f26262j - this.f26254b), (float) this.f26254b, (float) this.f26254b, this.f26263k);
            if (this.f26259g) {
                canvas.drawRect((float) ((this.f26262j - this.f26254b) - this.f26257e), (float) (this.f26254b - this.f26257e), (float) ((this.f26262j - this.f26254b) + this.f26257e), (float) (this.f26254b + this.f26257e), this.f26255c);
            } else {
                canvas.drawCircle((float) (this.f26262j - this.f26254b), (float) this.f26254b, (float) this.f26257e, this.f26255c);
            }
            canvas.drawBitmap(this.f26256d, (float) (this.f26262j - this.f26253a), 0.0f, null);
        }
    }

    /* renamed from: a */
    public void mo23089a(Paint paint, Paint paint2, int i, boolean z, boolean z2, boolean z3) {
        String str = f26252m;
        StringBuilder sb = new StringBuilder();
        sb.append("updateShaderView: ");
        sb.append(z);
        Log.d(str, sb.toString());
        this.f26260h = z;
        this.f26261i = z2;
        this.f26259g = z3;
        this.f26263k = paint;
        this.f26255c = paint2;
        this.f26257e = i;
        invalidate();
    }
}
