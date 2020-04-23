package p256e.p259c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p256e.p257a.C6974a;
import p256e.p260d.C7006c;
import p256e.p261e.C7008a;
import p256e.p261e.C7009b;
import p256e.p261e.C7010c;
import p256e.p261e.C7011d;
import p256e.p261e.C7011d.C7012a;
import p256e.p262f.C7063g;
import p256e.p262f.C7064h;

/* renamed from: e.c.a */
/* compiled from: PApplet */
public class C6982a {

    /* renamed from: a */
    public static final int f24495a = VERSION.SDK_INT;

    /* renamed from: af */
    protected static HashMap<String, Pattern> f24496af;

    /* renamed from: ag */
    public static final byte[] f24497ag = {71, 73, 70, 56, 57, 97, 16, 0, 16, 0, -77, 0, 0, 0, 0, 0, -1, -1, -1, 12, 12, 13, -15, -15, -14, 45, 57, 74, 54, 80, 111, 47, 71, 97, 62, 88, 117, 1, 14, 27, 7, 41, 73, 15, 52, 85, 2, 31, 55, 4, 54, 94, 18, 69, 109, 37, 87, 126, -1, -1, -1, 33, -7, 4, 1, 0, 0, 15, 0, 44, 0, 0, 0, 0, 16, 0, 16, 0, 0, 4, 122, -16, -107, 114, -86, -67, 83, 30, -42, 26, -17, -100, -45, 56, -57, -108, 48, 40, 122, -90, 104, 67, -91, -51, 32, -53, 77, -78, -100, 47, -86, 12, 76, -110, -20, -74, -101, 97, -93, 27, 40, 20, -65, 65, 48, -111, 99, -20, -112, -117, -123, -47, -105, 24, 114, -112, 74, 69, 84, 25, 93, 88, -75, 9, 46, 2, 49, 88, -116, -67, 7, -19, -83, 60, 38, 3, -34, 2, 66, -95, 27, -98, 13, 4, -17, 55, 33, 109, 11, 11, -2, Byte.MIN_VALUE, 121, 123, 62, 91, 120, Byte.MIN_VALUE, Byte.MAX_VALUE, 122, 115, 102, 2, 119, 0, -116, -113, -119, 6, 102, 121, -108, -126, 5, 18, 6, 4, -102, -101, -100, 114, 15, 17, 0, 59};

    /* renamed from: A */
    protected int f24498A;

    /* renamed from: B */
    public char f24499B;

    /* renamed from: C */
    public int f24500C;

    /* renamed from: D */
    public boolean f24501D;

    /* renamed from: E */
    public boolean f24502E = false;

    /* renamed from: F */
    protected boolean f24503F = false;

    /* renamed from: G */
    boolean f24504G = false;

    /* renamed from: H */
    public boolean f24505H = true;

    /* renamed from: I */
    protected HashMap<String, String> f24506I = new HashMap<>();

    /* renamed from: J */
    protected ArrayList<String> f24507J = new ArrayList<>();

    /* renamed from: K */
    long f24508K = System.currentTimeMillis();

    /* renamed from: L */
    protected boolean f24509L;

    /* renamed from: M */
    protected long f24510M = 0;

    /* renamed from: N */
    public float f24511N = 10.0f;

    /* renamed from: O */
    protected boolean f24512O;

    /* renamed from: P */
    protected boolean f24513P;

    /* renamed from: Q */
    public int f24514Q;

    /* renamed from: R */
    public boolean f24515R;

    /* renamed from: S */
    boolean f24516S;

    /* renamed from: T */
    String f24517T = "processing.core.PGraphicsAndroid2D";

    /* renamed from: U */
    int f24518U = 1;

    /* renamed from: V */
    boolean f24519V = false;

    /* renamed from: W */
    int f24520W = -1;

    /* renamed from: X */
    int f24521X = -2236963;

    /* renamed from: Y */
    boolean f24522Y = false;

    /* renamed from: Z */
    HashMap<String, C6986b> f24523Z = new HashMap<>();

    /* renamed from: aa */
    C6985a f24524aa = new C6985a();

    /* renamed from: ab */
    Random f24525ab;

    /* renamed from: ac */
    int f24526ac = 4;

    /* renamed from: ad */
    float f24527ad = 0.5f;

    /* renamed from: ae */
    public int f24528ae = 4;

    /* renamed from: ah */
    private boolean f24529ah = false;

    /* renamed from: b */
    protected C6997i f24530b;

    /* renamed from: c */
    public int f24531c = -1;

    /* renamed from: d */
    public C6989c f24532d;

    /* renamed from: e */
    public int f24533e;

    /* renamed from: f */
    public int f24534f;

    /* renamed from: g */
    public String f24535g;

    /* renamed from: h */
    protected boolean f24536h;

    /* renamed from: i */
    public int f24537i = -1;

    /* renamed from: j */
    public int f24538j = -1;

    /* renamed from: k */
    public float f24539k = 1.0f;

    /* renamed from: l */
    public int f24540l = 1;

    /* renamed from: m */
    public int f24541m;

    /* renamed from: n */
    public int f24542n;

    /* renamed from: o */
    public int f24543o;

    /* renamed from: p */
    public int f24544p;

    /* renamed from: q */
    public int f24545q;

    /* renamed from: r */
    public int f24546r;

    /* renamed from: s */
    public boolean f24547s;

    /* renamed from: t */
    public boolean f24548t;

    /* renamed from: u */
    public C7012a[] f24549u = new C7012a[0];

    /* renamed from: v */
    protected int f24550v;

    /* renamed from: w */
    protected int f24551w;

    /* renamed from: x */
    protected int f24552x;

    /* renamed from: y */
    protected int f24553y;

    /* renamed from: z */
    protected int f24554z;

    /* renamed from: e.c.a$a */
    /* compiled from: PApplet */
    class C6985a {

        /* renamed from: a */
        protected C7008a[] f24559a = new C7008a[10];

        /* renamed from: b */
        protected int f24560b;

        /* renamed from: c */
        protected int f24561c;

        C6985a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo21888a(C7008a aVar) {
            if (this.f24561c == this.f24559a.length) {
                this.f24559a = (C7008a[]) C6982a.m36402a((Object) this.f24559a);
            }
            C7008a[] aVarArr = this.f24559a;
            int i = this.f24561c;
            this.f24561c = i + 1;
            aVarArr[i] = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized C7008a mo21887a() {
            C7008a aVar;
            if (this.f24560b != this.f24561c) {
                C7008a[] aVarArr = this.f24559a;
                int i = this.f24560b;
                this.f24560b = i + 1;
                aVar = aVarArr[i];
                if (this.f24560b == this.f24561c) {
                    this.f24560b = 0;
                    this.f24561c = 0;
                }
            } else {
                throw new RuntimeException("Nothing left on the event queue.");
            }
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized boolean mo21889b() {
            return this.f24561c != 0;
        }
    }

    /* renamed from: e.c.a$b */
    /* compiled from: PApplet */
    class C6986b {

        /* renamed from: a */
        int f24563a;

        /* renamed from: b */
        Object[] f24564b;

        /* renamed from: c */
        Method[] f24565c;

        /* renamed from: d */
        Object[] f24566d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21890a() {
            mo21891a(this.f24566d);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21891a(Object[] objArr) {
            for (int i = 0; i < this.f24563a; i++) {
                try {
                    this.f24565c[i].invoke(this.f24564b[i], objArr);
                } catch (Exception e) {
                    e = e;
                    if (e instanceof InvocationTargetException) {
                        e = ((InvocationTargetException) e).getCause();
                    }
                    if (!(e instanceof RuntimeException)) {
                        e.printStackTrace();
                    } else {
                        throw ((RuntimeException) e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final float m36397a(float f) {
        return f < 0.0f ? -f : f;
    }

    /* renamed from: a */
    public static final float m36398a(float f, float f2) {
        return f < f2 ? f : f2;
    }

    /* renamed from: a */
    public static final float m36399a(float f, float f2, float f3) {
        if (f > f2) {
            if (f > f3) {
                return f;
            }
        } else if (f2 > f3) {
            return f2;
        }
        return f3;
    }

    /* renamed from: a */
    public static final int m36401a(int i, int i2, int i3) {
        if (i > i2) {
            if (i > i3) {
                return i;
            }
        } else if (i2 > i3) {
            return i2;
        }
        return i3;
    }

    /* renamed from: b */
    public static final float m36413b(float f) {
        return f * f;
    }

    /* renamed from: b */
    public static final float m36415b(float f, float f2, float f3) {
        if (f < f2) {
            if (f < f3) {
                return f;
            }
        } else if (f2 < f3) {
            return f2;
        }
        return f3;
    }

    /* renamed from: b */
    public static final int m36416b(int i) {
        return i < 0 ? -i : i;
    }

    /* renamed from: b */
    public static final int m36417b(int i, int i2, int i3) {
        if (i < i2) {
            if (i < i3) {
                return i;
            }
        } else if (i2 < i3) {
            return i2;
        }
        return i3;
    }

    /* renamed from: c */
    public static final float m36419c(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: c */
    public static final int m36420c(int i, int i2) {
        return i > i2 ? i : i2;
    }

    /* renamed from: d */
    public static final int m36422d(int i, int i2) {
        return i < i2 ? i : i2;
    }

    /* renamed from: D */
    public void mo21779D() {
    }

    /* renamed from: E */
    public void mo21780E() {
    }

    /* renamed from: F */
    public void mo21781F() {
    }

    /* renamed from: G */
    public void mo21782G() {
    }

    /* renamed from: H */
    public void mo21783H() {
    }

    /* renamed from: I */
    public void mo21784I() {
    }

    /* renamed from: J */
    public void mo21785J() {
    }

    /* renamed from: K */
    public void mo21786K() {
    }

    /* renamed from: L */
    public void mo21787L() {
    }

    /* renamed from: M */
    public void mo21788M() {
    }

    /* renamed from: N */
    public void mo21789N() {
    }

    /* renamed from: P */
    public void mo21791P() {
    }

    /* renamed from: Q */
    public void mo21792Q() {
    }

    /* renamed from: R */
    public void mo21793R() {
    }

    /* renamed from: S */
    public void mo21794S() {
    }

    /* renamed from: T */
    public void mo21795T() {
    }

    /* renamed from: a */
    public void mo21800a() {
    }

    /* renamed from: a */
    public void mo21807a(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
    }

    /* renamed from: a */
    public void mo21810a(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a */
    public boolean mo21820a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public void mo21825b() {
    }

    /* renamed from: b */
    public boolean mo21835b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: s */
    public void mo21877s() {
    }

    /* renamed from: t */
    public void mo21878t() {
    }

    /* renamed from: u */
    public void mo21879u() {
    }

    /* renamed from: v */
    public void mo21880v() {
    }

    /* renamed from: d */
    public C6997i mo21845d() {
        return this.f24530b;
    }

    /* renamed from: e */
    public Context mo21850e() {
        return this.f24530b.mo22060b();
    }

    /* renamed from: f */
    public Activity mo21855f() {
        return this.f24530b.mo22062c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21809a(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15, p256e.p258b.C6977a r16, android.view.SurfaceHolder r17) {
        /*
            r12 = this;
            r0 = r12
            r16.mo21761L_()
            int r1 = r16.mo21764b()
            r0.f24533e = r1
            int r1 = r16.mo21765c()
            r0.f24534f = r1
            float r1 = r16.mo21766d()
            r0.f24539k = r1
            r12.mo21870l()
            int r1 = r0.f24531c
            r2 = 0
            r3 = 1
            r4 = -1
            if (r1 != r4) goto L_0x0035
            boolean r1 = r0.f24519V
            if (r1 != 0) goto L_0x002c
            int r1 = r0.f24537i
            if (r1 == r4) goto L_0x002c
            int r1 = r0.f24538j
            if (r1 != r4) goto L_0x0042
        L_0x002c:
            int r1 = r0.f24533e
            r0.f24537i = r1
            int r1 = r0.f24534f
            r0.f24538j = r1
            goto L_0x0042
        L_0x0035:
            boolean r1 = r0.f24519V
            if (r1 != 0) goto L_0x0044
            int r1 = r0.f24537i
            if (r1 == r4) goto L_0x0044
            int r1 = r0.f24538j
            if (r1 != r4) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r8 = 0
            goto L_0x004b
        L_0x0044:
            r1 = 100
            r0.f24537i = r1
            r0.f24538j = r1
            r8 = 1
        L_0x004b:
            int r1 = r0.f24537i
            int r5 = r0.f24540l
            int r1 = r1 * r5
            r0.f24541m = r1
            int r1 = r0.f24538j
            int r5 = r0.f24540l
            int r1 = r1 * r5
            r0.f24542n = r1
            java.lang.String r1 = r12.mo21873o()
            int r5 = r0.f24537i
            int r6 = r0.f24538j
            e.c.c r1 = r12.mo21799a(r5, r6, r1, r3)
            r0.f24532d = r1
            e.c.c r1 = r0.f24532d
            r5 = r16
            r6 = r17
            e.c.i r1 = r1.mo21705a(r5, r6, r2)
            r0.f24530b = r1
            int r1 = r0.f24531c
            if (r1 != r4) goto L_0x0086
            r12.m36394W()
            e.c.i r1 = r0.f24530b
            int r4 = r0.f24537i
            int r5 = r0.f24538j
            r1.mo22056a(r4, r5)
            goto L_0x0092
        L_0x0086:
            e.c.i r5 = r0.f24530b
            int r6 = r0.f24537i
            int r7 = r0.f24538j
            r9 = r13
            r10 = r14
            r11 = r15
            r5.mo22057a(r6, r7, r8, r9, r10, r11)
        L_0x0092:
            r0.f24515R = r2
            r0.f24512O = r3
            r0.f24513P = r3
            e.c.i r1 = r0.f24530b
            java.io.File r1 = r1.mo22067h()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.f24535g = r1
            e.c.i r1 = r0.f24530b
            r1.mo22069j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p259c.C6982a.mo21809a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle, e.b.a, android.view.SurfaceHolder):void");
    }

    /* renamed from: W */
    private void m36394W() {
        if (this.f24519V) {
            mo21817a((Runnable) new Runnable() {
                public void run() {
                    C6982a.this.f24530b.mo22055a(C6982a.f24495a < 19 ? 2 : 5894);
                }
            });
        }
    }

    /* renamed from: g */
    public void mo21859g() {
        if (this.f24531c == -1) {
            m36394W();
        }
        mo21833b("resume");
        if (this.f24514Q > 0) {
            mo21880v();
        }
        this.f24505H = true;
        if (this.f24532d != null) {
            this.f24532d.mo22013z();
        }
        this.f24530b.mo22071l();
    }

    /* renamed from: h */
    public void mo21863h() {
        this.f24530b.mo22070k();
        mo21790O();
        if (this.f24532d != null) {
            this.f24532d.mo21750s();
        }
        mo21833b("pause");
        mo21879u();
    }

    /* renamed from: i */
    public void mo21867i() {
        mo21877s();
    }

    /* renamed from: j */
    public void mo21868j() {
        mo21878t();
    }

    /* renamed from: a */
    public void mo21806a(Bundle bundle) {
        mo21795T();
    }

    /* renamed from: k */
    public void mo21869k() {
        mo21833b("onDestroy");
        this.f24530b.mo22072m();
        mo21796U();
    }

    /* renamed from: a */
    public void mo21803a(int i, int i2, Intent intent) {
        mo21834b("onActivityResult", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent});
    }

    /* renamed from: a */
    public void mo21817a(Runnable runnable) {
        this.f24530b.mo22058a(runnable);
    }

    /* renamed from: X */
    private void m36395X() {
        if (this.f24507J.size() > 0) {
            this.f24530b.mo22059a((String[]) this.f24507J.toArray(new String[this.f24507J.size()]));
            this.f24507J.clear();
        }
    }

    /* renamed from: Y */
    private synchronized void m36396Y() {
        if (this.f24529ah) {
            this.f24529ah = false;
            mo21881w();
            if (!this.f24505H) {
                if (mo21855f() != null) {
                    mo21855f().finish();
                }
                this.f24505H = false;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo21822a(String str, Object... objArr) {
        if (this.f24516S) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://processing.org/reference/");
        sb.append(str);
        sb.append("_.html");
        String sb2 = sb.toString();
        if (!this.f24522Y) {
            C7006c cVar = new C7006c(objArr);
            PrintStream printStream = System.err;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("When not using the PDE, ");
            sb3.append(str);
            sb3.append("() can only be used inside settings().");
            printStream.println(sb3.toString());
            PrintStream printStream2 = System.err;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Remove the ");
            sb4.append(str);
            sb4.append("() method from setup(), and add the following:");
            printStream2.println(sb4.toString());
            System.err.println("public void settings() {");
            PrintStream printStream3 = System.err;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  ");
            sb5.append(str);
            sb5.append("(");
            sb5.append(cVar.mo22103b(", "));
            sb5.append(");");
            printStream3.println(sb5.toString());
            System.err.println("}");
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append("() cannot be used here, see ");
        sb6.append(sb2);
        throw new IllegalStateException(sb6.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo21870l() {
        this.f24516S = true;
        mo21800a();
        this.f24516S = false;
    }

    /* renamed from: m */
    public final int mo21871m() {
        return this.f24537i;
    }

    /* renamed from: n */
    public final int mo21872n() {
        return this.f24538j;
    }

    /* renamed from: o */
    public final String mo21873o() {
        return this.f24517T;
    }

    /* renamed from: p */
    public int mo21874p() {
        return this.f24518U;
    }

    /* renamed from: q */
    public final int mo21875q() {
        return this.f24521X;
    }

    /* renamed from: r */
    public void mo21876r() {
        this.f24536h = true;
        this.f24532d.mo21706a();
    }

    /* renamed from: a */
    public void mo21819a(boolean z) {
        this.f24502E = z;
        if (this.f24502E) {
            mo21793R();
        } else {
            mo21794S();
        }
    }

    /* renamed from: a */
    public boolean mo21821a(MotionEvent motionEvent) {
        mo21828b(motionEvent);
        return true;
    }

    /* renamed from: a */
    public void mo21805a(int i, KeyEvent keyEvent) {
        mo21808a(keyEvent);
    }

    /* renamed from: b */
    public void mo21827b(int i, KeyEvent keyEvent) {
        mo21808a(keyEvent);
    }

    /* renamed from: w */
    public void mo21881w() {
        this.f24505H = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21833b(String str) {
        C6986b bVar = (C6986b) this.f24523Z.get(str);
        if (bVar != null) {
            bVar.mo21890a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21834b(String str, final Object[] objArr) {
        final C6986b bVar = (C6986b) this.f24523Z.get(str);
        if (bVar != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    bVar.mo21891a(objArr);
                }
            });
        }
    }

    /* renamed from: c */
    public void mo21837c() {
        this.f24515R = true;
    }

    /* renamed from: a */
    public void mo21804a(int i, int i2, String str) {
        if (i != this.f24537i || i2 != this.f24538j || !this.f24517T.equals(str)) {
            if (mo21822a("size", Integer.valueOf(i), Integer.valueOf(i2), str)) {
                this.f24537i = i;
                this.f24538j = i2;
                this.f24517T = str;
            }
        }
    }

    /* renamed from: a */
    public void mo21802a(int i, int i2) {
        if (this.f24519V) {
            this.f24533e = i;
            this.f24534f = i2;
        }
        this.f24537i = i;
        this.f24538j = i2;
        this.f24541m = i * this.f24540l;
        this.f24542n = i2 * this.f24540l;
        this.f24532d.mo21715a(mo21871m(), mo21872n());
    }

    /* renamed from: b */
    public C6989c mo21823b(int i, int i2) {
        return mo21824b(i, i2, "processing.core.PGraphicsAndroid2D");
    }

    /* renamed from: b */
    public C6989c mo21824b(int i, int i2, String str) {
        return mo21799a(i, i2, str, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6989c mo21799a(int i, int i2, String str, boolean z) {
        C6989c cVar;
        if (str.equals("processing.core.PGraphicsAndroid2D")) {
            cVar = new C6974a();
        } else if (str.equals("processing.opengl.PGraphics2D")) {
            if (z || this.f24532d.mo21951ae()) {
                cVar = new C7063g();
            } else {
                throw new RuntimeException("createGraphics() with P2D requires size() to use P2D or P3D");
            }
        } else if (!str.equals("processing.opengl.PGraphics3D")) {
            try {
                Class loadClass = Thread.currentThread().getContextClassLoader().loadClass(str);
                if (loadClass != null) {
                    try {
                        Constructor constructor = loadClass.getConstructor(new Class[0]);
                        if (constructor != null) {
                            try {
                                cVar = (C6989c) constructor.newInstance(new Object[0]);
                            } catch (InvocationTargetException e) {
                                mo21818a((Throwable) e);
                                throw new RuntimeException(e.getMessage());
                            } catch (IllegalAccessException e2) {
                                mo21818a((Throwable) e2);
                                throw new RuntimeException(e2.getMessage());
                            } catch (InstantiationException e3) {
                                mo21818a((Throwable) e3);
                                throw new RuntimeException(e3.getMessage());
                            } catch (IllegalArgumentException e4) {
                                mo21818a((Throwable) e4);
                            }
                        }
                    } catch (NoSuchMethodException unused) {
                        throw new RuntimeException("Missing renderer constructor");
                    }
                }
                cVar = null;
            } catch (ClassNotFoundException unused2) {
                throw new RuntimeException("Missing renderer class");
            }
        } else if (z || this.f24532d.mo21951ae()) {
            cVar = new C7064h();
        } else {
            throw new RuntimeException("createGraphics() with P3D or OPENGL requires size() to use P2D or P3D");
        }
        cVar.mo21939a(this);
        cVar.mo21946a(z);
        cVar.mo21715a(i, i2);
        return cVar;
    }

    /* renamed from: x */
    public void mo21882x() {
        if (this.f24532d != null) {
            if (!this.f24536h && this.f24531c != -1) {
                return;
            }
            if (this.f24512O || this.f24513P) {
                if (this.f24509L) {
                    System.err.println("handleDraw() called before finishing");
                    System.exit(1);
                }
                this.f24509L = true;
                if (!mo21883y()) {
                    this.f24532d.mo21731d();
                    long nanoTime = System.nanoTime();
                    if (this.f24514Q == 0) {
                        mo21825b();
                    } else {
                        this.f24511N = (this.f24511N * 0.9f) + (((float) ((1000000.0d / (((double) (nanoTime - this.f24510M)) / 1000000.0d)) / 1000.0d)) * 0.1f);
                        if (this.f24514Q != 0) {
                            mo21833b("pre");
                        }
                        this.f24545q = this.f24550v;
                        this.f24546r = this.f24551w;
                        mo21837c();
                        this.f24550v = this.f24543o;
                        this.f24551w = this.f24544p;
                        mo21778C();
                        mo21833b("draw");
                        m36395X();
                        m36396Y();
                        this.f24513P = false;
                    }
                    this.f24532d.mo21734e();
                    this.f24509L = false;
                    if (this.f24514Q != 0) {
                        mo21833b("post");
                    }
                    this.f24510M = nanoTime;
                    this.f24514Q++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo21883y() {
        /*
            r3 = this;
            e.c.c r0 = r3.f24532d
            boolean r0 = r0.mo21906A()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            e.c.c r0 = r3.f24532d
            r0.mo21731d()
            e.c.c r0 = r3.f24532d
            r0.mo21734e()
        L_0x0014:
            r0 = 1
            goto L_0x002e
        L_0x0016:
            e.c.c r0 = r3.f24532d
            boolean r0 = r0.f24702bZ
            if (r0 == 0) goto L_0x002d
            r3.f24512O = r2
            e.c.c r0 = r3.f24532d
            r0.mo21731d()
            e.c.c r0 = r3.f24532d
            r0.mo21734e()
            e.c.c r0 = r3.f24532d
            r0.f24702bZ = r2
            goto L_0x0014
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r3.f24509L = r2
            return r1
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p259c.C6982a.mo21883y():boolean");
    }

    /* renamed from: z */
    public synchronized void mo21884z() {
        if (!this.f24512O) {
            this.f24512O = true;
        }
    }

    /* renamed from: A */
    public synchronized void mo21776A() {
        if (this.f24512O) {
            if (this.f24532d.mo21907B()) {
                this.f24532d.f24702bZ = true;
            } else {
                this.f24512O = false;
            }
        }
    }

    /* renamed from: B */
    public boolean mo21777B() {
        return this.f24512O;
    }

    /* renamed from: a */
    public void mo21813a(C7008a aVar) {
        this.f24524aa.mo21888a(aVar);
        if (!this.f24512O) {
            mo21778C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo21778C() {
        while (this.f24524aa.mo21889b()) {
            C7008a a = this.f24524aa.mo21887a();
            switch (a.mo22110a()) {
                case 1:
                    mo21814a((C7009b) a);
                    break;
                case 2:
                    mo21815a((C7010c) a);
                    break;
                case 3:
                    mo21816a((C7011d) a);
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21815a(C7010c cVar) {
        if (cVar.mo22111b() == 4 || cVar.mo22111b() == 5) {
            this.f24545q = this.f24552x;
            this.f24546r = this.f24553y;
            this.f24543o = cVar.mo22115c();
            this.f24544p = cVar.mo22116d();
        }
        if (cVar.mo22111b() == 1) {
            this.f24543o = cVar.mo22115c();
            this.f24544p = cVar.mo22116d();
            this.f24545q = this.f24543o;
            this.f24546r = this.f24544p;
            this.f24550v = this.f24543o;
            this.f24551w = this.f24544p;
        }
        switch (cVar.mo22111b()) {
            case 1:
                this.f24547s = true;
                break;
            case 2:
                this.f24547s = false;
                break;
        }
        mo21834b("mouseEvent", new Object[]{cVar});
        switch (cVar.mo22111b()) {
            case 1:
                mo21831b(cVar);
                break;
            case 2:
                mo21840c(cVar);
                break;
            case 3:
                mo21846d(cVar);
                break;
            case 4:
                mo21852e(cVar);
                break;
            case 5:
                mo21857f(cVar);
                break;
            case 6:
                mo21860g(cVar);
                break;
            case 7:
                mo21864h(cVar);
                break;
        }
        if (cVar.mo22111b() == 4 || cVar.mo22111b() == 5) {
            this.f24552x = this.f24543o;
            this.f24553y = this.f24544p;
        }
        if (cVar.mo22111b() == 1) {
            this.f24552x = this.f24543o;
            this.f24553y = this.f24544p;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21816a(C7011d dVar) {
        this.f24549u = dVar.mo22119a(this.f24549u);
        switch (dVar.mo22111b()) {
            case 1:
                this.f24548t = true;
                break;
            case 2:
                this.f24548t = false;
                break;
        }
        mo21834b("touchEvent", new Object[]{dVar});
        switch (dVar.mo22111b()) {
            case 1:
                mo21832b(dVar);
                return;
            case 2:
                mo21847d(dVar);
                return;
            case 3:
                mo21853e(dVar);
                return;
            case 4:
                mo21841c(dVar);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21828b(MotionEvent motionEvent) {
        int metaState = motionEvent.getMetaState();
        int i = (metaState & 1) != 0 ? 1 : 0;
        if ((metaState & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            i |= 2;
        }
        if ((65536 & metaState) != 0) {
            i |= 4;
        }
        if ((metaState & 2) != 0) {
            i |= 8;
        }
        int buttonState = motionEvent.getButtonState();
        if (buttonState != 4) {
            switch (buttonState) {
                case 1:
                    buttonState = 21;
                    break;
                case 2:
                    buttonState = 22;
                    break;
            }
        } else {
            buttonState = 3;
        }
        mo21829b(motionEvent, buttonState, i);
        mo21811a(motionEvent, buttonState, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21811a(MotionEvent motionEvent, int i, int i2) {
        int i3;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
            case 5:
                i3 = 1;
                break;
            case 1:
            case 6:
                i3 = 2;
                break;
            case 2:
                i3 = 4;
                break;
            default:
                i3 = 3;
                break;
        }
        if (i3 == 1 || i3 == 2) {
            this.f24498A = motionEvent2.getPointerId(0);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (action == 2) {
            int historySize = motionEvent.getHistorySize();
            for (int i4 = 0; i4 < historySize; i4++) {
                C7011d dVar = r1;
                C7011d dVar2 = new C7011d(motionEvent, motionEvent2.getHistoricalEventTime(i4), i3, i2, i);
                dVar.mo22117a(pointerCount);
                int i5 = 0;
                while (i5 < pointerCount) {
                    int i6 = i5;
                    dVar.mo22118a(i5, motionEvent2.getPointerId(i5), motionEvent2.getHistoricalX(i5, i4), motionEvent2.getHistoricalY(i5, i4), motionEvent2.getHistoricalSize(i5, i4), motionEvent2.getHistoricalPressure(i5, i4));
                    i5 = i6 + 1;
                }
                mo21813a((C7008a) dVar);
            }
        }
        C7011d dVar3 = new C7011d(motionEvent, motionEvent.getEventTime(), i3, i2, i);
        if (action == 1) {
            dVar3.mo22117a(0);
        } else {
            dVar3.mo22117a(pointerCount);
            for (int i7 = 0; i7 < motionEvent.getPointerCount(); i7++) {
                dVar3.mo22118a(i7, motionEvent2.getPointerId(i7), motionEvent2.getX(i7), motionEvent2.getY(i7), motionEvent2.getSize(i7), motionEvent2.getPressure(i7));
            }
        }
        mo21813a((C7008a) dVar3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21829b(MotionEvent motionEvent, int i, int i2) {
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f24554z = motionEvent.getPointerId(0);
                C7010c cVar = new C7010c(motionEvent, motionEvent.getEventTime(), 1, i2, (int) motionEvent.getX(), (int) motionEvent.getY(), i, 1);
                mo21813a((C7008a) cVar);
                return;
            case 1:
                int findPointerIndex = motionEvent.findPointerIndex(this.f24554z);
                if (findPointerIndex != -1) {
                    C7010c cVar2 = new C7010c(motionEvent, motionEvent.getEventTime(), 2, i2, (int) motionEvent.getX(findPointerIndex), (int) motionEvent.getY(findPointerIndex), i, 1);
                    mo21813a((C7008a) cVar2);
                    return;
                }
                return;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f24554z);
                if (findPointerIndex2 != -1) {
                    C7010c cVar3 = new C7010c(motionEvent, motionEvent.getEventTime(), 4, i2, (int) motionEvent.getX(findPointerIndex2), (int) motionEvent.getY(findPointerIndex2), i, 1);
                    mo21813a((C7008a) cVar3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void mo21831b(C7010c cVar) {
        mo21779D();
    }

    /* renamed from: c */
    public void mo21840c(C7010c cVar) {
        mo21780E();
    }

    /* renamed from: d */
    public void mo21846d(C7010c cVar) {
        mo21781F();
    }

    /* renamed from: e */
    public void mo21852e(C7010c cVar) {
        mo21782G();
    }

    /* renamed from: f */
    public void mo21857f(C7010c cVar) {
        mo21783H();
    }

    /* renamed from: g */
    public void mo21860g(C7010c cVar) {
        mo21784I();
    }

    /* renamed from: h */
    public void mo21864h(C7010c cVar) {
        mo21785J();
    }

    /* renamed from: b */
    public void mo21832b(C7011d dVar) {
        mo21786K();
    }

    /* renamed from: c */
    public void mo21841c(C7011d dVar) {
        mo21787L();
    }

    /* renamed from: d */
    public void mo21847d(C7011d dVar) {
        mo21788M();
    }

    /* renamed from: e */
    public void mo21853e(C7011d dVar) {
        mo21789N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21814a(C7009b bVar) {
        if (this.f24503F || !bVar.mo22114e()) {
            this.f24499B = bVar.mo22112c();
            this.f24500C = bVar.mo22113d();
            switch (bVar.mo22111b()) {
                case 1:
                    this.f24501D = true;
                    mo21830b(bVar);
                    break;
                case 2:
                    this.f24501D = false;
                    mo21839c(bVar);
                    break;
            }
            mo21834b("keyEvent", new Object[]{bVar});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21808a(KeyEvent keyEvent) {
        char unicodeChar = (char) keyEvent.getUnicodeChar();
        char c = (unicodeChar == 0 || unicodeChar == 65535) ? 65535 : unicodeChar;
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        int i = action == 0 ? 1 : action == 1 ? 2 : 0;
        C7009b bVar = new C7009b(keyEvent, keyEvent.getEventTime(), i, 0, c, keyCode, keyEvent.getRepeatCount() > 0);
        mo21813a((C7008a) bVar);
    }

    /* renamed from: O */
    public void mo21790O() {
        if (this.f24504G) {
            ((InputMethodManager) this.f24530b.mo22060b().getSystemService("input_method")).toggleSoftInput(1, 0);
            this.f24504G = false;
            if (this.f24531c == -1) {
                m36394W();
            }
        }
    }

    /* renamed from: b */
    public void mo21830b(C7009b bVar) {
        mo21791P();
    }

    /* renamed from: c */
    public void mo21839c(C7009b bVar) {
        mo21792Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21818a(Throwable th) {
        th.printStackTrace();
    }

    /* renamed from: U */
    public final void mo21796U() {
        this.f24515R = true;
        if (this.f24530b != null) {
            this.f24530b.mo22072m();
            this.f24530b.mo22063d();
        }
        if (this.f24532d != null) {
            this.f24532d.mo21749r();
            this.f24532d.mo21723b();
        }
        mo21833b("dispose");
    }

    /* renamed from: c */
    public void mo21842c(String str) {
        this.f24532d.mo21990h(mo21866i(str));
    }

    /* renamed from: c */
    public static final float m36418c(float f) {
        return (float) Math.sqrt((double) f);
    }

    /* renamed from: d */
    public static final float m36421d(float f) {
        return (float) Math.sin((double) f);
    }

    /* renamed from: e */
    public static final float m36423e(float f) {
        return (float) Math.cos((double) f);
    }

    /* renamed from: b */
    public static final float m36414b(float f, float f2) {
        return (float) Math.atan2((double) f, (double) f2);
    }

    /* renamed from: f */
    public static final int m36424f(float f) {
        return (int) Math.ceil((double) f);
    }

    /* renamed from: g */
    public static final int m36425g(float f) {
        return Math.round(f);
    }

    /* renamed from: a */
    public static final float m36400a(float f, float f2, float f3, float f4) {
        return m36418c(m36413b(f3 - f) + m36413b(f4 - f2));
    }

    /* renamed from: h */
    public final float mo21861h(float f) {
        float nextFloat;
        if (f == 0.0f || f != f) {
            return 0.0f;
        }
        if (this.f24525ab == null) {
            this.f24525ab = new Random();
        }
        do {
            nextFloat = this.f24525ab.nextFloat() * f;
        } while (nextFloat == f);
        return nextFloat;
    }

    /* renamed from: c */
    public final float mo21836c(float f, float f2) {
        float h;
        if (f >= f2) {
            return f;
        }
        float f3 = f2 - f;
        do {
            h = mo21861h(f3) + f;
        } while (h == f2);
        return h;
    }

    /* renamed from: d */
    public C6992d mo21844d(String str) {
        InputStream e = mo21851e(str);
        if (e == null) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find the image ");
            sb.append(str);
            sb.append(".");
            printStream.println(sb.toString());
            return null;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(e);
            if (decodeStream == null) {
                System.err.println("Could not load the image because the bitmap was empty.");
                return null;
            }
            C6992d dVar = new C6992d(decodeStream);
            dVar.f24755cj = this;
            return dVar;
        } finally {
            try {
                e.close();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C6987b mo21865i(float f) {
        return mo21798a("SansSerif", f, true, (char[]) null);
    }

    /* renamed from: a */
    public C6987b mo21798a(String str, float f, boolean z, char[] cArr) {
        Typeface typeface;
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".otf") || lowerCase.endsWith(".ttf")) {
            typeface = Typeface.createFromAsset(this.f24530b.mo22068i(), str);
        } else {
            typeface = (Typeface) C6987b.m36542a(str);
        }
        return new C6987b(typeface, m36425g(f), z, cArr);
    }

    /* renamed from: e */
    public InputStream mo21851e(String str) {
        InputStream f = mo21856f(str);
        String lowerCase = str.toLowerCase();
        if (f == null || (!lowerCase.endsWith(".gz") && !lowerCase.endsWith(".svgz"))) {
            return new BufferedInputStream(f);
        }
        try {
            return new BufferedInputStream(new GZIPInputStream(f));
        } catch (IOException e) {
            mo21818a((Throwable) e);
            return null;
        }
    }

    /* renamed from: f */
    public InputStream mo21856f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.indexOf(":") != -1) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                return httpURLConnection.getInputStream();
            } catch (FileNotFoundException | MalformedURLException unused) {
            } catch (IOException e) {
                mo21818a((Throwable) e);
                return null;
            }
        }
        try {
            InputStream open = this.f24530b.mo22068i().open(str);
            if (open != null) {
                return open;
            }
        } catch (IOException unused2) {
        }
        File file = new File(str);
        if (file.exists()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused3) {
            }
        }
        File file2 = new File(mo21862h(str));
        if (file2.exists()) {
            try {
                return new FileInputStream(file2);
            } catch (FileNotFoundException unused4) {
            }
        }
        return this.f24530b.mo22061b(str);
    }

    /* renamed from: a */
    public static String[] m36409a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String[] strArr = new String[100];
            int i = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (i == strArr.length) {
                    String[] strArr2 = new String[(i << 1)];
                    System.arraycopy(strArr, 0, strArr2, 0, i);
                    strArr = strArr2;
                }
                int i2 = i + 1;
                strArr[i] = readLine;
                i = i2;
            }
            bufferedReader.close();
            if (i == strArr.length) {
                return strArr;
            }
            String[] strArr3 = new String[i];
            System.arraycopy(strArr, 0, strArr3, 0, i);
            return strArr3;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public OutputStream mo21858g(String str) {
        try {
            File file = new File(str);
            if (!file.isAbsolute()) {
                file = new File(mo21862h(str));
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            return file.getName().toLowerCase().endsWith(".gz") ? new GZIPOutputStream(fileOutputStream) : fileOutputStream;
        } catch (IOException e) {
            mo21818a((Throwable) e);
            return null;
        }
    }

    /* renamed from: h */
    public String mo21862h(String str) {
        if (this.f24535g == null) {
            return str;
        }
        try {
            if (new File(str).isAbsolute()) {
                return str;
            }
        } catch (Exception unused) {
        }
        return this.f24530b.mo22054a(str).getAbsolutePath();
    }

    /* renamed from: i */
    public String mo21866i(String str) {
        if (str == null) {
            return null;
        }
        String h = mo21862h(str);
        m36426j(h);
        return h;
    }

    /* renamed from: j */
    public static void m36426j(String str) {
        m36405a(new File(str));
    }

    /* renamed from: a */
    public static void m36405a(File file) {
        try {
            String parent = file.getParent();
            if (parent != null) {
                File file2 = new File(parent);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("You don't have permissions to create ");
            sb.append(file.getAbsolutePath());
            printStream.println(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m36406a(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* renamed from: a */
    public static void m36408a(Object obj, Object obj2, int i) {
        System.arraycopy(obj, 0, obj2, 0, i);
    }

    /* renamed from: a */
    public static void m36407a(Object obj, Object obj2) {
        System.arraycopy(obj, 0, obj2, 0, Array.getLength(obj));
    }

    /* renamed from: a */
    public static String[] m36411a(String[] strArr) {
        return m36412a(strArr, strArr.length << 1);
    }

    /* renamed from: a */
    public static String[] m36412a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(i, strArr.length));
        return strArr2;
    }

    /* renamed from: a */
    public static Object m36402a(Object obj) {
        return m36403a(obj, Array.getLength(obj) << 1);
    }

    /* renamed from: a */
    public static Object m36403a(Object obj, int i) {
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i);
        System.arraycopy(obj, 0, newInstance, 0, Math.min(Array.getLength(obj), i));
        return newInstance;
    }

    /* renamed from: a */
    public static String m36404a(String[] strArr, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(strArr[i]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: k */
    static Pattern m36427k(String str) {
        Pattern pattern;
        if (f24496af == null) {
            f24496af = new HashMap<>();
            pattern = null;
        } else {
            pattern = (Pattern) f24496af.get(str);
        }
        if (pattern != null) {
            return pattern;
        }
        if (f24496af.size() == 10) {
            f24496af.clear();
        }
        Pattern compile = Pattern.compile(str, 40);
        f24496af.put(str, compile);
        return compile;
    }

    /* renamed from: a */
    public static String[] m36410a(String str, String str2) {
        Matcher matcher = m36427k(str2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        int groupCount = matcher.groupCount() + 1;
        String[] strArr = new String[groupCount];
        for (int i = 0; i < groupCount; i++) {
            strArr[i] = matcher.group(i);
        }
        return strArr;
    }

    /* renamed from: e */
    public final int mo21849e(int i, int i2) {
        if (this.f24532d != null) {
            return this.f24532d.mo21973e(i, i2);
        }
        if (i2 > 255) {
            i2 = 255;
        } else if (i2 < 0) {
            i2 = 0;
        }
        if (i <= 255) {
            return i | (i2 << 24) | (i << 16) | (i << 8);
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* renamed from: b */
    public void mo21826b(float f, float f2, float f3, float f4) {
        this.f24532d.mo21981f(f, f2, f3, f4);
    }

    /* renamed from: a */
    public void mo21812a(C6992d dVar, float f, float f2, float f3, float f4) {
        this.f24532d.mo21940a(dVar, f, f2, f3, f4);
    }

    /* renamed from: V */
    public void mo21797V() {
        this.f24532d.mo21926U();
    }

    /* renamed from: a */
    public void mo21801a(int i, float f) {
        this.f24532d.mo21935a(i, f);
    }

    /* renamed from: c */
    public void mo21838c(int i) {
        this.f24532d.mo22003u(i);
    }

    /* renamed from: d */
    public final float mo21843d(int i) {
        return this.f24532d.mo22008x(i);
    }

    /* renamed from: e */
    public final float mo21848e(int i) {
        return this.f24532d.mo22010y(i);
    }

    /* renamed from: f */
    public final float mo21854f(int i) {
        return this.f24532d.mo22012z(i);
    }
}
