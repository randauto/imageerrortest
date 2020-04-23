package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import java.util.Map;
import java.util.Set;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1389ad;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C1834a.C1835a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1971k;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2020g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2021h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;

/* renamed from: b.h.b.a.b.d.a.b */
/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class C1862b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C2355b f5696a = new C2355b("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final C2355b f5697b = new C2355b("javax.annotation.meta.TypeQualifier");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C2355b f5698c = new C2355b("javax.annotation.meta.TypeQualifierDefault");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C2355b f5699d = new C2355b("kotlin.annotations.jvm.UnderMigration");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Map<C2355b, C1971k> f5700e = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(new C2355b("javax.annotation.ParametersAreNullableByDefault"), new C1971k(new C2021h(C2020g.NULLABLE, false, 2, null), C1415k.m6832a(C1835a.VALUE_PARAMETER))), C3226t.m14841a(new C2355b("javax.annotation.ParametersAreNonnullByDefault"), new C1971k(new C2021h(C2020g.NOT_NULL, false, 2, null), C1415k.m6832a(C1835a.VALUE_PARAMETER)))});

    /* renamed from: f */
    private static final Set<C2355b> f5701f = C1395aj.m6761a((T[]) new C2355b[]{C2089p.m9351b(), C2089p.m9352c()});

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m8597b(C1796e eVar) {
        return f5701f.contains(C2524a.m12623b((C1804m) eVar)) || eVar.mo7086x().mo7257b(f5697b);
    }
}
