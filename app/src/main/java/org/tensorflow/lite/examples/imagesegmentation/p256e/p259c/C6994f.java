package p256e.p259c;

/* renamed from: e.c.f */
/* compiled from: PMatrix2D */
public class C6994f implements C6993e {

    /* renamed from: a */
    public float f24763a;

    /* renamed from: b */
    public float f24764b;

    /* renamed from: c */
    public float f24765c;

    /* renamed from: d */
    public float f24766d;

    /* renamed from: e */
    public float f24767e;

    /* renamed from: f */
    public float f24768f;

    public C6994f() {
        mo22034a();
    }

    /* renamed from: a */
    public void mo22034a() {
        mo22035a(1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }

    /* renamed from: a */
    public float[] mo22036a(float[] fArr) {
        if (fArr == null || fArr.length != 6) {
            fArr = new float[6];
        }
        fArr[0] = this.f24763a;
        fArr[1] = this.f24764b;
        fArr[2] = this.f24765c;
        fArr[3] = this.f24766d;
        fArr[4] = this.f24767e;
        fArr[5] = this.f24768f;
        return fArr;
    }

    /* renamed from: b */
    public void mo22037b(float[] fArr) {
        this.f24763a = fArr[0];
        this.f24764b = fArr[1];
        this.f24765c = fArr[2];
        this.f24766d = fArr[3];
        this.f24767e = fArr[4];
        this.f24768f = fArr[5];
    }

    /* renamed from: a */
    public void mo22035a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f24763a = f;
        this.f24764b = f2;
        this.f24765c = f3;
        this.f24766d = f4;
        this.f24767e = f5;
        this.f24768f = f6;
    }
}
