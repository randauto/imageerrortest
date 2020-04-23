package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.Modifier;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2083m;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2003r;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "isAbstract", "", "()Z", "isFinal", "isStatic", "modifiers", "", "getModifiers", "()I", "visibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.t */
/* compiled from: ReflectJavaModifierListOwner.kt */
public interface C2988t extends C2003r {

    @C3218m(mo10384a = {1, 1, 11})
    /* renamed from: b.h.b.a.d.t$a */
    /* compiled from: ReflectJavaModifierListOwner.kt */
    public static final class C2989a {
        /* renamed from: a */
        public static boolean m14218a(C2988t tVar) {
            return Modifier.isAbstract(tVar.mo10091v());
        }

        /* renamed from: b */
        public static boolean m14219b(C2988t tVar) {
            return Modifier.isStatic(tVar.mo10091v());
        }

        /* renamed from: c */
        public static boolean m14220c(C2988t tVar) {
            return Modifier.isFinal(tVar.mo10091v());
        }

        /* renamed from: d */
        public static C1723az m14221d(C2988t tVar) {
            C1723az azVar;
            int v = tVar.mo10091v();
            if (Modifier.isPublic(v)) {
                C1723az azVar2 = C1710ay.f5340e;
                C1489j.m6969a((Object) azVar2, "Visibilities.PUBLIC");
                return azVar2;
            } else if (Modifier.isPrivate(v)) {
                C1723az azVar3 = C1710ay.f5336a;
                C1489j.m6969a((Object) azVar3, "Visibilities.PRIVATE");
                return azVar3;
            } else if (Modifier.isProtected(v)) {
                if (Modifier.isStatic(v)) {
                    azVar = C2083m.f6319b;
                } else {
                    azVar = C2083m.f6320c;
                }
                C1489j.m6969a((Object) azVar, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
                return azVar;
            } else {
                C1723az azVar4 = C2083m.f6318a;
                C1489j.m6969a((Object) azVar4, "JavaVisibilities.PACKAGE_VISIBILITY");
                return azVar4;
            }
        }
    }

    /* renamed from: v */
    int mo10091v();
}
