package p073b.p085h.p087b.p088a;

import java.lang.reflect.Field;
import p073b.C3218m;
import p073b.C3219n;
import p073b.C3230x;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1481c;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3124e;
import p073b.p085h.C3125f.C3126a;
import p073b.p085h.C3135k;
import p073b.p085h.C3135k.C3136a;
import p073b.p085h.p086a.C1524b;
import p073b.p085h.p087b.p088a.C1550ac.C1551a;
import p073b.p085h.p087b.p088a.C3008g.C3009a;
import p073b.p085h.p087b.p088a.C3008g.C3010b;
import p073b.p085h.p087b.p088a.C3008g.C3011c;
import p073b.p085h.p087b.p088a.C3008g.C3012d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1686ag;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1688ai;
import p073b.p085h.p087b.p088a.p090b.p094b.C1689aj;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2087n;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2316f.C2317a;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2324j;
import p073b.p085h.p087b.p088a.p090b.p119i.C2493b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000 ;*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004:;<=B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\n\u00101\u001a\u0004\u0018\u00010\u0015H\u0004J\u0013\u00102\u001a\u00020'2\b\u00103\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u00104\u001a\u0004\u0018\u00010\n2\b\u00105\u001a\u0004\u0018\u00010\u00152\b\u00106\u001a\u0004\u0018\u00010\nH\u0004J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020\u0007H\u0016R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\r0\r0\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010(R\u0014\u0010)\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0013\u0010+\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/¨\u0006>"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "R", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "_descriptor", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "_javaField", "Ljava/lang/reflect/Field;", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getter", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "isBound", "", "()Z", "isConst", "isLateinit", "javaField", "getJavaField", "()Ljava/lang/reflect/Field;", "getName", "()Ljava/lang/String;", "getSignature", "computeDelegateField", "equals", "other", "getDelegate", "field", "receiver", "hashCode", "", "toString", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.v */
/* compiled from: KPropertyImpl.kt */
public abstract class C3093v<R> extends C3013h<R> implements C3135k<R> {

    /* renamed from: a */
    public static final C3095b f8485a = new C3095b(null);

    /* renamed from: h */
    private static final Object f8486h = new Object();

    /* renamed from: b */
    private final C1551a<Field> f8487b;

    /* renamed from: c */
    private final C1551a<C1687ah> f8488c;

    /* renamed from: d */
    private final C3048l f8489d;

    /* renamed from: e */
    private final String f8490e;

    /* renamed from: f */
    private final String f8491f;

    /* renamed from: g */
    private final Object f8492g;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "()V", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getDefaultCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "property", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.v$a */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C3094a<PropertyType, ReturnType> extends C3013h<ReturnType> implements C3124e<ReturnType> {
        /* renamed from: i */
        public abstract C3093v<PropertyType> mo10238i();

        /* renamed from: k */
        public abstract C1686ag mo10293k();

        /* renamed from: d */
        public C3048l mo10162d() {
            return mo10238i().mo10162d();
        }

        /* renamed from: e */
        public boolean mo10163e() {
            return mo10238i().mo10163e();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "()V", "EXTENSION_PROPERTY_DELEGATE", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.v$b */
    /* compiled from: KPropertyImpl.kt */
    public static final class C3095b {
        private C3095b() {
        }

        public /* synthetic */ C3095b(C1486g gVar) {
            this();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004R\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor$delegate", "name", "", "getName", "()Ljava/lang/String;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.v$c */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C3096c<R> extends C3094a<R, R> implements C3136a<R> {

        /* renamed from: a */
        static final /* synthetic */ C3135k[] f8493a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3096c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3096c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/FunctionCaller;"))};

        /* renamed from: b */
        private final C1551a f8494b = C1550ac.m7105b(new C3098b(this));

        /* renamed from: c */
        private final C1551a f8495c = C1550ac.m7105b(new C3097a(this));

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0006\b\u0000\u0010\u0002 \u0001\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "R", "invoke"})
        /* renamed from: b.h.b.a.v$c$a */
        /* compiled from: KPropertyImpl.kt */
        static final class C3097a extends C1490k implements C1449a<C2928d<?>> {

            /* renamed from: a */
            final /* synthetic */ C3096c f8496a;

            C3097a(C3096c cVar) {
                this.f8496a = cVar;
                super(0);
            }

            /* renamed from: b */
            public final C2928d<?> mo6823a() {
                return C3104w.m14588a(this.f8496a, true);
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "R", "invoke"})
        /* renamed from: b.h.b.a.v$c$b */
        /* compiled from: KPropertyImpl.kt */
        static final class C3098b extends C1490k implements C1449a<C1688ai> {

            /* renamed from: a */
            final /* synthetic */ C3096c f8497a;

            C3098b(C3096c cVar) {
                this.f8497a = cVar;
                super(0);
            }

            /* renamed from: b */
            public final C1688ai mo6823a() {
                C1688ai a = this.f8497a.mo10238i().mo10160b().mo7298a();
                return a != null ? a : C2493b.m12517b(this.f8497a.mo10238i().mo10160b(), C1659h.f5247a.mo7260a());
            }
        }

        /* renamed from: c */
        public C2928d<?> mo10161c() {
            return (C2928d) this.f8495c.mo7028a(this, f8493a[1]);
        }

        /* renamed from: l */
        public C1688ai mo10293k() {
            return (C1688ai) this.f8494b.mo7028a(this, f8493a[0]);
        }

        /* renamed from: g */
        public String mo6931g() {
            StringBuilder sb = new StringBuilder();
            sb.append("<get-");
            sb.append(mo10238i().mo6931g());
            sb.append('>');
            return sb.toString();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor$delegate", "name", "", "getName", "()Ljava/lang/String;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.v$d */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C3099d<R> extends C3094a<R, C3230x> implements C3126a<R> {

        /* renamed from: a */
        static final /* synthetic */ C3135k[] f8498a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3099d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3099d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/FunctionCaller;"))};

        /* renamed from: b */
        private final C1551a f8499b = C1550ac.m7105b(new C3101b(this));

        /* renamed from: c */
        private final C1551a f8500c = C1550ac.m7105b(new C3100a(this));

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "R", "invoke"})
        /* renamed from: b.h.b.a.v$d$a */
        /* compiled from: KPropertyImpl.kt */
        static final class C3100a extends C1490k implements C1449a<C2928d<?>> {

            /* renamed from: a */
            final /* synthetic */ C3099d f8501a;

            C3100a(C3099d dVar) {
                this.f8501a = dVar;
                super(0);
            }

            /* renamed from: b */
            public final C2928d<?> mo6823a() {
                return C3104w.m14588a(this.f8501a, false);
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "R", "invoke"})
        /* renamed from: b.h.b.a.v$d$b */
        /* compiled from: KPropertyImpl.kt */
        static final class C3101b extends C1490k implements C1449a<C1689aj> {

            /* renamed from: a */
            final /* synthetic */ C3099d f8502a;

            C3101b(C3099d dVar) {
                this.f8502a = dVar;
                super(0);
            }

            /* renamed from: b */
            public final C1689aj mo6823a() {
                C1689aj c = this.f8502a.mo10238i().mo10160b().mo7299c();
                return c != null ? c : C2493b.m12510a(this.f8502a.mo10238i().mo10160b(), C1659h.f5247a.mo7260a());
            }
        }

        /* renamed from: c */
        public C2928d<?> mo10161c() {
            return (C2928d) this.f8500c.mo7028a(this, f8498a[1]);
        }

        /* renamed from: j */
        public C1689aj mo10293k() {
            return (C1689aj) this.f8499b.mo7028a(this, f8498a[0]);
        }

        /* renamed from: g */
        public String mo6931g() {
            StringBuilder sb = new StringBuilder();
            sb.append("<set-");
            sb.append(mo10238i().mo6931g());
            sb.append('>');
            return sb.toString();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "R", "invoke"})
    /* renamed from: b.h.b.a.v$e */
    /* compiled from: KPropertyImpl.kt */
    static final class C3102e extends C1490k implements C1449a<C1687ah> {

        /* renamed from: a */
        final /* synthetic */ C3093v f8503a;

        C3102e(C3093v vVar) {
            this.f8503a = vVar;
            super(0);
        }

        /* renamed from: b */
        public final C1687ah mo6823a() {
            return this.f8503a.mo10162d().mo10208a(this.f8503a.mo6931g(), this.f8503a.mo10290q());
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Ljava/lang/reflect/Field;", "R", "invoke"})
    /* renamed from: b.h.b.a.v$f */
    /* compiled from: KPropertyImpl.kt */
    static final class C3103f extends C1490k implements C1449a<Field> {

        /* renamed from: a */
        final /* synthetic */ C3093v f8504a;

        C3103f(C3093v vVar) {
            this.f8504a = vVar;
            super(0);
        }

        /* renamed from: b */
        public final Field mo6823a() {
            Class cls;
            Field field;
            C3008g a = C1560ag.f4929a.mo7040a(this.f8504a.mo10160b());
            if (a instanceof C3011c) {
                C3011c cVar = (C3011c) a;
                C1687ah b = cVar.mo10153b();
                C2317a a2 = C2324j.f7118a.mo8894a(cVar.mo10154c(), cVar.mo10156e(), cVar.mo10157f());
                if (a2 == null) {
                    return null;
                }
                if (C2087n.m9341a(b) || C2324j.m11393a(cVar.mo10154c())) {
                    cls = this.f8504a.mo10162d().mo6933a().getEnclosingClass();
                } else {
                    C1804m b2 = b.mo7065b();
                    if (b2 instanceof C1796e) {
                        cls = C1563ai.m7147a((C1796e) b2);
                    } else {
                        cls = this.f8504a.mo10162d().mo6933a();
                    }
                }
                if (cls != null) {
                    try {
                        field = cls.getDeclaredField(a2.mo8883a());
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                } else {
                    field = null;
                }
                return field;
            } else if (a instanceof C3009a) {
                return ((C3009a) a).mo10150b();
            } else {
                if ((a instanceof C3010b) || (a instanceof C3012d)) {
                    return null;
                }
                throw new C3219n();
            }
        }
    }

    /* renamed from: m */
    public abstract C3096c<R> mo10272m();

    /* renamed from: d */
    public C3048l mo10162d() {
        return this.f8489d;
    }

    /* renamed from: g */
    public String mo6931g() {
        return this.f8490e;
    }

    /* renamed from: q */
    public final String mo10290q() {
        return this.f8491f;
    }

    /* renamed from: r */
    public final Object mo10291r() {
        return this.f8492g;
    }

    private C3093v(C3048l lVar, String str, String str2, C1687ah ahVar, Object obj) {
        this.f8489d = lVar;
        this.f8490e = str;
        this.f8491f = str2;
        this.f8492g = obj;
        this.f8487b = C1550ac.m7105b(new C3103f(this));
        this.f8488c = C1550ac.m7103a(ahVar, new C3102e(this));
    }

    public C3093v(C3048l lVar, String str, String str2, Object obj) {
        C1489j.m6972b(lVar, "container");
        C1489j.m6972b(str, "name");
        C1489j.m6972b(str2, "signature");
        this(lVar, str, str2, null, obj);
    }

    public C3093v(C3048l lVar, C1687ah ahVar) {
        C1489j.m6972b(lVar, "container");
        C1489j.m6972b(ahVar, "descriptor");
        String a = ahVar.mo7351z_().mo9039a();
        C1489j.m6969a((Object) a, "descriptor.name.asString()");
        this(lVar, a, C1560ag.f4929a.mo7040a(ahVar).mo10149a(), ahVar, C1481c.f4849b);
    }

    /* renamed from: e */
    public boolean mo10163e() {
        return !C1489j.m6971a(this.f8492g, C1481c.f4849b);
    }

    /* renamed from: n */
    public final Field mo10287n() {
        return (Field) this.f8487b.mo7026a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Field mo10288o() {
        if (mo10160b().mo7333B()) {
            return mo10287n();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10284a(Field field, Object obj) {
        try {
            if (obj == f8486h) {
                if (mo10160b().mo7231d() == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('\'');
                    sb.append(this);
                    sb.append("' is not an extension property and thus getExtensionDelegate() ");
                    sb.append("is not going to work, use getDelegate() instead");
                    throw new RuntimeException(sb.toString());
                }
            }
            if (field != null) {
                return field.get(obj);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new C1524b(e);
        }
    }

    /* renamed from: p */
    public C1687ah mo10160b() {
        Object a = this.f8488c.mo7026a();
        C1489j.m6969a(a, "_descriptor()");
        return (C1687ah) a;
    }

    /* renamed from: c */
    public C2928d<?> mo10161c() {
        return mo10272m().mo10161c();
    }

    public boolean equals(Object obj) {
        C3093v b = C1563ai.m7152b(obj);
        boolean z = false;
        if (b == null) {
            return false;
        }
        if (C1489j.m6971a((Object) mo10162d(), (Object) b.mo10162d()) && C1489j.m6971a((Object) mo6931g(), (Object) b.mo6931g()) && C1489j.m6971a((Object) this.f8491f, (Object) b.f8491f) && C1489j.m6971a(this.f8492g, b.f8492g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (((mo10162d().hashCode() * 31) + mo6931g().hashCode()) * 31) + this.f8491f.hashCode();
    }

    public String toString() {
        return C1556ae.f4923a.mo7030a(mo10160b());
    }
}
