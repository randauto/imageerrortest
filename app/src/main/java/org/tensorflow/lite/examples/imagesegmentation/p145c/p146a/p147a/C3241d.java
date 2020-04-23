package p145c.p146a.p147a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.p064v7.widget.AppCompatImageView;

/* renamed from: c.a.a.d */
/* compiled from: FancyImageView */
class C3241d extends AppCompatImageView {

    /* renamed from: a */
    private Bitmap f8676a;

    /* renamed from: b */
    private Paint f8677b;

    /* renamed from: c */
    private Paint f8678c;

    /* renamed from: d */
    private Paint f8679d;

    /* renamed from: e */
    private int f8680e = 0;

    /* renamed from: f */
    private int f8681f = 0;

    /* renamed from: g */
    private int f8682g;

    /* renamed from: h */
    private int f8683h = 20;

    /* renamed from: i */
    private C3239b f8684i;

    /* renamed from: j */
    private int f8685j;

    /* renamed from: k */
    private int f8686k = 1;

    /* renamed from: l */
    private double f8687l = 1.0d;

    /* renamed from: m */
    private boolean f8688m = true;

    /* renamed from: n */
    private Path f8689n;

    /* renamed from: o */
    private RectF f8690o;

    /* renamed from: p */
    private int f8691p;

    /* renamed from: q */
    private int f8692q;

    public C3241d(Context context) {
        super(context);
        m14868a();
    }

    /* renamed from: a */
    private void m14868a() {
        if (VERSION.SDK_INT >= 11) {
            setLayerType(2, null);
        }
        setWillNotDraw(false);
        setBackgroundColor(0);
        this.f8677b = new Paint();
        this.f8677b.setAntiAlias(true);
        this.f8677b.setColor(this.f8680e);
        this.f8677b.setAlpha(255);
        this.f8678c = new Paint();
        this.f8678c.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f8678c.setAlpha(255);
        this.f8678c.setAntiAlias(true);
        this.f8689n = new Path();
        this.f8679d = new Paint();
        this.f8679d.setAntiAlias(true);
        this.f8679d.setColor(this.f8681f);
        this.f8679d.setStrokeWidth((float) this.f8682g);
        this.f8679d.setStyle(Style.STROKE);
        this.f8690o = new RectF();
    }

    /* renamed from: a */
    public void mo10430a(int i, C3239b bVar) {
        this.f8680e = i;
        this.f8687l = 1.0d;
        this.f8684i = bVar;
    }

    /* renamed from: a */
    public void mo10429a(int i, int i2) {
        this.f8682g = i2;
        this.f8679d.setColor(i);
        this.f8679d.setStrokeWidth((float) i2);
    }

    /* renamed from: a */
    public void mo10428a(int i) {
        this.f8683h = i;
    }

    /* renamed from: a */
    public void mo10431a(boolean z) {
        this.f8688m = z;
        this.f8685j = this.f8688m ? 20 : 0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8676a == null) {
            this.f8676a = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
            this.f8676a.eraseColor(this.f8680e);
        }
        canvas.drawBitmap(this.f8676a, 0.0f, 0.0f, this.f8677b);
        if (this.f8684i.mo10425f()) {
            if (this.f8684i.mo10414a().equals(C3255g.CIRCLE)) {
                m14869a(canvas);
            } else {
                m14870b(canvas);
            }
            if (this.f8688m) {
                if (this.f8685j == this.f8691p) {
                    this.f8686k = this.f8692q * -1;
                } else if (this.f8685j == 0) {
                    this.f8686k = this.f8692q;
                }
                this.f8685j += this.f8686k;
                postInvalidate();
            }
        }
    }

    /* renamed from: a */
    private void m14869a(Canvas canvas) {
        canvas.drawCircle((float) this.f8684i.mo10422d(), (float) this.f8684i.mo10424e(), this.f8684i.mo10413a(this.f8685j, this.f8687l), this.f8678c);
        if (this.f8682g > 0) {
            this.f8689n.reset();
            this.f8689n.moveTo((float) this.f8684i.mo10422d(), (float) this.f8684i.mo10424e());
            this.f8689n.addCircle((float) this.f8684i.mo10422d(), (float) this.f8684i.mo10424e(), this.f8684i.mo10413a(this.f8685j, this.f8687l), Direction.CW);
            canvas.drawPath(this.f8689n, this.f8679d);
        }
    }

    /* renamed from: b */
    private void m14870b(Canvas canvas) {
        this.f8690o.set(this.f8684i.mo10417b(this.f8685j, this.f8687l), this.f8684i.mo10419c(this.f8685j, this.f8687l), this.f8684i.mo10421d(this.f8685j, this.f8687l), this.f8684i.mo10423e(this.f8685j, this.f8687l));
        canvas.drawRoundRect(this.f8690o, (float) this.f8683h, (float) this.f8683h, this.f8678c);
        if (this.f8682g > 0) {
            this.f8689n.reset();
            this.f8689n.moveTo((float) this.f8684i.mo10422d(), (float) this.f8684i.mo10424e());
            this.f8689n.addRoundRect(this.f8690o, (float) this.f8683h, (float) this.f8683h, Direction.CW);
            canvas.drawPath(this.f8689n, this.f8679d);
        }
    }

    /* renamed from: b */
    public void mo10432b(int i, int i2) {
        this.f8691p = i;
        this.f8692q = i2;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8676a != null && !this.f8676a.isRecycled()) {
            this.f8676a.recycle();
            this.f8676a = null;
        }
    }
}
