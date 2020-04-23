package p073b.p085h.p087b;

import java.util.Arrays;
import p073b.C1444d;
import p073b.C3218m;
import p073b.C3221p;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1488i;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3123d;
import p073b.p085h.C3124e;
import p073b.p085h.p087b.p088a.C1563ai;
import p073b.p085h.p087b.p088a.C2921c;
import p073b.p085h.p087b.p088a.C3057m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2248o;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2290h;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2319g;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2321h;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2324j;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2669q;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, mo10386c = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflect-api"})
/* renamed from: b.h.b.b */
/* compiled from: reflectLambda.kt */
public final class C3120b {

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/SimpleFunctionDescriptor;", "R", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;", "Lkotlin/ParameterName;", "name", "proto", "invoke"})
    /* renamed from: b.h.b.b$a */
    /* compiled from: reflectLambda.kt */
    static final class C3121a extends C1488i implements C1461m<C2669q, C2248o, C1691al> {

        /* renamed from: c */
        public static final C3121a f8535c = new C3121a();

        C3121a() {
            super(2);
        }

        /* renamed from: f */
        public final C3123d mo6930f() {
            return C1503v.m6999a(C2669q.class);
        }

        /* renamed from: g */
        public final String mo6931g() {
            return "loadFunction";
        }

        /* renamed from: h */
        public final String mo6932h() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        /* renamed from: a */
        public final C1691al mo6920a(C2669q qVar, C2248o oVar) {
            C1489j.m6972b(qVar, "p1");
            C1489j.m6972b(oVar, "p2");
            return qVar.mo9754a(oVar);
        }
    }

    /* renamed from: a */
    public static final <R> C3124e<R> m14621a(C1444d<? extends R> dVar) {
        C1489j.m6972b(dVar, "$receiver");
        C3218m mVar = (C3218m) dVar.getClass().getAnnotation(C3218m.class);
        if (mVar == null) {
            return null;
        }
        String[] b = mVar.mo10385b();
        if (b.length == 0) {
            b = null;
        }
        if (b == null) {
            return null;
        }
        C3221p c = C2324j.m11396c(b, mVar.mo10386c());
        C2321h hVar = (C2321h) c.mo10389c();
        C2248o oVar = (C2248o) c.mo10390d();
        int[] a = mVar.mo10384a();
        C2319g gVar = new C2319g(Arrays.copyOf(a, a.length));
        Class cls = dVar.getClass();
        C2406q qVar = oVar;
        C2285c cVar = hVar;
        C2193ag B = oVar.mo8617B();
        C1489j.m6969a((Object) B, "proto.typeTable");
        C1691al alVar = (C1691al) C1563ai.m7144a(cls, qVar, cVar, new C2290h(B), gVar, C3121a.f8535c);
        if (alVar != null) {
            return new C3057m<>(C2921c.f8257a, alVar);
        }
        return null;
    }
}
