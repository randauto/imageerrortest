package p073b.p076c.p077a;

import p073b.C3218m;
import p073b.p076c.C1440a;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo10386c = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "kotlin-stdlib-jdk7"})
/* renamed from: b.c.a.a */
/* compiled from: JDK7PlatformImplementations.kt */
public class C1441a extends C1440a {
    /* renamed from: a */
    public void mo6917a(Throwable th, Throwable th2) {
        C1489j.m6972b(th, "cause");
        C1489j.m6972b(th2, "exception");
        th.addSuppressed(th2);
    }
}
