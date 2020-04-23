package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3227u;
import p073b.C3230x;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1465q;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1626f;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p091a.C1639h;
import p073b.p085h.p087b.p088a.p090b.p091a.C1645k;
import p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1595c;
import p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1595c.C1596a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2073s;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p116f.C2362h;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.C2537e;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2535b;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2536c;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2840v;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;
import p073b.p085h.p087b.p088a.p090b.p139n.C2894d;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.d.b.z */
/* compiled from: typeSignatureMapping.kt */
public final class C2157z {
    /* renamed from: a */
    private static final <T> T m9618a(C2134k<T> kVar, T t, boolean z) {
        return z ? kVar.mo8053a(t) : t;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m9621a(C2841w wVar, C2134k kVar, C2154x xVar, C2152v vVar, C2128h hVar, C1465q qVar, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            qVar = C2894d.m13973c();
        }
        return m9620a(wVar, kVar, xVar, vVar, hVar, qVar, z);
    }

    /* renamed from: a */
    public static final <T> T m9620a(C2841w wVar, C2134k<T> kVar, C2154x xVar, C2152v<? extends T> vVar, C2128h<T> hVar, C1465q<? super C2841w, ? super T, ? super C2154x, C3230x> qVar, boolean z) {
        T t;
        Object obj;
        C1489j.m6972b(wVar, "kotlinType");
        C1489j.m6972b(kVar, "factory");
        C1489j.m6972b(xVar, "mode");
        C1489j.m6972b(vVar, "typeMappingConfiguration");
        C1489j.m6972b(qVar, "writeGenericType");
        if (C1626f.m7374b(wVar)) {
            return m9620a(C1645k.m7506a(wVar, vVar.mo8089a()), kVar, xVar, vVar, hVar, qVar, z);
        }
        Object a = m9619a(wVar, kVar, xVar);
        if (a != null) {
            T a2 = m9618a(kVar, (T) a, xVar.mo8094b());
            qVar.mo6921a(wVar, a2, xVar);
            return a2;
        }
        C2767an g = wVar.mo9507g();
        if (g instanceof C2840v) {
            Collection C_ = ((C2840v) g).mo7405C_();
            C1489j.m6969a((Object) C_, "constructor.supertypes");
            return m9620a(C2803a.m13684g(vVar.mo8086a(C_)), kVar, xVar, vVar, hVar, qVar, z);
        }
        C1799h d = g.mo7096d();
        if (d == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("no descriptor for type constructor of ");
            sb.append(wVar);
            throw new UnsupportedOperationException(sb.toString());
        } else if (C2827p.m13783a((C1804m) d)) {
            T b = kVar.mo8055b("error/NonExistentClass");
            if (d != null) {
                vVar.mo8088a(wVar, (C1796e) d);
                if (hVar != null) {
                    hVar.mo8039a(b);
                }
                return b;
            }
            throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        } else {
            boolean z2 = d instanceof C1796e;
            if (!z2 || !C1627g.m7409c(wVar)) {
                if (z2) {
                    C1796e eVar = (C1796e) d;
                    if (eVar.mo7081t() && !xVar.mo8095c()) {
                        C2841w a3 = m9617a(wVar);
                        if (a3 != null) {
                            if (!C2537e.m12669c(a3)) {
                                xVar = xVar.mo8092a();
                            }
                            return m9620a(a3, kVar, xVar, vVar, hVar, qVar, z);
                        }
                    }
                    if (!xVar.mo8096d() || !C1627g.m7415e(eVar)) {
                        C1796e E = eVar.mo7354E();
                        C1489j.m6969a((Object) E, "descriptor.original");
                        T a4 = vVar.mo8087a(E);
                        if (a4 != null) {
                            t = a4;
                        } else {
                            if (eVar.mo7073l() == C1797f.ENUM_ENTRY) {
                                C1804m b2 = eVar.mo7065b();
                                if (b2 != null) {
                                    eVar = (C1796e) b2;
                                } else {
                                    throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                }
                            }
                            C1796e E2 = eVar.mo7354E();
                            C1489j.m6969a((Object) E2, "enumClassIfEnumEntry.original");
                            t = kVar.mo8055b(m9622a(E2, vVar, z));
                        }
                    } else {
                        t = kVar.mo8052a();
                    }
                    qVar.mo6921a(wVar, t, xVar);
                    return t;
                } else if (d instanceof C1700ar) {
                    T a5 = m9620a(m9616a((C1700ar) d), kVar, xVar, vVar, null, C2894d.m13973c(), z);
                    if (hVar != null) {
                        C2360f z_ = d.mo7351z_();
                        C1489j.m6969a((Object) z_, "descriptor.getName()");
                        hVar.mo8038a(z_, a5);
                    }
                    return a5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown type ");
                    sb2.append(wVar);
                    throw new UnsupportedOperationException(sb2.toString());
                }
            } else if (wVar.mo9501a().size() == 1) {
                C2771ap apVar = (C2771ap) wVar.mo9501a().get(0);
                C2841w c = apVar.mo9869c();
                if (apVar.mo9868b() == C2792ba.IN_VARIANCE) {
                    obj = kVar.mo8055b("java/lang/Object");
                    if (hVar != null) {
                        hVar.mo8037a();
                        hVar.mo8039a(obj);
                        hVar.mo8040b();
                    }
                } else {
                    if (hVar != null) {
                        hVar.mo8037a();
                    }
                    C1489j.m6969a((Object) c, "memberType");
                    C2792ba b3 = apVar.mo9868b();
                    C1489j.m6969a((Object) b3, "memberProjection.projectionKind");
                    obj = m9620a(c, kVar, xVar.mo8093a(b3), vVar, hVar, qVar, z);
                    if (hVar != null) {
                        hVar.mo8040b();
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("[");
                sb3.append(kVar.mo8056b(obj));
                return kVar.mo8054a(sb3.toString());
            } else {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if ((r2 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1688ai) == false) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m9625a(p073b.p085h.p087b.p088a.p090b.p094b.C1648a r2) {
        /*
            java.lang.String r0 = "descriptor"
            p073b.p079e.p081b.C1489j.m6972b(r2, r0)
            boolean r0 = r2 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1803l
            r1 = 1
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            b.h.b.a.b.l.w r0 = r2.mo7234g()
            if (r0 != 0) goto L_0x0014
            p073b.p079e.p081b.C1489j.m6968a()
        L_0x0014:
            boolean r0 = p073b.p085h.p087b.p088a.p090b.p091a.C1627g.m7434v(r0)
            if (r0 == 0) goto L_0x002e
            b.h.b.a.b.l.w r0 = r2.mo7234g()
            if (r0 != 0) goto L_0x0023
            p073b.p079e.p081b.C1489j.m6968a()
        L_0x0023:
            boolean r0 = p073b.p085h.p087b.p088a.p090b.p131l.C2783av.m13580f(r0)
            if (r0 != 0) goto L_0x002e
            boolean r2 = r2 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1688ai
            if (r2 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2157z.m9625a(b.h.b.a.b.b.a):boolean");
    }

    /* renamed from: a */
    private static final String m9624a(boolean z) {
        C2355b bVar;
        if (z) {
            bVar = C2523c.f7566h;
        } else {
            bVar = C2523c.f7565g;
        }
        C2535b a = C2535b.m12653a(C2354a.m11661a(bVar));
        C1489j.m6969a((Object) a, "JvmClassName.byClassId(ClassId.topLevel(fqName))");
        String c = a.mo9555c();
        C1489j.m6969a((Object) c, "JvmClassName.byClassId(C…vel(fqName)).internalName");
        return c;
    }

    /* renamed from: a */
    private static final <T> T m9619a(C2841w wVar, C2134k<T> kVar, C2154x xVar) {
        C1799h d = wVar.mo9507g().mo7096d();
        if (!(d instanceof C1796e)) {
            d = null;
        }
        C1796e eVar = (C1796e) d;
        if (eVar == null) {
            return null;
        }
        boolean z = false;
        if (eVar == C1645k.m7505a()) {
            return kVar.mo8055b(m9624a(false));
        }
        if (C1489j.m6971a((Object) eVar, (Object) C1645k.m7508b())) {
            return kVar.mo8055b(m9624a(true));
        }
        C1804m mVar = eVar;
        C1639h c = C1627g.m7404c(mVar);
        if (c != null) {
            C2536c a = C2536c.m12659a(c);
            C1489j.m6969a((Object) a, "JvmPrimitiveType.get(primitiveType)");
            String c2 = a.mo9561c();
            C1489j.m6969a((Object) c2, "JvmPrimitiveType.get(primitiveType).desc");
            Object a2 = kVar.mo8054a(c2);
            if (C2783av.m13580f(wVar) || C2073s.m9309a(wVar)) {
                z = true;
            }
            return m9618a(kVar, (T) a2, z);
        }
        C1639h d2 = C1627g.m7411d(mVar);
        if (d2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            C2536c a3 = C2536c.m12659a(d2);
            C1489j.m6969a((Object) a3, "JvmPrimitiveType.get(arrayElementType)");
            sb.append(a3.mo9561c());
            return kVar.mo8054a(sb.toString());
        }
        if (C1627g.m7402b(mVar)) {
            C2354a a4 = C1595c.f4995a.mo7121a(C2524a.m12621a(mVar));
            if (a4 != null) {
                if (!xVar.mo8097e()) {
                    Iterable a5 = C1595c.f4995a.mo7123a();
                    if (!(a5 instanceof Collection) || !((Collection) a5).isEmpty()) {
                        Iterator it = a5.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C1489j.m6971a((Object) ((C1596a) it.next()).mo7130a(), (Object) a4)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z) {
                        return null;
                    }
                }
                C2535b a6 = C2535b.m12653a(a4);
                C1489j.m6969a((Object) a6, "JvmClassName.byClassId(classId)");
                String c3 = a6.mo9555c();
                C1489j.m6969a((Object) c3, "JvmClassName.byClassId(classId).internalName");
                return kVar.mo8055b(c3);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C2841w m9617a(C2841w wVar) {
        C2841w wVar2;
        C1489j.m6972b(wVar, "inlineClassType");
        if (!m9626b(wVar)) {
            return null;
        }
        C2841w b = C2537e.m12668b(wVar);
        if (b != null) {
            C2767an g = b.mo9507g();
            if (g != null) {
                C1799h d = g.mo7096d();
                if (d != null) {
                    if (d instanceof C1700ar) {
                        wVar2 = m9616a((C1700ar) d);
                    } else {
                        wVar2 = C2537e.m12670d(wVar);
                    }
                    return wVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m9626b(C2841w wVar) {
        C1489j.m6972b(wVar, "inlineClassType");
        C2841w b = C2537e.m12668b(wVar);
        boolean z = false;
        if (b == null) {
            return false;
        }
        if (!wVar.mo7897c() || (!C2783av.m13580f(b) && !C1627g.m7417e(b))) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m9623a(C1796e eVar, C2152v vVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            vVar = C2153w.f6455a;
        }
        return m9622a(eVar, vVar, z);
    }

    /* renamed from: a */
    public static final String m9622a(C1796e eVar, C2152v<?> vVar, boolean z) {
        C1489j.m6972b(eVar, "klass");
        C1489j.m6972b(vVar, "typeMappingConfiguration");
        C1804m a = z ? m9615a(eVar.mo7065b()) : eVar.mo7065b();
        C2360f a2 = C2362h.m11710a(eVar.mo7351z_());
        C1489j.m6969a((Object) a2, "SpecialNames.safeIdentifier(klass.name)");
        String b = a2.mo9040b();
        if (a instanceof C1680ab) {
            C2355b f = ((C1680ab) a).mo7284f();
            if (f.mo9016c()) {
                C1489j.m6969a((Object) b, "name");
            } else {
                StringBuilder sb = new StringBuilder();
                String a3 = f.mo9013a();
                C1489j.m6969a((Object) a3, "fqName.asString()");
                sb.append(C3199m.m14754a(a3, '.', '/', false, 4, (Object) null));
                sb.append('/');
                sb.append(b);
                b = sb.toString();
            }
            return b;
        }
        C1796e eVar2 = (C1796e) (!(a instanceof C1796e) ? null : a);
        if (eVar2 != null) {
            String b2 = vVar.mo8090b(eVar2);
            if (b2 == null) {
                b2 = m9622a(eVar2, vVar, z);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b2);
            sb2.append("$");
            sb2.append(b);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unexpected container: ");
        sb3.append(a);
        sb3.append(" for ");
        sb3.append(eVar);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    private static final C1804m m9615a(C1804m mVar) {
        C1804m mVar2 = (C1796e) (!(mVar instanceof C1796e) ? null : mVar);
        if (mVar2 == null) {
            mVar2 = (C1680ab) (!(mVar instanceof C1680ab) ? null : mVar);
        }
        C1804m mVar3 = mVar2;
        if (mVar3 != null) {
            return mVar3;
        }
        if (mVar != null) {
            return m9615a(mVar.mo7065b());
        }
        return null;
    }

    /* renamed from: a */
    private static final C2841w m9616a(C1700ar arVar) {
        Object obj;
        List j = arVar.mo7315j();
        boolean z = !j.isEmpty();
        if (!C3232z.f8648a || z) {
            C1489j.m6969a((Object) j, "upperBounds");
            Iterator it = j.iterator();
            while (true) {
                C1796e eVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C1799h d = ((C2841w) obj).mo9507g().mo7096d();
                if (d instanceof C1796e) {
                    eVar = d;
                }
                C1796e eVar2 = eVar;
                boolean z2 = false;
                if (!(eVar2 == null || eVar2.mo7073l() == C1797f.INTERFACE || eVar2.mo7073l() == C1797f.ANNOTATION_CLASS)) {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C2841w wVar = (C2841w) obj;
            if (wVar != null) {
                return wVar;
            }
            Object f = C1415k.m6883f(j);
            C1489j.m6969a(f, "upperBounds.first()");
            return (C2841w) f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Upper bounds should not be empty: ");
        sb.append(arVar);
        throw new AssertionError(sb.toString());
    }
}
