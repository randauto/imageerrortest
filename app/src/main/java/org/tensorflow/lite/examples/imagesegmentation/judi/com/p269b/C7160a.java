package org.tensorflow.lite.examples.imagesegmentation.judi.com.p269b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader.TileMode;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import androidx.appcompat.widget.AppCompatImageView;

import org.tensorflow.lite.examples.imagesegmentation.judi.com.p268a.C7141b;

import java.util.ArrayList;

/* renamed from: judi.com.b.a */
/* compiled from: DrawingView */
public class C7160a extends AppCompatImageView implements OnTouchListener {

    /* renamed from: d */
    public static int f26157d = 1;

    /* renamed from: e */
    public static int f26158e = 3;

    /* renamed from: f */
    public static int f26159f = 1;

    /* renamed from: g */
    public static int f26160g = 0;

    /* renamed from: h */
    public static int f26161h = 4;

    /* renamed from: i */
    public static int f26162i = 2;

    /* renamed from: j */
    public static int f26163j = 30;

    /* renamed from: A */
    Paint f26164A = new Paint();

    /* renamed from: B */
    BitmapShader f26165B;

    /* renamed from: C */
    public ProgressDialog f26166C = null;

    /* renamed from: D */
    float f26167D;

    /* renamed from: E */
    float f26168E;

    /* renamed from: F */
    float f26169F = 1.0f;

    /* renamed from: G */
    Path f26170G = new Path();

    /* renamed from: H */
    int f26171H;

    /* renamed from: I */
    private C7162a f26172I;

    /* renamed from: J */
    private ArrayList<Integer> f26173J = new ArrayList<>();

    /* renamed from: K */
    private int f26174K = 18;

    /* renamed from: L */
    private int f26175L = 18;

    /* renamed from: M */
    private ArrayList<Boolean> f26176M = new ArrayList<>();

    /* renamed from: N */
    private ArrayList<Path> f26177N = new ArrayList<>();

    /* renamed from: O */
    private int f26178O = -1;

    /* renamed from: P */
    private boolean f26179P = false;

    /* renamed from: Q */
    private boolean f26180Q = true;

    /* renamed from: R */
    private boolean f26181R = true;

    /* renamed from: S */
    private boolean f26182S = false;

    /* renamed from: T */
    private boolean f26183T = false;

    /* renamed from: U */
    private boolean f26184U = false;

    /* renamed from: V */
    private boolean f26185V = true;

    /* renamed from: W */
    private boolean f26186W = false;

    /* renamed from: a */
    Bitmap f26187a = null;

    /* renamed from: aa */
    private C7167c f26188aa;

    /* renamed from: ab */
    private ArrayList<Integer> f26189ab = new ArrayList<>();

    /* renamed from: ac */
    private int f26190ac = 200;

    /* renamed from: ad */
    private int f26191ad = 200;

    /* renamed from: ae */
    private boolean f26192ae = true;

    /* renamed from: af */
    private Bitmap f26193af;

    /* renamed from: ag */
    private int f26194ag;

    /* renamed from: ah */
    private C7170d f26195ah = null;

    /* renamed from: ai */
    private int f26196ai = 18;

    /* renamed from: aj */
    private int f26197aj = 18;

    /* renamed from: ak */
    private C7165d f26198ak;

    /* renamed from: al */
    private boolean f26199al = false;

    /* renamed from: b */
    Bitmap f26200b = null;

    /* renamed from: c */
    Bitmap f26201c = null;

    /* renamed from: k */
    float f26202k = 100.0f;

    /* renamed from: l */
    float f26203l = 100.0f;

    /* renamed from: m */
    Canvas f26204m;

    /* renamed from: n */
    Context f26205n;

    /* renamed from: o */
    Paint f26206o = new Paint();

    /* renamed from: p */
    Paint f26207p = new Paint();

    /* renamed from: q */
    int f26208q = C7166b.m38304a(getContext(), 2);

    /* renamed from: r */
    int f26209r;

    /* renamed from: s */
    boolean f26210s = false;

    /* renamed from: t */
    public boolean f26211t = true;

    /* renamed from: u */
    public boolean f26212u = true;

    /* renamed from: v */
    public boolean f26213v = true;

    /* renamed from: w */
    Path f26214w = new Path();

    /* renamed from: x */
    public float f26215x = 8.0f;

    /* renamed from: y */
    public float f26216y = 0.5f;

    /* renamed from: z */
    Paint f26217z = new Paint();

    /* renamed from: judi.com.b.a$a */
    /* compiled from: DrawingView */
    public interface C7162a {
        /* renamed from: a */
        void mo23076a(int i);

        /* renamed from: b */
        void mo23077b(int i);
    }

    /* renamed from: judi.com.b.a$b */
    /* compiled from: DrawingView */
    private class C7163b extends C7167c.C7169b {

        /* renamed from: b */
        private float f26219b;

        /* renamed from: c */
        private float f26220c;

        /* renamed from: d */
        private C7171e f26221d;

        private C7163b() {
            this.f26221d = new C7171e();
        }

        /* renamed from: a */
        public boolean mo23078a(View view, C7167c cVar) {
            C7164c cVar2 = new C7164c();
            cVar2.f26223b = C7160a.this.f26212u ? cVar.mo23086f() : 1.0f;
            float f = 0.0f;
            cVar2.f26222a = C7160a.this.f26211t ? C7171e.m38328a(this.f26221d, cVar.mo23084d()) : 0.0f;
            cVar2.f26224c = C7160a.this.f26213v ? cVar.mo23080a() - this.f26219b : 0.0f;
            if (C7160a.this.f26213v) {
                f = cVar.mo23082b() - this.f26220c;
            }
            cVar2.f26225d = f;
            cVar2.f26228g = this.f26219b;
            cVar2.f26229h = this.f26220c;
            cVar2.f26227f = C7160a.this.f26216y;
            cVar2.f26226e = C7160a.this.f26215x;
            C7160a.this.m38288a(view, cVar2);
            return false;
        }

        /* renamed from: b */
        public boolean mo23079b(View view, C7167c cVar) {
            this.f26219b = cVar.mo23080a();
            this.f26220c = cVar.mo23082b();
            this.f26221d.set(cVar.mo23084d());
            return true;
        }
    }

    /* renamed from: judi.com.b.a$c */
    /* compiled from: DrawingView */
    private class C7164c {

        /* renamed from: a */
        public float f26222a;

        /* renamed from: b */
        public float f26223b;

        /* renamed from: c */
        public float f26224c;

        /* renamed from: d */
        public float f26225d;

        /* renamed from: e */
        public float f26226e;

        /* renamed from: f */
        public float f26227f;

        /* renamed from: g */
        public float f26228g;

        /* renamed from: h */
        public float f26229h;

        private C7164c() {
        }
    }

    /* renamed from: judi.com.b.a$d */
    /* compiled from: DrawingView */
    public interface C7165d {
        /* renamed from: a */
        void mo23051a(boolean z, int i);

        /* renamed from: b */
        void mo23052b(boolean z, int i);
    }

    /* renamed from: a */
    public float mo23059a(int i, float f) {
        return ((float) i) / f;
    }

    public C7160a(Context context) {
        super(context);
        m38286a(context);
    }

    /* renamed from: a */
    private static void m38287a(View view, float f, float f2) {
        float[] fArr = {f, f2};
        view.getMatrix().mapVectors(fArr);
        view.setTranslationX(view.getTranslationX() + fArr[0]);
        view.setTranslationY(view.getTranslationY() + fArr[1]);
    }

    /* renamed from: c */
    private void m38291c() {
        int size = this.f26177N.size();
        StringBuilder sb = new StringBuilder();
        sb.append("ClearNextChange Curindx ");
        sb.append(this.f26178O);
        sb.append(" Size ");
        sb.append(size);
        Log.i("testings", sb.toString());
        int i = this.f26178O + 1;
        while (size > i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" indx ");
            sb2.append(i);
            Log.i("testings", sb2.toString());
            this.f26177N.remove(i);
            this.f26173J.remove(i);
            this.f26189ab.remove(i);
            this.f26176M.remove(i);
            size = this.f26177N.size();
        }
        if (this.f26198ak != null) {
            this.f26198ak.mo23052b(true, this.f26178O + 1);
            this.f26198ak.mo23051a(false, this.f26189ab.size() - (this.f26178O + 1));
        }
        if (this.f26172I != null) {
            this.f26172I.mo23077b(f26159f);
        }
    }

    /* renamed from: b */
    private static void m38290b(View view, float f, float f2) {
        if (view.getPivotX() != f || view.getPivotY() != f2) {
            float[] fArr = {0.0f, 0.0f};
            view.getMatrix().mapPoints(fArr);
            view.setPivotX(f);
            view.setPivotY(f2);
            float[] fArr2 = {0.0f, 0.0f};
            view.getMatrix().mapPoints(fArr2);
            float f3 = fArr2[0] - fArr[0];
            float f4 = fArr2[1] - fArr[1];
            view.setTranslationX(view.getTranslationX() - f3);
            view.setTranslationY(view.getTranslationY() - f4);
        }
    }

    /* renamed from: a */
    private Paint m38284a(int i, int i2, boolean z) {
        this.f26164A = new Paint();
        this.f26164A.setAlpha(0);
        if (z) {
            this.f26164A.setStyle(Style.FILL_AND_STROKE);
            this.f26164A.setStrokeJoin(Join.MITER);
            this.f26164A.setStrokeCap(Cap.SQUARE);
        } else {
            this.f26164A.setStyle(Style.STROKE);
            this.f26164A.setStrokeJoin(Join.ROUND);
            this.f26164A.setStrokeCap(Cap.ROUND);
            this.f26164A.setStrokeWidth((float) i2);
        }
        this.f26164A.setAntiAlias(true);
        if (i == f26157d) {
            this.f26164A.setColor(-16711936);
            this.f26164A.setAlpha(80);
            this.f26164A.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        }
        if (i == f26161h) {
            this.f26164A.setColor(-1);
            this.f26165B = C7141b.f26125a.mo23040b();
            this.f26164A.setShader(this.f26165B);
        }
        return this.f26164A;
    }

    /* renamed from: a */
    private void m38286a(Context context) {
        this.f26188aa = new C7167c(new C7163b());
        this.f26205n = context;
        setFocusable(true);
        setFocusableInTouchMode(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f26194ag = displayMetrics.widthPixels;
        this.f26174K = C7166b.m38304a(getContext(), this.f26174K);
        this.f26175L = C7166b.m38304a(getContext(), this.f26174K);
        this.f26196ai = C7166b.m38304a(getContext(), 50);
        this.f26197aj = C7166b.m38304a(getContext(), 50);
        this.f26164A.setAlpha(0);
        this.f26164A.setColor(0);
        this.f26164A.setStyle(Style.STROKE);
        this.f26164A.setStrokeJoin(Join.ROUND);
        this.f26164A.setStrokeCap(Cap.ROUND);
        this.f26164A.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f26164A.setAntiAlias(true);
        this.f26164A.setStrokeWidth(mo23059a(this.f26175L, this.f26169F));
        this.f26206o = new Paint();
        this.f26206o.setAntiAlias(true);
        this.f26206o.setColor(-16711936);
        this.f26206o.setAntiAlias(true);
        this.f26206o.setStyle(Style.STROKE);
        this.f26206o.setStrokeJoin(Join.MITER);
        this.f26206o.setStrokeWidth(mo23059a(this.f26208q, this.f26169F));
        this.f26207p = new Paint();
        this.f26207p.setAntiAlias(true);
        this.f26207p.setColor(-65536);
        this.f26207p.setAntiAlias(true);
        this.f26207p.setStyle(Style.STROKE);
        this.f26207p.setStrokeJoin(Join.MITER);
        this.f26207p.setStrokeWidth(mo23059a(this.f26208q, this.f26169F));
        this.f26207p.setPathEffect(new DashPathEffect(new float[]{10.0f, 20.0f}, 0.0f));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m38288a(View view, C7164c cVar) {
        m38290b(view, cVar.f26228g, cVar.f26229h);
        m38287a(view, cVar.f26224c, cVar.f26225d);
        float max = Math.max(cVar.f26227f, Math.min(cVar.f26226e, view.getScaleX() * cVar.f26223b));
        view.setScaleX(max);
        view.setScaleY(max);
        mo23061a(max);
        invalidate();
    }

    /* renamed from: d */
    private void m38292d() {
        for (int i = 0; i <= this.f26178O; i++) {
            if (((Integer) this.f26189ab.get(i)).intValue() == f26157d || ((Integer) this.f26189ab.get(i)).intValue() == f26161h) {
                this.f26170G = new Path((Path) this.f26177N.get(i));
                this.f26164A = m38284a(((Integer) this.f26189ab.get(i)).intValue(), ((Integer) this.f26173J.get(i)).intValue(), ((Boolean) this.f26176M.get(i)).booleanValue());
                this.f26204m.drawPath(this.f26170G, this.f26164A);
                this.f26170G.reset();
            }
            ((Integer) this.f26189ab.get(i)).intValue();
        }
    }

    /* renamed from: a */
    private void m38285a(float f, float f2, float f3, float f4, Paint paint, boolean z) {
        if (this.f26195ah != null) {
            Paint paint2 = new Paint();
            if (f4 - ((float) this.f26190ac) < ((float) C7166b.m38304a(this.f26205n, 300))) {
                if (f3 < ((float) C7166b.m38304a(this.f26205n, 180))) {
                    this.f26192ae = false;
                }
                if (f3 > ((float) (this.f26194ag - C7166b.m38304a(this.f26205n, 180)))) {
                    this.f26192ae = true;
                }
            }
            BitmapShader bitmapShader = new BitmapShader(C7141b.f26125a.mo23037a(), TileMode.CLAMP, TileMode.CLAMP);
            paint2.setShader(bitmapShader);
            Matrix matrix = new Matrix();
            matrix.postScale(this.f26169F * 1.5f, this.f26169F * 1.5f, f, f2);
            if (this.f26192ae) {
                matrix.postTranslate(-(f - ((float) C7166b.m38304a(this.f26205n, 75))), -(f2 - ((float) C7166b.m38304a(this.f26205n, 75))));
            } else {
                matrix.postTranslate(-(f - ((float) (this.f26194ag - C7166b.m38304a(this.f26205n, 75)))), -(f2 - ((float) C7166b.m38304a(this.f26205n, 75))));
            }
            bitmapShader.setLocalMatrix(matrix);
            this.f26164A.setShader(bitmapShader);
            paint.setStrokeWidth(mo23059a(this.f26208q, 1.5f) / 1.5f);
            this.f26195ah.mo23089a(paint2, paint, (int) (((double) (this.f26175L / 2)) * 1.5d), z, this.f26192ae, this.f26184U);
        }
    }

    /* renamed from: a */
    public void mo23062a(boolean z) {
        this.f26185V = z;
        if (z) {
            setOnTouchListener(this);
        } else {
            setOnTouchListener(null);
        }
    }

    public Bitmap getFinalBitmap() {
        return this.f26187a.copy(this.f26187a.getConfig(), true);
    }

    public int getLastChangeMode() {
        if (this.f26178O < 0) {
            return f26160g;
        }
        return ((Integer) this.f26189ab.get(this.f26178O)).intValue();
    }

    public int getOffset() {
        return this.f26191ad;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f26204m != null) {
            if (!this.f26199al && this.f26186W) {
                this.f26164A = m38284a(f26159f, this.f26174K, this.f26184U);
                if (this.f26170G != null) {
                    this.f26204m.drawPath(this.f26170G, this.f26164A);
                }
                this.f26186W = false;
            }
            if (f26159f == f26157d || f26159f == f26161h) {
                this.f26217z = new Paint();
                this.f26217z.setColor(-65536);
                this.f26206o.setStrokeWidth(mo23059a(this.f26208q, this.f26169F));
                if (this.f26184U) {
                    float f = (float) (this.f26174K / 2);
                    canvas.drawRect(this.f26202k - f, this.f26203l - f, f + this.f26202k, f + this.f26203l, this.f26206o);
                } else {
                    canvas.drawCircle(this.f26202k, this.f26203l, (float) (this.f26174K / 2), this.f26206o);
                }
                canvas.drawCircle(this.f26202k, this.f26203l + ((float) this.f26190ac), mo23059a(C7166b.m38304a(getContext(), 7), this.f26169F), this.f26217z);
            }
            this.f26199al = false;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (motionEvent.getPointerCount() != 1) {
            if (this.f26170G != null) {
                if (!this.f26210s || !(f26159f == f26157d || f26159f == f26161h)) {
                    this.f26170G.reset();
                    invalidate();
                    this.f26170G = null;
                } else {
                    int i = this.f26174K / 2;
                    if (this.f26184U) {
                        float f = (float) i;
                        this.f26170G.addRect(this.f26202k - f, this.f26203l - f, f + this.f26202k, f + this.f26203l, Direction.CW);
                    } else {
                        this.f26170G.lineTo(this.f26202k, this.f26203l);
                    }
                    invalidate();
                    this.f26177N.add(this.f26178O + 1, new Path(this.f26170G));
                    this.f26173J.add(this.f26178O + 1, Integer.valueOf(this.f26174K));
                    this.f26189ab.add(this.f26178O + 1, Integer.valueOf(f26159f));
                    this.f26176M.add(this.f26178O + 1, Boolean.valueOf(this.f26184U));
                    this.f26170G.reset();
                    this.f26178O++;
                    m38291c();
                    this.f26170G = null;
                    this.f26210s = false;
                }
            }
            this.f26188aa.mo23081a((View) view.getParent(), motionEvent);
            invalidate();
            m38285a(this.f26202k, this.f26203l, motionEvent.getRawX(), motionEvent.getRawY(), this.f26206o, false);
        } else {
            if (this.f26172I != null) {
                this.f26172I.mo23076a(motionEvent.getAction());
            }
            if (f26159f == f26158e) {
                this.f26202k = motionEvent.getX();
                this.f26203l = motionEvent.getY() - ((float) this.f26190ac);
                switch (action) {
                    case 0:
                        this.f26183T = true;
                        this.f26180Q = false;
                        this.f26167D = this.f26202k;
                        this.f26168E = this.f26203l;
                        this.f26214w = new Path();
                        this.f26214w.moveTo(this.f26202k, this.f26203l);
                        invalidate();
                        break;
                    case 1:
                        this.f26214w.lineTo(this.f26202k, this.f26203l);
                        this.f26214w.lineTo(this.f26167D, this.f26168E);
                        this.f26179P = true;
                        invalidate();
                        if (this.f26172I != null) {
                            this.f26172I.mo23077b(5);
                            break;
                        }
                        break;
                    case 2:
                        this.f26214w.lineTo(this.f26202k, this.f26203l);
                        invalidate();
                        break;
                    default:
                        return false;
                }
            }
            if (f26159f == f26157d || f26159f == f26161h) {
                int i2 = this.f26174K / 2;
                this.f26202k = motionEvent.getX();
                this.f26203l = motionEvent.getY() - ((float) this.f26190ac);
                this.f26186W = true;
                this.f26206o.setStrokeWidth(mo23059a(this.f26208q, this.f26169F));
                m38285a(this.f26202k, this.f26203l, motionEvent.getRawX(), motionEvent.getRawY(), this.f26206o, true);
                switch (action) {
                    case 0:
                        this.f26164A.setStrokeWidth((float) this.f26174K);
                        this.f26170G = new Path();
                        if (this.f26184U) {
                            float f2 = (float) i2;
                            this.f26170G.addRect(this.f26202k - f2, this.f26203l - f2, f2 + this.f26202k, f2 + this.f26203l, Direction.CW);
                        } else {
                            this.f26170G.moveTo(this.f26202k, this.f26203l);
                        }
                        invalidate();
                        return true;
                    case 1:
                        m38285a(this.f26202k, this.f26203l, motionEvent.getRawX(), motionEvent.getRawY(), this.f26206o, false);
                        if (this.f26170G != null) {
                            if (this.f26184U) {
                                float f3 = (float) i2;
                                this.f26170G.addRect(this.f26202k - f3, this.f26203l - f3, f3 + this.f26202k, f3 + this.f26203l, Direction.CW);
                            } else {
                                this.f26170G.lineTo(this.f26202k, this.f26203l);
                            }
                            invalidate();
                            this.f26177N.add(this.f26178O + 1, new Path(this.f26170G));
                            this.f26173J.add(this.f26178O + 1, Integer.valueOf(this.f26174K));
                            this.f26189ab.add(this.f26178O + 1, Integer.valueOf(f26159f));
                            this.f26176M.add(this.f26178O + 1, Boolean.valueOf(this.f26184U));
                            this.f26170G.reset();
                            this.f26178O++;
                            m38291c();
                            this.f26170G = null;
                            return true;
                        }
                        break;
                    case 2:
                        if (this.f26170G != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(" In Action Move ");
                            sb.append(this.f26202k);
                            sb.append(" ");
                            sb.append(this.f26203l);
                            sb.append(" offset ");
                            sb.append(this.f26190ac);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(" ofset 1 ");
                            sb2.append(this.f26190ac);
                            sb.append(sb2.toString());
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(" yPos  ");
                            sb3.append(motionEvent.getY());
                            sb.append(sb3.toString());
                            Log.e("movetest", sb.toString());
                            if (this.f26184U) {
                                float f4 = (float) i2;
                                this.f26170G.addRect(this.f26202k - f4, this.f26203l - f4, f4 + this.f26202k, f4 + this.f26203l, Direction.CW);
                            } else {
                                this.f26170G.lineTo(this.f26202k, this.f26203l);
                            }
                            invalidate();
                            this.f26210s = true;
                            return true;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo23060a() {
        this.f26179P = false;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26178O + 1 >= this.f26177N.size());
        sb.append(" Curindx ");
        sb.append(this.f26178O);
        sb.append(" ");
        sb.append(this.f26177N.size());
        Log.i("testings", sb.toString());
        if (this.f26178O + 1 < this.f26177N.size()) {
            setImageBitmap(this.f26193af);
            this.f26178O++;
            m38292d();
            if (this.f26198ak != null) {
                this.f26198ak.mo23052b(true, this.f26178O + 1);
                this.f26198ak.mo23051a(true, this.f26189ab.size() - (this.f26178O + 1));
            }
            if (this.f26178O + 1 >= this.f26177N.size() && this.f26198ak != null) {
                this.f26198ak.mo23051a(false, this.f26189ab.size() - (this.f26178O + 1));
            }
        }
    }

    public void setActionListener(C7162a aVar) {
        this.f26172I = aVar;
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.f26193af == null) {
                this.f26193af = bitmap.copy(bitmap.getConfig(), true);
            }
            this.f26171H = bitmap.getWidth();
            this.f26209r = bitmap.getHeight();
            this.f26187a = Bitmap.createBitmap(this.f26171H, this.f26209r, bitmap.getConfig());
            this.f26204m = new Canvas();
            this.f26204m.setBitmap(this.f26187a);
            this.f26204m.drawBitmap(bitmap, 0.0f, 0.0f, null);
            if (this.f26185V) {
                mo23062a(this.f26185V);
            }
            super.setImageBitmap(this.f26187a);
        }
    }

    public void setMODE(int i) {
        f26159f = i;
        if (!(i == f26162i || this.f26200b == null)) {
            this.f26200b.recycle();
            this.f26200b = null;
        }
        if (i != f26158e) {
            this.f26180Q = true;
            this.f26179P = false;
            if (this.f26201c != null) {
                this.f26201c.recycle();
                this.f26201c = null;
            }
        }
    }

    public void setOffset(int i) {
        this.f26191ad = i;
        this.f26190ac = (int) mo23059a(C7166b.m38304a(this.f26205n, i), this.f26169F);
        this.f26199al = true;
    }

    public void setRadius(int i) {
        this.f26175L = C7166b.m38304a(getContext(), i);
        this.f26174K = (int) mo23059a(this.f26175L, this.f26169F);
        this.f26199al = true;
    }

    public void setShaderView(C7170d dVar) {
        this.f26195ah = dVar;
    }

    public void setThreshold(int i) {
        f26163j = i;
        if (this.f26178O >= 0) {
            int intValue = ((Integer) this.f26189ab.get(this.f26178O)).intValue();
            StringBuilder sb = new StringBuilder();
            sb.append(" Threshold ");
            sb.append(i);
            sb.append("  ");
            sb.append(intValue == f26162i);
            Log.i("testings", sb.toString());
        }
    }

    public void setUndoRedoListener(C7165d dVar) {
        this.f26198ak = dVar;
    }

    /* renamed from: b */
    public void mo23063b() {
        this.f26179P = false;
        setImageBitmap(this.f26193af);
        StringBuilder sb = new StringBuilder();
        sb.append("Performing UNDO Curindx ");
        sb.append(this.f26178O);
        sb.append("  ");
        sb.append(this.f26177N.size());
        Log.i("testings", sb.toString());
        if (this.f26178O >= 0) {
            this.f26178O--;
            m38292d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" Curindx ");
            sb2.append(this.f26178O);
            sb2.append("  ");
            sb2.append(this.f26177N.size());
            Log.i("testings", sb2.toString());
            if (this.f26198ak != null) {
                this.f26198ak.mo23052b(true, this.f26178O + 1);
                this.f26198ak.mo23051a(true, this.f26189ab.size() - (this.f26178O + 1));
            }
            if (this.f26178O < 0 && this.f26198ak != null) {
                this.f26198ak.mo23052b(false, this.f26178O + 1);
            }
        }
    }

    /* renamed from: a */
    public void mo23061a(float f) {
        StringBuilder sb = new StringBuilder();
        sb.append("Scale ");
        sb.append(f);
        sb.append("  Brushsize  ");
        sb.append(this.f26174K);
        Log.i("testings", sb.toString());
        this.f26169F = f;
        this.f26174K = (int) mo23059a(this.f26175L, f);
        this.f26196ai = (int) mo23059a(this.f26197aj, f);
        this.f26190ac = (int) mo23059a(C7166b.m38304a(this.f26205n, this.f26191ad), f);
    }
}
