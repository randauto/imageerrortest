package p256e.p258b;

import android.app.Activity;
import android.os.Bundle;
import android.support.p053v4.app.C0625a;
import android.support.p053v4.p057c.C0723e;

/* renamed from: e.b.d */
/* compiled from: PermissionRequestor */
public class C6980d extends Activity {

    /* renamed from: a */
    C0723e f24492a;

    /* renamed from: b */
    String[] f24493b;

    /* renamed from: c */
    int f24494c;

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f24492a = (C0723e) getIntent().getParcelableExtra("resultReceiver");
        this.f24493b = getIntent().getStringArrayExtra("permissions");
        this.f24494c = getIntent().getIntExtra("requestCode", 0);
        C0625a.m2278a(this, this.f24493b, this.f24494c);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Bundle bundle = new Bundle();
        bundle.putStringArray("permissions", strArr);
        bundle.putIntArray("grantResults", iArr);
        this.f24492a.mo2440b(i, bundle);
        finish();
    }
}
