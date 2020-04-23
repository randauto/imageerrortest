package p073b.p085h.p087b.p088a.p090b.p119i.p124d;

import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.i.d.b */
/* compiled from: JvmClassName */
public class C2535b {

    /* renamed from: a */
    private final String f7591a;

    /* renamed from: b */
    private C2355b f7592b;

    /* renamed from: a */
    public static C2535b m12655a(String str) {
        return new C2535b(str);
    }

    /* renamed from: a */
    public static C2535b m12653a(C2354a aVar) {
        C2355b a = aVar.mo9001a();
        String replace = aVar.mo9002b().mo9013a().replace('.', '$');
        if (a.mo9016c()) {
            return new C2535b(replace);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.mo9013a().replace('.', '/'));
        sb.append("/");
        sb.append(replace);
        return new C2535b(sb.toString());
    }

    /* renamed from: a */
    public static C2535b m12654a(C2355b bVar) {
        C2535b bVar2 = new C2535b(bVar.mo9013a().replace('.', '/'));
        bVar2.f7592b = bVar;
        return bVar2;
    }

    private C2535b(String str) {
        this.f7591a = str;
    }

    /* renamed from: a */
    public C2355b mo9553a() {
        return new C2355b(this.f7591a.replace('/', '.'));
    }

    /* renamed from: b */
    public C2355b mo9554b() {
        int lastIndexOf = this.f7591a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            return C2355b.f7221a;
        }
        return new C2355b(this.f7591a.substring(0, lastIndexOf).replace('/', '.'));
    }

    /* renamed from: c */
    public String mo9555c() {
        return this.f7591a;
    }

    public String toString() {
        return this.f7591a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f7591a.equals(((C2535b) obj).f7591a);
    }

    public int hashCode() {
        return this.f7591a.hashCode();
    }
}
