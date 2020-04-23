package org.tensorflow.lite.examples.imagesegmentation.judi.com.p271d;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Element;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: judi.com.d.a */
/* compiled from: BlurFilter */
public class C7176a extends C7177b {

    /* renamed from: d */
    private float f26278d = 15.0f;

    /* renamed from: a */
    public void mo23097a() {
    }

    /* renamed from: b */
    public void mo23099b() {
    }

    public C7176a(Context context, Bitmap bitmap, Bitmap bitmap2) {
        super(context, bitmap, bitmap2);
    }

    /* renamed from: a */
    public void mo23098a(float f) {
        this.f26278d = f;
    }

    /* renamed from: c */
    public void mo23100c() {
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(this.f26281c, Element.U8_4(this.f26281c));
        create.setRadius(this.f26278d);
        create.setInput(this.f26279a);
        create.forEach(this.f26280b);
    }
}
