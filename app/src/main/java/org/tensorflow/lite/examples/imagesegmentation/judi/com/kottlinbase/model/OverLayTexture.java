package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, mo10386c = {"Ljudi/com/kottlinbase/model/OverLayTexture;", "Ljudi/com/kottlinbase/model/ITexture;", "path", "", "(Ljava/lang/String;)V", "getTextureType", "", "texturePath", "textureThumbnail", "app_release"})
/* compiled from: OverLayTexture.kt */
public final class OverLayTexture implements ITexture {
    private String path;

    public int getTextureType() {
        return 1;
    }

    public OverLayTexture(String str) {
        C1489j.m6972b(str, "path");
        this.path = str;
    }

    public String textureThumbnail() {
        return this.path;
    }

    public String texturePath() {
        return this.path;
    }
}
