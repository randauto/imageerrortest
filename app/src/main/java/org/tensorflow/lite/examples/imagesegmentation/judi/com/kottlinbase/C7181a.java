package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase;

import com.google.firebase.remoteconfig.C6792a;
import judi.com.kottlinbase.quickads.C7204b;

/* renamed from: judi.com.kottlinbase.a */
/* compiled from: AppLockAdsId */
public class C7181a implements C7204b {
    /* renamed from: a */
    public String mo23107a() {
        return "ca-app-pub-7060911291785551~7084692728";
    }

    /* renamed from: i */
    public String mo23117i(int i) {
        return i == 1 ? "0662887421C968B7DD1EFAC82DDCB017" : "6bdb782b-35b8-4db3-a227-1deb40e0a84d";
    }

    /* renamed from: a */
    private String m38370a(int i, int i2) {
        String str = i == 1 ? "emoji_full_admod_layer_" : "emoji_full_fan_layer_";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    private String m38371b(int i, int i2) {
        String str = i == 1 ? "emoji_native_admod_layer_" : "emoji_native_fan_layer_";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: c */
    private String m38372c(int i, int i2) {
        String str = i == 1 ? "emoji_banner_admod_layer_" : "emoji_banner_fan_layer_";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public String mo23108a(int i) {
        return C6792a.m35902a().mo21365a(m38372c(i, 1));
    }

    /* renamed from: b */
    public String mo23110b(int i) {
        return C6792a.m35902a().mo21365a(m38372c(i, 2));
    }

    /* renamed from: c */
    public String mo23111c(int i) {
        return C6792a.m35902a().mo21365a(m38370a(i, 1));
    }

    /* renamed from: d */
    public String mo23112d(int i) {
        return C6792a.m35902a().mo21365a(m38370a(i, 2));
    }

    /* renamed from: e */
    public String mo23113e(int i) {
        return C6792a.m35902a().mo21365a(m38370a(i, 3));
    }

    /* renamed from: f */
    public String mo23114f(int i) {
        return C6792a.m35902a().mo21365a(m38370a(i, 4));
    }

    /* renamed from: g */
    public String mo23115g(int i) {
        return C6792a.m35902a().mo21365a(m38371b(i, 1));
    }

    /* renamed from: h */
    public String mo23116h(int i) {
        return C6792a.m35902a().mo21365a(m38371b(i, 2));
    }

    /* renamed from: b */
    public float mo23109b() {
        return (float) C6792a.m35902a().mo21370b("emoji_use_dialog_percent");
    }
}
