package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import p073b.C3218m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&¨\u0006\u0019"}, mo10386c = {"Ljudi/com/kottlinbase/model/IEffect;", "", "blurLevel", "", "edgeFadding", "", "getAlphaEmoji", "getType", "gradientAngle", "saveBestConfig", "", "setAlphaEmoji", "alpha", "setBlurLevel", "level", "setEdgeFadding", "fade", "setFilterType", "type", "setGradientAngle", "angle", "setTextureType", "texture", "Ljudi/com/kottlinbase/model/ITexture;", "Companion", "app_release"})
/* compiled from: IEffect.kt */
public interface IEffect {
    public static final int BLUR_BOKEH = 2;
    public static final int BLUR_ONLY = 1;
    public static final int BLUR_OVER = 3;
    public static final int BOX_FILTER = 4;
    public static final Companion Companion = Companion.$$INSTANCE;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo10386c = {"Ljudi/com/kottlinbase/model/IEffect$Companion;", "", "()V", "BLUR_BOKEH", "", "BLUR_ONLY", "BLUR_OVER", "BOX_FILTER", "app_release"})
    /* compiled from: IEffect.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BLUR_BOKEH = 2;
        public static final int BLUR_ONLY = 1;
        public static final int BLUR_OVER = 3;
        public static final int BOX_FILTER = 4;

        private Companion() {
        }
    }

    float blurLevel();

    int edgeFadding();

    int getAlphaEmoji();

    int getType();

    int gradientAngle();

    void saveBestConfig();

    void setAlphaEmoji(int i);

    void setBlurLevel(float f);

    void setEdgeFadding(int i);

    void setFilterType(int i);

    void setGradientAngle(int i);

    void setTextureType(ITexture iTexture);

    ITexture texture();
}
