package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import p073b.C3218m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, mo10386c = {"Ljudi/com/kottlinbase/model/ITexture;", "", "getTextureType", "", "texturePath", "", "textureThumbnail", "Companion", "app_release"})
/* compiled from: ITexture.kt */
public interface ITexture {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int TYPE_DEFAULT = 2;
    public static final int TYPE_OVER = 1;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo10386c = {"Ljudi/com/kottlinbase/model/ITexture$Companion;", "", "()V", "TYPE_DEFAULT", "", "TYPE_OVER", "app_release"})
    /* compiled from: ITexture.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int TYPE_DEFAULT = 2;
        public static final int TYPE_OVER = 1;

        private Companion() {
        }
    }

    int getTextureType();

    String texturePath();

    String textureThumbnail();
}
