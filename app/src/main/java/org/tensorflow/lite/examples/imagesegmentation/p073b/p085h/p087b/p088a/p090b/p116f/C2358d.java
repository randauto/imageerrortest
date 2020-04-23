package p073b.p085h.p087b.p088a.p090b.p116f;

import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.f.d */
/* compiled from: FqNamesUtil.kt */
public final class C2358d {
    /* renamed from: a */
    public static final boolean m11697a(C2355b bVar, C2355b bVar2) {
        C1489j.m6972b(bVar, "$receiver");
        C1489j.m6972b(bVar2, "packageName");
        if (C1489j.m6971a((Object) bVar, (Object) bVar2) || bVar2.mo9016c()) {
            return true;
        }
        String a = bVar.mo9013a();
        C1489j.m6969a((Object) a, "this.asString()");
        String a2 = bVar2.mo9013a();
        C1489j.m6969a((Object) a2, "packageName.asString()");
        return m11699a(a, a2);
    }

    /* renamed from: a */
    private static final boolean m11699a(String str, String str2) {
        return C3199m.m14761b(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    /* renamed from: b */
    public static final C2355b m11700b(C2355b bVar, C2355b bVar2) {
        C1489j.m6972b(bVar, "$receiver");
        C1489j.m6972b(bVar2, "prefix");
        if (!m11697a(bVar, bVar2) || bVar2.mo9016c()) {
            return bVar;
        }
        if (C1489j.m6971a((Object) bVar, (Object) bVar2)) {
            C2355b bVar3 = C2355b.f7221a;
            C1489j.m6969a((Object) bVar3, "FqName.ROOT");
            return bVar3;
        }
        String a = bVar.mo9013a();
        C1489j.m6969a((Object) a, "asString()");
        int length = bVar2.mo9013a().length() + 1;
        if (a != null) {
            String substring = a.substring(length);
            C1489j.m6969a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new C2355b(substring);
        }
        throw new C3227u("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static final boolean m11698a(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        C2363i iVar = C2363i.BEGINNING;
        int length = str.length();
        C2363i iVar2 = iVar;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (C2359e.f7231a[iVar2.ordinal()]) {
                case 1:
                case 2:
                    if (Character.isJavaIdentifierPart(charAt)) {
                        iVar2 = C2363i.MIDDLE;
                        break;
                    } else {
                        return false;
                    }
                case 3:
                    if (charAt != '.') {
                        if (Character.isJavaIdentifierPart(charAt)) {
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        iVar2 = C2363i.AFTER_DOT;
                        break;
                    }
            }
        }
        if (iVar2 != C2363i.AFTER_DOT) {
            z = true;
        }
        return z;
    }
}
