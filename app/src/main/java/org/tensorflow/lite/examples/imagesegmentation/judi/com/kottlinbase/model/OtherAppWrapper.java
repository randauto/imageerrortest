package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import java.util.ArrayList;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, mo10386c = {"Ljudi/com/kottlinbase/model/OtherAppWrapper;", "", "otherApp", "", "Ljudi/com/kottlinbase/model/OtherApp;", "(Ljava/util/List;)V", "getOtherApp", "()Ljava/util/List;", "setOtherApp", "app_release"})
/* compiled from: OtherAppWrapper.kt */
public final class OtherAppWrapper {
    private List<OtherApp> otherApp;

    public OtherAppWrapper() {
        this(null, 1, null);
    }

    public OtherAppWrapper(List<OtherApp> list) {
        C1489j.m6972b(list, "otherApp");
        this.otherApp = list;
    }

    public /* synthetic */ OtherAppWrapper(List list, int i, C1486g gVar) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        this(list);
    }

    public final List<OtherApp> getOtherApp() {
        return this.otherApp;
    }

    public final void setOtherApp(List<OtherApp> list) {
        C1489j.m6972b(list, "<set-?>");
        this.otherApp = list;
    }
}
