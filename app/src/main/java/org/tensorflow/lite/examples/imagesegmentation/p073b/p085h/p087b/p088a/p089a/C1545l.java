package p073b.p085h.p087b.p088a.p089a;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1694an;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p107d.C1981a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p107d.C1982b;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1997l;
import p073b.p085h.p087b.p088a.p141d.C2982n;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory;", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElementFactory;", "()V", "source", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElement;", "javaElement", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaElement;", "RuntimeSourceElement", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.l */
/* compiled from: RuntimeSourceElementFactory.kt */
public final class C1545l implements C1982b {

    /* renamed from: a */
    public static final C1545l f4914a = new C1545l();

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory$RuntimeSourceElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElement;", "javaElement", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "(Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;)V", "getJavaElement", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "getContainingFile", "Lkotlin/reflect/jvm/internal/impl/descriptors/SourceFile;", "toString", "", "descriptors.runtime"})
    /* renamed from: b.h.b.a.a.l$a */
    /* compiled from: RuntimeSourceElementFactory.kt */
    public static final class C1546a implements C1981a {

        /* renamed from: b */
        private final C2982n f4915b;

        public C1546a(C2982n nVar) {
            C1489j.m6972b(nVar, "javaElement");
            this.f4915b = nVar;
        }

        /* renamed from: b */
        public C2982n mo7021c() {
            return this.f4915b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(": ");
            sb.append(mo7021c().toString());
            return sb.toString();
        }

        /* renamed from: a */
        public C1694an mo6988a() {
            C1694an anVar = C1694an.f5332a;
            C1489j.m6969a((Object) anVar, "SourceFile.NO_SOURCE_FILE");
            return anVar;
        }
    }

    private C1545l() {
    }

    /* renamed from: a */
    public C1981a mo7019a(C1997l lVar) {
        C1489j.m6972b(lVar, "javaElement");
        return new C1546a((C2982n) lVar);
    }
}
