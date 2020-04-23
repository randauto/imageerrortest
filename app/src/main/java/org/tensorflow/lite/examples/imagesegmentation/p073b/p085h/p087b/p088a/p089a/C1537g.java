package p073b.p085h.p087b.p088a.p089a;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p143j.C3199m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, mo10386c = {"toRuntimeFqName", "", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.g */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class C1537g {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m7082b(C2354a aVar) {
        String a = aVar.mo9002b().mo9013a();
        C1489j.m6969a((Object) a, "relativeClassName.asString()");
        String a2 = C3199m.m14754a(a, '.', '$', false, 4, (Object) null);
        C2355b a3 = aVar.mo9001a();
        C1489j.m6969a((Object) a3, "packageFqName");
        if (a3.mo9016c()) {
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo9001a());
        sb.append('.');
        sb.append(a2);
        return sb.toString();
    }
}
