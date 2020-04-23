package p073b.p085h.p087b.p088a.p141d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1990e;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p141d.C2962d.C2963a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0016R\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "values", "", "(Lorg/jetbrains/kotlin/name/Name;[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getElements", "", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.h */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C2968h extends C2962d implements C1990e {

    /* renamed from: b */
    private final Object[] f8304b;

    public C2968h(C2360f fVar, Object[] objArr) {
        C1489j.m6972b(objArr, "values");
        super(fVar);
        this.f8304b = objArr;
    }

    /* renamed from: b */
    public List<C2962d> mo7833b() {
        Object[] objArr = this.f8304b;
        Collection arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            C2963a aVar = C2962d.f8301a;
            if (obj == null) {
                C1489j.m6968a();
            }
            arrayList.add(aVar.mo10080a(obj, null));
        }
        return (List) arrayList;
    }
}
