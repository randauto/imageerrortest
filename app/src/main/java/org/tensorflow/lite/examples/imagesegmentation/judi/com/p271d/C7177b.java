package org.tensorflow.lite.examples.imagesegmentation.judi.com.p271d;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.support.p072v8.renderscript.Allocation;
import android.support.p072v8.renderscript.RenderScript;

/* renamed from: judi.com.d.b */
/* compiled from: ImageTools */
public abstract class C7177b {

    /* renamed from: a */
    Allocation f26279a;

    /* renamed from: b */
    Allocation f26280b;

    /* renamed from: c */
    RenderScript f26281c;

    /* renamed from: a */
    public abstract void mo23097a();

    /* renamed from: b */
    public abstract void mo23099b();

    /* renamed from: c */
    public abstract void mo23100c();

    public C7177b(Context context, Bitmap bitmap, Bitmap bitmap2) {
        this.f26281c = RenderScript.create(context);
        this.f26279a = Allocation.createFromBitmap(this.f26281c, bitmap);
        this.f26280b = Allocation.createFromBitmap(this.f26281c, bitmap2);
    }

    /* renamed from: d */
    public void mo23102d() {
        this.f26279a.destroy();
        this.f26280b.destroy();
    }

    /* renamed from: a */
    public void mo23101a(Bitmap bitmap) {
        this.f26280b.copyTo(bitmap);
    }

    /* renamed from: e */
    public void mo23103e() {
        mo23097a();
        mo23100c();
        mo23099b();
    }
}
