package p073b.p085h.p087b.p088a.p090b.p117g;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: b.h.b.a.b.g.n */
/* compiled from: LazyStringArrayList */
public class C2401n extends AbstractList<String> implements C2402o, RandomAccess {

    /* renamed from: a */
    public static final C2402o f7321a = new C2401n().mo9243b();

    /* renamed from: b */
    private final List<Object> f7322b;

    public C2401n() {
        this.f7322b = new ArrayList();
    }

    public C2401n(C2402o oVar) {
        this.f7322b = new ArrayList(oVar.size());
        addAll(oVar);
    }

    /* renamed from: a */
    public String get(int i) {
        Object obj = this.f7322b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C2371d) {
            C2371d dVar = (C2371d) obj;
            String f = dVar.mo9083f();
            if (dVar.mo9084g()) {
                this.f7322b.set(i, f);
            }
            return f;
        }
        byte[] bArr = (byte[]) obj;
        String b = C2392j.m11980b(bArr);
        if (C2392j.m11979a(bArr)) {
            this.f7322b.set(i, b);
        }
        return b;
    }

    public int size() {
        return this.f7322b.size();
    }

    /* renamed from: a */
    public String set(int i, String str) {
        return m12000a(this.f7322b.set(i, str));
    }

    /* renamed from: b */
    public void add(int i, String str) {
        this.f7322b.add(i, str);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof C2402o) {
            collection = ((C2402o) collection).mo9238a();
        }
        boolean addAll = this.f7322b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: b */
    public String remove(int i) {
        Object remove = this.f7322b.remove(i);
        this.modCount++;
        return m12000a(remove);
    }

    public void clear() {
        this.f7322b.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public void mo9239a(C2371d dVar) {
        this.f7322b.add(dVar);
        this.modCount++;
    }

    /* renamed from: c */
    public C2371d mo9246c(int i) {
        Object obj = this.f7322b.get(i);
        C2371d b = m12001b(obj);
        if (b != obj) {
            this.f7322b.set(i, b);
        }
        return b;
    }

    /* renamed from: a */
    private static String m12000a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C2371d) {
            return ((C2371d) obj).mo9083f();
        }
        return C2392j.m11980b((byte[]) obj);
    }

    /* renamed from: b */
    private static C2371d m12001b(Object obj) {
        if (obj instanceof C2371d) {
            return (C2371d) obj;
        }
        if (obj instanceof String) {
            return C2371d.m11739a((String) obj);
        }
        return C2371d.m11741a((byte[]) obj);
    }

    /* renamed from: a */
    public List<?> mo9238a() {
        return Collections.unmodifiableList(this.f7322b);
    }

    /* renamed from: b */
    public C2402o mo9243b() {
        return new C2426x(this);
    }
}
