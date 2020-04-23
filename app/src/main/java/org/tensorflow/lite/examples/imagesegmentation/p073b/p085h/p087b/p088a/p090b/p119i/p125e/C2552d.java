package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.i.e.d */
/* compiled from: MemberScope.kt */
public final class C2552d {

    /* renamed from: a */
    public static final C2552d f7621a = new C2552d(f7639u, null, 2, null);

    /* renamed from: b */
    public static final C2552d f7622b = new C2552d(f7642x, null, 2, null);

    /* renamed from: c */
    public static final C2552d f7623c = new C2552d(f7633o, null, 2, null);

    /* renamed from: d */
    public static final C2552d f7624d = new C2552d(f7634p, null, 2, null);

    /* renamed from: e */
    public static final C2552d f7625e = new C2552d(f7635q, null, 2, null);

    /* renamed from: f */
    public static final C2552d f7626f = new C2552d(f7640v, null, 2, null);

    /* renamed from: g */
    public static final C2552d f7627g = new C2552d(f7636r, null, 2, null);

    /* renamed from: h */
    public static final C2552d f7628h = new C2552d(f7637s, null, 2, null);

    /* renamed from: i */
    public static final C2552d f7629i = new C2552d(f7638t, null, 2, null);

    /* renamed from: j */
    public static final C2552d f7630j = new C2552d(f7641w, null, 2, null);

    /* renamed from: k */
    public static final C2553a f7631k = new C2553a(null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static int f7632n = 1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final int f7633o = f7631k.m12709i();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final int f7634p = f7631k.m12709i();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final int f7635q = f7631k.m12709i();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final int f7636r = f7631k.m12709i();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final int f7637s = f7631k.m12709i();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final int f7638t = f7631k.m12709i();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final int f7639u = (f7631k.m12709i() - 1);
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final int f7640v = ((f7633o | f7634p) | f7635q);

    /* renamed from: w */
    private static final int f7641w = ((f7634p | f7637s) | f7638t);

    /* renamed from: x */
    private static final int f7642x = (f7637s | f7638t);

    /* renamed from: y */
    private static final List<C2554a> f7643y;

    /* renamed from: z */
    private static final List<C2554a> f7644z;

    /* renamed from: l */
    private final int f7645l;

    /* renamed from: m */
    private final List<C2549c> f7646m;

    /* renamed from: b.h.b.a.b.i.e.d$a */
    /* compiled from: MemberScope.kt */
    public static final class C2553a {

        /* renamed from: b.h.b.a.b.i.e.d$a$a */
        /* compiled from: MemberScope.kt */
        private static final class C2554a {

            /* renamed from: a */
            private final int f7647a;

            /* renamed from: b */
            private final String f7648b;

            public C2554a(int i, String str) {
                C1489j.m6972b(str, "name");
                this.f7647a = i;
                this.f7648b = str;
            }

            /* renamed from: a */
            public final int mo9588a() {
                return this.f7647a;
            }

            /* renamed from: b */
            public final String mo9589b() {
                return this.f7648b;
            }
        }

        private C2553a() {
        }

        public /* synthetic */ C2553a(C1486g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final int m12709i() {
            int c = C2552d.f7632n;
            C2552d.f7632n = C2552d.f7632n << 1;
            return c;
        }

        /* renamed from: a */
        public final int mo9580a() {
            return C2552d.f7633o;
        }

        /* renamed from: b */
        public final int mo9581b() {
            return C2552d.f7634p;
        }

        /* renamed from: c */
        public final int mo9582c() {
            return C2552d.f7635q;
        }

        /* renamed from: d */
        public final int mo9583d() {
            return C2552d.f7636r;
        }

        /* renamed from: e */
        public final int mo9584e() {
            return C2552d.f7637s;
        }

        /* renamed from: f */
        public final int mo9585f() {
            return C2552d.f7638t;
        }

        /* renamed from: g */
        public final int mo9586g() {
            return C2552d.f7639u;
        }

        /* renamed from: h */
        public final int mo9587h() {
            return C2552d.f7640v;
        }
    }

    public C2552d(int i, List<? extends C2549c> list) {
        C1489j.m6972b(list, "excludes");
        this.f7646m = list;
        for (C2549c a : this.f7646m) {
            i &= ~a.mo9573a();
        }
        this.f7645l = i;
    }

    public /* synthetic */ C2552d(int i, List list, int i2, C1486g gVar) {
        if ((i2 & 2) != 0) {
            list = C1415k.m6837a();
        }
        this(i, list);
    }

    /* renamed from: b */
    public final List<C2549c> mo9578b() {
        return this.f7646m;
    }

    /* renamed from: a */
    public final int mo9575a() {
        return this.f7645l;
    }

    /* renamed from: a */
    public final boolean mo9576a(int i) {
        return (i & this.f7645l) != 0;
    }

    /* renamed from: b */
    public final C2552d mo9577b(int i) {
        int i2 = i & this.f7645l;
        if (i2 == 0) {
            return null;
        }
        return new C2552d(i2, this.f7646m);
    }

    public String toString() {
        Object obj;
        boolean z;
        Iterator it = f7643y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C2554a) obj).mo9588a() == this.f7645l) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C2554a aVar = (C2554a) obj;
        String b = aVar != null ? aVar.mo9589b() : null;
        if (b == null) {
            Iterable<C2554a> iterable = f7644z;
            Collection arrayList = new ArrayList();
            for (C2554a aVar2 : iterable) {
                Object b2 = mo9576a(aVar2.mo9588a()) ? aVar2.mo9589b() : null;
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            b = C1415k.m6859a((List) arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DescriptorKindFilter(");
        sb.append(b);
        sb.append(", ");
        sb.append(this.f7646m);
        sb.append(')');
        return sb.toString();
    }

    static {
        Object obj;
        Object obj2;
        C2553a aVar = f7631k;
        Field[] fields = C2552d.class.getFields();
        C1489j.m6969a((Object) fields, "T::class.java.fields");
        Collection arrayList = new ArrayList();
        for (Field field : fields) {
            C1489j.m6969a((Object) field, "it");
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        Iterable<Field> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Field field2 : iterable) {
            Object obj3 = field2.get(null);
            if (!(obj3 instanceof C2552d)) {
                obj3 = null;
            }
            C2552d dVar = (C2552d) obj3;
            if (dVar != null) {
                int i = dVar.f7645l;
                C1489j.m6969a((Object) field2, "field");
                String name = field2.getName();
                C1489j.m6969a((Object) name, "field.name");
                obj2 = new C2554a(i, name);
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                arrayList2.add(obj2);
            }
        }
        f7643y = C1415k.m6893k((Iterable<? extends T>) (List) arrayList2);
        C2553a aVar2 = f7631k;
        Field[] fields2 = C2552d.class.getFields();
        C1489j.m6969a((Object) fields2, "T::class.java.fields");
        Collection arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            C1489j.m6969a((Object) field3, "it");
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        Iterable iterable2 = (List) arrayList3;
        Collection arrayList4 = new ArrayList();
        for (Object next : iterable2) {
            Field field4 = (Field) next;
            C1489j.m6969a((Object) field4, "it");
            if (C1489j.m6971a((Object) field4.getType(), (Object) Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        Iterable<Field> iterable3 = (List) arrayList4;
        Collection arrayList5 = new ArrayList();
        for (Field field5 : iterable3) {
            Object obj4 = field5.get(null);
            if (obj4 != null) {
                int intValue = ((Integer) obj4).intValue();
                if (intValue == ((-intValue) & intValue)) {
                    C1489j.m6969a((Object) field5, "field");
                    String name2 = field5.getName();
                    C1489j.m6969a((Object) name2, "field.name");
                    obj = new C2554a(intValue, name2);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    arrayList5.add(obj);
                }
            } else {
                throw new C3227u("null cannot be cast to non-null type kotlin.Int");
            }
        }
        f7644z = C1415k.m6893k((Iterable<? extends T>) (List) arrayList5);
    }
}
