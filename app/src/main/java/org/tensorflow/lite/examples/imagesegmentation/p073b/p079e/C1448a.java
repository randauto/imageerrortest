package p073b.p079e;

import java.lang.annotation.Annotation;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1483d;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C1525b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001f\u0010\u0018\u001a\u00020\u0019\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\r*\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0002\u0010\u001b\"'\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018GX\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"&\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e\";\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018Ç\u0002X\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"+\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\"-\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b\"+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo10386c = {"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "java", "Ljava/lang/Class;", "java$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "javaClass$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"})
/* renamed from: b.e.a */
/* compiled from: JvmClassMapping.kt */
public final class C1448a {
    /* renamed from: a */
    public static final <T> Class<T> m6938a(C1525b<T> bVar) {
        C1489j.m6972b(bVar, "$receiver");
        Class<T> a = ((C1483d) bVar).mo6933a();
        if (a != null) {
            return a;
        }
        throw new C3227u("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Class<T> m6939b(p073b.p085h.C1525b<T> r1) {
        /*
            java.lang.String r0 = "$receiver"
            p073b.p079e.p081b.C1489j.m6972b(r1, r0)
            b.e.b.d r1 = (p073b.p079e.p081b.C1483d) r1
            java.lang.Class r1 = r1.mo6933a()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L_0x001c
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            b.u r1 = new b.u
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T>"
            r1.<init>(r0)
            throw r1
        L_0x001c:
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L_0x0024
            goto L_0x0090
        L_0x0024:
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L_0x0085;
                case -527879800: goto L_0x007a;
                case -515992664: goto L_0x006f;
                case 155276373: goto L_0x0064;
                case 344809556: goto L_0x0059;
                case 398507100: goto L_0x004e;
                case 398795216: goto L_0x0043;
                case 399092968: goto L_0x0038;
                case 761287205: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0090
        L_0x002d:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Double.TYPE
            goto L_0x0091
        L_0x0038:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Void.TYPE
            goto L_0x0091
        L_0x0043:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Long.TYPE
            goto L_0x0091
        L_0x004e:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Byte.TYPE
            goto L_0x0091
        L_0x0059:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Boolean.TYPE
            goto L_0x0091
        L_0x0064:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Character.TYPE
            goto L_0x0091
        L_0x006f:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Short.TYPE
            goto L_0x0091
        L_0x007a:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Float.TYPE
            goto L_0x0091
        L_0x0085:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0090
            java.lang.Class r1 = java.lang.Integer.TYPE
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p079e.C1448a.m6939b(b.h.b):java.lang.Class");
    }

    /* renamed from: c */
    public static final <T> Class<T> m6940c(C1525b<T> bVar) {
        C1489j.m6972b(bVar, "$receiver");
        Class a = ((C1483d) bVar).mo6933a();
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new C3227u("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (a != null) {
            return a;
        } else {
            throw new C3227u("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    /* renamed from: a */
    public static final <T> C1525b<T> m6936a(Class<T> cls) {
        C1489j.m6972b(cls, "$receiver");
        return C1503v.m6999a((Class) cls);
    }

    /* renamed from: a */
    public static final <T extends Annotation> C1525b<? extends T> m6937a(T t) {
        C1489j.m6972b(t, "$receiver");
        Class annotationType = t.annotationType();
        C1489j.m6969a((Object) annotationType, "(this as java.lang.annot…otation).annotationType()");
        C1525b<? extends T> a = m6936a(annotationType);
        if (a != null) {
            return a;
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
    }
}
