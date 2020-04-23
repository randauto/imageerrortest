package org.tensorflow.lite.examples.imagesegmentation.judi.com.p271d;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.ScriptIntrinsicBlend;

/* renamed from: judi.com.d.d */
/* compiled from: MixTools */
public class C7179d extends C7177b {

    /* renamed from: d */
    private Allocation f26282d;

    /* renamed from: e */
    private int f26283e = 1;

    /* renamed from: a */
    public void mo23097a() {
    }

    /* renamed from: b */
    public void mo23099b() {
    }

    public C7179d(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        super(context, bitmap, bitmap2);
        this.f26282d = Allocation.createFromBitmap(this.f26281c, bitmap3);
    }

    /* renamed from: a */
    public void mo23104a(int i) {
        this.f26283e = i;
    }

    /* renamed from: c */
    public void mo23100c() {
        ScriptIntrinsicBlend create = ScriptIntrinsicBlend.create(this.f26281c, Element.U8_4(this.f26281c));
        create.forEachDstAtop(this.f26279a, this.f26282d);
        switch (this.f26283e) {
            case 2:
                create.forEachDstIn(this.f26279a, this.f26282d);
                return;
            case 3:
                create.forEachDstOut(this.f26279a, this.f26282d);
                return;
            case 4:
                create.forEachSrcOut(this.f26279a, this.f26282d);
                return;
            case 5:
                create.forEachDstAtop(this.f26279a, this.f26282d);
                return;
            default:
                create.forEachDstOver(this.f26279a, this.f26282d);
                return;
        }
    }

    /* renamed from: a */
    public void mo23101a(Bitmap bitmap) {
        this.f26282d.copyTo(bitmap);
    }

    /* renamed from: d */
    public void mo23102d() {
        this.f26282d.destroy();
        super.mo23102d();
    }
}
