package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.load.p164b.C3529j;
import com.bumptech.glide.p156f.C3369h;
import com.judi.emojiphoto.R;
import java.io.File;
import judi.com.kottlinbase.model.IEffect;
import judi.com.kottlinbase.model.ITexture;
import judi.com.p271d.C7176a;
import judi.com.p271d.C7179d;
import judi.com.service.C7363a;
import judi.com.service.C7370d;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fJ\u001e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fJ\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\nH\u0002J(\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002J0\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001bH\u0002J \u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001bH\u0002J(\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0002J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J \u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0002J\u0018\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020!H\u0002J \u0010/\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0002J \u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u00061"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/Blurry;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "applyBokeh", "", "inputBitmap", "Landroid/graphics/Bitmap;", "outBitmap", "texture", "Ljudi/com/kottlinbase/model/ITexture;", "applyFilter", "", "config", "Ljudi/com/service/Config;", "blur", "Ljudi/com/kottlinbase/model/IEffect;", "path", "applyFilterV2", "applyOverTexture", "compress", "layer1", "layer2", "alpha", "", "createBackground", "type", "src", "doRadialBlur", "centerX", "", "centerY", "factor", "times", "dx", "dy", "getBitmap", "inputGuss", "blurLevel", "input", "output", "mappingBlurLevel", "blurType", "level", "maskGuss", "test", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.b */
/* compiled from: Blurry.kt */
public final class C7249b {

    /* renamed from: a */
    private final Context f26429a;

    public C7249b(Context context) {
        C1489j.m6972b(context, "context");
        this.f26429a = context;
    }

    /* renamed from: a */
    public final String mo23333a(C7363a aVar, IEffect iEffect, String str) {
        C1489j.m6972b(aVar, "config");
        C1489j.m6972b(iEffect, "blur");
        C1489j.m6972b(str, "path");
        File file = new File(aVar.mo23457d(), aVar.mo23456c());
        Bitmap decodeFile = BitmapFactory.decodeFile(new File(aVar.mo23457d(), aVar.mo23453a()).getPath());
        if (decodeFile == null) {
            return "";
        }
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Config.ARGB_8888);
        C7176a aVar2 = new C7176a(this.f26429a, decodeFile, createBitmap);
        aVar2.mo23098a(iEffect.blurLevel());
        aVar2.mo23103e();
        aVar2.mo23101a(createBitmap);
        aVar2.mo23102d();
        decodeFile.recycle();
        C1489j.m6969a((Object) createBitmap, "resultBitmap");
        m38699a(createBitmap, createBitmap, iEffect.texture());
        C7370d.m39133a(this.f26429a, new File(aVar.mo23457d()), createBitmap, aVar.mo23456c());
        String path = file.getPath();
        C1489j.m6969a((Object) path, "blurMaskFile.path");
        return path;
    }

    /* renamed from: a */
    private final void m38699a(Bitmap bitmap, Bitmap bitmap2, ITexture iTexture) {
        Bitmap bitmap3;
        if (iTexture == null) {
            bitmap3 = (Bitmap) C3303c.m15109b(this.f26429a).mo10845f().mo10830a(Integer.valueOf(R.drawable.default_emoji)).mo10667b(((C3369h) ((C3369h) C3369h.m15420b().mo10666b(bitmap.getWidth(), bitmap.getHeight())).mo10656a(C3529j.f9432b)).mo10669b(true)).mo10833b().get();
        } else {
            bitmap3 = (Bitmap) C3303c.m15109b(this.f26429a).mo10845f().mo10832a(iTexture.texturePath()).mo10667b(((C3369h) ((C3369h) C3369h.m15420b().mo10666b(bitmap.getWidth(), bitmap.getHeight())).mo10656a(C3529j.f9432b)).mo10669b(true)).mo10833b().get();
        }
        C7179d dVar = new C7179d(this.f26429a, bitmap, bitmap2, bitmap3);
        dVar.mo23104a(5);
        dVar.mo23103e();
        dVar.mo23101a(bitmap2);
        dVar.mo23102d();
    }

    /* renamed from: a */
    public final Bitmap mo23332a(Bitmap bitmap, Bitmap bitmap2, int i) {
        C1489j.m6972b(bitmap, "layer1");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        if (bitmap2 != null) {
            Paint paint = new Paint();
            paint.setAlpha((i * 255) / 100);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
        }
        C1489j.m6969a((Object) createBitmap, "result");
        return createBitmap;
    }
}
