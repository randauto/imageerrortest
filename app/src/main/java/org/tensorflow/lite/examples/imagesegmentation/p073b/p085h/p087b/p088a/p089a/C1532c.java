package p073b.p085h.p087b.p088a.p089a;

import java.util.Set;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2077i;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1992g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2005t;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p141d.C2970j;
import p073b.p085h.p087b.p088a.p141d.C2990u;
import p073b.p143j.C3199m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/ReflectJavaClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findPackage", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "knownClassNamesInPackage", "", "", "packageFqName", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.c */
/* compiled from: ReflectJavaClassFinder.kt */
public final class C1532c implements C2077i {

    /* renamed from: a */
    private final ClassLoader f4899a;

    /* renamed from: b */
    public Set<String> mo6994b(C2355b bVar) {
        C1489j.m6972b(bVar, "packageFqName");
        return null;
    }

    public C1532c(ClassLoader classLoader) {
        C1489j.m6972b(classLoader, "classLoader");
        this.f4899a = classLoader;
    }

    /* renamed from: a */
    public C1992g mo6992a(C2354a aVar) {
        C1489j.m6972b(aVar, "classId");
        C2355b a = aVar.mo9001a();
        String a2 = aVar.mo9002b().mo9013a();
        C1489j.m6969a((Object) a2, "classId.relativeClassName.asString()");
        String a3 = C3199m.m14754a(a2, '.', '$', false, 4, (Object) null);
        C1489j.m6969a((Object) a, "packageFqName");
        if (!a.mo9016c()) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.mo9013a());
            sb.append(".");
            sb.append(a3);
            a3 = sb.toString();
        }
        Class a4 = C1533d.m7070a(this.f4899a, a3);
        if (a4 != null) {
            return new C2970j(a4);
        }
        return null;
    }

    /* renamed from: a */
    public C2005t mo6993a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return new C2990u(bVar);
    }
}
