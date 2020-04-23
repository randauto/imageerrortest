package p073b.p085h.p087b.p088a.p090b.p100d.p110b.p111a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2088o;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n.C2138a;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n.C2139b;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n.C2140c;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.p111a.C2105a.C2106a;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2313d;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2319g;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.d.b.a.b */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class C2108b implements C2140c {

    /* renamed from: a */
    private static final boolean f6389a = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: b */
    private static final Map<C2354a, C2106a> f6390b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2319g f6391c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2313d f6392d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f6393e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f6394f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f6395g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String[] f6396h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String[] f6397i = null;

    /* renamed from: j */
    private String[] f6398j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2106a f6399k = null;

    /* renamed from: b.h.b.a.b.d.b.a.b$a */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private static abstract class C2110a implements C2139b {

        /* renamed from: a */
        private final List<String> f6400a = new ArrayList();

        /* renamed from: a */
        public void mo8016a(C2354a aVar, C2360f fVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo8018a(String[] strArr);

        /* renamed from: a */
        public void mo8017a(Object obj) {
            if (obj instanceof String) {
                this.f6400a.add((String) obj);
            }
        }

        /* renamed from: a */
        public void mo8015a() {
            mo8018a((String[]) this.f6400a.toArray(new String[this.f6400a.size()]));
        }
    }

    /* renamed from: b.h.b.a.b.d.b.a.b$b */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class C2111b implements C2138a {
        /* renamed from: a */
        public C2138a mo8019a(C2360f fVar, C2354a aVar) {
            return null;
        }

        /* renamed from: a */
        public void mo8021a() {
        }

        /* renamed from: a */
        public void mo8022a(C2360f fVar, C2354a aVar, C2360f fVar2) {
        }

        private C2111b() {
        }

        /* renamed from: a */
        public void mo8023a(C2360f fVar, Object obj) {
            if (fVar != null) {
                String a = fVar.mo9039a();
                if ("k".equals(a)) {
                    if (obj instanceof Integer) {
                        C2108b.this.f6399k = C2106a.m9437a(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(a)) {
                    if (obj instanceof int[]) {
                        C2108b.this.f6391c = new C2319g((int[]) obj);
                    }
                } else if ("bv".equals(a)) {
                    if (obj instanceof int[]) {
                        C2108b.this.f6392d = new C2313d((int[]) obj);
                    }
                } else if ("xs".equals(a)) {
                    if (obj instanceof String) {
                        C2108b.this.f6393e = (String) obj;
                    }
                } else if ("xi".equals(a)) {
                    if (obj instanceof Integer) {
                        C2108b.this.f6394f = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(a) && (obj instanceof String)) {
                    C2108b.this.f6395g = (String) obj;
                }
            }
        }

        /* renamed from: a */
        public C2139b mo8020a(C2360f fVar) {
            String a = fVar.mo9039a();
            if ("d1".equals(a)) {
                return m9457b();
            }
            if ("d2".equals(a)) {
                return m9458c();
            }
            return null;
        }

        /* renamed from: b */
        private C2139b m9457b() {
            return new C2110a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo8018a(String[] strArr) {
                    C2108b.this.f6396h = strArr;
                }
            };
        }

        /* renamed from: c */
        private C2139b m9458c() {
            return new C2110a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo8018a(String[] strArr) {
                    C2108b.this.f6397i = strArr;
                }
            };
        }
    }

    /* renamed from: b.h.b.a.b.d.b.a.b$c */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class C2114c implements C2138a {
        /* renamed from: a */
        public C2138a mo8019a(C2360f fVar, C2354a aVar) {
            return null;
        }

        /* renamed from: a */
        public void mo8021a() {
        }

        /* renamed from: a */
        public void mo8022a(C2360f fVar, C2354a aVar, C2360f fVar2) {
        }

        private C2114c() {
        }

        /* renamed from: a */
        public void mo8023a(C2360f fVar, Object obj) {
            if (fVar != null) {
                String a = fVar.mo9039a();
                if ("version".equals(a)) {
                    if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        C2108b.this.f6391c = new C2319g(iArr);
                        if (C2108b.this.f6392d == null) {
                            C2108b.this.f6392d = new C2313d(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(a)) {
                    C2108b.this.f6393e = obj instanceof String ? (String) obj : null;
                }
            }
        }

        /* renamed from: a */
        public C2139b mo8020a(C2360f fVar) {
            String a = fVar.mo9039a();
            if ("data".equals(a) || "filePartClassNames".equals(a)) {
                return m9466b();
            }
            if ("strings".equals(a)) {
                return m9467c();
            }
            return null;
        }

        /* renamed from: b */
        private C2139b m9466b() {
            return new C2110a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo8018a(String[] strArr) {
                    C2108b.this.f6396h = strArr;
                }
            };
        }

        /* renamed from: c */
        private C2139b m9467c() {
            return new C2110a() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo8018a(String[] strArr) {
                    C2108b.this.f6397i = strArr;
                }
            };
        }
    }

    /* renamed from: a */
    public void mo8001a() {
    }

    static {
        f6390b.put(C2354a.m11661a(new C2355b("kotlin.jvm.internal.KotlinClass")), C2106a.CLASS);
        f6390b.put(C2354a.m11661a(new C2355b("kotlin.jvm.internal.KotlinFileFacade")), C2106a.FILE_FACADE);
        f6390b.put(C2354a.m11661a(new C2355b("kotlin.jvm.internal.KotlinMultifileClass")), C2106a.MULTIFILE_CLASS);
        f6390b.put(C2354a.m11661a(new C2355b("kotlin.jvm.internal.KotlinMultifileClassPart")), C2106a.MULTIFILE_CLASS_PART);
        f6390b.put(C2354a.m11661a(new C2355b("kotlin.jvm.internal.KotlinSyntheticClass")), C2106a.SYNTHETIC_CLASS);
    }

    /* renamed from: b */
    public C2105a mo8014b() {
        if (this.f6399k == null) {
            return null;
        }
        if (!this.f6391c.mo8893d()) {
            this.f6398j = this.f6396h;
        }
        if (this.f6391c == null || !this.f6391c.mo8893d()) {
            this.f6396h = null;
        } else if (m9449c() && this.f6396h == null) {
            return null;
        }
        C2105a aVar = new C2105a(this.f6399k, this.f6391c != null ? this.f6391c : C2319g.f7108c, this.f6392d != null ? this.f6392d : C2313d.f7099c, this.f6396h, this.f6398j, this.f6397i, this.f6393e, this.f6394f, this.f6395g);
        return aVar;
    }

    /* renamed from: c */
    private boolean m9449c() {
        return this.f6399k == C2106a.CLASS || this.f6399k == C2106a.FILE_FACADE || this.f6399k == C2106a.MULTIFILE_CLASS_PART;
    }

    /* renamed from: a */
    public C2138a mo8000a(C2354a aVar, C1692am amVar) {
        if (aVar.mo9008g().equals(C2088o.f6323a)) {
            return new C2111b();
        }
        if (f6389a || this.f6399k != null) {
            return null;
        }
        C2106a aVar2 = (C2106a) f6390b.get(aVar);
        if (aVar2 == null) {
            return null;
        }
        this.f6399k = aVar2;
        return new C2114c();
    }
}
