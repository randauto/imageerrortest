package p256e.p257a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Environment;
import android.view.SurfaceHolder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import p256e.p258b.C6977a;
import p256e.p259c.C6982a;
import p256e.p259c.C6987b;
import p256e.p259c.C6989c;
import p256e.p259c.C6992d;
import p256e.p259c.C6994f;
import p256e.p259c.C6997i;

/* renamed from: e.a.a */
/* compiled from: PGraphicsAndroid2D */
public class C6974a extends C6989c {

    /* renamed from: a */
    public static boolean f24466a = true;

    /* renamed from: s */
    static int[] f24467s = new int[1];

    /* renamed from: b */
    public Canvas f24468b;

    /* renamed from: c */
    boolean f24469c;

    /* renamed from: d */
    protected float[][] f24470d = ((float[][]) Array.newInstance(float.class, new int[]{32, 6}));

    /* renamed from: e */
    public C6994f f24471e = new C6994f();

    /* renamed from: f */
    protected Matrix f24472f = new Matrix();

    /* renamed from: g */
    protected float[] f24473g = new float[9];

    /* renamed from: h */
    int f24474h;

    /* renamed from: i */
    Path f24475i = new Path();

    /* renamed from: j */
    RectF f24476j = new RectF();

    /* renamed from: k */
    Paint f24477k = new Paint();

    /* renamed from: l */
    Paint f24478l;

    /* renamed from: m */
    Paint f24479m;

    /* renamed from: n */
    protected boolean f24480n;

    /* renamed from: o */
    protected boolean f24481o;

    /* renamed from: p */
    Rect f24482p;

    /* renamed from: q */
    RectF f24483q;

    /* renamed from: r */
    float[] f24484r;

    /* renamed from: c */
    public void mo21730c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo21733d(int i) {
        return i == 4;
    }

    public C6974a() {
        this.f24477k.setStyle(Style.FILL);
        this.f24478l = new Paint();
        this.f24478l.setStyle(Style.STROKE);
        this.f24479m = new Paint(2);
    }

    /* renamed from: a */
    public void mo21706a() {
        this.f24481o = true;
    }

    /* renamed from: a */
    public void mo21715a(int i, int i2) {
        this.f24480n = (i == this.f24750ce && i2 == this.f24751cf) ? false : true;
        super.mo21715a(i, i2);
    }

    /* renamed from: b */
    public void mo21723b() {
        if (this.f24756ck != null) {
            this.f24756ck.recycle();
        }
    }

    /* renamed from: a */
    public C6997i mo21705a(C6977a aVar, SurfaceHolder surfaceHolder, boolean z) {
        return new C6975b(this, aVar, surfaceHolder);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public Canvas mo21728c() {
        if ((this.f24468b == null || this.f24480n) && (f24466a || !this.f24733x)) {
            if (this.f24756ck == null || this.f24756ck.getWidth() * this.f24756ck.getHeight() < this.f24750ce * this.f24751cf || VERSION.SDK_INT < 19) {
                if (this.f24756ck != null) {
                    this.f24756ck.recycle();
                }
                this.f24756ck = Bitmap.createBitmap(this.f24750ce, this.f24751cf, Config.ARGB_8888);
            } else {
                this.f24756ck.reconfigure(this.f24750ce, this.f24751cf, this.f24756ck.getConfig());
            }
            this.f24468b = new Canvas(this.f24756ck);
            this.f24480n = false;
        }
        mo21751t();
        return this.f24468b;
    }

    /* renamed from: d */
    public void mo21731d() {
        this.f24468b = mo21728c();
        mo22006w();
        mo21740i();
        this.f24718bp = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.unlockCanvasAndPost(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[SYNTHETIC, Splitter:B:26:0x0041] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21734e() {
        /*
            r6 = this;
            android.graphics.Bitmap r0 = r6.f24756ck
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r6.f24733x
            if (r0 == 0) goto L_0x0045
            e.c.a r0 = r6.f24755cj
            e.c.i r0 = r0.mo21845d()
            android.view.SurfaceHolder r0 = r0.mo22065f()
            if (r0 == 0) goto L_0x0048
            r1 = 0
            android.graphics.Canvas r2 = r0.lockCanvas(r1)     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            if (r2 == 0) goto L_0x0029
            android.graphics.Bitmap r3 = r6.f24756ck     // Catch:{ Exception -> 0x0027 }
            android.graphics.Matrix r4 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0027 }
            r4.<init>()     // Catch:{ Exception -> 0x0027 }
            r2.drawBitmap(r3, r4, r1)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0029
        L_0x0027:
            r1 = move-exception
            goto L_0x0038
        L_0x0029:
            if (r2 == 0) goto L_0x0048
        L_0x002b:
            r0.unlockCanvasAndPost(r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0048 }
            goto L_0x0048
        L_0x002f:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x003f
        L_0x0034:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0038:
            r1.printStackTrace()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0048
            goto L_0x002b
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r0.unlockCanvasAndPost(r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0044 }
        L_0x0044:
            throw r1
        L_0x0045:
            r6.mo21747p()
        L_0x0048:
            r6.mo22023ah()
            super.mo21748q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p257a.C6974a.mo21734e():void");
    }

    /* renamed from: a */
    public void mo21714a(int i) {
        this.f24716bn = i;
        this.f24718bp = 0;
        this.f24681bC = 0;
    }

    /* renamed from: a */
    public void mo21718a(C6992d dVar) {
        m36561c("texture");
    }

    /* renamed from: a */
    public void mo21708a(float f, float f2) {
        float f3 = f;
        float f4 = f2;
        if (this.f24716bn != 20) {
            this.f24681bC = 0;
            if (this.f24718bp == this.f24717bo.length) {
                float[][] fArr = (float[][]) Array.newInstance(float.class, new int[]{this.f24718bp << 1, 37});
                System.arraycopy(this.f24717bo, 0, fArr, 0, this.f24718bp);
                this.f24717bo = fArr;
            }
            this.f24717bo[this.f24718bp][0] = f3;
            this.f24717bo[this.f24718bp][1] = f4;
            this.f24718bp++;
            int i = this.f24716bn;
            if (i == 3) {
                return;
            }
            if (i != 5) {
                switch (i) {
                    case 9:
                        if (this.f24718bp % 3 == 0) {
                            mo21712a(this.f24717bo[this.f24718bp - 3][0], this.f24717bo[this.f24718bp - 3][1], this.f24717bo[this.f24718bp - 2][0], this.f24717bo[this.f24718bp - 2][1], f, f2);
                            this.f24718bp = 0;
                            return;
                        }
                        return;
                    case 10:
                        if (this.f24718bp >= 3) {
                            mo21712a(this.f24717bo[this.f24718bp - 2][0], this.f24717bo[this.f24718bp - 2][1], f, f2, this.f24717bo[this.f24718bp - 3][0], this.f24717bo[this.f24718bp - 3][1]);
                            return;
                        }
                        return;
                    case 11:
                        if (this.f24718bp >= 3) {
                            mo21712a(this.f24717bo[0][0], this.f24717bo[0][1], this.f24717bo[this.f24718bp - 2][0], this.f24717bo[this.f24718bp - 2][1], f, f2);
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 16:
                            case 17:
                                if (this.f24718bp % 4 == 0) {
                                    mo21713a(this.f24717bo[this.f24718bp - 4][0], this.f24717bo[this.f24718bp - 4][1], this.f24717bo[this.f24718bp - 3][0], this.f24717bo[this.f24718bp - 3][1], this.f24717bo[this.f24718bp - 2][0], this.f24717bo[this.f24718bp - 2][1], f, f2);
                                    this.f24718bp = 0;
                                    return;
                                }
                                return;
                            case 18:
                                if (this.f24718bp >= 4 && this.f24718bp % 2 == 0) {
                                    mo21713a(this.f24717bo[this.f24718bp - 4][0], this.f24717bo[this.f24718bp - 4][1], this.f24717bo[this.f24718bp - 2][0], this.f24717bo[this.f24718bp - 2][1], f, f2, this.f24717bo[this.f24718bp - 3][0], this.f24717bo[this.f24718bp - 3][1]);
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 50:
                                    case 51:
                                        if (this.f24718bp >= 2) {
                                            mo21725b(this.f24717bo[this.f24718bp - 2][0], this.f24717bo[this.f24718bp - 2][1], f, f4);
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
            } else if (this.f24718bp % 2 == 0) {
                mo21725b(this.f24717bo[this.f24718bp - 2][0], this.f24717bo[this.f24718bp - 2][1], f, f4);
                this.f24718bp = 0;
            }
        } else if (this.f24718bp == 0) {
            this.f24475i.reset();
            this.f24475i.moveTo(f, f4);
            this.f24718bp = 1;
        } else if (this.f24469c) {
            this.f24475i.moveTo(f, f4);
            this.f24469c = false;
        } else {
            this.f24475i.lineTo(f, f4);
        }
    }

    /* renamed from: a */
    public void mo21709a(float f, float f2, float f3) {
        m36560b("vertex");
    }

    /* renamed from: a */
    public void mo21710a(float f, float f2, float f3, float f4) {
        m36562d("vertex(x, y, u, v)");
    }

    /* renamed from: a */
    public void mo21711a(float f, float f2, float f3, float f4, float f5) {
        m36560b("vertex");
    }

    /* renamed from: b */
    public void mo21726b(int i) {
        if (this.f24716bn == 3 && this.f24656ad && this.f24718bp > 0) {
            Matrix j = mo21741j();
            if (this.f24667ao != 1.0f || !j.isIdentity()) {
                float f = this.f24667ao / 2.0f;
                this.f24478l.setStyle(Style.FILL);
                for (int i2 = 0; i2 < this.f24718bp; i2++) {
                    float f2 = this.f24717bo[i2][0];
                    float f3 = this.f24717bo[i2][1];
                    this.f24476j.set(f2 - f, f3 - f, f2 + f, f3 + f);
                    this.f24468b.drawOval(this.f24476j, this.f24478l);
                }
                this.f24478l.setStyle(Style.STROKE);
            } else {
                if (this.f24484r == null) {
                    this.f24484r = new float[2];
                }
                for (int i3 = 0; i3 < this.f24718bp; i3++) {
                    this.f24484r[0] = this.f24717bo[i3][0];
                    this.f24484r[1] = this.f24717bo[i3][1];
                    j.mapPoints(this.f24484r);
                    mo21716a(C6982a.m36425g(this.f24484r[0]), C6982a.m36425g(this.f24484r[1]), this.f24657ae);
                    float f4 = this.f24717bo[i3][0];
                    float f5 = this.f24717bo[i3][1];
                    mo21716a(C6982a.m36425g(mo21721b(f4, f5)), C6982a.m36425g(mo21727c(f4, f5)), this.f24657ae);
                }
            }
        } else if (this.f24716bn == 20) {
            if (!this.f24475i.isEmpty()) {
                if (i == 2) {
                    this.f24475i.close();
                }
                mo21736f();
            }
        } else if (this.f24716bn == 51 && this.f24718bp >= 2) {
            mo21725b(this.f24717bo[this.f24718bp - 1][0], this.f24717bo[this.f24718bp - 1][1], this.f24717bo[0][0], this.f24717bo[0][1]);
        }
        this.f24716bn = 0;
    }

    /* renamed from: b */
    public void mo21725b(float f, float f2, float f3, float f4) {
        if (this.f24656ad) {
            this.f24468b.drawLine(f, f2, f3, f4, this.f24478l);
        }
    }

    /* renamed from: a */
    public void mo21712a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f24475i.reset();
        this.f24475i.moveTo(f, f2);
        this.f24475i.lineTo(f3, f4);
        this.f24475i.lineTo(f5, f6);
        this.f24475i.close();
        mo21736f();
    }

    /* renamed from: a */
    public void mo21713a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f24475i.reset();
        this.f24475i.moveTo(f, f2);
        this.f24475i.lineTo(f3, f4);
        this.f24475i.lineTo(f5, f6);
        this.f24475i.lineTo(f7, f8);
        this.f24475i.close();
        mo21736f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21729c(float f, float f2, float f3, float f4) {
        if (this.f24619S) {
            this.f24468b.drawRect(f, f2, f3, f4, this.f24477k);
        }
        if (this.f24656ad) {
            this.f24468b.drawRect(f, f2, f3, f4, this.f24478l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21732d(float f, float f2, float f3, float f4) {
        this.f24476j.set(f, f2, f3 + f, f4 + f2);
        if (this.f24619S) {
            this.f24468b.drawOval(this.f24476j, this.f24477k);
        }
        if (this.f24656ad) {
            this.f24468b.drawOval(this.f24476j, this.f24478l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo21736f() {
        if (this.f24619S) {
            this.f24468b.drawPath(this.f24475i, this.f24477k);
        }
        if (this.f24656ad) {
            this.f24468b.drawPath(this.f24475i, this.f24478l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21719a(C6992d dVar, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4) {
        C6992d dVar2 = dVar;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        Bitmap bitmap = (Bitmap) dVar.mo22021af();
        if (bitmap != null && bitmap.isRecycled()) {
            bitmap = null;
        }
        if (bitmap == null && dVar2.f24748cc == 4) {
            bitmap = Bitmap.createBitmap(dVar2.f24750ce, dVar2.f24751cf, Config.ARGB_8888);
            int[] iArr = new int[dVar2.f24749cd.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                iArr[i9] = (dVar2.f24749cd[i9] << 24) | 16777215;
            }
            bitmap.setPixels(iArr, 0, dVar2.f24750ce, 0, 0, dVar2.f24750ce, dVar2.f24751cf);
            this.f24757cl = false;
            dVar2.mo22019a((Object) bitmap);
        }
        if (!(bitmap != null && dVar2.f24750ce == bitmap.getWidth() && dVar2.f24751cf == bitmap.getHeight())) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmap = Bitmap.createBitmap(dVar2.f24750ce, dVar2.f24751cf, Config.ARGB_8888);
            this.f24757cl = true;
            dVar2.mo22019a((Object) bitmap);
        }
        if (dVar.mo22022ag()) {
            if (!bitmap.isMutable()) {
                bitmap.recycle();
                bitmap = Bitmap.createBitmap(dVar2.f24750ce, dVar2.f24751cf, Config.ARGB_8888);
                dVar2.mo22019a((Object) bitmap);
            }
            if (dVar2.f24749cd != null) {
                bitmap.setPixels(dVar2.f24749cd, 0, dVar2.f24750ce, 0, 0, dVar2.f24750ce, dVar2.f24751cf);
            }
            dVar2.mo22031b(false);
        }
        if (this.f24482p == null) {
            this.f24482p = new Rect(i5, i6, i7, i8);
            this.f24483q = new RectF(f5, f6, f7, f8);
        } else {
            this.f24482p.set(i5, i6, i7, i8);
            this.f24483q.set(f5, f6, f7, f8);
        }
        this.f24468b.drawBitmap(bitmap, this.f24482p, this.f24483q, this.f24608H ? this.f24479m : null);
        MemoryInfo memoryInfo = new MemoryInfo();
        Activity c = this.f24755cj.mo21845d().mo22062c();
        if (c != null) {
            ((ActivityManager) c.getSystemService("activity")).getMemoryInfo(memoryInfo);
            if (memoryInfo.lowMemory) {
                bitmap.recycle();
                dVar2.mo22019a((Object) null);
            }
        }
    }

    /* renamed from: a */
    public void mo21717a(C6987b bVar, float f) {
        super.mo21717a(bVar, f);
        this.f24477k.setTypeface((Typeface) bVar.mo21900c());
        this.f24477k.setTextSize(f);
    }

    /* renamed from: a */
    public void mo21707a(float f) {
        if (this.f24674av == null) {
            mo21944a("textSize", f);
        }
        if (((Typeface) this.f24674av.mo21900c()) != null) {
            this.f24477k.setTextSize(f);
        }
        mo21974e(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo21704a(char[] cArr, int i, int i2) {
        if (((Typeface) this.f24674av.mo21900c()) == null) {
            return super.mo21704a(cArr, i, i2);
        }
        return this.f24477k.measureText(cArr, i, i2 - i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21720a(char[] cArr, int i, int i2, float f, float f2) {
        if (((Typeface) this.f24674av.mo21900c()) == null) {
            m36558a("Inefficient font rendering: use createFont() with a TTF/OTF instead of loadFont().");
            super.mo21720a(cArr, i, i2, f, f2);
            return;
        }
        this.f24477k.setAntiAlias(this.f24674av.mo21898b());
        this.f24468b.drawText(cArr, i, i2 - i, f, f2, this.f24477k);
        this.f24477k.setAntiAlias(this.f24729t > 0);
    }

    /* renamed from: g */
    public void mo21738g() {
        if (this.f24474h != this.f24470d.length) {
            this.f24471e.mo22036a(this.f24470d[this.f24474h]);
            this.f24474h++;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("pushMatrix() cannot use push more than ");
        sb.append(this.f24470d.length);
        sb.append(" times");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: h */
    public void mo21739h() {
        if (this.f24474h != 0) {
            this.f24474h--;
            this.f24471e.mo22037b(this.f24470d[this.f24474h]);
            mo21742k();
            this.f24468b.setMatrix(this.f24472f);
            return;
        }
        throw new RuntimeException("missing a popMatrix() to go with that pushMatrix()");
    }

    /* renamed from: i */
    public void mo21740i() {
        this.f24471e.mo22034a();
        this.f24468b.setMatrix(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Matrix mo21741j() {
        Matrix matrix = new Matrix();
        mo21742k();
        matrix.set(this.f24472f);
        return matrix;
    }

    /* renamed from: k */
    public void mo21742k() {
        this.f24473g[0] = this.f24471e.f24763a;
        this.f24473g[1] = this.f24471e.f24764b;
        this.f24473g[2] = this.f24471e.f24765c;
        this.f24473g[3] = this.f24471e.f24766d;
        this.f24473g[4] = this.f24471e.f24767e;
        this.f24473g[5] = this.f24471e.f24768f;
        this.f24473g[6] = 0.0f;
        this.f24473g[7] = 0.0f;
        this.f24473g[8] = 1.0f;
        this.f24472f.setValues(this.f24473g);
    }

    /* renamed from: b */
    public float mo21721b(float f, float f2) {
        if (this.f24484r == null) {
            this.f24484r = new float[2];
        }
        this.f24484r[0] = f;
        this.f24484r[1] = f2;
        mo21741j().mapPoints(this.f24484r);
        return this.f24484r[0];
    }

    /* renamed from: c */
    public float mo21727c(float f, float f2) {
        if (this.f24484r == null) {
            this.f24484r = new float[2];
        }
        this.f24484r[0] = f;
        this.f24484r[1] = f2;
        mo21741j().mapPoints(this.f24484r);
        return this.f24484r[1];
    }

    /* renamed from: e */
    public void mo21735e(int i) {
        super.mo21735e(i);
        if (this.f24669aq == 2) {
            this.f24478l.setStrokeCap(Cap.ROUND);
        } else if (this.f24669aq == 4) {
            this.f24478l.setStrokeCap(Cap.SQUARE);
        } else {
            this.f24478l.setStrokeCap(Cap.BUTT);
        }
    }

    /* renamed from: f */
    public void mo21737f(int i) {
        super.mo21737f(i);
        if (this.f24668ap == 8) {
            this.f24478l.setStrokeJoin(Join.MITER);
        } else if (this.f24668ap == 2) {
            this.f24478l.setStrokeJoin(Join.ROUND);
        } else {
            this.f24478l.setStrokeJoin(Join.BEVEL);
        }
    }

    /* renamed from: b */
    public void mo21724b(float f) {
        super.mo21724b(f);
        this.f24478l.setStrokeWidth(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo21743l() {
        super.mo21743l();
        this.f24478l.setColor(this.f24657ae);
        this.f24478l.setShader(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo21744m() {
        super.mo21744m();
        this.f24479m.setColorFilter(new PorterDuffColorFilter(this.f24609I, Mode.MULTIPLY));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo21745n() {
        super.mo21745n();
        this.f24477k.setColor(this.f24620T);
        this.f24477k.setShader(null);
    }

    /* renamed from: o */
    public void mo21746o() {
        this.f24468b.drawColor(this.f24644aR);
    }

    /* renamed from: p */
    public void mo21747p() {
        if (this.f24756ck != null) {
            if (this.f24749cd == null || this.f24749cd.length != this.f24750ce * this.f24751cf) {
                this.f24749cd = new int[(this.f24750ce * this.f24751cf)];
            }
            this.f24756ck.getPixels(this.f24749cd, 0, this.f24750ce, 0, 0, this.f24750ce, this.f24751cf);
            return;
        }
        throw new RuntimeException("The pixels array is not available in this renderer withouth a backing bitmap");
    }

    /* renamed from: q */
    public void mo21748q() {
        if (this.f24756ck != null) {
            this.f24756ck.setPixels(this.f24749cd, 0, this.f24750ce, 0, 0, this.f24750ce, this.f24751cf);
            return;
        }
        throw new RuntimeException("The pixels array is not available in this renderer withouth a backing bitmap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo21749r() {
        super.mo21749r();
        if (this.f24696bT != null) {
            new File(this.f24696bT).delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo21750s() {
        File file;
        super.mo21750s();
        Context e = this.f24755cj.mo21850e();
        if (e != null && this.f24756ck != null && !this.f24755cj.mo21845d().mo22053a().mo21768f()) {
            try {
                this.f24697bU = this.f24753ch;
                this.f24698bV = this.f24754ci;
                int height = this.f24756ck.getHeight() * this.f24756ck.getRowBytes();
                ByteBuffer allocate = ByteBuffer.allocate(height);
                this.f24756ck.copyPixelsToBuffer(allocate);
                if ("mounted" != Environment.getExternalStorageState()) {
                    if (Environment.isExternalStorageRemovable()) {
                        file = e.getCacheDir();
                        StringBuilder sb = new StringBuilder();
                        sb.append(file);
                        sb.append(File.separator);
                        sb.append("restore_pixels");
                        File file2 = new File(sb.toString());
                        this.f24696bT = file2.getAbsolutePath();
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        byte[] bArr = new byte[height];
                        allocate.rewind();
                        allocate.get(bArr);
                        objectOutputStream.writeObject(bArr);
                        objectOutputStream.flush();
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                    }
                }
                file = e.getExternalCacheDir();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file);
                sb2.append(File.separator);
                sb2.append("restore_pixels");
                File file22 = new File(sb2.toString());
                this.f24696bT = file22.getAbsolutePath();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file22);
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
                byte[] bArr2 = new byte[height];
                allocate.rewind();
                allocate.get(bArr2);
                objectOutputStream2.writeObject(bArr2);
                objectOutputStream2.flush();
                fileOutputStream2.getFD().sync();
                fileOutputStream2.close();
            } catch (Exception e2) {
                C6989c.m36558a("Could not save screen contents to cache");
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo21751t() {
        if (this.f24481o) {
            this.f24481o = false;
            if (this.f24696bT != null && this.f24697bU == this.f24753ch && this.f24698bV == this.f24754ci) {
                this.f24699bW = 1;
            }
        } else if (this.f24699bW > 0) {
            this.f24699bW--;
            if (this.f24699bW == 0) {
                if (this.f24755cj.mo21850e() != null) {
                    try {
                        File file = new File(this.f24696bT);
                        FileInputStream fileInputStream = new FileInputStream(file);
                        ByteBuffer wrap = ByteBuffer.wrap((byte[]) new ObjectInputStream(fileInputStream).readObject());
                        if (wrap.capacity() == this.f24756ck.getHeight() * this.f24756ck.getRowBytes()) {
                            wrap.rewind();
                            this.f24756ck.copyPixelsFromBuffer(wrap);
                        }
                        fileInputStream.close();
                        file.delete();
                    } catch (Exception e) {
                        C6989c.m36558a("Could not restore screen contents from cache");
                        e.printStackTrace();
                    } catch (Throwable th) {
                        this.f24696bT = null;
                        this.f24697bU = -1;
                        this.f24698bV = -1;
                        this.f24701bY = true;
                        throw th;
                    }
                    this.f24696bT = null;
                    this.f24697bU = -1;
                    this.f24698bV = -1;
                    this.f24701bY = true;
                } else {
                    return;
                }
            }
        }
        super.mo21751t();
    }

    /* renamed from: b */
    public int mo21722b(int i, int i2) {
        if (this.f24756ck == null || i < 0 || i2 < 0 || i >= this.f24750ce || i2 >= this.f24751cf) {
            return 0;
        }
        return this.f24756ck.getPixel(i, i2);
    }

    /* renamed from: u */
    public C6992d mo21752u() {
        return mo22029b(0, 0, this.f24750ce, this.f24751cf);
    }

    /* renamed from: a */
    public void mo21716a(int i, int i2, int i3) {
        if (this.f24756ck != null && i >= 0 && i2 >= 0 && i < this.f24750ce && i2 < this.f24751cf) {
            this.f24756ck.setPixel(i, i2, i3);
        }
    }
}
