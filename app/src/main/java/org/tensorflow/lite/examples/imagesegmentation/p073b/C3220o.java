package p073b;

import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo10386c = {"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", "", "(Ljava/lang/String;)V", "kotlin-stdlib"})
/* renamed from: b.o */
/* compiled from: Standard.kt */
public final class C3220o extends Error {
    public C3220o() {
        this(null, 1, null);
    }

    public C3220o(String str) {
        C1489j.m6972b(str, "message");
        super(str);
    }

    public /* synthetic */ C3220o(String str, int i, C1486g gVar) {
        if ((i & 1) != 0) {
            str = "An operation is not implemented.";
        }
        this(str);
    }
}
