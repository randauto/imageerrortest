package p073b.p085h.p087b.p088a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p073b.C3218m;
import p073b.C3227u;
import p073b.C3230x;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1483d;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.C1550ac.C1551a;
import p073b.p085h.p087b.p088a.p089a.C1540j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1803l;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1767l;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p085h.p087b.p088a.p141d.C2958b;
import p073b.p143j.C3186h;
import p073b.p143j.C3193j;
import p073b.p143j.C3199m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0005\b \u0018\u0000 ?2\u00020\u0001:\u0003?@AB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J\u001c\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J(\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011J \u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010$\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00042\u0006\u0010\u001e\u001a\u00020&H&J\u0012\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020)H&J\"\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0\u00042\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0004J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u001e\u001a\u00020&H&J\u001a\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u00103\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00104\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020)H\u0002J@\u00107\u001a\u0004\u0018\u00010\u001d*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0010\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t022\n\u00109\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J0\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\t2\u0010\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t022\u0006\u0010;\u001a\u00020\u0013H\u0002JE\u0010<\u001a\u0004\u0018\u00010\u001d*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0010\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0=2\n\u00109\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010;\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010>R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006B"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "isPublic", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "returnType", "tryGetConstructor", "declared", "tryGetMethod", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "Companion", "Data", "MemberBelonginess", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.l */
/* compiled from: KDeclarationContainerImpl.kt */
public abstract class C3048l implements C1483d {

    /* renamed from: a */
    private static final Class<?> f8412a = Class.forName("b.e.b.g");

    /* renamed from: b */
    public static final C3049a f8413b = new C3049a(null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C3193j f8414c = new C3193j("<v#(\\d+)>");

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflect_api", "()Lkotlin/text/Regex;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.l$a */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C3049a {
        private C3049a() {
        }

        public /* synthetic */ C3049a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C3193j mo10216a() {
            return C3048l.f8414c;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "getModuleData", "()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.l$b */
    /* compiled from: KDeclarationContainerImpl.kt */
    public abstract class C3050b {

        /* renamed from: c */
        static final /* synthetic */ C3135k[] f8415c = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3050b.class), "moduleData", "getModuleData()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;"))};

        /* renamed from: a */
        private final C1551a f8416a = C1550ac.m7105b(new C3051a(this));

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "invoke"})
        /* renamed from: b.h.b.a.l$b$a */
        /* compiled from: KDeclarationContainerImpl.kt */
        static final class C3051a extends C1490k implements C1449a<C1540j> {

            /* renamed from: a */
            final /* synthetic */ C3050b f8418a;

            C3051a(C3050b bVar) {
                this.f8418a = bVar;
                super(0);
            }

            /* renamed from: b */
            public final C1540j mo6823a() {
                return C1549ab.m7102a(C3048l.this.mo6933a());
            }
        }

        /* renamed from: g */
        public final C1540j mo10217g() {
            return (C1540j) this.f8416a.mo7028a(this, f8415c[0]);
        }

        public C3050b() {
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.l$c */
    /* compiled from: KDeclarationContainerImpl.kt */
    protected enum C3052c {
        DECLARED,
        INHERITED;

        /* renamed from: a */
        public final boolean mo10219a(C1724b bVar) {
            C1489j.m6972b(bVar, "member");
            C1725a n = bVar.mo7344n();
            C1489j.m6969a((Object) n, "member.kind");
            return n.mo7345a() == (this == DECLARED);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "invoke"})
    /* renamed from: b.h.b.a.l$d */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C3053d extends C1490k implements C1450b<C1813t, String> {

        /* renamed from: a */
        public static final C3053d f8422a = new C3053d();

        C3053d() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(C1813t tVar) {
            C1489j.m6972b(tVar, "descriptor");
            StringBuilder sb = new StringBuilder();
            sb.append(C2443c.f7423h.mo9344a((C1804m) tVar));
            sb.append(" | ");
            sb.append(C1560ag.f4929a.mo7039a(tVar));
            return sb.toString();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "invoke"})
    /* renamed from: b.h.b.a.l$e */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C3054e extends C1490k implements C1450b<C1687ah, String> {

        /* renamed from: a */
        public static final C3054e f8423a = new C3054e();

        C3054e() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(C1687ah ahVar) {
            C1489j.m6972b(ahVar, "descriptor");
            StringBuilder sb = new StringBuilder();
            sb.append(C2443c.f7423h.mo9344a((C1804m) ahVar));
            sb.append(" | ");
            sb.append(C1560ag.f4929a.mo7040a(ahVar));
            return sb.toString();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "kotlin.jvm.PlatformType", "second", "compare"})
    /* renamed from: b.h.b.a.l$f */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C3055f<T> implements Comparator<C1723az> {

        /* renamed from: a */
        public static final C3055f f8424a = new C3055f();

        C3055f() {
        }

        /* renamed from: a */
        public final int compare(C1723az azVar, C1723az azVar2) {
            Integer b = C1710ay.m7696b(azVar, azVar2);
            if (b != null) {
                return b.intValue();
            }
            return 0;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001J!\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, mo10386c = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$getMembers$visitor$1", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "visitConstructorDescriptor", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "data", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.l$g */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C3056g extends C1767l<C3013h<?>, C3230x> {

        /* renamed from: a */
        final /* synthetic */ C3048l f8425a;

        C3056g(C3048l lVar) {
            this.f8425a = lVar;
        }

        /* renamed from: a */
        public C3013h<?> mo7426a(C1687ah ahVar, C3230x xVar) {
            C1489j.m6972b(ahVar, "descriptor");
            C1489j.m6972b(xVar, "data");
            return this.f8425a.m14391a(ahVar);
        }

        /* renamed from: a */
        public C3013h<?> mo7437a(C1813t tVar, C3230x xVar) {
            C1489j.m6972b(tVar, "descriptor");
            C1489j.m6972b(xVar, "data");
            return new C3057m<>(this.f8425a, tVar);
        }

        /* renamed from: a */
        public C3013h<?> mo7435a(C1803l lVar, C3230x xVar) {
            C1489j.m6972b(lVar, "descriptor");
            C1489j.m6972b(xVar, "data");
            StringBuilder sb = new StringBuilder();
            sb.append("No constructors should appear in this scope: ");
            sb.append(lVar);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public abstract C1687ah mo10039a(int i);

    /* renamed from: a */
    public abstract Collection<C1687ah> mo10040a(C2360f fVar);

    /* renamed from: b */
    public abstract Collection<C1803l> mo10041b();

    /* renamed from: b */
    public abstract Collection<C1813t> mo10042b(C2360f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Class<?> mo10215h() {
        Class<?> d = C2958b.m14088d(mo6933a());
        return d != null ? d : mo6933a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0022 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<p073b.p085h.p087b.p088a.C3013h<?>> mo10212a(p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h r8, p073b.p085h.p087b.p088a.C3048l.C3052c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            p073b.p079e.p081b.C1489j.m6972b(r8, r0)
            java.lang.String r0 = "belonginess"
            p073b.p079e.p081b.C1489j.m6972b(r9, r0)
            b.h.b.a.l$g r0 = new b.h.b.a.l$g
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2566j.C2567a.m12758a(r8, r1, r1, r2, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r8 = r8.iterator()
        L_0x0022:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r8.next()
            b.h.b.a.b.b.m r3 = (p073b.p085h.p087b.p088a.p090b.p094b.C1804m) r3
            boolean r4 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1724b
            if (r4 == 0) goto L_0x0055
            r4 = r3
            b.h.b.a.b.b.b r4 = (p073b.p085h.p087b.p088a.p090b.p094b.C1724b) r4
            b.h.b.a.b.b.az r5 = r4.mo7077p()
            b.h.b.a.b.b.az r6 = p073b.p085h.p087b.p088a.p090b.p094b.C1710ay.f5343h
            boolean r5 = p073b.p079e.p081b.C1489j.m6971a(r5, r6)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0055
            boolean r4 = r9.mo10219a(r4)
            if (r4 == 0) goto L_0x0055
            r4 = r0
            b.h.b.a.b.b.o r4 = (p073b.p085h.p087b.p088a.p090b.p094b.C1806o) r4
            b.x r5 = p073b.C3230x.f8645a
            java.lang.Object r3 = r3.mo7348a(r4, r5)
            b.h.b.a.h r3 = (p073b.p085h.p087b.p088a.C3013h) r3
            goto L_0x0056
        L_0x0055:
            r3 = r1
        L_0x0056:
            if (r3 == 0) goto L_0x0022
            r2.add(r3)
            goto L_0x0022
        L_0x005c:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r8 = p073b.p074a.C1415k.m6893k(r2)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.C3048l.mo10212a(b.h.b.a.b.i.e.h, b.h.b.a.l$c):java.util.Collection");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3093v<?> m14391a(C1687ah ahVar) {
        int i = 0;
        int i2 = ahVar.mo7232e() != null ? 1 : 0;
        if (ahVar.mo7231d() != null) {
            i = 1;
        }
        int i3 = i2 + i;
        if (ahVar.mo7330s()) {
            switch (i3) {
                case 0:
                    return new C3061n<>(this, ahVar);
                case 1:
                    return new C3064o<>(this, ahVar);
                case 2:
                    return new C3067p<>(this, ahVar);
            }
        } else {
            switch (i3) {
                case 0:
                    return new C3081s<>(this, ahVar);
                case 1:
                    return new C3085t<>(this, ahVar);
                case 2:
                    return new C3089u<>(this, ahVar);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported property: ");
        sb.append(ahVar);
        throw new C1548aa(sb.toString());
    }

    /* renamed from: a */
    public final C1687ah mo10208a(String str, String str2) {
        String str3;
        C1489j.m6972b(str, "name");
        C1489j.m6972b(str2, "signature");
        C3186h b = f8414c.mo10378b(str2);
        boolean z = true;
        if (b != null) {
            String str4 = (String) b.mo10366b().mo10367a().mo10365a().get(1);
            C1687ah a = mo10039a(Integer.parseInt(str4));
            if (a != null) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Local property #");
            sb.append(str4);
            sb.append(" not found in ");
            sb.append(mo6933a());
            throw new C1548aa(sb.toString());
        }
        C2360f a2 = C2360f.m11701a(str);
        C1489j.m6969a((Object) a2, "Name.identifier(name)");
        Iterable a3 = mo10040a(a2);
        Collection arrayList = new ArrayList();
        for (Object next : a3) {
            if (C1489j.m6971a((Object) C1560ag.f4929a.mo7040a((C1687ah) next).mo10149a(), (Object) str2)) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Property '");
            sb2.append(str);
            sb2.append("' (JVM signature: ");
            sb2.append(str2);
            sb2.append(") not resolved in ");
            sb2.append(this);
            throw new C1548aa(sb2.toString());
        } else if (list.size() == 1) {
            return (C1687ah) C1415k.m6890j(list);
        } else {
            Iterable iterable = list;
            Map linkedHashMap = new LinkedHashMap();
            for (Object next2 : iterable) {
                C1723az p = ((C1687ah) next2).mo7077p();
                Object obj = linkedHashMap.get(p);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(p, obj);
                }
                ((List) obj).add(next2);
            }
            Collection values = C1389ad.m6745a(linkedHashMap, C3055f.f8424a).values();
            C1489j.m6969a((Object) values, "properties\n             …                }).values");
            List list2 = (List) C1415k.m6876d(values);
            if (list2.size() == 1) {
                C1489j.m6969a((Object) list2, "mostVisibleProperties");
                return (C1687ah) C1415k.m6883f(list2);
            }
            C2360f a4 = C2360f.m11701a(str);
            C1489j.m6969a((Object) a4, "Name.identifier(name)");
            String a5 = C1415k.m6859a(mo10040a(a4), "\n", null, null, 0, null, C3054e.f8423a, 30, null);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Property '");
            sb3.append(str);
            sb3.append("' (JVM signature: ");
            sb3.append(str2);
            sb3.append(") not resolved in ");
            sb3.append(this);
            sb3.append(':');
            if (a5.length() != 0) {
                z = false;
            }
            if (z) {
                str3 = " no members found";
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(10);
                sb4.append(a5);
                str3 = sb4.toString();
            }
            sb3.append(str3);
            throw new C1548aa(sb3.toString());
        }
    }

    /* renamed from: b */
    public final C1813t mo10213b(String str, String str2) {
        Collection collection;
        String str3;
        C1489j.m6972b(str, "name");
        C1489j.m6972b(str2, "signature");
        if (C1489j.m6971a((Object) str, (Object) "<init>")) {
            collection = C1415k.m6893k((Iterable<? extends T>) mo10041b());
        } else {
            C2360f a = C2360f.m11701a(str);
            C1489j.m6969a((Object) a, "Name.identifier(name)");
            collection = mo10042b(a);
        }
        Iterable iterable = collection;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (C1489j.m6971a((Object) C1560ag.f4929a.mo7039a((C1813t) next).mo10139a(), (Object) str2)) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        boolean z = true;
        if (list.size() == 1) {
            return (C1813t) C1415k.m6890j(list);
        }
        String a2 = C1415k.m6859a(iterable, "\n", null, null, 0, null, C3053d.f8422a, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (a2.length() != 0) {
            z = false;
        }
        if (z) {
            str3 = " no members found";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(10);
            sb2.append(a2);
            str3 = sb2.toString();
        }
        sb.append(str3);
        throw new C1548aa(sb.toString());
    }

    /* renamed from: a */
    private final Method m14395a(Class<?> cls, String str, List<? extends Class<?>> list, Class<?> cls2, boolean z) {
        Collection collection = list;
        if (collection != null) {
            Object[] array = collection.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                if (z) {
                    Method a = m14396a(cls, str, (Class<?>[]) clsArr, cls2, false);
                    if (a != null) {
                        return a;
                    }
                    if (cls.isInterface()) {
                        Method a2 = m14395a(Object.class, str, list, cls2, z);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                while (cls != null) {
                    Method a3 = m14396a(cls, str, (Class<?>[]) clsArr, cls2, true);
                    if (a3 != null) {
                        return a3;
                    }
                    cls = cls.getSuperclass();
                }
                return null;
            }
            throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C3227u("null cannot be cast to non-null type java.util.Collection<T>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[LOOP:0: B:12:0x003e->B:26:0x0071, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method m14396a(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>[] r8, java.lang.Class<?> r9, boolean r10) {
        /*
            r5 = this;
            r0 = 0
            if (r10 == 0) goto L_0x000f
            int r1 = r8.length     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r1)     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r7, r1)     // Catch:{ NoSuchMethodException -> 0x0074 }
            goto L_0x001a
        L_0x000f:
            int r1 = r8.length     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r1)     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ NoSuchMethodException -> 0x0074 }
        L_0x001a:
            java.lang.String r2 = "result"
            p073b.p079e.p081b.C1489j.m6969a(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.Class r2 = r1.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0074 }
            boolean r2 = p073b.p079e.p081b.C1489j.m6971a(r2, r9)     // Catch:{ NoSuchMethodException -> 0x0074 }
            if (r2 == 0) goto L_0x002b
            r0 = r1
            goto L_0x0074
        L_0x002b:
            if (r10 == 0) goto L_0x0032
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()     // Catch:{ NoSuchMethodException -> 0x0074 }
            goto L_0x0036
        L_0x0032:
            java.lang.reflect.Method[] r6 = r6.getMethods()     // Catch:{ NoSuchMethodException -> 0x0074 }
        L_0x0036:
            java.lang.String r10 = "allMethods"
            p073b.p079e.p081b.C1489j.m6969a(r6, r10)     // Catch:{ NoSuchMethodException -> 0x0074 }
            int r10 = r6.length     // Catch:{ NoSuchMethodException -> 0x0074 }
            r1 = 0
            r2 = 0
        L_0x003e:
            if (r2 >= r10) goto L_0x0074
            r3 = r6[r2]     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.String r4 = "method"
            p073b.p079e.p081b.C1489j.m6969a(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0074 }
            java.lang.String r4 = r3.getName()     // Catch:{ NoSuchMethodException -> 0x0074 }
            boolean r4 = p073b.p079e.p081b.C1489j.m6971a(r4, r7)     // Catch:{ NoSuchMethodException -> 0x0074 }
            if (r4 == 0) goto L_0x006c
            java.lang.Class r4 = r3.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0074 }
            boolean r4 = p073b.p079e.p081b.C1489j.m6971a(r4, r9)     // Catch:{ NoSuchMethodException -> 0x0074 }
            if (r4 == 0) goto L_0x006c
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch:{ NoSuchMethodException -> 0x0074 }
            if (r4 != 0) goto L_0x0064
            p073b.p079e.p081b.C1489j.m6968a()     // Catch:{ NoSuchMethodException -> 0x0074 }
        L_0x0064:
            boolean r4 = java.util.Arrays.equals(r4, r8)     // Catch:{ NoSuchMethodException -> 0x0074 }
            if (r4 == 0) goto L_0x006c
            r4 = 1
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            if (r4 == 0) goto L_0x0071
            r0 = r3
            goto L_0x0074
        L_0x0071:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.C3048l.m14396a(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class, boolean):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private final Constructor<?> m14394a(Class<?> cls, List<? extends Class<?>> list, boolean z) {
        if (z) {
            try {
                Collection collection = list;
                if (collection != null) {
                    Object[] array = collection.toArray(new Class[0]);
                    if (array != null) {
                        Class[] clsArr = (Class[]) array;
                        return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    }
                    throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new C3227u("null cannot be cast to non-null type java.util.Collection<T>");
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } else {
            Collection collection2 = list;
            if (collection2 != null) {
                Object[] array2 = collection2.toArray(new Class[0]);
                if (array2 != null) {
                    Class[] clsArr2 = (Class[]) array2;
                    return cls.getConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                }
                throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new C3227u("null cannot be cast to non-null type java.util.Collection<T>");
        }
    }

    /* renamed from: a */
    public final Method mo10210a(String str, String str2, boolean z) {
        C1489j.m6972b(str, "name");
        C1489j.m6972b(str2, "desc");
        if (C1489j.m6971a((Object) str, (Object) "<init>")) {
            return null;
        }
        return m14395a(mo10215h(), str, m14397a(str2), m14399b(str2), z);
    }

    /* renamed from: a */
    public final Method mo10211a(String str, String str2, boolean z, boolean z2) {
        C1489j.m6972b(str, "name");
        C1489j.m6972b(str2, "desc");
        if (C1489j.m6971a((Object) str, (Object) "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo6933a());
        }
        List list = arrayList;
        m14398a(list, str2, false);
        Class h = mo10215h();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("$default");
        return m14395a(h, sb.toString(), list, m14399b(str2), z2);
    }

    /* renamed from: a */
    public final Constructor<?> mo10209a(String str, boolean z) {
        C1489j.m6972b(str, "desc");
        return m14394a(mo6933a(), m14397a(str), !z);
    }

    /* renamed from: b */
    public final Constructor<?> mo10214b(String str, boolean z) {
        C1489j.m6972b(str, "desc");
        List arrayList = new ArrayList();
        m14398a(arrayList, str, true);
        return m14394a(mo6933a(), arrayList, !z);
    }

    /* renamed from: a */
    private final void m14398a(List<Class<?>> list, String str, boolean z) {
        List a = m14397a(str);
        list.addAll(a);
        int size = ((a.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            C1489j.m6969a((Object) cls, "Integer.TYPE");
            list.add(cls);
        }
        Object obj = z ? f8412a : Object.class;
        C1489j.m6969a(obj, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(obj);
    }

    /* renamed from: a */
    private final List<Class<?>> m14397a(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (C3199m.m14813c((CharSequence) "VZCBSIFJD", charAt, false, 2, (Object) null)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = C3199m.m14767a((CharSequence) str, ';', i2, false, 4, (Object) null) + 1;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown type prefix in the method signature: ");
                sb.append(str);
                throw new C1548aa(sb.toString());
            }
            arrayList.add(m14393a(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: a */
    private final Class<?> m14393a(String str, int i, int i2) {
        switch (str.charAt(i)) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            case 'F':
                return Float.TYPE;
            case 'I':
                return Integer.TYPE;
            case 'J':
                return Long.TYPE;
            case 'L':
                ClassLoader a = C2958b.m14084a(mo6933a());
                int i3 = i + 1;
                int i4 = i2 - 1;
                if (str != null) {
                    String substring = str.substring(i3, i4);
                    C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Class<?> loadClass = a.loadClass(C3199m.m14754a(substring, '/', '.', false, 4, (Object) null));
                    C1489j.m6969a((Object) loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                    return loadClass;
                }
                throw new C3227u("null cannot be cast to non-null type java.lang.String");
            case 'S':
                return Short.TYPE;
            case 'V':
                Class<?> cls = Void.TYPE;
                C1489j.m6969a((Object) cls, "Void.TYPE");
                return cls;
            case 'Z':
                return Boolean.TYPE;
            case '[':
                return C2958b.m14091g(m14393a(str, i + 1, i2));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown type prefix in the method signature: ");
                sb.append(str);
                throw new C1548aa(sb.toString());
        }
    }

    /* renamed from: b */
    private final Class<?> m14399b(String str) {
        return m14393a(str, C3199m.m14767a((CharSequence) str, ')', 0, false, 6, (Object) null) + 1, str.length());
    }
}
