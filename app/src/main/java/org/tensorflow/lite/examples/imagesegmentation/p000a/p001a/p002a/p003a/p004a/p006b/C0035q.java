package p000a.p001a.p002a.p003a.p004a.p006b;

import android.content.Context;
import java.lang.reflect.Method;
import p000a.p001a.p002a.p003a.C0140c;

/* renamed from: a.a.a.a.a.b.q */
/* compiled from: FirebaseAppImpl */
final class C0035q implements C0034p {

    /* renamed from: a */
    private final Method f58a;

    /* renamed from: b */
    private final Object f59b;

    /* renamed from: a */
    public static C0034p m102a(Context context) {
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new C0035q(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            C0140c.m397g().mo283a("Fabric", "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find method: ");
            sb.append(e.getMessage());
            C0140c.m397g().mo283a("Fabric", sb.toString());
            return null;
        } catch (Exception e2) {
            C0140c.m397g().mo284a("Fabric", "Unexpected error loading FirebaseApp instance.", (Throwable) e2);
            return null;
        }
    }

    private C0035q(Class cls, Object obj) {
        this.f59b = obj;
        this.f58a = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }

    /* renamed from: a */
    public boolean mo58a() {
        try {
            return ((Boolean) this.f58a.invoke(this.f59b, new Object[0])).booleanValue();
        } catch (Exception e) {
            C0140c.m397g().mo284a("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", (Throwable) e);
            return false;
        }
    }
}
