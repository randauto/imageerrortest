package p073b.p085h.p087b.p088a.p090b.p116f;

import java.util.List;

/* renamed from: b.h.b.a.b.f.b */
/* compiled from: FqName */
public final class C2355b {

    /* renamed from: a */
    public static final C2355b f7221a = new C2355b("");

    /* renamed from: b */
    private final C2356c f7222b;

    /* renamed from: c */
    private transient C2355b f7223c;

    public C2355b(String str) {
        this.f7222b = new C2356c(str, this);
    }

    public C2355b(C2356c cVar) {
        this.f7222b = cVar;
    }

    private C2355b(C2356c cVar, C2355b bVar) {
        this.f7222b = cVar;
        this.f7223c = bVar;
    }

    /* renamed from: a */
    public String mo9013a() {
        return this.f7222b.mo9025a();
    }

    /* renamed from: b */
    public C2356c mo9014b() {
        return this.f7222b;
    }

    /* renamed from: c */
    public boolean mo9016c() {
        return this.f7222b.mo9029d();
    }

    /* renamed from: d */
    public C2355b mo9017d() {
        if (this.f7223c != null) {
            return this.f7223c;
        }
        if (!mo9016c()) {
            this.f7223c = new C2355b(this.f7222b.mo9030e());
            return this.f7223c;
        }
        throw new IllegalStateException("root");
    }

    /* renamed from: a */
    public C2355b mo9012a(C2360f fVar) {
        return new C2355b(this.f7222b.mo9024a(fVar), this);
    }

    /* renamed from: e */
    public C2360f mo9018e() {
        return this.f7222b.mo9032f();
    }

    /* renamed from: f */
    public C2360f mo9020f() {
        return this.f7222b.mo9033g();
    }

    /* renamed from: g */
    public List<C2360f> mo9021g() {
        return this.f7222b.mo9034h();
    }

    /* renamed from: b */
    public boolean mo9015b(C2360f fVar) {
        return this.f7222b.mo9027b(fVar);
    }

    /* renamed from: c */
    public static C2355b m11673c(C2360f fVar) {
        return new C2355b(C2356c.m11683c(fVar));
    }

    public String toString() {
        return this.f7222b.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2355b)) {
            return false;
        }
        return this.f7222b.equals(((C2355b) obj).f7222b);
    }

    public int hashCode() {
        return this.f7222b.hashCode();
    }
}
