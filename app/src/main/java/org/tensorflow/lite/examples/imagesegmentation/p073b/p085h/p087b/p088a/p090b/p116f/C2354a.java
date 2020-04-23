package p073b.p085h.p087b.p088a.p090b.p116f;

import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.f.a */
/* compiled from: ClassId */
public final class C2354a {

    /* renamed from: a */
    static final /* synthetic */ boolean f7217a = (!C2354a.class.desiredAssertionStatus());

    /* renamed from: b */
    private final C2355b f7218b;

    /* renamed from: c */
    private final C2355b f7219c;

    /* renamed from: d */
    private final boolean f7220d;

    /* renamed from: a */
    public static C2354a m11661a(C2355b bVar) {
        return new C2354a(bVar.mo9017d(), bVar.mo9018e());
    }

    public C2354a(C2355b bVar, C2355b bVar2, boolean z) {
        this.f7218b = bVar;
        if (f7217a || !bVar2.mo9016c()) {
            this.f7219c = bVar2;
            this.f7220d = z;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class name must not be root: ");
        sb.append(bVar);
        sb.append(z ? " (local)" : "");
        throw new AssertionError(sb.toString());
    }

    public C2354a(C2355b bVar, C2360f fVar) {
        this(bVar, C2355b.m11673c(fVar), false);
    }

    /* renamed from: a */
    public C2355b mo9001a() {
        return this.f7218b;
    }

    /* renamed from: b */
    public C2355b mo9002b() {
        return this.f7219c;
    }

    /* renamed from: c */
    public C2360f mo9003c() {
        return this.f7219c.mo9018e();
    }

    /* renamed from: d */
    public boolean mo9004d() {
        return this.f7220d;
    }

    /* renamed from: a */
    public C2354a mo9000a(C2360f fVar) {
        return new C2354a(mo9001a(), this.f7219c.mo9012a(fVar), this.f7220d);
    }

    /* renamed from: e */
    public C2354a mo9005e() {
        C2355b d = this.f7219c.mo9017d();
        if (d.mo9016c()) {
            return null;
        }
        return new C2354a(mo9001a(), d, this.f7220d);
    }

    /* renamed from: f */
    public boolean mo9007f() {
        return !this.f7219c.mo9017d().mo9016c();
    }

    /* renamed from: g */
    public C2355b mo9008g() {
        if (this.f7218b.mo9016c()) {
            return this.f7219c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7218b.mo9013a());
        sb.append(".");
        sb.append(this.f7219c.mo9013a());
        return new C2355b(sb.toString());
    }

    /* renamed from: a */
    public static C2354a m11662a(String str) {
        return m11663a(str, false);
    }

    /* renamed from: a */
    public static C2354a m11663a(String str, boolean z) {
        return new C2354a(new C2355b(C3199m.m14809c(str, '/', "").replace('/', '.')), new C2355b(C3199m.m14814d(str, '/', str)), z);
    }

    /* renamed from: h */
    public String mo9009h() {
        if (this.f7218b.mo9016c()) {
            return this.f7219c.mo9013a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7218b.mo9013a().replace('.', '/'));
        sb.append("/");
        sb.append(this.f7219c.mo9013a());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2354a aVar = (C2354a) obj;
        if (!this.f7218b.equals(aVar.f7218b) || !this.f7219c.equals(aVar.f7219c) || this.f7220d != aVar.f7220d) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((this.f7218b.hashCode() * 31) + this.f7219c.hashCode()) * 31) + Boolean.valueOf(this.f7220d).hashCode();
    }

    public String toString() {
        if (!this.f7218b.mo9016c()) {
            return mo9009h();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(mo9009h());
        return sb.toString();
    }
}
