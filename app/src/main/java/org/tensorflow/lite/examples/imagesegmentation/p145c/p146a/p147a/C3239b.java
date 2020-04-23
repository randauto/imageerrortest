package p145c.p146a.p147a;

import android.app.Activity;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: c.a.a.b */
/* compiled from: Calculator */
class C3239b {

    /* renamed from: a */
    private final int f8667a;

    /* renamed from: b */
    private final int f8668b;

    /* renamed from: c */
    private C3255g f8669c;

    /* renamed from: d */
    private int f8670d;

    /* renamed from: e */
    private int f8671e;

    /* renamed from: f */
    private int f8672f;

    /* renamed from: g */
    private int f8673g;

    /* renamed from: h */
    private int f8674h;

    /* renamed from: i */
    private boolean f8675i;

    C3239b(Activity activity, C3255g gVar, View view, double d, boolean z) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        this.f8667a = i3;
        if (z) {
            i = 0;
        } else {
            i = C3264k.m14942a(activity);
        }
        this.f8668b = i4 - i;
        if (view != null) {
            if (!z || VERSION.SDK_INT < 21) {
                i2 = C3264k.m14942a(activity);
            } else {
                i2 = 0;
            }
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.f8670d = view.getWidth();
            this.f8671e = view.getHeight();
            this.f8669c = gVar;
            this.f8672f = iArr[0] + (this.f8670d / 2);
            this.f8673g = (iArr[1] + (this.f8671e / 2)) - i2;
            this.f8674h = (int) (((double) ((int) (Math.hypot((double) view.getWidth(), (double) view.getHeight()) / 2.0d))) * d);
            this.f8675i = true;
            return;
        }
        this.f8675i = false;
    }

    /* renamed from: a */
    public void mo10416a(int i, int i2, int i3, int i4) {
        this.f8672f = i;
        this.f8673g = i2;
        this.f8670d = i3;
        this.f8671e = i4;
        this.f8669c = C3255g.ROUNDED_RECTANGLE;
        this.f8675i = true;
    }

    /* renamed from: a */
    public void mo10415a(int i, int i2, int i3) {
        this.f8672f = i;
        this.f8674h = i3;
        this.f8673g = i2;
        this.f8669c = C3255g.CIRCLE;
        this.f8675i = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3255g mo10414a() {
        return this.f8669c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo10418b() {
        return this.f8670d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo10420c() {
        return this.f8671e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo10422d() {
        return this.f8672f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo10424e() {
        return this.f8673g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo10425f() {
        return this.f8675i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo10413a(int i, double d) {
        return (float) (((double) this.f8674h) + (((double) i) * d));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo10417b(int i, double d) {
        return (float) (((double) (this.f8672f - (this.f8670d / 2))) - (((double) i) * d));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo10419c(int i, double d) {
        return (float) (((double) (this.f8673g - (this.f8671e / 2))) - (((double) i) * d));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo10421d(int i, double d) {
        return (float) (((double) (this.f8672f + (this.f8670d / 2))) + (((double) i) * d));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo10423e(int i, double d) {
        return (float) (((double) (this.f8673g + (this.f8671e / 2))) + (((double) i) * d));
    }
}
