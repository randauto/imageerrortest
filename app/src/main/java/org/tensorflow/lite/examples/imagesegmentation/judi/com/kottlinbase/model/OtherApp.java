package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/model/OtherApp;", "", "title", "", "packageName", "thumb", "appContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppContent", "()Ljava/lang/String;", "setAppContent", "(Ljava/lang/String;)V", "getPackageName", "setPackageName", "getThumb", "setThumb", "getTitle", "setTitle", "app_release"})
/* compiled from: OtherApp.kt */
public final class OtherApp {
    private String appContent;
    private String packageName;
    private String thumb;
    private String title;

    public OtherApp() {
        this(null, null, null, null, 15, null);
    }

    public OtherApp(String str, String str2, String str3, String str4) {
        C1489j.m6972b(str, "title");
        C1489j.m6972b(str2, "packageName");
        C1489j.m6972b(str3, "thumb");
        C1489j.m6972b(str4, "appContent");
        this.title = str;
        this.packageName = str2;
        this.thumb = str3;
        this.appContent = str4;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.title = str;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final void setPackageName(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.packageName = str;
    }

    public final String getThumb() {
        return this.thumb;
    }

    public final void setThumb(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.thumb = str;
    }

    public /* synthetic */ OtherApp(String str, String str2, String str3, String str4, int i, C1486g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        this(str, str2, str3, str4);
    }

    public final String getAppContent() {
        return this.appContent;
    }

    public final void setAppContent(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.appContent = str;
    }
}
