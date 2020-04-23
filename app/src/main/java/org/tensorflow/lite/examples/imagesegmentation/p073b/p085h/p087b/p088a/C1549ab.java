package p073b.p085h.p087b.p088a;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p089a.C1540j;
import p073b.p085h.p087b.p088a.p141d.C2958b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\bH\u0000\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo10386c = {"moduleByClassLoader", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "Ljava/lang/ref/WeakReference;", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "clearModuleByClassLoaderCache", "", "getOrCreateModule", "Ljava/lang/Class;", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.ab */
/* compiled from: moduleByClassLoader.kt */
public final class C1549ab {

    /* renamed from: a */
    private static final ConcurrentMap<C1565ak, WeakReference<C1540j>> f4917a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C1540j m7102a(Class<?> cls) {
        C1489j.m6972b(cls, "$receiver");
        ClassLoader a = C2958b.m14084a(cls);
        C1565ak akVar = new C1565ak(a);
        WeakReference weakReference = (WeakReference) f4917a.get(akVar);
        if (weakReference != null) {
            C1540j jVar = (C1540j) weakReference.get();
            if (jVar != null) {
                C1489j.m6969a((Object) jVar, "it");
                return jVar;
            }
            f4917a.remove(akVar, weakReference);
        }
        C1540j a2 = C1540j.f4906a.mo7012a(a);
        while (true) {
            try {
                WeakReference weakReference2 = (WeakReference) f4917a.putIfAbsent(akVar, new WeakReference(a2));
                if (weakReference2 != null) {
                    C1540j jVar2 = (C1540j) weakReference2.get();
                    if (jVar2 != null) {
                        return jVar2;
                    }
                    f4917a.remove(akVar, weakReference2);
                } else {
                    akVar.mo7042a(null);
                    return a2;
                }
            } finally {
                akVar.mo7042a(null);
            }
        }
    }
}
