package p073b.p079e.p081b;

import p073b.p085h.C1525b;
import p073b.p085h.C3123d;
import p073b.p085h.C3124e;
import p073b.p085h.C3129h;
import p073b.p085h.C3137l;
import p073b.p085h.C3139m;

/* renamed from: b.e.b.w */
/* compiled from: ReflectionFactory */
public class C1504w {
    /* renamed from: a */
    public C3124e mo6959a(C1488i iVar) {
        return iVar;
    }

    /* renamed from: a */
    public C3129h mo6960a(C1492m mVar) {
        return mVar;
    }

    /* renamed from: a */
    public C3137l mo6961a(C1496q qVar) {
        return qVar;
    }

    /* renamed from: a */
    public C3139m mo6962a(C1498s sVar) {
        return sVar;
    }

    /* renamed from: a */
    public C3123d mo6958a(Class cls, String str) {
        return new C1494o(cls, str);
    }

    /* renamed from: a */
    public C1525b mo6957a(Class cls) {
        return new C1484e(cls);
    }

    /* renamed from: a */
    public String mo6964a(C1490k kVar) {
        return mo6963a((C1487h) kVar);
    }

    /* renamed from: a */
    public String mo6963a(C1487h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring("kotlin.jvm.functions.".length()) : obj;
    }
}
