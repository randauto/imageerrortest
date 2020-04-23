package p073b.p085h.p087b;

import java.util.Iterator;
import java.util.List;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C1525b;
import p073b.p085h.C3122c;
import p073b.p085h.C3143o;
import p073b.p085h.C3144p;
import p073b.p085h.p087b.p088a.C1548aa;
import p073b.p085h.p087b.p088a.C3111x;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, mo10386c = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "jvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflect-api"})
/* renamed from: b.h.b.a */
/* compiled from: KTypesJvm.kt */
public final class C1526a {
    /* renamed from: a */
    public static final C1525b<?> m7055a(C3143o oVar) {
        C1489j.m6972b(oVar, "$receiver");
        C3122c a = oVar.mo10308a();
        if (a != null) {
            C1525b<?> a2 = m7054a(a);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(oVar);
        throw new C1548aa(sb.toString());
    }

    /* renamed from: a */
    public static final C1525b<?> m7054a(C3122c cVar) {
        Object obj;
        boolean z;
        C1489j.m6972b(cVar, "$receiver");
        if (cVar instanceof C1525b) {
            return (C1525b) cVar;
        }
        if (cVar instanceof C3144p) {
            List a = ((C3144p) cVar).mo10318a();
            Iterator it = a.iterator();
            while (true) {
                C1796e eVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C3143o oVar = (C3143o) obj;
                if (oVar != null) {
                    C1799h d = ((C3111x) oVar).mo10310c().mo9507g().mo7096d();
                    if (d instanceof C1796e) {
                        eVar = d;
                    }
                    C1796e eVar2 = eVar;
                    if (eVar2 == null || eVar2.mo7073l() == C1797f.INTERFACE || eVar2.mo7073l() == C1797f.ANNOTATION_CLASS) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    throw new C3227u("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                }
            }
            C3143o oVar2 = (C3143o) obj;
            if (oVar2 == null) {
                oVar2 = (C3143o) C1415k.m6885g(a);
            }
            if (oVar2 != null) {
                C1525b<?> a2 = m7055a(oVar2);
                if (a2 != null) {
                    return a2;
                }
            }
            return C1503v.m6999a(Object.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(cVar);
        throw new C1548aa(sb.toString());
    }
}
