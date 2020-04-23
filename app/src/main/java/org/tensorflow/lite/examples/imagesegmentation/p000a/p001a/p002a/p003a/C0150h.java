package p000a.p001a.p002a.p003a;

import p000a.p001a.p002a.p003a.p004a.p006b.C0048x;
import p000a.p001a.p002a.p003a.p004a.p007c.C0068e;
import p000a.p001a.p002a.p003a.p004a.p007c.C0069f;
import p000a.p001a.p002a.p003a.p004a.p007c.C0079m;

/* renamed from: a.a.a.a.h */
/* compiled from: InitializationTask */
class C0150h<Result> extends C0069f<Void, Void, Result> {

    /* renamed from: a */
    final C0151i<Result> f339a;

    public C0150h(C0151i<Result> iVar) {
        this.f339a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97a() {
        super.mo97a();
        C0048x a = m423a("onPreExecute");
        try {
            boolean onPreExecute = this.f339a.onPreExecute();
            a.mo94b();
            if (onPreExecute) {
                return;
            }
        } catch (C0079m e) {
            throw e;
        } catch (Exception e2) {
            C0140c.m397g().mo293e("Fabric", "Failure onPreExecute()", e2);
            a.mo94b();
        } catch (Throwable th) {
            a.mo94b();
            mo99a(true);
            throw th;
        }
        mo99a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Result mo96a(Void... voidArr) {
        C0048x a = m423a("doInBackground");
        Result doInBackground = !mo104d() ? this.f339a.doInBackground() : null;
        a.mo94b();
        return doInBackground;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98a(Result result) {
        this.f339a.onPostExecute(result);
        this.f339a.initializationCallback.mo305a(result);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo101b(Result result) {
        this.f339a.onCancelled(result);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f339a.getIdentifier());
        sb.append(" Initialization was cancelled");
        this.f339a.initializationCallback.mo304a((Exception) new C0149g(sb.toString()));
    }

    public C0068e getPriority() {
        return C0068e.HIGH;
    }

    /* renamed from: a */
    private C0048x m423a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f339a.getIdentifier());
        sb.append(".");
        sb.append(str);
        C0048x xVar = new C0048x(sb.toString(), "KitInitialization");
        xVar.mo93a();
        return xVar;
    }
}
