package p073b.p076c;

import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p073b.p143j.C3199m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo10386c = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"})
/* renamed from: b.c.b */
/* compiled from: PlatformImplementations.kt */
public final class C1442b {

    /* renamed from: a */
    public static final C1440a f4845a;

    static {
        C1440a aVar;
        Object newInstance;
        Object newInstance2;
        int a = m6926a();
        if (a >= 65544) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                C1489j.m6969a(newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance2 != null) {
                    aVar = (C1440a) newInstance2;
                    f4845a = aVar;
                }
                throw new C3227u("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = C1440a.class.getClassLoader();
                StringBuilder sb = new StringBuilder();
                sb.append("Instance classloader: ");
                sb.append(classLoader);
                sb.append(", base type classloader: ");
                sb.append(classLoader2);
                Throwable initCause = new ClassCastException(sb.toString()).initCause(e);
                C1489j.m6969a((Object) initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C1489j.m6969a(newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = (C1440a) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = C1440a.class.getClassLoader();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Instance classloader: ");
                            sb2.append(classLoader3);
                            sb2.append(", base type classloader: ");
                            sb2.append(classLoader4);
                            Throwable initCause2 = new ClassCastException(sb2.toString()).initCause(e2);
                            C1489j.m6969a((Object) initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause2;
                        }
                    } else {
                        throw new C3227u("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543) {
            try {
                newInstance = Class.forName("b.c.a.a").newInstance();
                C1489j.m6969a(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance != null) {
                    aVar = (C1440a) newInstance;
                    f4845a = aVar;
                }
                throw new C3227u("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = C1440a.class.getClassLoader();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Instance classloader: ");
                sb3.append(classLoader5);
                sb3.append(", base type classloader: ");
                sb3.append(classLoader6);
                Throwable initCause3 = new ClassCastException(sb3.toString()).initCause(e3);
                C1489j.m6969a((Object) initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C1489j.m6969a(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            aVar = (C1440a) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = C1440a.class.getClassLoader();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Instance classloader: ");
                            sb4.append(classLoader7);
                            sb4.append(", base type classloader: ");
                            sb4.append(classLoader8);
                            Throwable initCause4 = new ClassCastException(sb4.toString()).initCause(e4);
                            C1489j.m6969a((Object) initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause4;
                        }
                    } else {
                        throw new C3227u("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new C1440a();
        f4845a = aVar;
    }

    /* renamed from: a */
    private static final int m6926a() {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property == null) {
            return 65542;
        }
        CharSequence charSequence = property;
        int a = C3199m.m14767a(charSequence, '.', 0, false, 6, (Object) null);
        if (a < 0) {
            try {
                i = Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        int i2 = a + 1;
        int a2 = C3199m.m14767a(charSequence, '.', i2, false, 4, (Object) null);
        if (a2 < 0) {
            a2 = property.length();
        }
        if (property != null) {
            String substring = property.substring(0, a);
            C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (property != null) {
                String substring2 = property.substring(i2, a2);
                C1489j.m6969a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                try {
                    i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                } catch (NumberFormatException unused2) {
                }
                return i;
            }
            throw new C3227u("null cannot be cast to non-null type java.lang.String");
        }
        throw new C3227u("null cannot be cast to non-null type java.lang.String");
    }
}
