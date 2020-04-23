package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p272a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0015\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u0017"}, mo10386c = {"Ljudi/com/kottlinbase/utils/ScreenUtil;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "isNavigationBarAvailable", "", "()Z", "convertDpToPixel", "", "context", "Landroid/content/Context;", "dp", "convertSPtoPX", "spValue", "", "getHeightScreen", "getNavigationBarHeight", "getScreenSize", "Ljudi/com/kottlinbase/utils/ScreenUtil$ScreenSize;", "getWidthScreen", "ScreenSize", "app_release"})
/* renamed from: judi.com.kottlinbase.a.c */
/* compiled from: ScreenUtil.kt */
public final class C7189c {

    /* renamed from: a */
    public static final C7189c f26296a = new C7189c();

    /* renamed from: b */
    private static final String f26297b = C7189c.class.getSimpleName();

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, mo10386c = {"Ljudi/com/kottlinbase/utils/ScreenUtil$ScreenSize;", "", "()V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "width", "getWidth", "setWidth", "app_release"})
    /* renamed from: judi.com.kottlinbase.a.c$a */
    /* compiled from: ScreenUtil.kt */
    public static final class C7190a {

        /* renamed from: a */
        private int f26298a;

        /* renamed from: b */
        private int f26299b;

        /* renamed from: a */
        public final int mo23128a() {
            return this.f26298a;
        }

        /* renamed from: a */
        public final void mo23129a(int i) {
            this.f26298a = i;
        }

        /* renamed from: b */
        public final int mo23130b() {
            return this.f26299b;
        }

        /* renamed from: b */
        public final void mo23131b(int i) {
            this.f26299b = i;
        }
    }

    private C7189c() {
    }

    /* renamed from: a */
    public final int mo23124a(Context context) {
        return mo23127c(context).mo23130b();
    }

    /* renamed from: b */
    public final int mo23126b(Context context) {
        return mo23127c(context).mo23128a();
    }

    /* renamed from: c */
    public final C7190a mo23127c(Context context) {
        if (context == null) {
            C1489j.m6968a();
        }
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (VERSION.SDK_INT >= 17) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                C7190a aVar = new C7190a();
                aVar.mo23129a(displayMetrics.widthPixels);
                aVar.mo23131b(displayMetrics.heightPixels);
                return aVar;
            }
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                C1489j.m6969a((Object) method, "Display::class.java.getMethod(\"getRawHeight\")");
                Method method2 = Display.class.getMethod("getRawWidth", new Class[0]);
                C1489j.m6969a((Object) method2, "Display::class.java.getMethod(\"getRawWidth\")");
                try {
                    C7190a aVar2 = new C7190a();
                    Object invoke = method2.invoke(defaultDisplay, new Object[0]);
                    if (invoke != null) {
                        aVar2.mo23129a(((Integer) invoke).intValue());
                        Object invoke2 = method.invoke(defaultDisplay, new Object[0]);
                        if (invoke2 != null) {
                            aVar2.mo23131b(((Integer) invoke2).intValue());
                            return aVar2;
                        }
                        throw new C3227u("null cannot be cast to non-null type kotlin.Int");
                    }
                    throw new C3227u("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException e) {
                    Log.e(f26297b, "error: ", e);
                    return new C7190a();
                } catch (IllegalArgumentException e2) {
                    Log.e(f26297b, "error: ", e2);
                    return new C7190a();
                } catch (InvocationTargetException e3) {
                    Log.e(f26297b, "error: ", e3);
                    return new C7190a();
                }
            } catch (NoSuchMethodException e4) {
                Log.e(f26297b, "NoSuchMethodException error: ", e4);
                return new C7190a();
            }
        } else {
            throw new C3227u("null cannot be cast to non-null type android.view.WindowManager");
        }
    }

    /* renamed from: a */
    public final int mo23125a(Context context, int i) {
        C1489j.m6972b(context, "context");
        Resources resources = context.getResources();
        C1489j.m6969a((Object) resources, "resources");
        return (int) (((float) i) * (((float) resources.getDisplayMetrics().densityDpi) / 160.0f));
    }
}
