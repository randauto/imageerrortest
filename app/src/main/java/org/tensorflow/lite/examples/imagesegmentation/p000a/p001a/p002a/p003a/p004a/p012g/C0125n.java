package p000a.p001a.p002a.p003a.p004a.p012g;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import p000a.p001a.p002a.p003a.C0140c;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;

/* renamed from: a.a.a.a.a.g.n */
/* compiled from: IconRequest */
public class C0125n {

    /* renamed from: a */
    public final String f260a;

    /* renamed from: b */
    public final int f261b;

    /* renamed from: c */
    public final int f262c;

    /* renamed from: d */
    public final int f263d;

    public C0125n(String str, int i, int i2, int i3) {
        this.f260a = str;
        this.f261b = i;
        this.f262c = i2;
        this.f263d = i3;
    }

    /* renamed from: a */
    public static C0125n m359a(Context context, String str) {
        if (str != null) {
            try {
                int l = C0020i.m81l(context);
                StringBuilder sb = new StringBuilder();
                sb.append("App icon resource ID is ");
                sb.append(l);
                C0140c.m397g().mo283a("Fabric", sb.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), l, options);
                return new C0125n(str, l, options.outWidth, options.outHeight);
            } catch (Exception e) {
                C0140c.m397g().mo293e("Fabric", "Failed to load icon", e);
            }
        }
        return null;
    }
}
