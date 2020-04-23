package p073b.p085h.p087b.p088a.p090b.p091a.p092a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3230x;
import p073b.p074a.C1388ac;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p084g.C1515c;
import p073b.p085h.p087b.p088a.p090b.p091a.C1621c;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p091a.C1644j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap.C1698a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1734a;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1746ag;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h.C2564c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2773ar;
import p073b.p085h.p087b.p088a.p090b.p131l.C2789b;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.a.a.b */
/* compiled from: FunctionClassDescriptor.kt */
public final class C1576b extends C1734a {

    /* renamed from: c */
    private final C1578a f4961c = new C1578a();

    /* renamed from: d */
    private final C1583d f4962d = new C1583d(this.f4964f, this);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<C1700ar> f4963e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2713i f4964f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1680ab f4965g;

    /* renamed from: h */
    private final C1580b f4966h;

    /* renamed from: i */
    private final int f4967i;

    /* renamed from: b.h.b.a.b.a.a.b$a */
    /* compiled from: FunctionClassDescriptor.kt */
    private final class C1578a extends C2789b {

        /* renamed from: b.h.b.a.b.a.a.b$a$a */
        /* compiled from: FunctionClassDescriptor.kt */
        static final class C1579a extends C1490k implements C1461m<C1680ab, C2360f, C3230x> {

            /* renamed from: a */
            final /* synthetic */ C1578a f4971a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f4972b;

            C1579a(C1578a aVar, ArrayList arrayList) {
                this.f4971a = aVar;
                this.f4972b = arrayList;
                super(2);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6920a(Object obj, Object obj2) {
                mo7100a((C1680ab) obj, (C2360f) obj2);
                return C3230x.f8645a;
            }

            /* renamed from: a */
            public final void mo7100a(C1680ab abVar, C2360f fVar) {
                C1489j.m6972b(abVar, "packageFragment");
                C1489j.m6972b(fVar, "name");
                C1799h c = abVar.mo7159a().mo7649c(fVar, C1830d.f5610d);
                if (!(c instanceof C1796e)) {
                    c = null;
                }
                C1796e eVar = (C1796e) c;
                if (eVar != null) {
                    C2767an e = eVar.mo7067e();
                    List b = this.f4971a.mo7094b();
                    C1489j.m6969a((Object) e, "typeConstructor");
                    Iterable<C1700ar> e2 = C1415k.m6881e(b, e.mo7094b().size());
                    Collection arrayList = new ArrayList(C1415k.m6842a(e2, 10));
                    for (C1700ar A_ : e2) {
                        arrayList.add(new C2773ar(A_.mo7346A_()));
                    }
                    this.f4972b.add(C2842x.m13880a(C1659h.f5247a.mo7260a(), eVar, (List) arrayList));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Class ");
                sb.append(fVar);
                sb.append(" not found in ");
                sb.append(abVar);
                throw new IllegalStateException(sb.toString().toString());
            }
        }

        /* renamed from: f */
        public boolean mo7097f() {
            return true;
        }

        public C1578a() {
            super(C1576b.this.f4964f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Collection<C2841w> mo7093a() {
            C1580b bVar;
            ArrayList arrayList = new ArrayList(2);
            C1579a aVar = new C1579a(this, arrayList);
            switch (C1582c.f4981a[C1576b.this.mo7062A().ordinal()]) {
                case 1:
                    C1680ab a = C1576b.this.f4965g;
                    C2360f a2 = C2360f.m11701a("Function");
                    C1489j.m6969a((Object) a2, "Name.identifier(\"Function\")");
                    aVar.mo7100a(a, a2);
                    break;
                case 2:
                    C1680ab a3 = C1576b.this.f4965g;
                    C2360f a4 = C2360f.m11701a("KFunction");
                    C1489j.m6969a((Object) a4, "Name.identifier(\"KFunction\")");
                    aVar.mo7100a(a3, a4);
                    break;
                default:
                    C1680ab a5 = C1576b.this.f4965g;
                    C2360f a6 = C2360f.m11701a(C1576b.this.mo7062A().mo7103b());
                    C1489j.m6969a((Object) a6, "Name.identifier(functionKind.classNamePrefix)");
                    aVar.mo7100a(a5, a6);
                    break;
            }
            switch (C1582c.f4982b[C1576b.this.mo7062A().ordinal()]) {
                case 1:
                    bVar = C1580b.Function;
                    break;
                case 2:
                    bVar = C1580b.SuspendFunction;
                    break;
                default:
                    bVar = null;
                    break;
            }
            if (bVar != null) {
                C1821y e = C1576b.this.f4965g.mo7283e();
                C2355b bVar2 = C1627g.f5071c;
                C1489j.m6969a((Object) bVar2, "BUILT_INS_PACKAGE_FQ_NAME");
                Iterable f = e.mo7523a(bVar2).mo7290f();
                Collection arrayList2 = new ArrayList();
                for (Object next : f) {
                    if (next instanceof C1621c) {
                        arrayList2.add(next);
                    }
                }
                C1680ab abVar = (C1621c) C1415k.m6883f((List) arrayList2);
                C2360f a7 = bVar.mo7102a(C1576b.this.mo7063B());
                C1489j.m6969a((Object) a7, "numberedSupertypeKind.numberedClassName(arity)");
                aVar.mo7100a(abVar, a7);
            }
            return C1415k.m6893k((Iterable<? extends T>) arrayList);
        }

        /* renamed from: b */
        public List<C1700ar> mo7094b() {
            return C1576b.this.f4963e;
        }

        /* renamed from: c */
        public C1576b mo7096d() {
            return C1576b.this;
        }

        public String toString() {
            return mo7096d().toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C1697ap mo7098g() {
            return C1698a.f5333a;
        }
    }

    /* renamed from: b.h.b.a.b.a.a.b$b */
    /* compiled from: FunctionClassDescriptor.kt */
    public enum C1580b {
        Function(r3, "Function"),
        SuspendFunction(r3, "SuspendFunction"),
        KFunction(C1644j.m7504a(), "KFunction"),
        KSuspendFunction(C1644j.m7504a(), "KSuspendFunction");
        

        /* renamed from: e */
        public static final C1581a f4977e = null;

        /* renamed from: g */
        private final C2355b f4979g;

        /* renamed from: h */
        private final String f4980h;

        /* renamed from: b.h.b.a.b.a.a.b$b$a */
        /* compiled from: FunctionClassDescriptor.kt */
        public static final class C1581a {
            private C1581a() {
            }

            public /* synthetic */ C1581a(C1486g gVar) {
                this();
            }

            /* renamed from: a */
            public final C1580b mo7104a(C2355b bVar, String str) {
                C1580b[] values;
                C1489j.m6972b(bVar, "packageFqName");
                C1489j.m6972b(str, "className");
                for (C1580b bVar2 : C1580b.values()) {
                    if (C1489j.m6971a((Object) bVar2.mo7101a(), (Object) bVar) && C3199m.m14761b(str, bVar2.mo7103b(), false, 2, null)) {
                        return bVar2;
                    }
                }
                return null;
            }
        }

        protected C1580b(C2355b bVar, String str) {
            C1489j.m6972b(bVar, "packageFqName");
            C1489j.m6972b(str, "classNamePrefix");
            this.f4979g = bVar;
            this.f4980h = str;
        }

        /* renamed from: a */
        public final C2355b mo7101a() {
            return this.f4979g;
        }

        /* renamed from: b */
        public final String mo7103b() {
            return this.f4980h;
        }

        static {
            f4977e = new C1581a(null);
        }

        /* renamed from: a */
        public final C2360f mo7102a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4980h);
            sb.append(i);
            return C2360f.m11701a(sb.toString());
        }
    }

    /* renamed from: h */
    public Void mo7069h() {
        return null;
    }

    /* renamed from: n */
    public Void mo7075n() {
        return null;
    }

    /* renamed from: q */
    public boolean mo7078q() {
        return false;
    }

    /* renamed from: r */
    public boolean mo7079r() {
        return false;
    }

    /* renamed from: s */
    public boolean mo7080s() {
        return false;
    }

    /* renamed from: t */
    public boolean mo7081t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo7083u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo7084v() {
        return false;
    }

    /* renamed from: w */
    public boolean mo7085w() {
        return false;
    }

    /* renamed from: i */
    public /* synthetic */ C1796e mo7070i() {
        return (C1796e) mo7069h();
    }

    /* renamed from: o */
    public /* synthetic */ C1795d mo7076o() {
        return (C1795d) mo7075n();
    }

    /* renamed from: A */
    public final C1580b mo7062A() {
        return this.f4966h;
    }

    /* renamed from: B */
    public final int mo7063B() {
        return this.f4967i;
    }

    public C1576b(C2713i iVar, C1680ab abVar, C1580b bVar, int i) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(abVar, "containingDeclaration");
        C1489j.m6972b(bVar, "functionKind");
        super(iVar, bVar.mo7102a(i));
        this.f4964f = iVar;
        this.f4965g = abVar;
        this.f4966h = bVar;
        this.f4967i = i;
        final ArrayList arrayList = new ArrayList();
        C15771 r6 = new C1461m<C2792ba, String, C3230x>(this) {

            /* renamed from: a */
            final /* synthetic */ C1576b f4968a;

            {
                this.f4968a = r1;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6920a(Object obj, Object obj2) {
                mo7091a((C2792ba) obj, (String) obj2);
                return C3230x.f8645a;
            }

            /* renamed from: a */
            public final void mo7091a(C2792ba baVar, String str) {
                C1489j.m6972b(baVar, "variance");
                C1489j.m6972b(str, "name");
                arrayList.add(C1746ag.m7832a(this.f4968a, C1659h.f5247a.mo7260a(), false, baVar, C2360f.m11701a(str), arrayList.size()));
            }
        };
        Iterable cVar = new C1515c(1, this.f4967i);
        Collection arrayList2 = new ArrayList(C1415k.m6842a(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            int b = ((C1388ac) it).mo6764b();
            C2792ba baVar = C2792ba.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(b);
            r6.mo7091a(baVar, sb.toString());
            arrayList2.add(C3230x.f8645a);
        }
        List list = (List) arrayList2;
        r6.mo7091a(C2792ba.OUT_VARIANCE, "R");
        this.f4963e = C1415k.m6893k((Iterable<? extends T>) arrayList);
    }

    /* renamed from: a */
    public C1680ab mo7065b() {
        return this.f4965g;
    }

    /* renamed from: c */
    public C2564c mo7087x_() {
        return C2564c.f7661a;
    }

    /* renamed from: e */
    public C2767an mo7067e() {
        return this.f4961c;
    }

    /* renamed from: y_ */
    public C1583d mo7068g() {
        return this.f4962d;
    }

    /* renamed from: j */
    public List<C1795d> mo7072k() {
        return C1415k.m6837a();
    }

    /* renamed from: l */
    public C1797f mo7073l() {
        return C1797f.INTERFACE;
    }

    /* renamed from: m */
    public C1818w mo7074m() {
        return C1818w.ABSTRACT;
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return C1710ay.f5340e;
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return C1659h.f5247a.mo7260a();
    }

    /* renamed from: y */
    public C1692am mo7088y() {
        C1692am amVar = C1692am.f5331a;
        C1489j.m6969a((Object) amVar, "SourceElement.NO_SOURCE");
        return amVar;
    }

    /* renamed from: z */
    public List<C1700ar> mo7090z() {
        return this.f4963e;
    }

    public String toString() {
        return mo7351z_().mo9039a();
    }
}
