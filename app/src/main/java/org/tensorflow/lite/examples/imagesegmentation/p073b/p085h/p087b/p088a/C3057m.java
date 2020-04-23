package p073b.p085h.p087b.p088a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.C3219n;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1481c;
import p073b.p079e.p081b.C1487h;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3124e;
import p073b.p085h.C3133j;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.C1527a.C1528a;
import p073b.p085h.p087b.p088a.C1527a.C1529b;
import p073b.p085h.p087b.p088a.C1550ac.C1551a;
import p073b.p085h.p087b.p088a.C2928d.C2932c;
import p073b.p085h.p087b.p088a.C2928d.C2935f;
import p073b.p085h.p087b.p088a.C2928d.C2936g;
import p073b.p085h.p087b.p088a.C2928d.C2939j;
import p073b.p085h.p087b.p088a.C2928d.C2943n;
import p073b.p085h.p087b.p088a.C2928d.C2948s;
import p073b.p085h.p087b.p088a.C2928d.C2949t;
import p073b.p085h.p087b.p088a.C2928d.C2952w;
import p073b.p085h.p087b.p088a.C2928d.C2955z;
import p073b.p085h.p087b.p088a.C2997e.C2998a;
import p073b.p085h.p087b.p088a.C2999f.C3000a;
import p073b.p085h.p087b.p088a.C2999f.C3003b;
import p073b.p085h.p087b.p088a.C2999f.C3005c;
import p073b.p085h.p087b.p088a.C2999f.C3006d;
import p073b.p085h.p087b.p088a.C2999f.C3007e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u00020\u00042\u00020\u0005B)\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0011J\u001e\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0\u00132\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010,\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020.2\u0006\u0010,\u001a\u00020/H\u0002J\u0010\u00101\u001a\u00020.2\u0006\u0010,\u001a\u00020/H\u0002J\u0013\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\b\u00107\u001a\u00020\tH\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138VX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0015R\u001b\u0010\r\u001a\u00020\u000e8VX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u00068"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Ljava/lang/reflect/Constructor;", "member", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/FunctionCaller$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", "other", "getArity", "", "hashCode", "toString", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.m */
/* compiled from: KFunctionImpl.kt */
public final class C3057m extends C3013h<Object> implements C1487h, C2997e, C3124e<Object> {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f8426a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3057m.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3057m.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/FunctionCaller;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3057m.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/FunctionCaller;"))};

    /* renamed from: b */
    private final C1551a f8427b;

    /* renamed from: c */
    private final C1551a f8428c;

    /* renamed from: d */
    private final C1551a f8429d;

    /* renamed from: e */
    private final C3048l f8430e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f8431f;

    /* renamed from: g */
    private final Object f8432g;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Member;", "invoke"})
    /* renamed from: b.h.b.a.m$a */
    /* compiled from: KFunctionImpl.kt */
    static final class C3058a extends C1490k implements C1449a<C2928d<? extends Member>> {

        /* renamed from: a */
        final /* synthetic */ C3057m f8433a;

        C3058a(C3057m mVar) {
            this.f8433a = mVar;
            super(0);
        }

        /* renamed from: b */
        public final C2928d<Member> mo6823a() {
            Member member;
            C2928d<Member> dVar;
            C2952w wVar;
            C2999f a = C1560ag.f4929a.mo7039a(this.f8433a.mo10160b());
            if (a instanceof C3006d) {
                if (this.f8433a.mo10165h()) {
                    Class a2 = this.f8433a.mo10162d().mo6933a();
                    Iterable<C3133j> f = this.f8433a.mo10164f();
                    Collection arrayList = new ArrayList(C1415k.m6842a(f, 10));
                    for (C3133j a3 : f) {
                        String a4 = a3.mo10263a();
                        if (a4 == null) {
                            C1489j.m6968a();
                        }
                        arrayList.add(a4);
                    }
                    C1527a aVar = new C1527a(a2, (List) arrayList, C1528a.POSITIONAL_CALL, C1529b.KOTLIN, null, 16, null);
                    return aVar;
                }
                member = this.f8433a.mo10162d().mo10209a(((C3006d) a).mo10146b(), C1563ai.m7151a((C1724b) this.f8433a.mo10160b()));
            } else if (a instanceof C3007e) {
                C3007e eVar = (C3007e) a;
                member = this.f8433a.mo10162d().mo10210a(eVar.mo10147b(), eVar.mo10148c(), C1563ai.m7151a((C1724b) this.f8433a.mo10160b()));
            } else if (a instanceof C3005c) {
                member = ((C3005c) a).mo10145b();
            } else if (a instanceof C3003b) {
                member = ((C3003b) a).mo10143b();
            } else if (a instanceof C3000a) {
                List b = ((C3000a) a).mo10140b();
                Class a5 = this.f8433a.mo10162d().mo6933a();
                Iterable<Method> iterable = b;
                Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable, 10));
                for (Method method : iterable) {
                    C1489j.m6969a((Object) method, "it");
                    arrayList2.add(method.getName());
                }
                C1527a aVar2 = new C1527a(a5, (List) arrayList2, C1528a.POSITIONAL_CALL, C1529b.JAVA, b);
                return aVar2;
            } else {
                throw new C3219n();
            }
            if (member instanceof Constructor) {
                dVar = this.f8433a.m14432a((Constructor) member);
            } else if (member instanceof Method) {
                Method method2 = (Method) member;
                if (!Modifier.isStatic(method2.getModifiers())) {
                    wVar = this.f8433a.m14437c(method2);
                } else if (this.f8433a.mo10160b().mo7086x().mo7254a(C1563ai.m7145a()) != null) {
                    wVar = this.f8433a.m14435b(method2);
                } else {
                    wVar = this.f8433a.m14430a(method2);
                }
                dVar = wVar;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not compute caller for function: ");
                sb.append(this.f8433a.mo10160b());
                sb.append(" (member = ");
                sb.append(member);
                sb.append(')');
                throw new C1548aa(sb.toString());
            }
            return dVar;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Member;", "invoke"})
    /* renamed from: b.h.b.a.m$b */
    /* compiled from: KFunctionImpl.kt */
    static final class C3059b extends C1490k implements C1449a<C2928d<? extends Member>> {

        /* renamed from: a */
        final /* synthetic */ C3057m f8434a;

        C3059b(C3057m mVar) {
            this.f8434a = mVar;
            super(0);
        }

        /* renamed from: b */
        public final C2928d<Member> mo6823a() {
            Member member;
            C2952w wVar;
            C2999f a = C1560ag.f4929a.mo7039a(this.f8434a.mo10160b());
            C2928d<Member> dVar = null;
            if (a instanceof C3007e) {
                C3048l d = this.f8434a.mo10162d();
                C3007e eVar = (C3007e) a;
                String b = eVar.mo10147b();
                String c = eVar.mo10148c();
                Member b2 = this.f8434a.mo10161c().mo10062b();
                if (b2 == null) {
                    C1489j.m6968a();
                }
                member = d.mo10211a(b, c, !Modifier.isStatic(b2.getModifiers()), C1563ai.m7151a((C1724b) this.f8434a.mo10160b()));
            } else if (a instanceof C3006d) {
                if (this.f8434a.mo10165h()) {
                    Class a2 = this.f8434a.mo10162d().mo6933a();
                    Iterable<C3133j> f = this.f8434a.mo10164f();
                    Collection arrayList = new ArrayList(C1415k.m6842a(f, 10));
                    for (C3133j a3 : f) {
                        String a4 = a3.mo10263a();
                        if (a4 == null) {
                            C1489j.m6968a();
                        }
                        arrayList.add(a4);
                    }
                    C1527a aVar = new C1527a(a2, (List) arrayList, C1528a.CALL_BY_NAME, C1529b.KOTLIN, null, 16, null);
                    return aVar;
                }
                member = this.f8434a.mo10162d().mo10214b(((C3006d) a).mo10146b(), C1563ai.m7151a((C1724b) this.f8434a.mo10160b()));
            } else if (a instanceof C3000a) {
                List b3 = ((C3000a) a).mo10140b();
                Class a5 = this.f8434a.mo10162d().mo6933a();
                Iterable<Method> iterable = b3;
                Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable, 10));
                for (Method method : iterable) {
                    C1489j.m6969a((Object) method, "it");
                    arrayList2.add(method.getName());
                }
                C1527a aVar2 = new C1527a(a5, (List) arrayList2, C1528a.CALL_BY_NAME, C1529b.JAVA, b3);
                return aVar2;
            } else {
                member = null;
            }
            if (member instanceof Constructor) {
                dVar = this.f8434a.m14432a((Constructor) member);
            } else if (member instanceof Method) {
                if (this.f8434a.mo10160b().mo7086x().mo7254a(C1563ai.m7145a()) != null) {
                    C1804m b4 = this.f8434a.mo10160b().mo7065b();
                    if (b4 == null) {
                        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    } else if (!((C1796e) b4).mo7078q()) {
                        wVar = this.f8434a.m14435b((Method) member);
                        dVar = wVar;
                    }
                }
                wVar = this.f8434a.m14430a((Method) member);
                dVar = wVar;
            }
            return dVar;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "invoke"})
    /* renamed from: b.h.b.a.m$c */
    /* compiled from: KFunctionImpl.kt */
    static final class C3060c extends C1490k implements C1449a<C1813t> {

        /* renamed from: a */
        final /* synthetic */ C3057m f8435a;

        /* renamed from: b */
        final /* synthetic */ String f8436b;

        C3060c(C3057m mVar, String str) {
            this.f8435a = mVar;
            this.f8436b = str;
            super(0);
        }

        /* renamed from: b */
        public final C1813t mo6823a() {
            return this.f8435a.mo10162d().mo10213b(this.f8436b, this.f8435a.f8431f);
        }
    }

    /* renamed from: c */
    public C2928d<?> mo10161c() {
        return (C2928d) this.f8428c.mo7028a(this, f8426a[1]);
    }

    /* renamed from: i */
    public C1813t mo10160b() {
        return (C1813t) this.f8427b.mo7028a(this, f8426a[0]);
    }

    /* renamed from: a */
    public Object mo6823a() {
        return C2998a.m14258a(this);
    }

    /* renamed from: a */
    public Object mo6756a(Object obj) {
        return C2998a.m14259a(this, obj);
    }

    /* renamed from: a */
    public Object mo6920a(Object obj, Object obj2) {
        return C2998a.m14260a(this, obj, obj2);
    }

    /* renamed from: a */
    public Object mo6921a(Object obj, Object obj2, Object obj3) {
        return C2998a.m14261a(this, obj, obj2, obj3);
    }

    /* renamed from: d */
    public C3048l mo10162d() {
        return this.f8430e;
    }

    /* synthetic */ C3057m(C3048l lVar, String str, String str2, C1813t tVar, Object obj, int i, C1486g gVar) {
        if ((i & 16) != 0) {
            obj = C1481c.f4849b;
        }
        this(lVar, str, str2, tVar, obj);
    }

    private C3057m(C3048l lVar, String str, String str2, C1813t tVar, Object obj) {
        this.f8430e = lVar;
        this.f8431f = str2;
        this.f8432g = obj;
        this.f8427b = C1550ac.m7103a(tVar, new C3060c(this, str));
        this.f8428c = C1550ac.m7105b(new C3058a(this));
        this.f8429d = C1550ac.m7105b(new C3059b(this));
    }

    public C3057m(C3048l lVar, String str, String str2, Object obj) {
        C1489j.m6972b(lVar, "container");
        C1489j.m6972b(str, "name");
        C1489j.m6972b(str2, "signature");
        this(lVar, str, str2, null, obj);
    }

    public C3057m(C3048l lVar, C1813t tVar) {
        C1489j.m6972b(lVar, "container");
        C1489j.m6972b(tVar, "descriptor");
        String a = tVar.mo7351z_().mo9039a();
        C1489j.m6969a((Object) a, "descriptor.name.asString()");
        this(lVar, a, C1560ag.f4929a.mo7039a(tVar).mo10139a(), tVar, null, 16, null);
    }

    /* renamed from: e */
    public boolean mo10163e() {
        return !C1489j.m6971a(this.f8432g, C1481c.f4849b);
    }

    /* renamed from: g */
    public String mo6931g() {
        String a = mo10160b().mo7351z_().mo9039a();
        C1489j.m6969a((Object) a, "descriptor.name.asString()");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2952w m14430a(Method method) {
        return mo10163e() ? new C2939j(method, this.f8432g) : new C2955z(method);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C2952w m14435b(Method method) {
        return mo10163e() ? new C2936g(method) : new C2949t(method);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C2952w m14437c(Method method) {
        return mo10163e() ? new C2935f(method, this.f8432g) : new C2948s(method);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C2928d<Constructor<?>> m14432a(Constructor<?> constructor) {
        return mo10163e() ? new C2932c<>(constructor, this.f8432g) : new C2943n<>(constructor);
    }

    public boolean equals(Object obj) {
        C3057m a = C1563ai.m7146a(obj);
        boolean z = false;
        if (a == null) {
            return false;
        }
        if (C1489j.m6971a((Object) mo10162d(), (Object) a.mo10162d()) && C1489j.m6971a((Object) mo6931g(), (Object) a.mo6931g()) && C1489j.m6971a((Object) this.f8431f, (Object) a.f8431f) && C1489j.m6971a(this.f8432g, a.f8432g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (((mo10162d().hashCode() * 31) + mo6931g().hashCode()) * 31) + this.f8431f.hashCode();
    }

    public String toString() {
        return C1556ae.f4923a.mo7032a(mo10160b());
    }
}
