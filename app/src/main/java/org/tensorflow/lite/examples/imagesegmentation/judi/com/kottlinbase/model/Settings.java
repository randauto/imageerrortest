package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.model;

import com.p148a.C3284d;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/model/Settings;", "Lcom/orm/SugarRecord;", "defaultBokeh", "", "(Ljava/lang/String;)V", "getDefaultBokeh", "()Ljava/lang/String;", "setDefaultBokeh", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "app_release"})
/* compiled from: Settings.kt */
public final class Settings extends C3284d {
    public static final Companion Companion = new Companion(null);
    private String defaultBokeh;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo10386c = {"Ljudi/com/kottlinbase/model/Settings$Companion;", "", "()V", "changeDefaultBokeh", "", "bokeh", "", "settings", "Ljudi/com/kottlinbase/model/Settings;", "app_release"})
    /* compiled from: Settings.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C1486g gVar) {
            this();
        }

        public final void changeDefaultBokeh(String str) {
            C1489j.m6972b(str, "bokeh");
            Settings settings = settings();
            settings.setDefaultBokeh(str);
            settings.save();
        }

        public final Settings settings() {
            List listAll = C3284d.listAll(Settings.class);
            if (listAll == null || listAll.isEmpty()) {
                Settings settings = new Settings(null, 1, null);
                settings.setDefaultBokeh("Creator");
                settings.setId(Long.valueOf(settings.save()));
                return settings;
            }
            Object obj = listAll.get(0);
            C1489j.m6969a(obj, "listAll[0]");
            return (Settings) obj;
        }
    }

    public Settings() {
        this(null, 1, null);
    }

    public static /* synthetic */ Settings copy$default(Settings settings, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settings.defaultBokeh;
        }
        return settings.copy(str);
    }

    public final String component1() {
        return this.defaultBokeh;
    }

    public final Settings copy(String str) {
        C1489j.m6972b(str, "defaultBokeh");
        return new Settings(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r1.defaultBokeh, (java.lang.Object) ((judi.com.kottlinbase.model.Settings) r2).defaultBokeh) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof judi.com.kottlinbase.model.Settings
            if (r0 == 0) goto L_0x0013
            judi.com.kottlinbase.model.Settings r2 = (judi.com.kottlinbase.model.Settings) r2
            java.lang.String r0 = r1.defaultBokeh
            java.lang.String r2 = r2.defaultBokeh
            boolean r2 = p073b.p079e.p081b.C1489j.m6971a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: judi.com.kottlinbase.model.Settings.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.defaultBokeh;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Settings(defaultBokeh=");
        sb.append(this.defaultBokeh);
        sb.append(")");
        return sb.toString();
    }

    public Settings(String str) {
        C1489j.m6972b(str, "defaultBokeh");
        this.defaultBokeh = str;
    }

    public /* synthetic */ Settings(String str, int i, C1486g gVar) {
        if ((i & 1) != 0) {
            str = "Creator";
        }
        this(str);
    }

    public final String getDefaultBokeh() {
        return this.defaultBokeh;
    }

    public final void setDefaultBokeh(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.defaultBokeh = str;
    }
}
