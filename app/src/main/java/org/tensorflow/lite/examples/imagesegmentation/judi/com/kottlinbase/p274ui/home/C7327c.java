package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.app.Activity;
import android.content.Context;
import android.support.p053v4.app.C0625a;
import java.util.Arrays;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p254d.p255a.C6972a;
import p254d.p255a.C6973b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0007*\u00020\b\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000¨\u0006\r"}, mo10386c = {"PERMISSION_ONSTORAGEREADY", "", "", "[Ljava/lang/String;", "REQUEST_ONSTORAGEREADY", "", "onRequestPermissionsResult", "", "Ljudi/com/kottlinbase/ui/home/HomeActivity;", "requestCode", "grantResults", "", "onStorageReadyWithPermissionCheck", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.home.c */
/* compiled from: HomeActivityPermissionsDispatcher.kt */
public final class C7327c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int f26618a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f26619b = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: a */
    public static final void m38973a(HomeActivity homeActivity) {
        C1489j.m6972b(homeActivity, "$receiver");
        Context context = homeActivity;
        String[] strArr = f26619b;
        if (C6973b.m36298a(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            homeActivity.mo23316w();
            return;
        }
        Activity activity = homeActivity;
        String[] strArr2 = f26619b;
        if (C6973b.m36296a(activity, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
            homeActivity.mo23402a((C6972a) new C7326b(homeActivity));
        } else {
            C0625a.m2278a(activity, f26619b, f26618a);
        }
    }

    /* renamed from: a */
    public static final void m38974a(HomeActivity homeActivity, int i, int[] iArr) {
        C1489j.m6972b(homeActivity, "$receiver");
        C1489j.m6972b(iArr, "grantResults");
        if (i != f26618a) {
            return;
        }
        if (C6973b.m36300a(Arrays.copyOf(iArr, iArr.length))) {
            homeActivity.mo23316w();
            return;
        }
        Activity activity = homeActivity;
        String[] strArr = f26619b;
        if (!C6973b.m36296a(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            homeActivity.mo23407x();
        }
    }
}
