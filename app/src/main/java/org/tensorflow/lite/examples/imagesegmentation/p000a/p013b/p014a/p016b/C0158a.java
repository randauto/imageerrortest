package p000a.p013b.p014a.p016b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p000a.p013b.C0189e;
import p000a.p013b.p014a.p015a.C0157a;

/* renamed from: a.b.a.b.a */
/* compiled from: AndroidSchedulers */
public final class C0158a {

    /* renamed from: a */
    private static final C0189e f357a = C0157a.m455a((Callable<C0189e>) new Callable<C0189e>() {
        /* renamed from: a */
        public C0189e call() {
            return C0160a.f358a;
        }
    });

    /* renamed from: a.b.a.b.a$a */
    /* compiled from: AndroidSchedulers */
    private static final class C0160a {

        /* renamed from: a */
        static final C0189e f358a = new C0161b(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static C0189e m458a() {
        return C0157a.m454a(f357a);
    }
}
