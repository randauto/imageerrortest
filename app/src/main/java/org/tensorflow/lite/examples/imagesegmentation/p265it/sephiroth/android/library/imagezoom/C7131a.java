package p265it.sephiroth.android.library.imagezoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import p265it.sephiroth.android.library.imagezoom.p267a.C7138a;
import p265it.sephiroth.android.library.p266a.C7125a;
import p265it.sephiroth.android.library.p266a.C7126b;

/* renamed from: it.sephiroth.android.library.imagezoom.a */
/* compiled from: ImageViewTouchBase */
public abstract class C7131a extends ImageView {

    /* renamed from: a */
    private float f26069a;

    /* renamed from: b */
    private float f26070b;

    /* renamed from: c */
    private boolean f26071c;

    /* renamed from: d */
    private boolean f26072d;

    /* renamed from: e */
    private int f26073e;

    /* renamed from: f */
    private int f26074f;

    /* renamed from: g */
    private PointF f26075g;

    /* renamed from: h */
    private boolean f26076h;

    /* renamed from: i */
    private boolean f26077i;

    /* renamed from: j */
    private C7136b f26078j;

    /* renamed from: k */
    protected C7126b f26079k;

    /* renamed from: l */
    protected Matrix f26080l;

    /* renamed from: m */
    protected Matrix f26081m;

    /* renamed from: n */
    protected Matrix f26082n;

    /* renamed from: o */
    protected Handler f26083o;

    /* renamed from: p */
    protected Runnable f26084p;

    /* renamed from: q */
    protected boolean f26085q;

    /* renamed from: r */
    protected final Matrix f26086r;

    /* renamed from: s */
    protected final float[] f26087s;

    /* renamed from: t */
    protected C7135a f26088t;

    /* renamed from: u */
    protected final int f26089u;

    /* renamed from: v */
    protected RectF f26090v;

    /* renamed from: w */
    protected RectF f26091w;

    /* renamed from: x */
    protected RectF f26092x;

    /* renamed from: y */
    private C7137c f26093y;

    /* renamed from: it.sephiroth.android.library.imagezoom.a$a */
    /* compiled from: ImageViewTouchBase */
    public enum C7135a {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.a$b */
    /* compiled from: ImageViewTouchBase */
    public interface C7136b {
        /* renamed from: a */
        void mo23002a(Drawable drawable);
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.a$c */
    /* compiled from: ImageViewTouchBase */
    public interface C7137c {
        /* renamed from: a */
        void mo23003a(boolean z, int i, int i2, int i3, int i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22921a(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22974c(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo22976d() {
    }

    @SuppressLint({"Override"})
    public float getRotation() {
        return 0.0f;
    }

    public C7131a(Context context) {
        this(context, null);
    }

    public C7131a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7131a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26079k = new C7125a();
        this.f26080l = new Matrix();
        this.f26081m = new Matrix();
        this.f26083o = new Handler();
        this.f26084p = null;
        this.f26085q = false;
        this.f26069a = -1.0f;
        this.f26070b = -1.0f;
        this.f26086r = new Matrix();
        this.f26087s = new float[9];
        this.f26073e = -1;
        this.f26074f = -1;
        this.f26075g = new PointF();
        this.f26088t = C7135a.NONE;
        this.f26089u = 200;
        this.f26090v = new RectF();
        this.f26091w = new RectF();
        this.f26092x = new RectF();
        mo22922a(context, attributeSet, i);
    }

    public void setOnDrawableChangedListener(C7136b bVar) {
        this.f26078j = bVar;
    }

    public void setOnLayoutChangeListener(C7137c cVar) {
        this.f26093y = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22922a(Context context, AttributeSet attributeSet, int i) {
        setScaleType(ScaleType.MATRIX);
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType == ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("ImageViewTouchBase", "Unsupported scaletype. Only MATRIX can be used");
        }
    }

    public void setDisplayType(C7135a aVar) {
        if (aVar != this.f26088t) {
            this.f26085q = false;
            this.f26088t = aVar;
            this.f26076h = true;
            requestLayout();
        }
    }

    public C7135a getDisplayType() {
        return this.f26088t;
    }

    /* access modifiers changed from: protected */
    public void setMinScale(float f) {
        this.f26070b = f;
    }

    /* access modifiers changed from: protected */
    public void setMaxScale(float f) {
        this.f26069a = f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f;
        float a;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i11 = this.f26073e;
            int i12 = this.f26074f;
            this.f26073e = i9 - i7;
            this.f26074f = i10 - i8;
            i6 = this.f26073e - i11;
            i5 = this.f26074f - i12;
            this.f26075g.x = ((float) this.f26073e) / 2.0f;
            this.f26075g.y = ((float) this.f26074f) / 2.0f;
        } else {
            i6 = 0;
            i5 = 0;
        }
        Runnable runnable = this.f26084p;
        if (runnable != null) {
            this.f26084p = null;
            runnable.run();
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            if (this.f26077i) {
                mo22961a(drawable);
            }
            if (z || this.f26077i || this.f26076h) {
                mo22969b(i7, i8, i9, i10);
            }
            if (this.f26077i) {
                this.f26077i = false;
            }
            if (this.f26076h) {
                this.f26076h = false;
            }
        } else if (z || this.f26076h || this.f26077i) {
            mo22950a(this.f26088t);
            float c = mo22973c(this.f26080l);
            float scale = getScale();
            float min = Math.min(1.0f, 1.0f / c);
            mo22962a(drawable, this.f26080l);
            float c2 = mo22973c(this.f26080l);
            if (this.f26077i || this.f26076h) {
                if (this.f26082n != null) {
                    this.f26081m.set(this.f26082n);
                    this.f26082n = null;
                    a = getScale();
                } else {
                    this.f26081m.reset();
                    a = mo22950a(this.f26088t);
                }
                f = a;
                setImageMatrix(getImageViewMatrix());
                if (f != getScale()) {
                    mo22966b(f);
                }
            } else if (z) {
                if (!this.f26072d) {
                    this.f26070b = -1.0f;
                }
                if (!this.f26071c) {
                    this.f26069a = -1.0f;
                }
                setImageMatrix(getImageViewMatrix());
                mo22967b((float) (-i6), (float) (-i5));
                if (!this.f26085q) {
                    f = mo22950a(this.f26088t);
                    mo22966b(f);
                } else {
                    f = ((double) Math.abs(scale - min)) > 0.001d ? (c / c2) * scale : 1.0f;
                    mo22966b(f);
                }
            } else {
                f = 1.0f;
            }
            this.f26085q = false;
            if (f > getMaxScale() || f < getMinScale()) {
                mo22966b(f);
            }
            mo22963a(true, true);
            if (this.f26077i) {
                mo22961a(drawable);
            }
            if (z || this.f26077i || this.f26076h) {
                mo22969b(i7, i8, i9, i10);
            }
            if (this.f26076h) {
                this.f26076h = false;
            }
            if (this.f26077i) {
                this.f26077i = false;
            }
        }
    }

    /* renamed from: a */
    public void mo22953a() {
        this.f26081m = new Matrix();
        float a = mo22950a(this.f26088t);
        setImageMatrix(getImageViewMatrix());
        if (a != getScale()) {
            mo22966b(a);
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo22950a(C7135a aVar) {
        if (aVar == C7135a.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (aVar == C7135a.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / mo22973c(this.f26080l));
        }
        return 1.0f / mo22973c(this.f26080l);
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    public void setImageBitmap(Bitmap bitmap) {
        mo22959a(bitmap, (Matrix) null, -1.0f, -1.0f);
    }

    /* renamed from: a */
    public void mo22959a(Bitmap bitmap, Matrix matrix, float f, float f2) {
        if (bitmap != null) {
            mo22971b((Drawable) new C7138a(bitmap), matrix, f, f2);
        } else {
            mo22971b((Drawable) null, matrix, f, f2);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        mo22971b(drawable, (Matrix) null, -1.0f, -1.0f);
    }

    /* renamed from: b */
    public void mo22971b(Drawable drawable, Matrix matrix, float f, float f2) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final Matrix matrix2 = matrix;
            final float f3 = f;
            final float f4 = f2;
            C71321 r1 = new Runnable() {
                public void run() {
                    C7131a.this.mo22971b(drawable2, matrix2, f3, f4);
                }
            };
            this.f26084p = r1;
            return;
        }
        mo22923a(drawable, matrix, f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22923a(Drawable drawable, Matrix matrix, float f, float f2) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.f26080l.reset();
            super.setImageDrawable(null);
        }
        if (f == -1.0f || f2 == -1.0f) {
            this.f26070b = -1.0f;
            this.f26069a = -1.0f;
            this.f26072d = false;
            this.f26071c = false;
        } else {
            float min = Math.min(f, f2);
            float max = Math.max(min, f2);
            this.f26070b = min;
            this.f26069a = max;
            this.f26072d = true;
            this.f26071c = true;
            if (this.f26088t == C7135a.FIT_TO_SCREEN || this.f26088t == C7135a.FIT_IF_BIGGER) {
                if (this.f26070b >= 1.0f) {
                    this.f26072d = false;
                    this.f26070b = -1.0f;
                }
                if (this.f26069a <= 1.0f) {
                    this.f26071c = true;
                    this.f26069a = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.f26082n = new Matrix(matrix);
        }
        this.f26077i = true;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22961a(Drawable drawable) {
        mo22970b(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22958a(int i, int i2, int i3, int i4) {
        if (this.f26093y != null) {
            this.f26093y.mo23003a(true, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22970b(Drawable drawable) {
        if (this.f26078j != null) {
            this.f26078j.mo23002a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22969b(int i, int i2, int i3, int i4) {
        mo22958a(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo22964b() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        return Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f26073e), ((float) drawable.getIntrinsicHeight()) / ((float) this.f26074f)) * 8.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo22972c() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        return Math.min(1.0f, 1.0f / mo22973c(this.f26080l));
    }

    public float getMaxScale() {
        if (this.f26069a == -1.0f) {
            this.f26069a = mo22964b();
        }
        return this.f26069a;
    }

    public float getMinScale() {
        if (this.f26070b == -1.0f) {
            this.f26070b = mo22972c();
        }
        return this.f26070b;
    }

    public Matrix getImageViewMatrix() {
        return mo22951a(this.f26081m);
    }

    /* renamed from: a */
    public Matrix mo22951a(Matrix matrix) {
        this.f26086r.set(this.f26080l);
        this.f26086r.postConcat(matrix);
        return this.f26086r;
    }

    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        boolean z = (matrix == null && !imageMatrix.isIdentity()) || (matrix != null && !imageMatrix.equals(matrix));
        super.setImageMatrix(matrix);
        if (z) {
            mo22976d();
        }
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f26081m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22962a(Drawable drawable, Matrix matrix) {
        float f = (float) this.f26073e;
        float f2 = (float) this.f26074f;
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        if (intrinsicWidth > f || intrinsicHeight > f2) {
            float min = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
            matrix.postScale(min, min);
            matrix.postTranslate((f - (intrinsicWidth * min)) / 2.0f, (f2 - (intrinsicHeight * min)) / 2.0f);
            return;
        }
        float min2 = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
        matrix.postScale(min2, min2);
        matrix.postTranslate((f - (intrinsicWidth * min2)) / 2.0f, (f2 - (intrinsicHeight * min2)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo22949a(Matrix matrix, int i) {
        matrix.getValues(this.f26087s);
        return this.f26087s[i];
    }

    public RectF getBitmapRect() {
        return mo22965b(this.f26081m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RectF mo22965b(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix a = mo22951a(matrix);
        this.f26090v.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        a.mapRect(this.f26090v);
        return this.f26090v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo22973c(Matrix matrix) {
        return mo22949a(matrix, 0);
    }

    public float getScale() {
        return mo22973c(this.f26081m);
    }

    public float getBaseScale() {
        return mo22973c(this.f26080l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22963a(boolean z, boolean z2) {
        if (getDrawable() != null) {
            RectF a = mo22952a(this.f26081m, z, z2);
            if (!(a.left == 0.0f && a.top == 0.0f)) {
                mo22967b(a.left, a.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.RectF mo22952a(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L_0x000d:
            android.graphics.RectF r0 = r5.f26091w
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.mo22965b(r6)
            float r0 = r6.height()
            float r2 = r6.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x0046
            int r8 = r5.f26074f
            float r8 = (float) r8
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r6.top
            float r8 = r8 - r0
            goto L_0x0047
        L_0x002f:
            float r0 = r6.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            float r8 = r6.top
            float r8 = -r8
            goto L_0x0047
        L_0x0039:
            float r0 = r6.bottom
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0046
            int r8 = r5.f26074f
            float r8 = (float) r8
            float r0 = r6.bottom
            float r8 = r8 - r0
            goto L_0x0047
        L_0x0046:
            r8 = 0
        L_0x0047:
            if (r7 == 0) goto L_0x006c
            int r7 = r5.f26073e
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r6 = r6.left
            float r6 = r7 - r6
            goto L_0x006d
        L_0x0057:
            float r0 = r6.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            float r6 = r6.left
            float r6 = -r6
            goto L_0x006d
        L_0x0061:
            float r0 = r6.right
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            float r6 = r6.right
            float r6 = r7 - r6
            goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            android.graphics.RectF r7 = r5.f26091w
            r7.set(r6, r8, r1, r1)
            android.graphics.RectF r6 = r5.f26091w
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p265it.sephiroth.android.library.imagezoom.C7131a.mo22952a(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22967b(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f26081m.postTranslate(f, f2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22956a(float f, float f2, float f3) {
        this.f26081m.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    /* access modifiers changed from: protected */
    public PointF getCenter() {
        return this.f26075g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22966b(float f) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        if (f < getMinScale()) {
            f = getMinScale();
        }
        PointF center = getCenter();
        mo22968b(f, center.x, center.y);
    }

    /* renamed from: c */
    public void mo22975c(float f, float f2) {
        PointF center = getCenter();
        mo22957a(f, center.x, center.y, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22968b(float f, float f2, float f3) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        mo22956a(f / getScale(), f2, f3);
        mo22974c(getScale());
        mo22963a(true, true);
    }

    /* renamed from: d */
    public void mo22977d(float f, float f2) {
        mo22954a((double) f, (double) f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22954a(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f26092x.set((float) d, (float) d2, 0.0f, 0.0f);
        mo22960a(bitmapRect, this.f26092x);
        mo22967b(this.f26092x.left, this.f26092x.top);
        mo22963a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22960a(RectF rectF, RectF rectF2) {
        if (rectF != null) {
            if (rectF.top >= 0.0f && rectF.bottom <= ((float) this.f26074f)) {
                rectF2.top = 0.0f;
            }
            if (rectF.left >= 0.0f && rectF.right <= ((float) this.f26073e)) {
                rectF2.left = 0.0f;
            }
            if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > ((float) this.f26074f)) {
                rectF2.top = (float) ((int) (0.0f - rectF.top));
            }
            if (rectF.bottom + rectF2.top <= ((float) (this.f26074f + 0)) && rectF.top < 0.0f) {
                rectF2.top = (float) ((int) (((float) (this.f26074f + 0)) - rectF.bottom));
            }
            if (rectF.left + rectF2.left >= 0.0f) {
                rectF2.left = (float) ((int) (0.0f - rectF.left));
            }
            if (rectF.right + rectF2.left <= ((float) (this.f26073e + 0))) {
                rectF2.left = (float) ((int) (((float) (this.f26073e + 0)) - rectF.right));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22955a(float f, float f2, double d) {
        final double d2 = (double) f;
        final double d3 = (double) f2;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f26083o;
        final double d4 = d;
        C71332 r0 = new Runnable() {

            /* renamed from: a */
            double f26099a = 0.0d;

            /* renamed from: b */
            double f26100b = 0.0d;

            public void run() {
                double min = Math.min(d4, (double) (System.currentTimeMillis() - currentTimeMillis));
                double d = min;
                double a = C7131a.this.f26079k.mo22918a(d, 0.0d, d2, d4);
                double a2 = C7131a.this.f26079k.mo22918a(d, 0.0d, d3, d4);
                C7131a.this.mo22954a(a - this.f26099a, a2 - this.f26100b);
                this.f26099a = a;
                this.f26100b = a2;
                if (min < d4) {
                    C7131a.this.f26083o.post(this);
                    return;
                }
                RectF a3 = C7131a.this.mo22952a(C7131a.this.f26081m, true, true);
                if (a3.left != 0.0f || a3.top != 0.0f) {
                    C7131a.this.mo22977d(a3.left, a3.top);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22957a(float f, float f2, float f3, float f4) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f5 = f - scale;
        Matrix matrix = new Matrix(this.f26081m);
        matrix.postScale(f, f, f2, f3);
        RectF a = mo22952a(matrix, true, true);
        final float f6 = f2 + (a.left * f);
        final float f7 = f3 + (a.top * f);
        Handler handler = this.f26083o;
        final float f8 = f4;
        C71343 r0 = new Runnable() {
            public void run() {
                float min = Math.min(f8, (float) (System.currentTimeMillis() - currentTimeMillis));
                C7131a.this.mo22968b(scale + ((float) C7131a.this.f26079k.mo22919b((double) min, 0.0d, (double) f5, (double) f8)), f6, f7);
                if (min < f8) {
                    C7131a.this.f26083o.post(this);
                    return;
                }
                C7131a.this.mo22921a(C7131a.this.getScale());
                C7131a.this.mo22963a(true, true);
            }
        };
        handler.post(r0);
    }
}
