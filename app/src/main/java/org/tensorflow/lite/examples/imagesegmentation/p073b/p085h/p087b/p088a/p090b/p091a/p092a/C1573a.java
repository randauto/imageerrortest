package p073b.p085h.p087b.p088a.p090b.p091a.p092a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3227u;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1621c;
import p073b.p085h.p087b.p088a.p090b.p091a.p092a.C1576b.C1580b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1728b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.a.a.a */
/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
public final class C1573a implements C1728b {

    /* renamed from: a */
    public static final C1574a f4956a = new C1574a(null);

    /* renamed from: b */
    private final C2713i f4957b;

    /* renamed from: c */
    private final C1821y f4958c;

    /* renamed from: b.h.b.a.b.a.a.a$a */
    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    public static final class C1574a {
        private C1574a() {
        }

        public /* synthetic */ C1574a(C1486g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C1575b m7175b(String str, C2355b bVar) {
            C1580b a = C1580b.f4977e.mo7104a(bVar, str);
            if (a == null) {
                return null;
            }
            C1574a aVar = this;
            int length = a.mo7103b().length();
            if (str != null) {
                String substring = str.substring(length);
                C1489j.m6969a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                Integer a2 = aVar.m7174a(substring);
                if (a2 != null) {
                    return new C1575b(a, a2.intValue());
                }
                return null;
            }
            throw new C3227u("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: a */
        public final C1580b mo7055a(String str, C2355b bVar) {
            C1489j.m6972b(str, "className");
            C1489j.m6972b(bVar, "packageFqName");
            C1575b b = m7175b(str, bVar);
            if (b != null) {
                return b.mo7056a();
            }
            return null;
        }

        /* renamed from: a */
        private final Integer m7174a(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - '0';
                if (charAt < 0 || 9 < charAt) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: b.h.b.a.b.a.a.a$b */
    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    private static final class C1575b {

        /* renamed from: a */
        private final C1580b f4959a;

        /* renamed from: b */
        private final int f4960b;

        /* renamed from: b */
        public final C1580b mo7057b() {
            return this.f4959a;
        }

        /* renamed from: c */
        public final int mo7058c() {
            return this.f4960b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C1575b) {
                    C1575b bVar = (C1575b) obj;
                    if (C1489j.m6971a((Object) this.f4959a, (Object) bVar.f4959a)) {
                        if (this.f4960b == bVar.f4960b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C1580b bVar = this.f4959a;
            return ((bVar != null ? bVar.hashCode() : 0) * 31) + this.f4960b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("KindWithArity(kind=");
            sb.append(this.f4959a);
            sb.append(", arity=");
            sb.append(this.f4960b);
            sb.append(")");
            return sb.toString();
        }

        public C1575b(C1580b bVar, int i) {
            C1489j.m6972b(bVar, "kind");
            this.f4959a = bVar;
            this.f4960b = i;
        }

        /* renamed from: a */
        public final C1580b mo7056a() {
            return this.f4959a;
        }
    }

    public C1573a(C2713i iVar, C1821y yVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(yVar, "module");
        this.f4957b = iVar;
        this.f4958c = yVar;
    }

    /* renamed from: a */
    public boolean mo7054a(C2355b bVar, C2360f fVar) {
        C1489j.m6972b(bVar, "packageFqName");
        C1489j.m6972b(fVar, "name");
        String a = fVar.mo9039a();
        C1489j.m6969a((Object) a, "string");
        if ((C3199m.m14761b(a, "Function", false, 2, null) || C3199m.m14761b(a, "KFunction", false, 2, null) || C3199m.m14761b(a, "SuspendFunction", false, 2, null) || C3199m.m14761b(a, "KSuspendFunction", false, 2, null)) && f4956a.m7175b(a, bVar) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C1796e mo7052a(C2354a aVar) {
        C1489j.m6972b(aVar, "classId");
        if (aVar.mo9004d() || aVar.mo9007f()) {
            return null;
        }
        String a = aVar.mo9002b().mo9013a();
        C1489j.m6969a((Object) a, "className");
        if (!C3199m.m14808b((CharSequence) a, (CharSequence) "Function", false, 2, (Object) null)) {
            return null;
        }
        C2355b a2 = aVar.mo9001a();
        C1574a aVar2 = f4956a;
        C1489j.m6969a((Object) a2, "packageFqName");
        C1575b a3 = aVar2.m7175b(a, a2);
        if (a3 == null) {
            return null;
        }
        C1580b b = a3.mo7057b();
        int c = a3.mo7058c();
        Iterable f = this.f4958c.mo7523a(a2).mo7290f();
        Collection arrayList = new ArrayList();
        for (Object next : f) {
            if (next instanceof C1621c) {
                arrayList.add(next);
            }
        }
        return new C1576b(this.f4957b, (C1621c) C1415k.m6883f((List) arrayList), b, c);
    }

    /* renamed from: a */
    public Collection<C1796e> mo7053a(C2355b bVar) {
        C1489j.m6972b(bVar, "packageFqName");
        return C1395aj.m6759a();
    }
}
