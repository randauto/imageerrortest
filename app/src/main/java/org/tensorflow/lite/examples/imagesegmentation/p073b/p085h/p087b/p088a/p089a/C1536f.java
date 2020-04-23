package p073b.p085h.p087b.p088a.p089a;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1992g;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2136m;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findBuiltInsData", "Ljava/io/InputStream;", "packageFqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "findKotlinClass", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "fqName", "", "javaClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findMetadata", "hasMetadataPackage", "", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.f */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class C1536f implements C2136m {

    /* renamed from: a */
    private final ClassLoader f4903a;

    public C1536f(ClassLoader classLoader) {
        C1489j.m6972b(classLoader, "classLoader");
        this.f4903a = classLoader;
    }

    /* renamed from: a */
    private final C2137n m7078a(String str) {
        Class a = C1533d.m7070a(this.f4903a, str);
        return a != null ? C1534e.f4900a.mo7004a(a) : null;
    }

    /* renamed from: a */
    public C2137n mo7006a(C2354a aVar) {
        C1489j.m6972b(aVar, "classId");
        return m7078a(C1537g.m7082b(aVar));
    }

    /* renamed from: a */
    public C2137n mo7005a(C1992g gVar) {
        C1489j.m6972b(gVar, "javaClass");
        C2355b c = gVar.mo7835c();
        if (c != null) {
            String a = c.mo9013a();
            if (a != null) {
                return m7078a(a);
            }
        }
        return null;
    }
}
