package p256e.p262f;

import java.nio.Buffer;

/* renamed from: e.f.m */
/* compiled from: VertexBuffer */
public class C7091m {

    /* renamed from: a */
    public int f25974a;

    /* renamed from: b */
    int f25975b;

    /* renamed from: c */
    int f25976c;

    /* renamed from: d */
    int f25977d;

    /* renamed from: e */
    boolean f25978e;

    /* renamed from: f */
    protected C7056e f25979f;

    /* renamed from: g */
    protected int f25980g;

    /* renamed from: h */
    private C7074h f25981h;

    C7091m(C7065i iVar, int i, int i2, int i3) {
        this(iVar, i, i2, i3, false);
    }

    C7091m(C7065i iVar, int i, int i2, int i3, boolean z) {
        this.f25979f = iVar.f25493a;
        this.f25980g = this.f25979f.mo22206A();
        this.f25975b = i;
        this.f25977d = i2;
        this.f25976c = i3;
        this.f25978e = z;
        mo22882a();
        mo22883b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22882a() {
        this.f25980g = this.f25979f.mo22208B();
        this.f25981h = new C7074h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22883b() {
        int i = (this.f25978e ? this.f25977d * 512 : this.f25977d * 256) * this.f25976c;
        this.f25979f.mo22310c(this.f25975b, this.f25974a);
        this.f25979f.mo22276a(this.f25975b, i, (Buffer) null, C7056e.f25190cm);
    }
}
