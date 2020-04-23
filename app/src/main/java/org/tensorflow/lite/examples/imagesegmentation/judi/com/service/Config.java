package org.tensorflow.lite.examples.imagesegmentation.judi.com.service;

/* renamed from: judi.com.service.a */
/* compiled from: Config */
public final class Config {

    /* renamed from: a */
    private String f26705a;

    /* renamed from: b */
    private String f26706b = "SegMap.map";

    /* renamed from: c */
    private String f26707c = "input.jpg";

    /* renamed from: d */
    private String f26708d = "mask.png";

    /* renamed from: e */
    private String f26709e = "mask_out.png";

    /* renamed from: f */
    private String f26710f = "trim_mask.png";

    /* renamed from: g */
    private String f26711g = "subject.png";

    /* renamed from: h */
    private String f26712h = "blur_mask.png";

    /* renamed from: i */
    private boolean f26713i = false;

    /* renamed from: j */
    private boolean f26714j = true;

    public Config(String str) {
        this.f26705a = str;
    }

    private Config() {
    }

    /* renamed from: a */
    public Config mo23454a(boolean z) {
        this.f26713i = z;
        return this;
    }

    /* renamed from: a */
    public String mo23453a() {
        return this.f26710f;
    }

    /* renamed from: b */
    public String mo23455b() {
        return this.f26707c;
    }

    /* renamed from: c */
    public String mo23456c() {
        return this.f26712h;
    }

    /* renamed from: d */
    public String mo23457d() {
        return this.f26705a;
    }

    /* renamed from: e */
    public String mo23458e() {
        return this.f26708d;
    }
}
