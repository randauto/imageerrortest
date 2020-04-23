package p145c.p146a.p147a;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: c.a.a.e */
/* compiled from: FancyShowCaseQueue */
public class C3242e implements C3240c {

    /* renamed from: a */
    private Queue<C3243f> f8693a = new LinkedList();

    /* renamed from: b */
    private C3240c f8694b = null;

    /* renamed from: c */
    private C3243f f8695c;

    /* renamed from: d */
    private C3256h f8696d;

    /* renamed from: a */
    public C3242e mo10435a(C3243f fVar) {
        this.f8693a.add(fVar);
        return this;
    }

    /* renamed from: a */
    public void mo10436a() {
        if (!this.f8693a.isEmpty()) {
            this.f8695c = (C3243f) this.f8693a.poll();
            this.f8694b = this.f8695c.getDismissListener();
            this.f8695c.setDismissListener(this);
            this.f8695c.mo10437a();
        } else if (this.f8696d != null) {
            this.f8696d.mo10469a();
        }
    }

    /* renamed from: b */
    public void mo10427b(String str) {
        if (this.f8694b != null) {
            this.f8694b.mo10427b(str);
        }
        mo10436a();
    }

    /* renamed from: a */
    public void mo10426a(String str) {
        if (this.f8694b != null) {
            this.f8694b.mo10426a(str);
        }
        mo10436a();
    }
}
