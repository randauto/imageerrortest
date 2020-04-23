package p073b.p085h.p087b.p088a.p090b.p112e.p113a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C1383a;
import p073b.C3219n;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2182ab;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2201ak;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2201ak.C2204b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2201ak.C2206c;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2222e;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2248o;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2260u;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q;

/* renamed from: b.h.b.a.b.e.a.i */
/* compiled from: VersionRequirement.kt */
public final class C2291i {

    /* renamed from: a */
    public static final C2292a f7037a = new C2292a(null);

    /* renamed from: b */
    private final C2293b f7038b;

    /* renamed from: c */
    private final C2206c f7039c;

    /* renamed from: d */
    private final C1383a f7040d;

    /* renamed from: e */
    private final Integer f7041e;

    /* renamed from: f */
    private final String f7042f;

    /* renamed from: b.h.b.a.b.e.a.i$a */
    /* compiled from: VersionRequirement.kt */
    public static final class C2292a {
        private C2292a() {
        }

        public /* synthetic */ C2292a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final List<C2291i> mo8819a(C2406q qVar, C2285c cVar, C2296k kVar) {
            List list;
            C1489j.m6972b(qVar, "proto");
            C1489j.m6972b(cVar, "nameResolver");
            C1489j.m6972b(kVar, "table");
            if (qVar instanceof C2216c) {
                list = ((C2216c) qVar).mo8452H();
            } else if (qVar instanceof C2222e) {
                list = ((C2222e) qVar).mo8517j();
            } else if (qVar instanceof C2248o) {
                list = ((C2248o) qVar).mo8618C();
            } else if (qVar instanceof C2260u) {
                list = ((C2260u) qVar).mo8708E();
            } else if (qVar instanceof C2182ab) {
                list = ((C2182ab) qVar).mo8303y();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected declaration: ");
                sb.append(qVar.getClass());
                throw new IllegalStateException(sb.toString());
            }
            C1489j.m6969a((Object) list, "ids");
            Iterable<Integer> iterable = list;
            Collection arrayList = new ArrayList();
            for (Integer num : iterable) {
                C2292a aVar = C2291i.f7037a;
                C1489j.m6969a((Object) num, "id");
                C2291i a = aVar.mo8818a(num.intValue(), cVar, kVar);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return (List) arrayList;
        }

        /* renamed from: a */
        public final C2291i mo8818a(int i, C2285c cVar, C2296k kVar) {
            C1383a aVar;
            C1489j.m6972b(cVar, "nameResolver");
            C1489j.m6972b(kVar, "table");
            C2201ak a = kVar.mo8825a(i);
            String str = null;
            if (a == null) {
                return null;
            }
            C2293b a2 = C2293b.f7044b.mo8824a(a.mo8403d() ? Integer.valueOf(a.mo8404e()) : null, a.mo8405f() ? Integer.valueOf(a.mo8406g()) : null);
            C2204b k = a.mo8408k();
            if (k == null) {
                C1489j.m6968a();
            }
            switch (C2295j.f7048a[k.ordinal()]) {
                case 1:
                    aVar = C1383a.WARNING;
                    break;
                case 2:
                    aVar = C1383a.ERROR;
                    break;
                case 3:
                    aVar = C1383a.HIDDEN;
                    break;
                default:
                    throw new C3219n();
            }
            C1383a aVar2 = aVar;
            Integer valueOf = a.mo8409l() ? Integer.valueOf(a.mo8410p()) : null;
            if (a.mo8411q()) {
                str = cVar.mo8811a(a.mo8412r());
            }
            String str2 = str;
            C2206c t = a.mo8414t();
            C1489j.m6969a((Object) t, "info.versionKind");
            C2291i iVar = new C2291i(a2, t, aVar2, valueOf, str2);
            return iVar;
        }
    }

    /* renamed from: b.h.b.a.b.e.a.i$b */
    /* compiled from: VersionRequirement.kt */
    public static final class C2293b {

        /* renamed from: a */
        public static final C2293b f7043a = new C2293b(256, 256, 256);

        /* renamed from: b */
        public static final C2294a f7044b = new C2294a(null);

        /* renamed from: c */
        private final int f7045c;

        /* renamed from: d */
        private final int f7046d;

        /* renamed from: e */
        private final int f7047e;

        /* renamed from: b.h.b.a.b.e.a.i$b$a */
        /* compiled from: VersionRequirement.kt */
        public static final class C2294a {
            private C2294a() {
            }

            public /* synthetic */ C2294a(C1486g gVar) {
                this();
            }

            /* renamed from: a */
            public final C2293b mo8824a(Integer num, Integer num2) {
                if (num2 != null) {
                    return new C2293b(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new C2293b(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
                }
                return C2293b.f7043a;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2293b) {
                    C2293b bVar = (C2293b) obj;
                    if (this.f7045c == bVar.f7045c) {
                        if (this.f7046d == bVar.f7046d) {
                            if (this.f7047e == bVar.f7047e) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f7045c * 31) + this.f7046d) * 31) + this.f7047e;
        }

        public C2293b(int i, int i2, int i3) {
            this.f7045c = i;
            this.f7046d = i2;
            this.f7047e = i3;
        }

        public /* synthetic */ C2293b(int i, int i2, int i3, int i4, C1486g gVar) {
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            this(i, i2, i3);
        }

        /* renamed from: a */
        public final String mo8820a() {
            StringBuilder sb;
            int i;
            if (this.f7047e == 0) {
                sb = new StringBuilder();
                sb.append(this.f7045c);
                sb.append('.');
                i = this.f7046d;
            } else {
                sb = new StringBuilder();
                sb.append(this.f7045c);
                sb.append('.');
                sb.append(this.f7046d);
                sb.append('.');
                i = this.f7047e;
            }
            sb.append(i);
            return sb.toString();
        }

        public String toString() {
            return mo8820a();
        }
    }

    public C2291i(C2293b bVar, C2206c cVar, C1383a aVar, Integer num, String str) {
        C1489j.m6972b(bVar, "version");
        C1489j.m6972b(cVar, "kind");
        C1489j.m6972b(aVar, "level");
        this.f7038b = bVar;
        this.f7039c = cVar;
        this.f7040d = aVar;
        this.f7041e = num;
        this.f7042f = str;
    }

    /* renamed from: a */
    public final C2293b mo8815a() {
        return this.f7038b;
    }

    /* renamed from: b */
    public final C2206c mo8816b() {
        return this.f7039c;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("since ");
        sb.append(this.f7038b);
        sb.append(' ');
        sb.append(this.f7040d);
        if (this.f7041e != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" error ");
            sb2.append(this.f7041e);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f7042f != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            sb3.append(this.f7042f);
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }
}
