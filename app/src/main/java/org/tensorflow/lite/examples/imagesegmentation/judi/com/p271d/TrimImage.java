package org.tensorflow.lite.examples.imagesegmentation.judi.com.p271d;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;

import org.tensorflow.lite.examples.imagesegmentation.judi.com.p270c.ScriptC_TrimWithMask;

/* renamed from: judi.com.d.e */
/* compiled from: TrimImage */
public class TrimImage extends C7177b {

    /* renamed from: d */
    private Allocation f26284d;

    /* renamed from: a */
    public void mo23097a() {
    }

    /* renamed from: b */
    public void mo23099b() {
    }

    public TrimImage(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        super(context, bitmap2, bitmap3);
        this.f26284d = Allocation.createFromBitmap(this.f26281c, bitmap);
    }

    /* renamed from: c */
    public void mo23100c() {
        ScriptC_TrimWithMask cVar = new ScriptC_TrimWithMask(this.f26281c);
        cVar.mo23094a(this.f26284d);
        cVar.mo23095a(this.f26279a, this.f26280b);
    }

    /* renamed from: d */
    public void mo23102d() {
        this.f26284d.destroy();
        super.mo23102d();
    }
}
