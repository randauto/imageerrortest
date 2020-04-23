package p073b.p085h.p087b.p088a;

import java.lang.ref.WeakReference;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p140c.C2924b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0000\"*\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, mo10386c = {"K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/pcollections/HashPMap;", "", "kotlin.jvm.PlatformType", "", "clearKClassCache", "", "getOrCreateKotlinClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "jClass", "Ljava/lang/Class;", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.i */
/* compiled from: kClassCache.kt */
public final class C3023i {

    /* renamed from: a */
    private static C2924b<String, Object> f8367a = C2924b.m14037a();

    /* renamed from: a */
    public static final <T> C3024j<T> m14317a(Class<T> cls) {
        C1489j.m6972b(cls, "jClass");
        String name = cls.getName();
        Object a = f8367a.mo10052a((Object) name);
        Class cls2 = null;
        if (a instanceof WeakReference) {
            C3024j<T> jVar = (C3024j) ((WeakReference) a).get();
            if (jVar != null) {
                cls2 = jVar.mo6933a();
            }
            if (C1489j.m6971a((Object) cls2, (Object) cls)) {
                return jVar;
            }
        } else if (a != null) {
            for (WeakReference weakReference : (WeakReference[]) a) {
                C3024j<T> jVar2 = (C3024j) weakReference.get();
                if (C1489j.m6971a(jVar2 != null ? jVar2.mo6933a() : null, (Object) cls)) {
                    return jVar2;
                }
            }
            int length = ((Object[]) a).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(a, 0, weakReferenceArr, 0, length);
            C3024j<T> jVar3 = new C3024j<>(cls);
            weakReferenceArr[length] = new WeakReference(jVar3);
            f8367a = f8367a.mo10051a(name, weakReferenceArr);
            return jVar3;
        }
        C3024j<T> jVar4 = new C3024j<>(cls);
        f8367a = f8367a.mo10051a(name, new WeakReference(jVar4));
        return jVar4;
    }
}
