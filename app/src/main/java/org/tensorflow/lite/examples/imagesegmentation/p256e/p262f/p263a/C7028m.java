package p256e.p262f.p263a;

/* renamed from: e.f.a.m */
/* compiled from: PGLU */
public class C7028m {

    /* renamed from: a */
    private static String[] f24979a = {"invalid enumerant", "invalid value", "invalid operation", "stack overflow", "stack underflow", "out of memory", "invalid framebuffer operation"};

    /* renamed from: b */
    private static String[] f24980b = {"invalid enumerant", "invalid value", "out of memory", "", "invalid operation"};

    /* renamed from: c */
    private static String[] f24981c = {" ", "gluTessBeginPolygon() must precede a gluTessEndPolygon", "gluTessBeginContour() must precede a gluTessEndContour()", "gluTessEndPolygon() must follow a gluTessBeginPolygon()", "gluTessEndContour() must follow a gluTessBeginContour()", "a coordinate is too large", "need combine callback"};

    /* renamed from: a */
    public static final C7029n m36916a() {
        return C7023h.m36862a();
    }

    /* renamed from: a */
    public static final void m36920a(C7029n nVar, int i, C7030o oVar) {
        ((C7023h) nVar).mo22136a(i, oVar);
    }

    /* renamed from: a */
    public static final void m36921a(C7029n nVar, Object obj) {
        ((C7023h) nVar).mo22137a(obj);
    }

    /* renamed from: a */
    public static final void m36918a(C7029n nVar) {
        ((C7023h) nVar).mo22145d();
    }

    /* renamed from: a */
    public static final void m36919a(C7029n nVar, int i, double d) {
        ((C7023h) nVar).mo22135a(i, d);
    }

    /* renamed from: b */
    public static final void m36923b(C7029n nVar) {
        ((C7023h) nVar).mo22141b();
    }

    /* renamed from: c */
    public static final void m36924c(C7029n nVar) {
        ((C7023h) nVar).mo22144c();
    }

    /* renamed from: a */
    public static final void m36922a(C7029n nVar, double[] dArr, int i, Object obj) {
        ((C7023h) nVar).mo22139a(dArr, i, obj);
    }

    /* renamed from: a */
    public static String m36917a(int i) {
        if (i == 0) {
            return "no error";
        }
        if (i >= 1280 && i <= 1286) {
            return f24979a[i - 1280];
        }
        if (i == 32817) {
            return "table too large";
        }
        if (i >= 100900 && i <= 100904) {
            return f24980b[i - 100900];
        }
        if (i >= 100151 && i <= 100158) {
            return f24981c[i - 100150];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("error (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
