package p000a.p001a.p002a.p003a.p004a.p011f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import p000a.p001a.p002a.p003a.C0151i;

/* renamed from: a.a.a.a.a.f.d */
/* compiled from: PreferenceStoreImpl */
public class C0111d implements C0110c {

    /* renamed from: a */
    private final SharedPreferences f209a;

    /* renamed from: b */
    private final String f210b;

    /* renamed from: c */
    private final Context f211c;

    public C0111d(Context context, String str) {
        if (context != null) {
            this.f211c = context;
            this.f210b = str;
            this.f209a = this.f211c.getSharedPreferences(this.f210b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public C0111d(C0151i iVar) {
        this(iVar.getContext(), iVar.getClass().getName());
    }

    /* renamed from: a */
    public SharedPreferences mo258a() {
        return this.f209a;
    }

    /* renamed from: b */
    public Editor mo260b() {
        return this.f209a.edit();
    }

    @TargetApi(9)
    /* renamed from: a */
    public boolean mo259a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }
}
