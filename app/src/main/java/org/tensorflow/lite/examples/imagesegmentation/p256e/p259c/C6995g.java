package p256e.p259c;

/* renamed from: e.c.g */
/* compiled from: PMatrix3D */
public final class C6995g implements C6993e {

    /* renamed from: a */
    public float f24769a;

    /* renamed from: b */
    public float f24770b;

    /* renamed from: c */
    public float f24771c;

    /* renamed from: d */
    public float f24772d;

    /* renamed from: e */
    public float f24773e;

    /* renamed from: f */
    public float f24774f;

    /* renamed from: g */
    public float f24775g;

    /* renamed from: h */
    public float f24776h;

    /* renamed from: i */
    public float f24777i;

    /* renamed from: j */
    public float f24778j;

    /* renamed from: k */
    public float f24779k;

    /* renamed from: l */
    public float f24780l;

    /* renamed from: m */
    public float f24781m;

    /* renamed from: n */
    public float f24782n;

    /* renamed from: o */
    public float f24783o;

    /* renamed from: p */
    public float f24784p;

    /* renamed from: a */
    private float m36741a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return (f * ((f5 * f9) - (f6 * f8))) + (f2 * ((f6 * f7) - (f9 * f4))) + (f3 * ((f4 * f8) - (f5 * f7)));
    }

    public C6995g() {
        mo22038a();
    }

    public C6995g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        mo22041a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16);
    }

    /* renamed from: a */
    public void mo22038a() {
        mo22041a(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public C6995g mo22046b() {
        C6995g gVar = new C6995g();
        gVar.mo22042a((C6993e) this);
        return gVar;
    }

    /* renamed from: a */
    public float[] mo22044a(float[] fArr) {
        if (fArr == null || fArr.length != 16) {
            fArr = new float[16];
        }
        fArr[0] = this.f24769a;
        fArr[1] = this.f24770b;
        fArr[2] = this.f24771c;
        fArr[3] = this.f24772d;
        fArr[4] = this.f24773e;
        fArr[5] = this.f24774f;
        fArr[6] = this.f24775g;
        fArr[7] = this.f24776h;
        fArr[8] = this.f24777i;
        fArr[9] = this.f24778j;
        fArr[10] = this.f24779k;
        fArr[11] = this.f24780l;
        fArr[12] = this.f24781m;
        fArr[13] = this.f24782n;
        fArr[14] = this.f24783o;
        fArr[15] = this.f24784p;
        return fArr;
    }

    /* renamed from: a */
    public void mo22042a(C6993e eVar) {
        C6993e eVar2 = eVar;
        if (eVar2 instanceof C6995g) {
            C6995g gVar = (C6995g) eVar2;
            mo22041a(gVar.f24769a, gVar.f24770b, gVar.f24771c, gVar.f24772d, gVar.f24773e, gVar.f24774f, gVar.f24775g, gVar.f24776h, gVar.f24777i, gVar.f24778j, gVar.f24779k, gVar.f24780l, gVar.f24781m, gVar.f24782n, gVar.f24783o, gVar.f24784p);
            return;
        }
        C6994f fVar = (C6994f) eVar2;
        mo22041a(fVar.f24763a, fVar.f24764b, 0.0f, fVar.f24765c, fVar.f24766d, fVar.f24767e, 0.0f, fVar.f24768f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public void mo22049b(float[] fArr) {
        if (fArr.length == 6) {
            mo22040a(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
        } else if (fArr.length == 16) {
            this.f24769a = fArr[0];
            this.f24770b = fArr[1];
            this.f24771c = fArr[2];
            this.f24772d = fArr[3];
            this.f24773e = fArr[4];
            this.f24774f = fArr[5];
            this.f24775g = fArr[6];
            this.f24776h = fArr[7];
            this.f24777i = fArr[8];
            this.f24778j = fArr[9];
            this.f24779k = fArr[10];
            this.f24780l = fArr[11];
            this.f24781m = fArr[12];
            this.f24782n = fArr[13];
            this.f24783o = fArr[14];
            this.f24784p = fArr[15];
        }
    }

    /* renamed from: a */
    public void mo22040a(float f, float f2, float f3, float f4, float f5, float f6) {
        mo22041a(f, f2, 0.0f, f3, f4, f5, 0.0f, f6, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public void mo22041a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f24769a = f;
        this.f24770b = f2;
        this.f24771c = f3;
        this.f24772d = f4;
        this.f24773e = f5;
        this.f24774f = f6;
        this.f24775g = f7;
        this.f24776h = f8;
        this.f24777i = f9;
        this.f24778j = f10;
        this.f24779k = f11;
        this.f24780l = f12;
        this.f24781m = f13;
        this.f24782n = f14;
        this.f24783o = f15;
        this.f24784p = f16;
    }

    /* renamed from: a */
    public void mo22039a(float f, float f2, float f3) {
        this.f24772d += (this.f24769a * f) + (this.f24770b * f2) + (this.f24771c * f3);
        this.f24776h += (this.f24773e * f) + (this.f24774f * f2) + (this.f24775g * f3);
        this.f24780l += (this.f24777i * f) + (this.f24778j * f2) + (this.f24779k * f3);
        this.f24784p += (f * this.f24781m) + (f2 * this.f24782n) + (f3 * this.f24783o);
    }

    /* renamed from: a */
    public void mo22043a(C6995g gVar) {
        C6995g gVar2 = gVar;
        mo22047b(gVar2.f24769a, gVar2.f24770b, gVar2.f24771c, gVar2.f24772d, gVar2.f24773e, gVar2.f24774f, gVar2.f24775g, gVar2.f24776h, gVar2.f24777i, gVar2.f24778j, gVar2.f24779k, gVar2.f24780l, gVar2.f24781m, gVar2.f24782n, gVar2.f24783o, gVar2.f24784p);
    }

    /* renamed from: b */
    public void mo22047b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = (this.f24769a * f) + (this.f24770b * f5) + (this.f24771c * f9) + (this.f24772d * f13);
        float f18 = (this.f24769a * f2) + (this.f24770b * f6) + (this.f24771c * f10) + (this.f24772d * f14);
        float f19 = (this.f24769a * f3) + (this.f24770b * f7) + (this.f24771c * f11) + (this.f24772d * f15);
        float f20 = (this.f24769a * f4) + (this.f24770b * f8) + (this.f24771c * f12) + (this.f24772d * f16);
        float f21 = (this.f24773e * f) + (this.f24774f * f5) + (this.f24775g * f9) + (this.f24776h * f13);
        float f22 = (this.f24773e * f2) + (this.f24774f * f6) + (this.f24775g * f10) + (this.f24776h * f14);
        float f23 = (this.f24773e * f3) + (this.f24774f * f7) + (this.f24775g * f11) + (this.f24776h * f15);
        float f24 = (this.f24773e * f4) + (this.f24774f * f8) + (this.f24775g * f12) + (this.f24776h * f16);
        float f25 = (this.f24777i * f) + (this.f24778j * f5) + (this.f24779k * f9) + (this.f24780l * f13);
        float f26 = (this.f24777i * f2) + (this.f24778j * f6) + (this.f24779k * f10) + (this.f24780l * f14);
        float f27 = (this.f24777i * f3) + (this.f24778j * f7) + (this.f24779k * f11) + (this.f24780l * f15);
        float f28 = (this.f24777i * f4) + (this.f24778j * f8) + (this.f24779k * f12) + (this.f24780l * f16);
        float f29 = (this.f24781m * f) + (this.f24782n * f5) + (this.f24783o * f9) + (this.f24784p * f13);
        float f30 = (this.f24781m * f2) + (this.f24782n * f6) + (this.f24783o * f10) + (this.f24784p * f14);
        float f31 = (this.f24781m * f3) + (this.f24782n * f7) + (this.f24783o * f11) + (this.f24784p * f15);
        float f32 = (this.f24781m * f4) + (this.f24782n * f8) + (this.f24783o * f12) + (this.f24784p * f16);
        this.f24769a = f17;
        this.f24770b = f18;
        this.f24771c = f19;
        this.f24772d = f20;
        this.f24773e = f21;
        this.f24774f = f22;
        this.f24775g = f23;
        this.f24776h = f24;
        this.f24777i = f25;
        this.f24778j = f26;
        this.f24779k = f27;
        this.f24780l = f28;
        this.f24781m = f29;
        this.f24782n = f30;
        this.f24783o = f31;
        this.f24784p = f32;
    }

    /* renamed from: b */
    public void mo22048b(C6995g gVar) {
        C6995g gVar2 = gVar;
        mo22050c(gVar2.f24769a, gVar2.f24770b, gVar2.f24771c, gVar2.f24772d, gVar2.f24773e, gVar2.f24774f, gVar2.f24775g, gVar2.f24776h, gVar2.f24777i, gVar2.f24778j, gVar2.f24779k, gVar2.f24780l, gVar2.f24781m, gVar2.f24782n, gVar2.f24783o, gVar2.f24784p);
    }

    /* renamed from: c */
    public void mo22050c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = (this.f24769a * f) + (this.f24773e * f2) + (this.f24777i * f3) + (this.f24781m * f4);
        float f18 = (this.f24770b * f) + (this.f24774f * f2) + (this.f24778j * f3) + (this.f24782n * f4);
        float f19 = (this.f24771c * f) + (this.f24775g * f2) + (this.f24779k * f3) + (this.f24783o * f4);
        float f20 = (f * this.f24772d) + (f2 * this.f24776h) + (this.f24780l * f3) + (this.f24784p * f4);
        float f21 = (this.f24769a * f5) + (this.f24773e * f6) + (this.f24777i * f7) + (this.f24781m * f8);
        float f22 = (this.f24770b * f5) + (this.f24774f * f6) + (this.f24778j * f7) + (this.f24782n * f8);
        float f23 = (this.f24771c * f5) + (this.f24775g * f6) + (this.f24779k * f7) + (this.f24783o * f8);
        float f24 = (f5 * this.f24772d) + (f6 * this.f24776h) + (this.f24780l * f7) + (this.f24784p * f8);
        float f25 = (this.f24769a * f9) + (this.f24773e * f10) + (this.f24777i * f11) + (this.f24781m * f12);
        float f26 = (this.f24770b * f9) + (this.f24774f * f10) + (this.f24778j * f11) + (this.f24782n * f12);
        float f27 = (this.f24771c * f9) + (this.f24775g * f10) + (this.f24779k * f11) + (this.f24783o * f12);
        float f28 = (f9 * this.f24772d) + (f10 * this.f24776h) + (this.f24780l * f11) + (this.f24784p * f12);
        float f29 = (this.f24769a * f13) + (this.f24773e * f14) + (this.f24777i * f15) + (this.f24781m * f16);
        float f30 = (this.f24770b * f13) + (this.f24774f * f14) + (this.f24778j * f15) + (this.f24782n * f16);
        float f31 = (this.f24771c * f13) + (this.f24775g * f14) + (this.f24779k * f15) + (this.f24783o * f16);
        float f32 = (this.f24772d * f13) + (f14 * this.f24776h) + (this.f24780l * f15) + (this.f24784p * f16);
        this.f24769a = f17;
        this.f24770b = f18;
        this.f24771c = f19;
        this.f24772d = f20;
        this.f24773e = f21;
        this.f24774f = f22;
        this.f24775g = f23;
        this.f24776h = f24;
        this.f24777i = f25;
        this.f24778j = f26;
        this.f24779k = f27;
        this.f24780l = f28;
        this.f24781m = f29;
        this.f24782n = f30;
        this.f24783o = f31;
        this.f24784p = f32;
    }

    /* renamed from: a */
    public float[] mo22045a(float[] fArr, float[] fArr2) {
        if (fArr2 == null || fArr2.length < 3) {
            fArr2 = new float[3];
        }
        if (fArr != fArr2) {
            if (fArr2.length == 3) {
                fArr2[0] = (this.f24769a * fArr[0]) + (this.f24770b * fArr[1]) + (this.f24771c * fArr[2]) + this.f24772d;
                fArr2[1] = (this.f24773e * fArr[0]) + (this.f24774f * fArr[1]) + (this.f24775g * fArr[2]) + this.f24776h;
                fArr2[2] = (this.f24777i * fArr[0]) + (this.f24778j * fArr[1]) + (this.f24779k * fArr[2]) + this.f24780l;
            } else if (fArr2.length > 3) {
                fArr2[0] = (this.f24769a * fArr[0]) + (this.f24770b * fArr[1]) + (this.f24771c * fArr[2]) + (this.f24772d * fArr[3]);
                fArr2[1] = (this.f24773e * fArr[0]) + (this.f24774f * fArr[1]) + (this.f24775g * fArr[2]) + (this.f24776h * fArr[3]);
                fArr2[2] = (this.f24777i * fArr[0]) + (this.f24778j * fArr[1]) + (this.f24779k * fArr[2]) + (this.f24780l * fArr[3]);
                fArr2[3] = (this.f24781m * fArr[0]) + (this.f24782n * fArr[1]) + (this.f24783o * fArr[2]) + (this.f24784p * fArr[3]);
            }
            return fArr2;
        }
        throw new RuntimeException("The source and target vectors used in PMatrix3D.mult() cannot be identical.");
    }

    /* renamed from: c */
    public boolean mo22051c() {
        float d = mo22052d();
        if (d == 0.0f) {
            return false;
        }
        float a = m36741a(this.f24774f, this.f24775g, this.f24776h, this.f24778j, this.f24779k, this.f24780l, this.f24782n, this.f24783o, this.f24784p);
        float f = -m36741a(this.f24773e, this.f24775g, this.f24776h, this.f24777i, this.f24779k, this.f24780l, this.f24781m, this.f24783o, this.f24784p);
        float a2 = m36741a(this.f24773e, this.f24774f, this.f24776h, this.f24777i, this.f24778j, this.f24780l, this.f24781m, this.f24782n, this.f24784p);
        float f2 = -m36741a(this.f24773e, this.f24774f, this.f24775g, this.f24777i, this.f24778j, this.f24779k, this.f24781m, this.f24782n, this.f24783o);
        float f3 = -m36741a(this.f24770b, this.f24771c, this.f24772d, this.f24778j, this.f24779k, this.f24780l, this.f24782n, this.f24783o, this.f24784p);
        float f4 = f3;
        float a3 = m36741a(this.f24769a, this.f24771c, this.f24772d, this.f24777i, this.f24779k, this.f24780l, this.f24781m, this.f24783o, this.f24784p);
        float f5 = -m36741a(this.f24769a, this.f24770b, this.f24772d, this.f24777i, this.f24778j, this.f24780l, this.f24781m, this.f24782n, this.f24784p);
        float f6 = f5;
        float a4 = m36741a(this.f24769a, this.f24770b, this.f24771c, this.f24777i, this.f24778j, this.f24779k, this.f24781m, this.f24782n, this.f24783o);
        float a5 = m36741a(this.f24770b, this.f24771c, this.f24772d, this.f24774f, this.f24775g, this.f24776h, this.f24782n, this.f24783o, this.f24784p);
        float f7 = -m36741a(this.f24769a, this.f24771c, this.f24772d, this.f24773e, this.f24775g, this.f24776h, this.f24781m, this.f24783o, this.f24784p);
        float f8 = f7;
        float a6 = m36741a(this.f24769a, this.f24770b, this.f24772d, this.f24773e, this.f24774f, this.f24776h, this.f24781m, this.f24782n, this.f24784p);
        float f9 = -m36741a(this.f24769a, this.f24770b, this.f24771c, this.f24773e, this.f24774f, this.f24775g, this.f24781m, this.f24782n, this.f24783o);
        float f10 = f9;
        float f11 = -m36741a(this.f24770b, this.f24771c, this.f24772d, this.f24774f, this.f24775g, this.f24776h, this.f24778j, this.f24779k, this.f24780l);
        float f12 = f11;
        float a7 = m36741a(this.f24769a, this.f24771c, this.f24772d, this.f24773e, this.f24775g, this.f24776h, this.f24777i, this.f24779k, this.f24780l);
        float f13 = -m36741a(this.f24769a, this.f24770b, this.f24772d, this.f24773e, this.f24774f, this.f24776h, this.f24777i, this.f24778j, this.f24780l);
        float f14 = f13;
        float a8 = m36741a(this.f24769a, this.f24770b, this.f24771c, this.f24773e, this.f24774f, this.f24775g, this.f24777i, this.f24778j, this.f24779k);
        this.f24769a = a / d;
        this.f24770b = f4 / d;
        this.f24771c = a5 / d;
        this.f24772d = f12 / d;
        this.f24773e = f / d;
        this.f24774f = a3 / d;
        this.f24775g = f8 / d;
        this.f24776h = a7 / d;
        this.f24777i = a2 / d;
        this.f24778j = f6 / d;
        this.f24779k = a6 / d;
        this.f24780l = f14 / d;
        this.f24781m = f2 / d;
        this.f24782n = a4 / d;
        this.f24783o = f10 / d;
        this.f24784p = a8 / d;
        return true;
    }

    /* renamed from: d */
    public float mo22052d() {
        return (((this.f24769a * (((((((this.f24774f * this.f24779k) * this.f24784p) + ((this.f24775g * this.f24780l) * this.f24782n)) + ((this.f24776h * this.f24778j) * this.f24783o)) - ((this.f24776h * this.f24779k) * this.f24782n)) - ((this.f24774f * this.f24780l) * this.f24783o)) - ((this.f24775g * this.f24778j) * this.f24784p))) - (this.f24770b * (((((((this.f24773e * this.f24779k) * this.f24784p) + ((this.f24775g * this.f24780l) * this.f24781m)) + ((this.f24776h * this.f24777i) * this.f24783o)) - ((this.f24776h * this.f24779k) * this.f24781m)) - ((this.f24773e * this.f24780l) * this.f24783o)) - ((this.f24775g * this.f24777i) * this.f24784p)))) + (this.f24771c * (((((((this.f24773e * this.f24778j) * this.f24784p) + ((this.f24774f * this.f24780l) * this.f24781m)) + ((this.f24776h * this.f24777i) * this.f24782n)) - ((this.f24776h * this.f24778j) * this.f24781m)) - ((this.f24773e * this.f24780l) * this.f24782n)) - ((this.f24774f * this.f24777i) * this.f24784p)))) - (this.f24772d * (((((((this.f24773e * this.f24778j) * this.f24783o) + ((this.f24774f * this.f24779k) * this.f24781m)) + ((this.f24775g * this.f24777i) * this.f24782n)) - ((this.f24775g * this.f24778j) * this.f24781m)) - ((this.f24773e * this.f24779k) * this.f24782n)) - ((this.f24774f * this.f24777i) * this.f24783o)));
    }
}
