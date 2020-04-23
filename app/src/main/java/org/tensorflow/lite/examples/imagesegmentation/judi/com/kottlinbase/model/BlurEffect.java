package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import com.p148a.C3284d;
import com.p148a.p149a.C3267b;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016R\u0012\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, mo10386c = {"Ljudi/com/kottlinbase/model/BlurEffect;", "Ljudi/com/kottlinbase/model/IEffect;", "Lcom/orm/SugarRecord;", "blur", "", "texture", "Ljudi/com/kottlinbase/model/ITexture;", "fadding", "", "angle", "filterType", "alpha", "(FLjudi/com/kottlinbase/model/ITexture;IIII)V", "blurLevel", "edgeFadding", "getAlphaEmoji", "getType", "gradientAngle", "save", "", "saveBestConfig", "", "setAlphaEmoji", "setBlurLevel", "level", "setEdgeFadding", "fade", "setFilterType", "type", "setGradientAngle", "setTextureType", "Companion", "app_release"})
/* compiled from: BlurEffect.kt */
public class BlurEffect extends C3284d implements IEffect {
    public static final Companion Companion = new Companion(null);
    @C3267b
    private int alpha;
    private int angle;
    private float blur;
    private int fadding;
    @C3267b
    private int filterType;
    private ITexture texture;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo10386c = {"Ljudi/com/kottlinbase/model/BlurEffect$Companion;", "", "()V", "bestEffect", "Ljudi/com/kottlinbase/model/IEffect;", "app_release"})
    /* compiled from: BlurEffect.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C1486g gVar) {
            this();
        }

        public final IEffect bestEffect() {
            List listAll = C3284d.listAll(BlurEffect.class);
            if (!listAll.isEmpty()) {
                Object obj = listAll.get(0);
                C1489j.m6969a(obj, "findAll[0]");
                return (IEffect) obj;
            }
            BlurEffect blurEffect = new BlurEffect(0.0f, null, 0, 0, 0, 0, 63, null);
            return blurEffect;
        }
    }

    public BlurEffect() {
        this(0.0f, null, 0, 0, 0, 0, 63, null);
    }

    public /* synthetic */ BlurEffect(float f, ITexture iTexture, int i, int i2, int i3, int i4, int i5, C1486g gVar) {
        if ((i5 & 1) != 0) {
            f = 15.0f;
        }
        if ((i5 & 2) != 0) {
            iTexture = null;
        }
        ITexture iTexture2 = iTexture;
        this(f, iTexture2, (i5 & 4) != 0 ? 2 : i, (i5 & 8) != 0 ? 180 : i2, (i5 & 16) != 0 ? 1 : i3, (i5 & 32) != 0 ? 100 : i4);
    }

    public BlurEffect(float f, ITexture iTexture, int i, int i2, int i3, int i4) {
        this.blur = f;
        this.texture = iTexture;
        this.fadding = i;
        this.angle = i2;
        this.filterType = i3;
        this.alpha = i4;
    }

    public void setAlphaEmoji(int i) {
        this.alpha = i;
    }

    public int getAlphaEmoji() {
        return this.alpha;
    }

    public void setEdgeFadding(int i) {
        this.fadding = i;
    }

    public void setGradientAngle(int i) {
        this.angle = i;
    }

    public int edgeFadding() {
        return this.fadding;
    }

    public int gradientAngle() {
        return this.angle;
    }

    public void setBlurLevel(float f) {
        this.blur = f;
    }

    public void setTextureType(ITexture iTexture) {
        C1489j.m6972b(iTexture, "texture");
        this.texture = iTexture;
    }

    public ITexture texture() {
        return this.texture;
    }

    public int getType() {
        return this.filterType;
    }

    public float blurLevel() {
        return this.blur;
    }

    public void saveBestConfig() {
        save();
    }

    public void setFilterType(int i) {
        this.filterType = i;
    }

    public long save() {
        List listAll = C3284d.listAll(BlurEffect.class);
        if (!listAll.isEmpty()) {
            Object obj = listAll.get(0);
            C1489j.m6969a(obj, "findAll[0]");
            setId(((BlurEffect) obj).getId());
        }
        return super.save();
    }
}
