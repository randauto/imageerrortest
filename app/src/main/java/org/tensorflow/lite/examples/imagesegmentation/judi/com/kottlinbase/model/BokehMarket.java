package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, mo10386c = {"Ljudi/com/kottlinbase/model/BokehMarket;", "", "url", "", "thumbnailUrl", "name", "folder", "isUse", "", "minVersion", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getFolder", "()Ljava/lang/String;", "setFolder", "(Ljava/lang/String;)V", "()Z", "setUse", "(Z)V", "getMinVersion", "()I", "setMinVersion", "(I)V", "getName", "setName", "getThumbnailUrl", "setThumbnailUrl", "getUrl", "setUrl", "app_release"})
/* compiled from: BokehMarket.kt */
public final class BokehMarket {
    private String folder;
    private boolean isUse;
    private int minVersion;
    private String name;
    private String thumbnailUrl;
    private String url;

    public BokehMarket(String str, String str2, String str3, String str4, boolean z, int i) {
        C1489j.m6972b(str, "url");
        C1489j.m6972b(str2, "thumbnailUrl");
        C1489j.m6972b(str3, "name");
        C1489j.m6972b(str4, "folder");
        this.url = str;
        this.thumbnailUrl = str2;
        this.name = str3;
        this.folder = str4;
        this.isUse = z;
        this.minVersion = i;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.url = str;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final void setThumbnailUrl(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.thumbnailUrl = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.name = str;
    }

    public final String getFolder() {
        return this.folder;
    }

    public final void setFolder(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.folder = str;
    }

    public /* synthetic */ BokehMarket(String str, String str2, String str3, String str4, boolean z, int i, int i2, C1486g gVar) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = "";
        }
        this(str5, str6, str7, str4, (i2 & 16) != 0 ? false : z, i);
    }

    public final boolean isUse() {
        return this.isUse;
    }

    public final void setUse(boolean z) {
        this.isUse = z;
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    public final void setMinVersion(int i) {
        this.minVersion = i;
    }
}
