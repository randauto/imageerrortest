package p073b.p085h.p087b.p088a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.C2999f.C3007e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2087n;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2260u;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2290h;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2336c;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2340e;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2316f.C2317a;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2324j;
import p073b.p085h.p087b.p088a.p141d.C2958b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0004\t\n\u000b\f¨\u0006\r"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.g */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class C3008g {

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", "", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.g$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3009a extends C3008g {

        /* renamed from: a */
        private final Field f8343a;

        public C3009a(Field field) {
            C1489j.m6972b(field, "field");
            super(null);
            this.f8343a = field;
        }

        /* renamed from: b */
        public final Field mo10150b() {
            return this.f8343a;
        }

        /* renamed from: a */
        public String mo10149a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C2087n.m9347c(this.f8343a.getName()));
            sb.append("()");
            Class type = this.f8343a.getType();
            C1489j.m6969a((Object) type, "field.type");
            sb.append(C2958b.m14090f(type));
            return sb.toString();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterMethod", "Ljava/lang/reflect/Method;", "setterMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getSetterMethod", "asString", "", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.g$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3010b extends C3008g {

        /* renamed from: a */
        private final Method f8344a;

        /* renamed from: b */
        private final Method f8345b;

        public C3010b(Method method, Method method2) {
            C1489j.m6972b(method, "getterMethod");
            super(null);
            this.f8344a = method;
            this.f8345b = method2;
        }

        /* renamed from: b */
        public final Method mo10151b() {
            return this.f8344a;
        }

        /* renamed from: c */
        public final Method mo10152c() {
            return this.f8345b;
        }

        /* renamed from: a */
        public String mo10149a() {
            return C1561ah.m7141b(this.f8344a);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "string", "", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "asString", "getManglingSuffix", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.g$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3011c extends C3008g {

        /* renamed from: a */
        private final String f8346a;

        /* renamed from: b */
        private final C1687ah f8347b;

        /* renamed from: c */
        private final C2260u f8348c;

        /* renamed from: d */
        private final C2340e f8349d;

        /* renamed from: e */
        private final C2285c f8350e;

        /* renamed from: f */
        private final C2290h f8351f;

        /* renamed from: b */
        public final C1687ah mo10153b() {
            return this.f8347b;
        }

        /* renamed from: c */
        public final C2260u mo10154c() {
            return this.f8348c;
        }

        /* renamed from: d */
        public final C2340e mo10155d() {
            return this.f8349d;
        }

        /* renamed from: e */
        public final C2285c mo10156e() {
            return this.f8350e;
        }

        /* renamed from: f */
        public final C2290h mo10157f() {
            return this.f8351f;
        }

        public C3011c(C1687ah ahVar, C2260u uVar, C2340e eVar, C2285c cVar, C2290h hVar) {
            String str;
            C1489j.m6972b(ahVar, "descriptor");
            C1489j.m6972b(uVar, "proto");
            C1489j.m6972b(eVar, "signature");
            C1489j.m6972b(cVar, "nameResolver");
            C1489j.m6972b(hVar, "typeTable");
            super(null);
            this.f8347b = ahVar;
            this.f8348c = uVar;
            this.f8349d = eVar;
            this.f8350e = cVar;
            this.f8351f = hVar;
            if (this.f8349d.mo8944j()) {
                StringBuilder sb = new StringBuilder();
                C2285c cVar2 = this.f8350e;
                C2336c k = this.f8349d.mo8945k();
                C1489j.m6969a((Object) k, "signature.getter");
                sb.append(cVar2.mo8811a(k.mo8925e()));
                C2285c cVar3 = this.f8350e;
                C2336c k2 = this.f8349d.mo8945k();
                C1489j.m6969a((Object) k2, "signature.getter");
                sb.append(cVar3.mo8811a(k2.mo8927g()));
                str = sb.toString();
            } else {
                C2317a a = C2324j.f7118a.mo8894a(this.f8348c, this.f8350e, this.f8351f);
                if (a != null) {
                    String d = a.mo8887d();
                    String e = a.mo8888e();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C2087n.m9347c(d));
                    sb2.append(m14284g());
                    sb2.append("()");
                    sb2.append(e);
                    str = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No field signature for property: ");
                    sb3.append(this.f8347b);
                    throw new C1548aa(sb3.toString());
                }
            }
            this.f8346a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
            if (r0 != null) goto L_0x0040;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.lang.String m14284g() {
            /*
                r3 = this;
                b.h.b.a.b.b.ah r0 = r3.f8347b
                b.h.b.a.b.b.m r0 = r0.mo7065b()
                b.h.b.a.b.b.ah r1 = r3.f8347b
                b.h.b.a.b.b.az r1 = r1.mo7077p()
                b.h.b.a.b.b.az r2 = p073b.p085h.p087b.p088a.p090b.p094b.C1710ay.f5339d
                boolean r1 = p073b.p079e.p081b.C1489j.m6971a(r1, r2)
                if (r1 == 0) goto L_0x0056
                boolean r1 = r0 instanceof p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2608e
                if (r1 == 0) goto L_0x0056
                b.h.b.a.b.j.a.a.e r0 = (p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2608e) r0
                b.h.b.a.b.e.a$c r0 = r0.mo9643H()
                b.h.b.a.b.g.i$c r0 = (p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2387c) r0
                b.h.b.a.b.g.i$f<b.h.b.a.b.e.a$c, java.lang.Integer> r1 = p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.f7137i
                java.lang.String r2 = "JvmProtoBuf.classModuleName"
                p073b.p079e.p081b.C1489j.m6969a(r1, r2)
                java.lang.Object r0 = p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2288f.m11197a(r0, r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L_0x003e
                b.h.b.a.b.e.a.c r1 = r3.f8350e
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                java.lang.String r0 = r1.mo8811a(r0)
                if (r0 == 0) goto L_0x003e
                goto L_0x0040
            L_0x003e:
                java.lang.String r0 = "main"
            L_0x0040:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "$"
                r1.append(r2)
                java.lang.String r0 = p073b.p085h.p087b.p088a.p090b.p116f.C2361g.m11709a(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L_0x0056:
                b.h.b.a.b.b.ah r1 = r3.f8347b
                b.h.b.a.b.b.az r1 = r1.mo7077p()
                b.h.b.a.b.b.az r2 = p073b.p085h.p087b.p088a.p090b.p094b.C1710ay.f5336a
                boolean r1 = p073b.p079e.p081b.C1489j.m6971a(r1, r2)
                if (r1 == 0) goto L_0x00a0
                boolean r0 = r0 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1680ab
                if (r0 == 0) goto L_0x00a0
                b.h.b.a.b.b.ah r0 = r3.f8347b
                if (r0 == 0) goto L_0x0098
                b.h.b.a.b.j.a.a.j r0 = (p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2638j) r0
                b.h.b.a.b.j.a.a.f r0 = r0.mo9635N()
                boolean r1 = r0 instanceof p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2129i
                if (r1 == 0) goto L_0x00a0
                b.h.b.a.b.d.b.i r0 = (p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2129i) r0
                b.h.b.a.b.i.d.b r1 = r0.mo8045e()
                if (r1 == 0) goto L_0x00a0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "$"
                r1.append(r2)
                b.h.b.a.b.f.f r0 = r0.mo8042b()
                java.lang.String r0 = r0.mo9039a()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L_0x0098:
                b.u r0 = new b.u
                java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor"
                r0.<init>(r1)
                throw r0
            L_0x00a0:
                java.lang.String r0 = ""
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.C3008g.C3011c.m14284g():java.lang.String");
        }

        /* renamed from: a */
        public String mo10149a() {
            return this.f8346a;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "setterSignature", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getSetterSignature", "asString", "", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.g$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3012d extends C3008g {

        /* renamed from: a */
        private final C3007e f8352a;

        /* renamed from: b */
        private final C3007e f8353b;

        /* renamed from: b */
        public final C3007e mo10158b() {
            return this.f8352a;
        }

        /* renamed from: c */
        public final C3007e mo10159c() {
            return this.f8353b;
        }

        public C3012d(C3007e eVar, C3007e eVar2) {
            C1489j.m6972b(eVar, "getterSignature");
            super(null);
            this.f8352a = eVar;
            this.f8353b = eVar2;
        }

        /* renamed from: a */
        public String mo10149a() {
            return this.f8352a.mo10139a();
        }
    }

    /* renamed from: a */
    public abstract String mo10149a();

    private C3008g() {
    }

    public /* synthetic */ C3008g(C1486g gVar) {
        this();
    }
}
