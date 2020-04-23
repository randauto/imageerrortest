package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2572m;

/* renamed from: b.h.b.a.b.l.v */
/* compiled from: IntersectionTypeConstructor */
public class C2840v implements C2767an {

    /* renamed from: a */
    static final /* synthetic */ boolean f8121a = (!C2840v.class.desiredAssertionStatus());

    /* renamed from: b */
    private final Set<C2841w> f8122b;

    /* renamed from: c */
    private final int f8123c;

    /* renamed from: d */
    public C1799h mo7096d() {
        return null;
    }

    /* renamed from: f */
    public boolean mo7097f() {
        return false;
    }

    public C2840v(Collection<C2841w> collection) {
        if (f8121a || !collection.isEmpty()) {
            this.f8122b = new LinkedHashSet(collection);
            this.f8123c = this.f8122b.hashCode();
            return;
        }
        throw new AssertionError("Attempt to create an empty intersection");
    }

    /* renamed from: b */
    public List<C1700ar> mo7094b() {
        return Collections.emptyList();
    }

    /* renamed from: C_ */
    public Collection<C2841w> mo7405C_() {
        return this.f8122b;
    }

    /* renamed from: a */
    public C2560h mo9951a() {
        StringBuilder sb = new StringBuilder();
        sb.append("member scope for intersection type ");
        sb.append(this);
        return C2572m.m12783a(sb.toString(), (Collection<? extends C2841w>) this.f8122b);
    }

    /* renamed from: e */
    public C1627g mo7407e() {
        return ((C2841w) this.f8122b.iterator().next()).mo9507g().mo7407e();
    }

    public String toString() {
        return m13867a(this.f8122b);
    }

    /* renamed from: a */
    private static String m13867a(Iterable<C2841w> iterable) {
        StringBuilder sb = new StringBuilder("{");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C2841w) it.next()).toString());
            if (it.hasNext()) {
                sb.append(" & ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2840v vVar = (C2840v) obj;
        return this.f8122b == null ? vVar.f8122b == null : this.f8122b.equals(vVar.f8122b);
    }

    public int hashCode() {
        return this.f8123c;
    }
}
