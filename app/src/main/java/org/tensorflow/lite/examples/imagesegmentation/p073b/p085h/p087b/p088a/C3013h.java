package p073b.p085h.p087b.p088a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p073b.C3218m;
import p073b.p074a.C1415k;
import p073b.p075b.C1435a;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.C1522a;
import p073b.p085h.C3133j;
import p073b.p085h.C3133j.C3134a;
import p073b.p085h.p086a.C1523a;
import p073b.p085h.p087b.p088a.C1550ac.C1551a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1649a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b.C1864b;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J%\u00105\u001a\u00028\u00002\u0016\u00106\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010807\"\u0004\u0018\u000108H\u0016¢\u0006\u0002\u00109J#\u0010:\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0002¢\u0006\u0002\u0010<J#\u0010=\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0016¢\u0006\u0002\u0010<J#\u0010>\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0002¢\u0006\u0002\u0010<J\u0012\u0010?\u001a\u0004\u0018\u0001082\u0006\u0010@\u001a\u00020AH\u0002R(\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \b*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\r0\r0\u0005X\u0004¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \b*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0014\u0010$\u001a\u00020\"8DX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0012\u0010%\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0012R\u0014\u0010*\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0012R\u0016\u00101\u001a\u0004\u0018\u0001028VX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006B"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "()V", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "_parameters", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_typeParameters", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "annotations", "getAnnotations", "()Ljava/util/List;", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "isAbstract", "", "()Z", "isAnnotationConstructor", "isBound", "isFinal", "isOpen", "parameters", "getParameters", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "call", "args", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "callAnnotationConstructor", "", "(Ljava/util/Map;)Ljava/lang/Object;", "callBy", "callDefaultMethod", "defaultPrimitiveValue", "type", "Ljava/lang/reflect/Type;", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.h */
/* compiled from: KCallableImpl.kt */
public abstract class C3013h<R> implements C1522a<R> {

    /* renamed from: a */
    private final C1551a<List<Annotation>> f8354a = C1550ac.m7105b(new C3014a(this));

    /* renamed from: b */
    private final C1551a<ArrayList<C3133j>> f8355b = C1550ac.m7105b(new C3015b(this));

    /* renamed from: c */
    private final C1551a<C3111x> f8356c = C1550ac.m7105b(new C3020c(this));

    /* renamed from: d */
    private final C1551a<List<C3117z>> f8357d = C1550ac.m7105b(new C3022d(this));

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "", "R", "invoke"})
    /* renamed from: b.h.b.a.h$a */
    /* compiled from: KCallableImpl.kt */
    static final class C3014a extends C1490k implements C1449a<List<? extends Annotation>> {

        /* renamed from: a */
        final /* synthetic */ C3013h f8358a;

        C3014a(C3013h hVar) {
            this.f8358a = hVar;
            super(0);
        }

        /* renamed from: b */
        public final List<Annotation> mo6823a() {
            return C1563ai.m7150a((C1649a) this.f8358a.mo10160b());
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "R", "invoke"})
    /* renamed from: b.h.b.a.h$b */
    /* compiled from: KCallableImpl.kt */
    static final class C3015b extends C1490k implements C1449a<ArrayList<C3133j>> {

        /* renamed from: a */
        final /* synthetic */ C3013h f8359a;

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo10386c = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
        /* renamed from: b.h.b.a.h$b$a */
        /* compiled from: Comparisons.kt */
        public static final class C3019a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C1435a.m6922a(((C3133j) t).mo10263a(), ((C3133j) t2).mo10263a());
            }
        }

        C3015b(C3013h hVar) {
            this.f8359a = hVar;
            super(0);
        }

        /* renamed from: b */
        public final ArrayList<C3133j> mo6823a() {
            int i;
            final C1724b b = this.f8359a.mo10160b();
            ArrayList<C3133j> arrayList = new ArrayList<>();
            final int i2 = 0;
            if (b.mo7232e() == null || this.f8359a.mo10163e()) {
                i = 0;
            } else {
                arrayList.add(new C3079r(this.f8359a, 0, C3134a.INSTANCE, new C1449a<C1690ak>() {
                    /* renamed from: b */
                    public final C1690ak mo6823a() {
                        C1690ak e = b.mo7232e();
                        if (e == null) {
                            C1489j.m6968a();
                        }
                        return e;
                    }
                }));
                i = 1;
            }
            if (b.mo7231d() != null && !this.f8359a.mo10163e()) {
                int i3 = i + 1;
                arrayList.add(new C3079r(this.f8359a, i, C3134a.EXTENSION_RECEIVER, new C1449a<C1690ak>() {
                    /* renamed from: b */
                    public final C1690ak mo6823a() {
                        C1690ak d = b.mo7231d();
                        if (d == null) {
                            C1489j.m6968a();
                        }
                        return d;
                    }
                }));
                i = i3;
            }
            List i4 = b.mo7236i();
            C1489j.m6969a((Object) i4, "descriptor.valueParameters");
            int size = i4.size();
            while (i2 < size) {
                int i5 = i + 1;
                arrayList.add(new C3079r(this.f8359a, i, C3134a.VALUE, new C1449a<C1705au>() {
                    /* renamed from: b */
                    public final C1705au mo6823a() {
                        Object obj = b.mo7236i().get(i2);
                        C1489j.m6969a(obj, "descriptor.valueParameters[i]");
                        return (C1705au) obj;
                    }
                }));
                i2++;
                i = i5;
            }
            if (this.f8359a.mo10165h() && (b instanceof C1864b)) {
                List list = arrayList;
                if (list.size() > 1) {
                    C1415k.m6845a(list, new C3019a());
                }
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "R", "invoke"})
    /* renamed from: b.h.b.a.h$c */
    /* compiled from: KCallableImpl.kt */
    static final class C3020c extends C1490k implements C1449a<C3111x> {

        /* renamed from: a */
        final /* synthetic */ C3013h f8364a;

        C3020c(C3013h hVar) {
            this.f8364a = hVar;
            super(0);
        }

        /* renamed from: b */
        public final C3111x mo6823a() {
            C2841w g = this.f8364a.mo10160b().mo7234g();
            if (g == null) {
                C1489j.m6968a();
            }
            C1489j.m6969a((Object) g, "descriptor.returnType!!");
            return new C3111x(g, new C1449a<Type>(this) {

                /* renamed from: a */
                final /* synthetic */ C3020c f8365a;

                {
                    this.f8365a = r1;
                }

                /* renamed from: b */
                public final Type mo6823a() {
                    return this.f8365a.f8364a.mo10161c().mo10064c();
                }
            });
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "R", "invoke"})
    /* renamed from: b.h.b.a.h$d */
    /* compiled from: KCallableImpl.kt */
    static final class C3022d extends C1490k implements C1449a<List<? extends C3117z>> {

        /* renamed from: a */
        final /* synthetic */ C3013h f8366a;

        C3022d(C3013h hVar) {
            this.f8366a = hVar;
            super(0);
        }

        /* renamed from: b */
        public final List<C3117z> mo6823a() {
            List f = this.f8366a.mo10160b().mo7233f();
            C1489j.m6969a((Object) f, "descriptor.typeParameters");
            Iterable<C1700ar> iterable = f;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C1700ar zVar : iterable) {
                arrayList.add(new C3117z(zVar));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: b */
    public abstract C1724b mo10160b();

    /* renamed from: c */
    public abstract C2928d<?> mo10161c();

    /* renamed from: d */
    public abstract C3048l mo10162d();

    /* renamed from: e */
    public abstract boolean mo10163e();

    /* renamed from: f */
    public List<C3133j> mo10164f() {
        Object a = this.f8355b.mo7026a();
        C1489j.m6969a(a, "_parameters()");
        return (List) a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo10165h() {
        return C1489j.m6971a((Object) mo6931g(), (Object) "<init>") && mo10162d().mo6933a().isAnnotation();
    }

    /* renamed from: a */
    public R mo6925a(Object... objArr) {
        C1489j.m6972b(objArr, "args");
        try {
            return mo10161c().mo6987a(objArr);
        } catch (IllegalAccessException e) {
            throw new C1523a(e);
        }
    }
}
