package p073b.p085h.p087b.p088a.p089a;

import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2663m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;", "()V", "reportCannotInferVisibility", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "reportIncompleteHierarchy", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "unresolvedSuperClasses", "", "", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.i */
/* compiled from: RuntimeErrorReporter.kt */
public final class C1539i implements C2663m {

    /* renamed from: a */
    public static final C1539i f4905a = new C1539i();

    private C1539i() {
    }

    /* renamed from: a */
    public void mo7008a(C1796e eVar, List<String> list) {
        C1489j.m6972b(eVar, "descriptor");
        C1489j.m6972b(list, "unresolvedSuperClasses");
        StringBuilder sb = new StringBuilder();
        sb.append("Incomplete hierarchy for class ");
        sb.append(eVar.mo7351z_());
        sb.append(", unresolved classes ");
        sb.append(list);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo7007a(C1724b bVar) {
        C1489j.m6972b(bVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot infer visibility for ");
        sb.append(bVar);
        throw new IllegalStateException(sb.toString());
    }
}
