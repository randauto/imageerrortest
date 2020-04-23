package p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p073b.C3230x;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2264w;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2274y;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2286d;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2299a.C2301a;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2299a.C2305c;
import p073b.p085h.p087b.p088a.p090b.p117g.C2410t;

/* renamed from: b.h.b.a.b.e.b.a.k */
/* compiled from: ModuleMapping.kt */
public final class C2325k {

    /* renamed from: a */
    public static final C2325k f7120a = new C2325k(C1389ad.m6747a(), new C2309a(C1415k.m6837a()), "EMPTY");

    /* renamed from: b */
    public static final C2325k f7121b = new C2325k(C1389ad.m6747a(), new C2309a(C1415k.m6837a()), "CORRUPTED");

    /* renamed from: c */
    public static final C2326a f7122c = new C2326a(null);

    /* renamed from: d */
    private final Map<String, C2328m> f7123d;

    /* renamed from: e */
    private final C2309a f7124e;

    /* renamed from: f */
    private final String f7125f;

    /* renamed from: b.h.b.a.b.e.b.a.k$a */
    /* compiled from: ModuleMapping.kt */
    public static final class C2326a {
        private C2326a() {
        }

        public /* synthetic */ C2326a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2325k mo8900a(byte[] bArr, String str, boolean z, boolean z2, C1450b<? super C2319g, C3230x> bVar) {
            String str2;
            byte[] bArr2 = bArr;
            String str3 = str;
            C1450b<? super C2319g, C3230x> bVar2 = bVar;
            C1489j.m6972b(str3, "debugName");
            C1489j.m6972b(bVar2, "reportIncompatibleVersionError");
            if (bArr2 == null) {
                return C2325k.f7120a;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr2));
            try {
                int[] iArr = new int[dataInputStream.readInt()];
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    iArr[i] = dataInputStream.readInt();
                }
                C2319g gVar = new C2319g(Arrays.copyOf(iArr, iArr.length));
                if (z || gVar.mo8893d()) {
                    C2301a a = C2301a.m11233a((InputStream) dataInputStream);
                    if (a == null) {
                        return C2325k.f7120a;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C2305c cVar : a.mo8832d()) {
                        C1489j.m6969a((Object) cVar, "proto");
                        String e = cVar.mo8864e();
                        Map map = linkedHashMap;
                        C1489j.m6969a((Object) e, "packageFqName");
                        Object obj = map.get(e);
                        if (obj == null) {
                            obj = new C2328m(e);
                            map.put(e, obj);
                        }
                        C2328m mVar = (C2328m) obj;
                        C2410t<String> g = cVar.mo8866g();
                        C1489j.m6969a((Object) g, "proto.shortClassNameList");
                        int i2 = 0;
                        for (String str4 : g) {
                            List j = cVar.mo8867j();
                            C1489j.m6969a((Object) j, "proto.multifileFacadeShortNameIdList");
                            Integer num = (Integer) C1415k.m6872c(j, i2);
                            Number valueOf = num != null ? Integer.valueOf(num.intValue() - 1) : null;
                            if (valueOf != null) {
                                C2410t k = cVar.mo8868k();
                                C1489j.m6969a((Object) k, "proto.multifileFacadeShortNameList");
                                str2 = (String) C1415k.m6872c((List<? extends T>) k, valueOf.intValue());
                            } else {
                                str2 = null;
                            }
                            String a2 = str2 != null ? C2327l.m11404b(e, str2) : null;
                            C1489j.m6969a((Object) str4, "partShortName");
                            mVar.mo8903a(C2327l.m11404b(e, str4), a2);
                            i2++;
                        }
                        if (z2) {
                            C2410t<String> l = cVar.mo8869l();
                            C1489j.m6969a((Object) l, "proto.classWithJvmPackageNameShortNameList");
                            int i3 = 0;
                            for (String str5 : l) {
                                List p = cVar.mo8870p();
                                C1489j.m6969a((Object) p, "proto.classWithJvmPackageNamePackageIdList");
                                Integer num2 = (Integer) C1415k.m6872c(p, i3);
                                if (num2 == null) {
                                    List p2 = cVar.mo8870p();
                                    C1489j.m6969a((Object) p2, "proto.classWithJvmPackageNamePackageIdList");
                                    num2 = (Integer) C1415k.m6888i(p2);
                                }
                                if (num2 != null) {
                                    int intValue = num2.intValue();
                                    C2410t j2 = a.mo8836j();
                                    C1489j.m6969a((Object) j2, "moduleProto.jvmPackageNameList");
                                    String str6 = (String) C1415k.m6872c((List<? extends T>) j2, intValue);
                                    if (str6 != null) {
                                        C1489j.m6969a((Object) str5, "partShortName");
                                        mVar.mo8903a(C2327l.m11404b(str6, str5), null);
                                    }
                                }
                                i3++;
                            }
                        }
                    }
                    for (C2305c cVar2 : a.mo8834f()) {
                        Map map2 = linkedHashMap;
                        C1489j.m6969a((Object) cVar2, "proto");
                        String e2 = cVar2.mo8864e();
                        C1489j.m6969a((Object) e2, "proto.packageFqName");
                        Object obj2 = map2.get(e2);
                        if (obj2 == null) {
                            String e3 = cVar2.mo8864e();
                            C1489j.m6969a((Object) e3, "proto.packageFqName");
                            obj2 = new C2328m(e3);
                            map2.put(e2, obj2);
                        }
                        C2328m mVar2 = (C2328m) obj2;
                        C2410t<String> g2 = cVar2.mo8866g();
                        C1489j.m6969a((Object) g2, "proto.shortClassNameList");
                        for (String a3 : g2) {
                            mVar2.mo8902a(a3);
                        }
                    }
                    C2274y l2 = a.mo8838l();
                    C1489j.m6969a((Object) l2, "moduleProto.stringTable");
                    C2264w q = a.mo8840q();
                    C1489j.m6969a((Object) q, "moduleProto.qualifiedNameTable");
                    C2286d dVar = new C2286d(l2, q);
                    List r = a.mo8841r();
                    C1489j.m6969a((Object) r, "moduleProto.annotationList");
                    Iterable<C2160a> iterable = r;
                    Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
                    for (C2160a aVar : iterable) {
                        C1489j.m6969a((Object) aVar, "proto");
                        arrayList.add(dVar.mo8812b(aVar.mo8103e()));
                    }
                    return new C2325k(linkedHashMap, new C2309a((List) arrayList), str3, null);
                }
                bVar2.mo6756a(gVar);
                return C2325k.f7120a;
            } catch (IOException unused) {
                return C2325k.f7121b;
            }
        }
    }

    private C2325k(Map<String, C2328m> map, C2309a aVar, String str) {
        this.f7123d = map;
        this.f7124e = aVar;
        this.f7125f = str;
    }

    public /* synthetic */ C2325k(Map map, C2309a aVar, String str, C1486g gVar) {
        this(map, aVar, str);
    }

    /* renamed from: a */
    public final Map<String, C2328m> mo8898a() {
        return this.f7123d;
    }

    public String toString() {
        return this.f7125f;
    }
}
