package p073b.p085h.p087b.p088a.p090b.p117g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import p073b.p085h.p087b.p088a.p090b.p117g.C2380h.C2382a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2392j.C2393a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q.C2407a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2430z.C2432a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2430z.C2437b;

/* renamed from: b.h.b.a.b.g.h */
/* compiled from: FieldSet */
final class C2380h<FieldDescriptorType extends C2382a<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C2380h f7285d = new C2380h(true);

    /* renamed from: a */
    private final C2417v<FieldDescriptorType, Object> f7286a = C2417v.m12078a(16);

    /* renamed from: b */
    private boolean f7287b;

    /* renamed from: c */
    private boolean f7288c = false;

    /* renamed from: b.h.b.a.b.g.h$a */
    /* compiled from: FieldSet */
    public interface C2382a<T extends C2382a<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo9190a();

        /* renamed from: a */
        C2407a mo9191a(C2407a aVar, C2406q qVar);

        /* renamed from: b */
        C2432a mo9192b();

        /* renamed from: c */
        C2437b mo9193c();

        /* renamed from: d */
        boolean mo9194d();

        /* renamed from: e */
        boolean mo9195e();
    }

    private C2380h() {
    }

    private C2380h(boolean z) {
        mo9184c();
    }

    /* renamed from: a */
    public static <T extends C2382a<T>> C2380h<T> m11899a() {
        return new C2380h<>();
    }

    /* renamed from: b */
    public static <T extends C2382a<T>> C2380h<T> m11908b() {
        return f7285d;
    }

    /* renamed from: c */
    public void mo9184c() {
        if (!this.f7287b) {
            this.f7286a.mo9277a();
            this.f7287b = true;
        }
    }

    /* renamed from: d */
    public C2380h<FieldDescriptorType> clone() {
        C2380h<FieldDescriptorType> a = m11899a();
        for (int i = 0; i < this.f7286a.mo9280c(); i++) {
            Entry b = this.f7286a.mo9278b(i);
            a.mo9178a((FieldDescriptorType) (C2382a) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f7286a.mo9283d()) {
            a.mo9178a((FieldDescriptorType) (C2382a) entry.getKey(), entry.getValue());
        }
        a.f7288c = this.f7288c;
        return a;
    }

    /* renamed from: e */
    public Iterator<Entry<FieldDescriptorType, Object>> mo9187e() {
        if (this.f7288c) {
            return new C2399b(this.f7286a.entrySet().iterator());
        }
        return this.f7286a.entrySet().iterator();
    }

    /* renamed from: a */
    public boolean mo9180a(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.mo9194d()) {
            return this.f7286a.get(fielddescriptortype) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: b */
    public Object mo9181b(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f7286a.get(fielddescriptortype);
        return obj instanceof C2396l ? ((C2396l) obj).mo9221a() : obj;
    }

    /* renamed from: a */
    public void mo9178a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo9194d()) {
            m11905a(fielddescriptortype.mo9192b(), obj);
            r5 = obj;
        } else if (obj instanceof List) {
            List<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object a : arrayList) {
                m11905a(fielddescriptortype.mo9192b(), a);
            }
            r5 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r5 instanceof C2396l) {
            this.f7288c = true;
        }
        this.f7286a.put(fielddescriptortype, r5);
    }

    /* renamed from: c */
    public int mo9183c(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo9194d()) {
            Object b = mo9181b(fielddescriptortype);
            if (b == null) {
                return 0;
            }
            return ((List) b).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: a */
    public Object mo9177a(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.mo9194d()) {
            Object b = mo9181b(fielddescriptortype);
            if (b != null) {
                return ((List) b).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public void mo9182b(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.mo9194d()) {
            m11905a(fielddescriptortype.mo9192b(), obj);
            Object b = mo9181b(fielddescriptortype);
            if (b == null) {
                list = new ArrayList();
                this.f7286a.put(fielddescriptortype, list);
            } else {
                list = (List) b;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((r3 instanceof p073b.p085h.p087b.p088a.p090b.p117g.C2392j.C2393a) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r3 instanceof p073b.p085h.p087b.p088a.p090b.p117g.C2396l) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r1 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11905a(p073b.p085h.p087b.p088a.p090b.p117g.C2430z.C2432a r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L_0x004c
            int[] r0 = p073b.p085h.p087b.p088a.p090b.p117g.C2380h.C23811.f7289a
            b.h.b.a.b.g.z$b r2 = r2.mo9336a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x003f;
                case 2: goto L_0x003c;
                case 3: goto L_0x0039;
                case 4: goto L_0x0036;
                case 5: goto L_0x0033;
                case 6: goto L_0x0030;
                case 7: goto L_0x0027;
                case 8: goto L_0x001e;
                case 9: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0041
        L_0x0014:
            boolean r2 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p117g.C2406q
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p117g.C2396l
            if (r2 == 0) goto L_0x0041
        L_0x001c:
            r1 = 1
            goto L_0x0041
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p117g.C2392j.C2393a
            if (r2 == 0) goto L_0x0041
            goto L_0x001c
        L_0x0027:
            boolean r2 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p117g.C2371d
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0041
            goto L_0x001c
        L_0x0030:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0041
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0041
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0041
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0041
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0041
        L_0x003f:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0041:
            if (r1 == 0) goto L_0x0044
            return
        L_0x0044:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x004c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p117g.C2380h.m11905a(b.h.b.a.b.g.z$a, java.lang.Object):void");
    }

    /* renamed from: f */
    public boolean mo9188f() {
        for (int i = 0; i < this.f7286a.mo9280c(); i++) {
            if (!m11906a(this.f7286a.mo9278b(i))) {
                return false;
            }
        }
        for (Entry a : this.f7286a.mo9283d()) {
            if (!m11906a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m11906a(Entry<FieldDescriptorType, Object> entry) {
        C2382a aVar = (C2382a) entry.getKey();
        if (aVar.mo9193c() == C2437b.MESSAGE) {
            if (aVar.mo9194d()) {
                for (C2406q h : (List) entry.getValue()) {
                    if (!h.mo8106h()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C2406q) {
                    if (!((C2406q) value).mo8106h()) {
                        return false;
                    }
                } else if (value instanceof C2396l) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    static int m11898a(C2432a aVar, boolean z) {
        if (z) {
            return 2;
        }
        return aVar.mo9337b();
    }

    /* renamed from: a */
    public void mo9179a(C2380h<FieldDescriptorType> hVar) {
        for (int i = 0; i < hVar.f7286a.mo9280c(); i++) {
            m11909b(hVar.f7286a.mo9278b(i));
        }
        for (Entry b : hVar.f7286a.mo9283d()) {
            m11909b(b);
        }
    }

    /* renamed from: a */
    private Object m11901a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    private void m11909b(Entry<FieldDescriptorType, Object> entry) {
        C2382a aVar = (C2382a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C2396l) {
            value = ((C2396l) value).mo9221a();
        }
        if (aVar.mo9194d()) {
            Object b = mo9181b((FieldDescriptorType) aVar);
            if (b == null) {
                b = new ArrayList();
            }
            for (Object a : (List) value) {
                ((List) b).add(m11901a(a));
            }
            this.f7286a.put(aVar, b);
        } else if (aVar.mo9193c() == C2437b.MESSAGE) {
            Object b2 = mo9181b((FieldDescriptorType) aVar);
            if (b2 == null) {
                this.f7286a.put(aVar, m11901a(value));
                return;
            }
            this.f7286a.put(aVar, aVar.mo9191a(((C2406q) b2).mo8110m(), (C2406q) value).mo8141l());
        } else {
            this.f7286a.put(aVar, m11901a(value));
        }
    }

    /* renamed from: a */
    public static Object m11900a(C2374e eVar, C2432a aVar, boolean z) {
        switch (aVar) {
            case DOUBLE:
                return Double.valueOf(eVar.mo9102b());
            case FLOAT:
                return Float.valueOf(eVar.mo9103c());
            case INT64:
                return Long.valueOf(eVar.mo9107e());
            case UINT64:
                return Long.valueOf(eVar.mo9105d());
            case INT32:
                return Integer.valueOf(eVar.mo9109f());
            case FIXED64:
                return Long.valueOf(eVar.mo9110g());
            case FIXED32:
                return Integer.valueOf(eVar.mo9111h());
            case BOOL:
                return Boolean.valueOf(eVar.mo9112i());
            case STRING:
                if (z) {
                    return eVar.mo9114k();
                }
                return eVar.mo9113j();
            case BYTES:
                return eVar.mo9115l();
            case UINT32:
                return Integer.valueOf(eVar.mo9116m());
            case SFIXED32:
                return Integer.valueOf(eVar.mo9118o());
            case SFIXED64:
                return Long.valueOf(eVar.mo9119p());
            case SINT32:
                return Integer.valueOf(eVar.mo9120q());
            case SINT64:
                return Long.valueOf(eVar.mo9121r());
            case GROUP:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case MESSAGE:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case ENUM:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    private static void m11902a(C2376f fVar, C2432a aVar, int i, Object obj) {
        if (aVar == C2432a.GROUP) {
            fVar.mo9140a(i, (C2406q) obj);
            return;
        }
        fVar.mo9166f(i, m11898a(aVar, false));
        m11903a(fVar, aVar, obj);
    }

    /* renamed from: a */
    private static void m11903a(C2376f fVar, C2432a aVar, Object obj) {
        switch (aVar) {
            case DOUBLE:
                fVar.mo9133a(((Double) obj).doubleValue());
                return;
            case FLOAT:
                fVar.mo9134a(((Float) obj).floatValue());
                return;
            case INT64:
                fVar.mo9153b(((Long) obj).longValue());
                return;
            case UINT64:
                fVar.mo9142a(((Long) obj).longValue());
                return;
            case INT32:
                fVar.mo9150b(((Integer) obj).intValue());
                return;
            case FIXED64:
                fVar.mo9158c(((Long) obj).longValue());
                return;
            case FIXED32:
                fVar.mo9155c(((Integer) obj).intValue());
                return;
            case BOOL:
                fVar.mo9147a(((Boolean) obj).booleanValue());
                return;
            case STRING:
                fVar.mo9146a((String) obj);
                return;
            case BYTES:
                if (obj instanceof C2371d) {
                    fVar.mo9143a((C2371d) obj);
                    return;
                } else {
                    fVar.mo9148a((byte[]) obj);
                    return;
                }
            case UINT32:
                fVar.mo9161d(((Integer) obj).intValue());
                return;
            case SFIXED32:
                fVar.mo9165f(((Integer) obj).intValue());
                return;
            case SFIXED64:
                fVar.mo9162d(((Long) obj).longValue());
                return;
            case SINT32:
                fVar.mo9167g(((Integer) obj).intValue());
                return;
            case SINT64:
                fVar.mo9164e(((Long) obj).longValue());
                return;
            case GROUP:
                fVar.mo9145a((C2406q) obj);
                return;
            case MESSAGE:
                fVar.mo9154b((C2406q) obj);
                return;
            case ENUM:
                if (obj instanceof C2393a) {
                    fVar.mo9163e(((C2393a) obj).mo8186a());
                    return;
                } else {
                    fVar.mo9163e(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public static void m11904a(C2382a<?> aVar, Object obj, C2376f fVar) {
        C2432a b = aVar.mo9192b();
        int a = aVar.mo9190a();
        if (aVar.mo9194d()) {
            List<Object> list = (List) obj;
            if (aVar.mo9195e()) {
                fVar.mo9166f(a, 2);
                int i = 0;
                for (Object b2 : list) {
                    i += m11907b(b, b2);
                }
                fVar.mo9171p(i);
                for (Object a2 : list) {
                    m11903a(fVar, b, a2);
                }
                return;
            }
            for (Object a3 : list) {
                m11902a(fVar, b, a, a3);
            }
        } else if (obj instanceof C2396l) {
            m11902a(fVar, b, a, ((C2396l) obj).mo9221a());
        } else {
            m11902a(fVar, b, a, obj);
        }
    }

    /* renamed from: g */
    public int mo9189g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f7286a.mo9280c(); i2++) {
            Entry b = this.f7286a.mo9278b(i2);
            i += m11910c((C2382a) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f7286a.mo9283d()) {
            i += m11910c((C2382a) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: a */
    private static int m11897a(C2432a aVar, int i, Object obj) {
        int o = C2376f.m11848o(i);
        if (aVar == C2432a.GROUP) {
            o *= 2;
        }
        return o + m11907b(aVar, obj);
    }

    /* renamed from: b */
    private static int m11907b(C2432a aVar, Object obj) {
        switch (aVar) {
            case DOUBLE:
                return C2376f.m11818b(((Double) obj).doubleValue());
            case FLOAT:
                return C2376f.m11819b(((Float) obj).floatValue());
            case INT64:
                return C2376f.m11836g(((Long) obj).longValue());
            case UINT64:
                return C2376f.m11835f(((Long) obj).longValue());
            case INT32:
                return C2376f.m11837h(((Integer) obj).intValue());
            case FIXED64:
                return C2376f.m11838h(((Long) obj).longValue());
            case FIXED32:
                return C2376f.m11839i(((Integer) obj).intValue());
            case BOOL:
                return C2376f.m11827b(((Boolean) obj).booleanValue());
            case STRING:
                return C2376f.m11826b((String) obj);
            case BYTES:
                if (obj instanceof C2371d) {
                    return C2376f.m11825b((C2371d) obj);
                }
                return C2376f.m11828b((byte[]) obj);
            case UINT32:
                return C2376f.m11841j(((Integer) obj).intValue());
            case SFIXED32:
                return C2376f.m11844l(((Integer) obj).intValue());
            case SFIXED64:
                return C2376f.m11840i(((Long) obj).longValue());
            case SINT32:
                return C2376f.m11846m(((Integer) obj).intValue());
            case SINT64:
                return C2376f.m11842j(((Long) obj).longValue());
            case GROUP:
                return C2376f.m11830c((C2406q) obj);
            case MESSAGE:
                if (obj instanceof C2396l) {
                    return C2376f.m11816a((C2400m) (C2396l) obj);
                }
                return C2376f.m11833d((C2406q) obj);
            case ENUM:
                if (obj instanceof C2393a) {
                    return C2376f.m11843k(((C2393a) obj).mo8186a());
                }
                return C2376f.m11843k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: c */
    public static int m11910c(C2382a<?> aVar, Object obj) {
        C2432a b = aVar.mo9192b();
        int a = aVar.mo9190a();
        if (!aVar.mo9194d()) {
            return m11897a(b, a, obj);
        }
        int i = 0;
        if (aVar.mo9195e()) {
            for (Object b2 : (List) obj) {
                i += m11907b(b, b2);
            }
            return C2376f.m11848o(a) + i + C2376f.m11849q(i);
        }
        for (Object a2 : (List) obj) {
            i += m11897a(b, a, a2);
        }
        return i;
    }
}
