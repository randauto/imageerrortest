package p145c.p146a.p147a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p145c.p146a.p147a.C3258j.C3259a;
import p145c.p146a.p147a.C3258j.C3260b;
import p145c.p146a.p147a.C3258j.C3261c;
import p145c.p146a.p147a.C3258j.C3262d;
import p145c.p146a.p147a.C3258j.C3263e;

/* renamed from: c.a.a.f */
/* compiled from: FancyShowCaseView */
public class C3243f extends FrameLayout implements OnGlobalLayoutListener {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f8697A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f8698B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f8699C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f8700D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f8701E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public ViewGroup f8702F;

    /* renamed from: G */
    private SharedPreferences f8703G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C3239b f8704H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f8705I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f8706J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f8707K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f8708L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f8709M;

    /* renamed from: N */
    private float[] f8710N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f8711O;

    /* renamed from: a */
    C3241d f8712a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Activity f8713b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f8714c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Spanned f8715d;

    /* renamed from: e */
    private String f8716e;

    /* renamed from: f */
    private double f8717f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public View f8718g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f8719h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f8720i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f8721j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f8722k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f8723l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f8724m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f8725n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f8726o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f8727p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C3257i f8728q;

    /* renamed from: r */
    private Animation f8729r;

    /* renamed from: s */
    private Animation f8730s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C3238a f8731t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f8732u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f8733v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f8734w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C3255g f8735x;

    /* renamed from: y */
    private C3240c f8736y;

    /* renamed from: z */
    private long f8737z;

    /* renamed from: c.a.a.f$9 */
    /* compiled from: FancyShowCaseView */
    static /* synthetic */ class C32539 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8747a = new int[C3255g.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                c.a.a.g[] r0 = p145c.p146a.p147a.C3255g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8747a = r0
                int[] r0 = f8747a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.a.a.g r1 = p145c.p146a.p147a.C3255g.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f8747a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.a.a.g r1 = p145c.p146a.p147a.C3255g.ROUNDED_RECTANGLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p145c.p146a.p147a.C3243f.C32539.<clinit>():void");
        }
    }

    /* renamed from: c.a.a.f$a */
    /* compiled from: FancyShowCaseView */
    public static class C3254a {

        /* renamed from: A */
        private int f8748A;

        /* renamed from: B */
        private int f8749B;

        /* renamed from: C */
        private int f8750C;

        /* renamed from: D */
        private boolean f8751D = true;

        /* renamed from: E */
        private int f8752E = 20;

        /* renamed from: F */
        private int f8753F = 1;

        /* renamed from: G */
        private long f8754G;

        /* renamed from: a */
        private Activity f8755a;

        /* renamed from: b */
        private View f8756b;

        /* renamed from: c */
        private String f8757c;

        /* renamed from: d */
        private String f8758d;

        /* renamed from: e */
        private Spanned f8759e;

        /* renamed from: f */
        private double f8760f = 1.0d;

        /* renamed from: g */
        private int f8761g;

        /* renamed from: h */
        private int f8762h;

        /* renamed from: i */
        private int f8763i = -1;

        /* renamed from: j */
        private int f8764j = -1;

        /* renamed from: k */
        private int f8765k = -1;

        /* renamed from: l */
        private int f8766l;

        /* renamed from: m */
        private int f8767m;

        /* renamed from: n */
        private int f8768n;

        /* renamed from: o */
        private C3257i f8769o;

        /* renamed from: p */
        private Animation f8770p;

        /* renamed from: q */
        private Animation f8771q;

        /* renamed from: r */
        private C3238a f8772r;

        /* renamed from: s */
        private boolean f8773s = true;

        /* renamed from: t */
        private boolean f8774t;

        /* renamed from: u */
        private boolean f8775u;

        /* renamed from: v */
        private C3255g f8776v = C3255g.CIRCLE;

        /* renamed from: w */
        private C3240c f8777w = null;

        /* renamed from: x */
        private int f8778x;

        /* renamed from: y */
        private int f8779y;

        /* renamed from: z */
        private int f8780z;

        public C3254a(Activity activity) {
            this.f8755a = activity;
        }

        /* renamed from: a */
        public C3254a mo10464a(String str) {
            this.f8758d = str;
            this.f8759e = null;
            return this;
        }

        /* renamed from: a */
        public C3254a mo10462a(int i) {
            this.f8763i = i;
            return this;
        }

        /* renamed from: b */
        public C3254a mo10468b(String str) {
            this.f8757c = str;
            return this;
        }

        /* renamed from: a */
        public C3254a mo10463a(View view) {
            this.f8756b = view;
            return this;
        }

        /* renamed from: a */
        public C3254a mo10465a(boolean z) {
            this.f8775u = z;
            return this;
        }

        /* renamed from: b */
        public C3254a mo10467b(int i) {
            this.f8768n = i;
            return this;
        }

        /* renamed from: a */
        public C3243f mo10466a() {
            C3243f fVar = new C3243f(this.f8755a, this.f8756b, this.f8757c, this.f8758d, this.f8759e, this.f8763i, this.f8766l, this.f8764j, this.f8765k, this.f8760f, this.f8761g, this.f8762h, this.f8778x, this.f8767m, this.f8769o, this.f8770p, this.f8771q, this.f8772r, this.f8773s, this.f8774t, this.f8775u, this.f8776v, this.f8777w, this.f8768n, this.f8779y, this.f8780z, this.f8748A, this.f8749B, this.f8750C, this.f8751D, this.f8752E, this.f8753F, this.f8754G);
            return fVar;
        }
    }

    private C3243f(Activity activity, View view, String str, String str2, Spanned spanned, int i, int i2, int i3, int i4, double d, int i5, int i6, int i7, int i8, C3257i iVar, Animation animation, Animation animation2, C3238a aVar, boolean z, boolean z2, boolean z3, C3255g gVar, C3240c cVar, int i9, int i10, int i11, int i12, int i13, int i14, boolean z4, int i15, int i16, long j) {
        super(activity);
        this.f8697A = 400;
        this.f8710N = new float[2];
        this.f8716e = str;
        this.f8713b = activity;
        this.f8718g = view;
        this.f8714c = str2;
        this.f8715d = spanned;
        this.f8717f = d;
        this.f8719h = i5;
        this.f8720i = i6;
        this.f8726o = i7;
        this.f8721j = i;
        this.f8722k = i2;
        this.f8723l = i3;
        this.f8724m = i4;
        this.f8727p = i9;
        this.f8725n = i8;
        this.f8728q = iVar;
        this.f8729r = animation;
        this.f8730s = animation2;
        this.f8731t = aVar;
        this.f8732u = z;
        this.f8733v = z2;
        this.f8734w = z3;
        this.f8735x = gVar;
        this.f8736y = cVar;
        this.f8705I = i10;
        this.f8706J = i11;
        this.f8707K = i12;
        this.f8708L = i13;
        this.f8709M = i14;
        this.f8711O = z4;
        this.f8698B = i15;
        this.f8699C = i16;
        this.f8737z = j;
        m14898e();
    }

    /* renamed from: e */
    private void m14898e() {
        int i;
        if (this.f8719h != 0) {
            i = this.f8719h;
        } else {
            i = this.f8713b.getResources().getColor(C3260b.fancy_showcase_view_default_background_color);
        }
        this.f8719h = i;
        this.f8721j = this.f8721j >= 0 ? this.f8721j : 17;
        this.f8722k = this.f8722k != 0 ? this.f8722k : C3263e.FancyShowCaseDefaultTitleStyle;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f8713b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        this.f8700D = i2 / 2;
        this.f8701E = i3 / 2;
        this.f8703G = this.f8713b.getSharedPreferences("PrefShowCaseView", 0);
    }

    /* renamed from: a */
    public void mo10437a() {
        if (this.f8713b == null || (this.f8716e != null && mo10439c())) {
            if (this.f8736y != null) {
                this.f8736y.mo10426a(this.f8716e);
            }
            return;
        }
        if (this.f8718g == null) {
            m14901f();
        } else if (this.f8718g.getWidth() == 0 && this.f8718g.getHeight() == 0) {
            this.f8718g.getViewTreeObserver().addOnGlobalLayoutListener(this);
        } else {
            m14901f();
        }
    }

    /* renamed from: f */
    private void m14901f() {
        C3239b bVar = new C3239b(this.f8713b, this.f8735x, this.f8718g, this.f8717f, this.f8734w);
        this.f8704H = bVar;
        this.f8702F = (ViewGroup) ((ViewGroup) this.f8713b.findViewById(16908290)).getParent().getParent();
        this.f8702F.postDelayed(new Runnable() {
            public void run() {
                if (C3243f.this.f8713b != null && !C3243f.this.f8713b.isFinishing()) {
                    C3243f fVar = (C3243f) C3243f.this.f8702F.findViewWithTag("ShowCaseViewTag");
                    C3243f.this.setClickable(!C3243f.this.f8733v);
                    if (fVar == null) {
                        C3243f.this.setTag("ShowCaseViewTag");
                        if (C3243f.this.f8732u) {
                            C3243f.this.m14903g();
                        }
                        C3243f.this.setLayoutParams(new LayoutParams(-1, -1));
                        C3243f.this.f8702F.addView(C3243f.this);
                        C3243f.this.f8712a = new C3241d(C3243f.this.f8713b);
                        C3243f.this.f8712a.mo10432b(C3243f.this.f8698B, C3243f.this.f8699C);
                        if (C3243f.this.f8704H.mo10425f()) {
                            C3243f.this.f8700D = C3243f.this.f8704H.mo10422d();
                            C3243f.this.f8701E = C3243f.this.f8704H.mo10424e();
                        }
                        C3243f.this.f8712a.mo10430a(C3243f.this.f8719h, C3243f.this.f8704H);
                        if (C3243f.this.f8708L > 0 && C3243f.this.f8709M > 0) {
                            C3243f.this.f8704H.mo10416a(C3243f.this.f8705I, C3243f.this.f8706J, C3243f.this.f8708L, C3243f.this.f8709M);
                        }
                        if (C3243f.this.f8707K > 0) {
                            C3243f.this.f8704H.mo10415a(C3243f.this.f8705I, C3243f.this.f8706J, C3243f.this.f8707K);
                        }
                        C3243f.this.f8712a.mo10431a(C3243f.this.f8711O);
                        C3243f.this.f8712a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        if (C3243f.this.f8720i != 0 && C3243f.this.f8726o > 0) {
                            C3243f.this.f8712a.mo10429a(C3243f.this.f8720i, C3243f.this.f8726o);
                        }
                        if (C3243f.this.f8727p > 0) {
                            C3243f.this.f8712a.mo10428a(C3243f.this.f8727p);
                        }
                        C3243f.this.addView(C3243f.this.f8712a);
                        if (C3243f.this.f8725n == 0) {
                            C3243f.this.m14907i();
                        } else {
                            C3243f.this.m14892a(C3243f.this.f8725n, C3243f.this.f8728q);
                        }
                        C3243f.this.m14905h();
                        C3243f.this.m14913l();
                    }
                }
            }
        }, this.f8737z);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m14903g() {
        if (this.f8733v) {
            setOnTouchListener(new OnTouchListener() {
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
                    /*
                        r8 = this;
                        int r9 = r10.getActionMasked()
                        r0 = 1
                        if (r9 != 0) goto L_0x00b0
                        float r9 = r10.getX()
                        float r10 = r10.getY()
                        int[] r1 = p145c.p146a.p147a.C3243f.C32539.f8747a
                        c.a.a.f r2 = p145c.p146a.p147a.C3243f.this
                        c.a.a.g r2 = r2.f8735x
                        int r2 = r2.ordinal()
                        r1 = r1[r2]
                        r2 = 0
                        switch(r1) {
                            case 1: goto L_0x006f;
                            case 2: goto L_0x0024;
                            default: goto L_0x0021;
                        }
                    L_0x0021:
                        r9 = 0
                        goto L_0x00a0
                    L_0x0024:
                        android.graphics.Rect r1 = new android.graphics.Rect
                        r1.<init>()
                        c.a.a.f r3 = p145c.p146a.p147a.C3243f.this
                        int r3 = r3.getFocusCenterX()
                        c.a.a.f r4 = p145c.p146a.p147a.C3243f.this
                        int r4 = r4.getFocusWidth()
                        int r4 = r4 / 2
                        int r3 = r3 - r4
                        c.a.a.f r4 = p145c.p146a.p147a.C3243f.this
                        int r4 = r4.getFocusCenterX()
                        c.a.a.f r5 = p145c.p146a.p147a.C3243f.this
                        int r5 = r5.getFocusWidth()
                        int r5 = r5 / 2
                        int r4 = r4 + r5
                        c.a.a.f r5 = p145c.p146a.p147a.C3243f.this
                        int r5 = r5.getFocusCenterY()
                        c.a.a.f r6 = p145c.p146a.p147a.C3243f.this
                        int r6 = r6.getFocusHeight()
                        int r6 = r6 / 2
                        int r5 = r5 - r6
                        c.a.a.f r6 = p145c.p146a.p147a.C3243f.this
                        int r6 = r6.getFocusCenterY()
                        c.a.a.f r7 = p145c.p146a.p147a.C3243f.this
                        int r7 = r7.getFocusHeight()
                        int r7 = r7 / 2
                        int r6 = r6 + r7
                        r1.set(r3, r5, r4, r6)
                        int r9 = (int) r9
                        int r10 = (int) r10
                        boolean r9 = r1.contains(r9, r10)
                        goto L_0x00a0
                    L_0x006f:
                        c.a.a.f r1 = p145c.p146a.p147a.C3243f.this
                        int r1 = r1.getFocusCenterX()
                        float r1 = (float) r1
                        float r1 = r1 - r9
                        double r3 = (double) r1
                        r5 = 4611686018427387904(0x4000000000000000, double:2.0)
                        double r3 = java.lang.Math.pow(r3, r5)
                        c.a.a.f r9 = p145c.p146a.p147a.C3243f.this
                        int r9 = r9.getFocusCenterY()
                        float r9 = (float) r9
                        float r9 = r9 - r10
                        double r9 = (double) r9
                        double r9 = java.lang.Math.pow(r9, r5)
                        double r3 = r3 + r9
                        double r9 = java.lang.Math.sqrt(r3)
                        double r9 = java.lang.Math.abs(r9)
                        c.a.a.f r1 = p145c.p146a.p147a.C3243f.this
                        float r1 = r1.getFocusRadius()
                        double r3 = (double) r1
                        int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                        if (r9 >= 0) goto L_0x0021
                        r9 = 1
                    L_0x00a0:
                        if (r9 == 0) goto L_0x00a3
                        return r2
                    L_0x00a3:
                        c.a.a.f r9 = p145c.p146a.p147a.C3243f.this
                        boolean r9 = r9.f8732u
                        if (r9 == 0) goto L_0x00b0
                        c.a.a.f r9 = p145c.p146a.p147a.C3243f.this
                        r9.mo10438b()
                    L_0x00b0:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p145c.p146a.p147a.C3243f.C32452.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        } else {
            setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C3243f.this.mo10438b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m14905h() {
        if (this.f8729r != null) {
            startAnimation(this.f8729r);
        } else if (C3264k.m14943a()) {
            m14909j();
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f8713b, C3259a.fscv_fade_in);
            loadAnimation.setFillAfter(true);
            loadAnimation.setAnimationListener(new AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    if (C3243f.this.f8731t != null) {
                        C3243f.this.f8731t.mo10411a();
                    }
                }
            });
            startAnimation(loadAnimation);
        }
    }

    /* renamed from: b */
    public void mo10438b() {
        if (this.f8730s != null) {
            startAnimation(this.f8730s);
        } else if (C3264k.m14943a()) {
            m14911k();
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f8713b, C3259a.fscv_fade_out);
            loadAnimation.setAnimationListener(new AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    C3243f.this.mo10440d();
                    if (C3243f.this.f8731t != null) {
                        C3243f.this.f8731t.mo10412b();
                    }
                }
            });
            loadAnimation.setFillAfter(true);
            startAnimation(loadAnimation);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14892a(int i, C3257i iVar) {
        View inflate = this.f8713b.getLayoutInflater().inflate(i, this, false);
        addView(inflate);
        if (iVar != null) {
            iVar.mo10458a(inflate);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m14907i() {
        m14892a(C3262d.fancy_showcase_view_layout_title, (C3257i) new C3257i() {
            /* renamed from: a */
            public void mo10458a(View view) {
                TextView textView = (TextView) view.findViewById(C3261c.fscv_title);
                if (VERSION.SDK_INT >= 23) {
                    textView.setTextAppearance(C3243f.this.f8722k);
                } else {
                    textView.setTextAppearance(C3243f.this.f8713b, C3243f.this.f8722k);
                }
                if (C3243f.this.f8723l != -1) {
                    textView.setTextSize(C3243f.this.f8724m, (float) C3243f.this.f8723l);
                }
                textView.setGravity(C3243f.this.f8721j);
                if (C3243f.this.f8734w) {
                    ((RelativeLayout.LayoutParams) textView.getLayoutParams()).setMargins(0, C3264k.m14942a(C3243f.this.getContext()), 0, 0);
                }
                if (C3243f.this.f8715d != null) {
                    textView.setText(C3243f.this.f8715d);
                } else {
                    textView.setText(C3243f.this.f8714c);
                }
            }
        });
    }

    /* renamed from: j */
    private void m14909j() {
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (VERSION.SDK_INT < 16) {
                    C3243f.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    C3243f.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                int hypot = (int) Math.hypot((double) C3243f.this.getWidth(), (double) C3243f.this.getHeight());
                int i = 0;
                if (C3243f.this.f8718g != null) {
                    i = C3243f.this.f8718g.getWidth() / 2;
                } else if (C3243f.this.f8707K > 0 || C3243f.this.f8708L > 0 || C3243f.this.f8709M > 0) {
                    C3243f.this.f8700D = C3243f.this.f8705I;
                    C3243f.this.f8701E = C3243f.this.f8706J;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(C3243f.this, C3243f.this.f8700D, C3243f.this.f8701E, (float) i, (float) hypot);
                createCircularReveal.setDuration((long) C3243f.this.f8697A);
                if (C3243f.this.f8731t != null) {
                    createCircularReveal.addListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            C3243f.this.f8731t.mo10411a();
                        }
                    });
                }
                createCircularReveal.setInterpolator(AnimationUtils.loadInterpolator(C3243f.this.f8713b, 17563650));
                createCircularReveal.start();
            }
        });
    }

    @TargetApi(21)
    /* renamed from: k */
    private void m14911k() {
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.f8700D, this.f8701E, (float) ((int) Math.hypot((double) getWidth(), (double) getHeight())), 0.0f);
        createCircularReveal.setDuration((long) this.f8697A);
        createCircularReveal.setInterpolator(AnimationUtils.loadInterpolator(this.f8713b, 17563651));
        createCircularReveal.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                C3243f.this.mo10440d();
                if (C3243f.this.f8731t != null) {
                    C3243f.this.f8731t.mo10412b();
                }
            }
        });
        createCircularReveal.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m14913l() {
        Editor edit = this.f8703G.edit();
        edit.putBoolean(this.f8716e, true);
        edit.apply();
    }

    /* renamed from: c */
    public boolean mo10439c() {
        return this.f8703G.getBoolean(this.f8716e, false);
    }

    /* renamed from: d */
    public void mo10440d() {
        if (this.f8712a != null) {
            this.f8712a = null;
        }
        this.f8702F.removeView(this);
        if (this.f8736y != null) {
            this.f8736y.mo10427b(this.f8716e);
        }
    }

    public C3240c getDismissListener() {
        return this.f8736y;
    }

    public void setDismissListener(C3240c cVar) {
        this.f8736y = cVar;
    }

    public void onGlobalLayout() {
        if (VERSION.SDK_INT < 16) {
            this.f8718g.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else {
            this.f8718g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        m14901f();
    }

    public int getFocusCenterX() {
        return this.f8704H.mo10422d();
    }

    public int getFocusCenterY() {
        return this.f8704H.mo10424e();
    }

    public float getFocusRadius() {
        if (C3255g.CIRCLE.equals(this.f8735x)) {
            return this.f8704H.mo10413a(0, 1.0d);
        }
        return 0.0f;
    }

    public int getFocusWidth() {
        return this.f8704H.mo10418b();
    }

    public int getFocusHeight() {
        return this.f8704H.mo10420c();
    }
}
