package p073b.p085h.p087b.p088a.p090b.p119i.p122b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1639h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.i.b.g */
/* compiled from: ConstantValueFactory.kt */
public final class C2501g {

    /* renamed from: a */
    public static final C2501g f7548a = new C2501g();

    /* renamed from: b.h.b.a.b.i.b.g$a */
    /* compiled from: ConstantValueFactory.kt */
    static final class C2502a extends C1490k implements C1450b<C1821y, C2841w> {

        /* renamed from: a */
        final /* synthetic */ C2841w f7549a;

        C2502a(C2841w wVar) {
            this.f7549a = wVar;
            super(1);
        }

        /* renamed from: a */
        public final C2841w mo6756a(C1821y yVar) {
            C1489j.m6972b(yVar, "it");
            return this.f7549a;
        }
    }

    /* renamed from: b.h.b.a.b.i.b.g$b */
    /* compiled from: ConstantValueFactory.kt */
    static final class C2503b extends C1490k implements C1450b<C1821y, C2755ad> {

        /* renamed from: a */
        final /* synthetic */ C1639h f7550a;

        C2503b(C1639h hVar) {
            this.f7550a = hVar;
            super(1);
        }

        /* renamed from: a */
        public final C2755ad mo6756a(C1821y yVar) {
            C1489j.m6972b(yVar, "module");
            C2755ad b = yVar.mo7522a().mo7189b(this.f7550a);
            C1489j.m6969a((Object) b, "module.builtIns.getPrimi…KotlinType(componentType)");
            return b;
        }
    }

    private C2501g() {
    }

    /* renamed from: a */
    public final C2496b mo9524a(List<? extends C2500f<?>> list, C2841w wVar) {
        C1489j.m6972b(list, "value");
        C1489j.m6972b(wVar, "type");
        return new C2496b(list, new C2502a(wVar));
    }

    /* renamed from: a */
    public final C2500f<?> mo9525a(Object obj) {
        if (obj instanceof Byte) {
            return new C2498d<>(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C2516r<>(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C2510l<>(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C2514p<>(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C2499e<>(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C2509k<>(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C2504h<>(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C2497c<>(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C2517s<>((String) obj);
        }
        if (obj instanceof byte[]) {
            return m12533a(C1406e.m6790a((byte[]) obj), C1639h.BYTE);
        }
        if (obj instanceof short[]) {
            return m12533a(C1406e.m6796a((short[]) obj), C1639h.SHORT);
        }
        if (obj instanceof int[]) {
            return m12533a(C1406e.m6818d((int[]) obj), C1639h.INT);
        }
        if (obj instanceof long[]) {
            return m12533a(C1406e.m6793a((long[]) obj), C1639h.LONG);
        }
        if (obj instanceof char[]) {
            return m12533a(C1406e.m6804b((char[]) obj), C1639h.CHAR);
        }
        if (obj instanceof float[]) {
            return m12533a(C1406e.m6792a((float[]) obj), C1639h.FLOAT);
        }
        if (obj instanceof double[]) {
            return m12533a(C1406e.m6791a((double[]) obj), C1639h.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return m12533a(C1406e.m6797a((boolean[]) obj), C1639h.BOOLEAN);
        }
        if (obj == null) {
            return new C2515q<>();
        }
        return null;
    }

    /* renamed from: a */
    private final C2496b m12533a(List<?> list, C1639h hVar) {
        Iterable<Object> k = C1415k.m6893k((Iterable<? extends T>) list);
        Collection arrayList = new ArrayList();
        for (Object a : k) {
            C2500f a2 = mo9525a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new C2496b((List) arrayList, new C2503b(hVar));
    }
}
