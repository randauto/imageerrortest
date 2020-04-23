package p073b.p085h.p087b.p088a.p090b.p116f;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p073b.p074a.C1406e;
import p073b.p079e.p080a.C1450b;

/* renamed from: b.h.b.a.b.f.c */
/* compiled from: FqNameUnsafe */
public final class C2356c {

    /* renamed from: a */
    private static final C2360f f7224a = C2360f.m11703c("<root>");

    /* renamed from: b */
    private static final Pattern f7225b = Pattern.compile("\\.");

    /* renamed from: c */
    private static final C1450b<String, C2360f> f7226c = new C1450b<String, C2360f>() {
        /* renamed from: a */
        public C2360f mo6756a(String str) {
            return C2360f.m11704d(str);
        }
    };

    /* renamed from: d */
    private final String f7227d;

    /* renamed from: e */
    private transient C2355b f7228e;

    /* renamed from: f */
    private transient C2356c f7229f;

    /* renamed from: g */
    private transient C2360f f7230g;

    C2356c(String str, C2355b bVar) {
        this.f7227d = str;
        this.f7228e = bVar;
    }

    public C2356c(String str) {
        this.f7227d = str;
    }

    private C2356c(String str, C2356c cVar, C2360f fVar) {
        this.f7227d = str;
        this.f7229f = cVar;
        this.f7230g = fVar;
    }

    /* renamed from: i */
    private void m11684i() {
        int lastIndexOf = this.f7227d.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f7230g = C2360f.m11704d(this.f7227d.substring(lastIndexOf + 1));
            this.f7229f = new C2356c(this.f7227d.substring(0, lastIndexOf));
            return;
        }
        this.f7230g = C2360f.m11704d(this.f7227d);
        this.f7229f = C2355b.f7221a.mo9014b();
    }

    /* renamed from: a */
    public String mo9025a() {
        return this.f7227d;
    }

    /* renamed from: b */
    public boolean mo9026b() {
        return this.f7228e != null || mo9025a().indexOf(60) < 0;
    }

    /* renamed from: c */
    public C2355b mo9028c() {
        if (this.f7228e != null) {
            return this.f7228e;
        }
        this.f7228e = new C2355b(this);
        return this.f7228e;
    }

    /* renamed from: d */
    public boolean mo9029d() {
        return this.f7227d.isEmpty();
    }

    /* renamed from: e */
    public C2356c mo9030e() {
        if (this.f7229f != null) {
            return this.f7229f;
        }
        if (!mo9029d()) {
            m11684i();
            return this.f7229f;
        }
        throw new IllegalStateException("root");
    }

    /* renamed from: a */
    public C2356c mo9024a(C2360f fVar) {
        String str;
        if (mo9029d()) {
            str = fVar.mo9039a();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7227d);
            sb.append(".");
            sb.append(fVar.mo9039a());
            str = sb.toString();
        }
        return new C2356c(str, this, fVar);
    }

    /* renamed from: f */
    public C2360f mo9032f() {
        if (this.f7230g != null) {
            return this.f7230g;
        }
        if (!mo9029d()) {
            m11684i();
            return this.f7230g;
        }
        throw new IllegalStateException("root");
    }

    /* renamed from: g */
    public C2360f mo9033g() {
        if (mo9029d()) {
            return f7224a;
        }
        return mo9032f();
    }

    /* renamed from: h */
    public List<C2360f> mo9034h() {
        return mo9029d() ? Collections.emptyList() : C1406e.m6794a((T[]) f7225b.split(this.f7227d), f7226c);
    }

    /* renamed from: b */
    public boolean mo9027b(C2360f fVar) {
        int indexOf = this.f7227d.indexOf(46);
        if (mo9029d()) {
            return false;
        }
        String str = this.f7227d;
        String a = fVar.mo9039a();
        if (indexOf == -1) {
            indexOf = this.f7227d.length();
        }
        return str.regionMatches(0, a, 0, indexOf);
    }

    /* renamed from: c */
    public static C2356c m11683c(C2360f fVar) {
        return new C2356c(fVar.mo9039a(), C2355b.f7221a.mo9014b(), fVar);
    }

    public String toString() {
        return mo9029d() ? f7224a.mo9039a() : this.f7227d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2356c)) {
            return false;
        }
        return this.f7227d.equals(((C2356c) obj).f7227d);
    }

    public int hashCode() {
        return this.f7227d.hashCode();
    }
}
