package p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3221p;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2197ai;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2222e;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2248o;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2256s;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2260u;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2280b.C2282a;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2288f;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2289g;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2290h;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2332a;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2336c;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2340e;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2344g;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2316f.C2317a;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2316f.C2318b;
import p073b.p085h.p087b.p088a.p090b.p117g.C2378g;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2387c;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2391f;

/* renamed from: b.h.b.a.b.e.b.a.j */
/* compiled from: JvmProtoBufUtil.kt */
public final class C2324j {

    /* renamed from: a */
    public static final C2324j f7118a = new C2324j();

    /* renamed from: b */
    private static final C2378g f7119b;

    static {
        C2378g a = C2378g.m11893a();
        C2330b.m11409a(a);
        C1489j.m6969a((Object) a, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        f7119b = a;
    }

    private C2324j() {
    }

    /* renamed from: a */
    public final C2378g mo8897a() {
        return f7119b;
    }

    /* renamed from: a */
    public static final C3221p<C2321h, C2216c> m11391a(String[] strArr, String[] strArr2) {
        C1489j.m6972b(strArr, "data");
        C1489j.m6972b(strArr2, "strings");
        byte[] a = C2310b.m11367a(strArr);
        C1489j.m6969a((Object) a, "BitEncoding.decodeBytes(data)");
        return m11390a(a, strArr2);
    }

    /* renamed from: a */
    public static final C3221p<C2321h, C2216c> m11390a(byte[] bArr, String[] strArr) {
        C1489j.m6972b(bArr, "bytes");
        C1489j.m6972b(strArr, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C3221p<>(f7118a.m11389a(byteArrayInputStream, strArr), C2216c.m10357a(byteArrayInputStream, f7119b));
    }

    /* renamed from: b */
    public static final C3221p<C2321h, C2256s> m11395b(String[] strArr, String[] strArr2) {
        C1489j.m6972b(strArr, "data");
        C1489j.m6972b(strArr2, "strings");
        byte[] a = C2310b.m11367a(strArr);
        C1489j.m6969a((Object) a, "BitEncoding.decodeBytes(data)");
        return m11394b(a, strArr2);
    }

    /* renamed from: b */
    public static final C3221p<C2321h, C2256s> m11394b(byte[] bArr, String[] strArr) {
        C1489j.m6972b(bArr, "bytes");
        C1489j.m6972b(strArr, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C3221p<>(f7118a.m11389a(byteArrayInputStream, strArr), C2256s.m10880a(byteArrayInputStream, f7119b));
    }

    /* renamed from: c */
    public static final C3221p<C2321h, C2248o> m11396c(String[] strArr, String[] strArr2) {
        C1489j.m6972b(strArr, "data");
        C1489j.m6972b(strArr2, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(C2310b.m11367a(strArr));
        return new C3221p<>(f7118a.m11389a(byteArrayInputStream, strArr2), C2248o.m10772a(byteArrayInputStream, f7119b));
    }

    /* renamed from: a */
    private final C2321h m11389a(InputStream inputStream, String[] strArr) {
        C2344g a = C2344g.m11552a(inputStream, f7119b);
        C1489j.m6969a((Object) a, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new C2321h(a, strArr);
    }

    /* renamed from: a */
    public final C2318b mo8896a(C2248o oVar, C2285c cVar, C2290h hVar) {
        String str;
        C1489j.m6972b(oVar, "proto");
        C1489j.m6972b(cVar, "nameResolver");
        C1489j.m6972b(hVar, "typeTable");
        C2387c cVar2 = oVar;
        C2391f<C2248o, C2336c> fVar = C2330b.f7130b;
        C1489j.m6969a((Object) fVar, "JvmProtoBuf.methodSignature");
        C2336c cVar3 = (C2336c) C2288f.m11197a(cVar2, fVar);
        int k = (cVar3 == null || !cVar3.mo8924d()) ? oVar.mo8631k() : cVar3.mo8925e();
        if (cVar3 == null || !cVar3.mo8926f()) {
            Collection b = C1415k.m6838b(C2289g.m11212b(oVar, hVar));
            List y = oVar.mo8642y();
            C1489j.m6969a((Object) y, "proto.valueParameterList");
            Iterable<C2197ai> iterable = y;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C2197ai aiVar : iterable) {
                C1489j.m6969a((Object) aiVar, "it");
                arrayList.add(C2289g.m11202a(aiVar, hVar));
            }
            Iterable<C2173aa> b2 = C1415k.m6870b(b, (Iterable<? extends T>) (List) arrayList);
            Collection arrayList2 = new ArrayList(C1415k.m6842a(b2, 10));
            for (C2173aa a : b2) {
                String a2 = f7118a.m11392a(a, cVar);
                if (a2 == null) {
                    return null;
                }
                arrayList2.add(a2);
            }
            List list = (List) arrayList2;
            String a3 = m11392a(C2289g.m11203a(oVar, hVar), cVar);
            if (a3 == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C1415k.m6859a(list, "", "(", ")", 0, null, null, 56, null));
            sb.append(a3);
            str = sb.toString();
        } else {
            str = cVar.mo8811a(cVar3.mo8927g());
        }
        return new C2318b(cVar.mo8811a(k), str);
    }

    /* renamed from: a */
    public final C2318b mo8895a(C2222e eVar, C2285c cVar, C2290h hVar) {
        String str;
        C1489j.m6972b(eVar, "proto");
        C1489j.m6972b(cVar, "nameResolver");
        C1489j.m6972b(hVar, "typeTable");
        C2387c cVar2 = eVar;
        C2391f<C2222e, C2336c> fVar = C2330b.f7129a;
        C1489j.m6969a((Object) fVar, "JvmProtoBuf.constructorSignature");
        C2336c cVar3 = (C2336c) C2288f.m11197a(cVar2, fVar);
        if (cVar3 == null || !cVar3.mo8926f()) {
            List f = eVar.mo8515f();
            C1489j.m6969a((Object) f, "proto.valueParameterList");
            Iterable<C2197ai> iterable = f;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C2197ai aiVar : iterable) {
                C2324j jVar = f7118a;
                C1489j.m6969a((Object) aiVar, "it");
                String a = jVar.m11392a(C2289g.m11202a(aiVar, hVar), cVar);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
            }
            str = C1415k.m6859a((List) arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            str = cVar.mo8811a(cVar3.mo8927g());
        }
        return new C2318b("<init>", str);
    }

    /* renamed from: a */
    public final C2317a mo8894a(C2260u uVar, C2285c cVar, C2290h hVar) {
        String str;
        C1489j.m6972b(uVar, "proto");
        C1489j.m6972b(cVar, "nameResolver");
        C1489j.m6972b(hVar, "typeTable");
        C2387c cVar2 = uVar;
        C2391f<C2260u, C2340e> fVar = C2330b.f7132d;
        C1489j.m6969a((Object) fVar, "JvmProtoBuf.propertySignature");
        C2340e eVar = (C2340e) C2288f.m11197a(cVar2, fVar);
        if (eVar == null) {
            return null;
        }
        C2332a e = eVar.mo8940d() ? eVar.mo8941e() : null;
        int k = (e == null || !e.mo8908d()) ? uVar.mo8718k() : e.mo8909e();
        if (e == null || !e.mo8910f()) {
            str = m11392a(C2289g.m11204a(uVar, hVar), cVar);
            if (str == null) {
                return null;
            }
        } else {
            str = cVar.mo8811a(e.mo8911g());
        }
        return new C2317a(cVar.mo8811a(k), str);
    }

    /* renamed from: a */
    private final String m11392a(C2173aa aaVar, C2285c cVar) {
        if (aaVar.mo8223s()) {
            return C2311c.m11370a(cVar.mo8812b(aaVar.mo8224t()));
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m11393a(C2260u uVar) {
        C1489j.m6972b(uVar, "proto");
        C2282a a = C2315e.f7101a.mo8882a();
        Object c = uVar.mo9208c(C2330b.f7133e);
        C1489j.m6969a(c, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean a2 = a.mo8809b(((Number) c).intValue());
        C1489j.m6969a((Object) a2, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return a2.booleanValue();
    }
}
