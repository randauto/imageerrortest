package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.test;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import judi.com.kottlinbase.p274ui.creater.p277a.C7283a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p256e.p259c.C6982a;
import p256e.p259c.C6989c;
import p256e.p259c.C6992d;
import p256e.p259c.C7001k;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0002J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0004J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, mo10386c = {"Ljudi/com/kottlinbase/ui/test/BokehDrawer;", "Lprocessing/core/PApplet;", "emojiCode", "", "", "(Ljava/util/List;)V", "TAG", "bgImg", "Lprocessing/core/PImage;", "isSaveFrame", "", "minDist", "", "minMouseDist", "points", "Ljudi/com/kottlinbase/ui/creater/drawer/Emoji;", "savePath", "thr", "getThr", "()I", "setThr", "(I)V", "brightness", "x", "", "y", "colorAt", "draw", "", "grayLevel", "pix", "saveEmoji", "path", "settings", "setup", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.test.a */
/* compiled from: BokehDrawer.kt */
public final class C7355a extends C6982a {

    /* renamed from: ah */
    private final String f26684ah = "BokehDrawer";

    /* renamed from: ai */
    private final int f26685ai = 100;

    /* renamed from: aj */
    private final int f26686aj;

    /* renamed from: ak */
    private int f26687ak = 100;

    /* renamed from: al */
    private List<C7283a> f26688al = new ArrayList();

    /* renamed from: am */
    private List<String> f26689am;

    /* renamed from: an */
    private boolean f26690an;

    /* renamed from: ao */
    private String f26691ao;

    /* renamed from: ap */
    private C6992d f26692ap;

    /* renamed from: a */
    public final void mo23440a(int i) {
        this.f26687ak = i;
    }

    public C7355a(List<String> list) {
        C1489j.m6972b(list, "emojiCode");
        this.f26689am = list;
    }

    /* renamed from: a */
    public void mo21800a() {
        mo21804a(this.f24537i, this.f24538j, "processing.opengl.PGraphics2D");
    }

    /* renamed from: a */
    public final void mo23441a(String str) {
        C1489j.m6972b(str, "path");
        this.f26691ao = str;
        this.f26690an = true;
    }

    /* renamed from: d */
    private final int m39083d(float f, float f2) {
        float f3 = (float) 0;
        if (f >= f3) {
            C6992d dVar = this.f26692ap;
            if (dVar == null) {
                C1489j.m6968a();
            }
            if (f <= ((float) dVar.f24750ce) && f2 >= f3) {
                C6992d dVar2 = this.f26692ap;
                if (dVar2 == null) {
                    C1489j.m6968a();
                }
                if (f2 <= ((float) dVar2.f24751cf)) {
                    C6992d dVar3 = this.f26692ap;
                    if (dVar3 == null) {
                        C1489j.m6968a();
                    }
                    return dVar3.mo21722b((int) f, (int) f2);
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    private final int m39085g(int i) {
        return (int) ((mo21843d(i) * 0.2126f) + (mo21848e(i) * 0.7152f) + (mo21854f(i) * 0.0722f));
    }

    /* renamed from: e */
    private final int m39084e(float f, float f2) {
        float f3 = (float) 0;
        if (f >= f3) {
            C6992d dVar = this.f26692ap;
            if (dVar == null) {
                C1489j.m6968a();
            }
            if (f <= ((float) dVar.f24750ce) && f2 >= f3) {
                C6992d dVar2 = this.f26692ap;
                if (dVar2 == null) {
                    C1489j.m6968a();
                }
                if (f2 <= ((float) dVar2.f24751cf)) {
                    C6992d dVar3 = this.f26692ap;
                    if (dVar3 == null) {
                        C1489j.m6968a();
                    }
                    int b = dVar3.mo21722b((int) f, (int) f2);
                    return (int) ((mo21843d(b) * 0.2126f) + (mo21848e(b) * 0.7152f) + (mo21854f(b) * 0.0722f));
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public void mo21825b() {
        this.f26692ap = mo21844d("/sdcard/DCIM/detector/test/blur_mask_max.png");
        C1489j.m6969a((Object) mo21844d("/sdcard/DCIM/detector/test/tex_blur_2.png"), "loadImage(\"/sdcard/DCIM/…tor/test/tex_blur_2.png\")");
        StringBuilder sb = new StringBuilder();
        sb.append(": ");
        sb.append(this.f24537i);
        sb.append("/");
        sb.append(this.f24538j);
        Log.d("size", sb.toString());
        int i = (this.f24537i * this.f24538j) / 14400;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(": ");
        sb2.append(i);
        Log.d("ddddd", sb2.toString());
        int c = C6982a.m36420c(300, i);
        if (1 <= c) {
            int i2 = 1;
            while (true) {
                C7001k kVar = new C7001k(mo21861h((float) this.f24537i), mo21861h((float) this.f24538j));
                float c2 = mo21836c(50.0f, 60.0f);
                String str = (String) this.f26689am.get((int) mo21836c(0.0f, (float) (this.f26689am.size() - 1)));
                int i3 = (int) c2;
                C6989c b = mo21823b(i3, i3);
                b.mo21731d();
                b.mo21707a(((float) b.f24750ce) * 0.4f);
                b.mo21971d(3, 3);
                b.mo21999q(mo21849e(255, (int) mo21836c(100.0f, 200.0f)));
                b.mo21926U();
                float f = c2 / ((float) 2);
                b.mo21981f(f, f, c2, c2);
                b.mo21734e();
                List<C7283a> list = this.f26688al;
                C7001k a = kVar.mo22081a();
                C1489j.m6969a((Object) a, "v.copy()");
                list.add(new C7283a(kVar, a, c2, null));
                if (i2 != c) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo21837c() {
        mo21838c(0);
        C6992d dVar = this.f26692ap;
        if (dVar == null) {
            C1489j.m6968a();
        }
        mo21812a(dVar, 0.0f, 0.0f, (float) this.f24537i, (float) this.f24538j);
        String str = this.f26684ah;
        StringBuilder sb = new StringBuilder();
        sb.append("brightness >> ");
        sb.append(m39084e((float) this.f24543o, (float) this.f24544p));
        Log.d(str, sb.toString());
        C7001k kVar = new C7001k((float) this.f24543o, (float) this.f24544p);
        int size = this.f26688al.size();
        for (int i = 0; i < size; i++) {
            C7001k a = ((C7283a) this.f26688al.get(i)).mo23377a();
            float c = ((C7283a) this.f26688al.get(i)).mo23379c();
            if (a.mo22080a(kVar) < ((float) this.f26685ai)) {
                float b = C6982a.m36414b(a.f24839b - kVar.f24839b, a.f24838a - kVar.f24838a);
                a.f24838a = kVar.f24838a + (C6982a.m36423e(b) * ((float) this.f26685ai));
                a.f24839b = kVar.f24839b + (C6982a.m36421d(b) * ((float) this.f26685ai));
            }
            int size2 = this.f26688al.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (i != i2) {
                    C7001k a2 = ((C7283a) this.f26688al.get(i2)).mo23377a();
                    double c2 = ((double) (((C7283a) this.f26688al.get(i2)).mo23379c() + c)) * 0.2d;
                    if (m39084e(a2.f24838a, a2.f24839b) < this.f26687ak || ((double) a.mo22080a(a2)) < c2) {
                        float b2 = C6982a.m36414b(a2.f24839b - a.f24839b, a2.f24838a - a.f24838a);
                        int i3 = (int) c2;
                        a2.f24838a = a.f24838a + (C6982a.m36423e(b2) * ((float) (this.f26686aj + i3 + 2)));
                        a2.f24839b = a.f24839b + (C6982a.m36421d(b2) * ((float) (this.f26686aj + i3 + 2)));
                    }
                }
            }
            float f = (float) 0;
            if (a.f24838a < f || a.f24838a > ((float) this.f24537i) || a.f24839b < f || a.f24839b > ((float) this.f24537i)) {
                a.f24838a = C6982a.m36419c(a.f24838a, 0.0f, (float) this.f24537i);
                a.f24839b = C6982a.m36419c(a.f24839b, 0.0f, (float) this.f24538j);
            }
            C7001k b3 = ((C7283a) this.f26688al.get(i)).mo23378b();
            b3.f24838a += (a.f24838a - ((C7283a) this.f26688al.get(i)).mo23378b().f24838a) * 0.09f;
            C7001k b4 = ((C7283a) this.f26688al.get(i)).mo23378b();
            b4.f24839b += (a.f24839b - ((C7283a) this.f26688al.get(i)).mo23378b().f24839b) * 0.09f;
        }
        int size3 = this.f26688al.size();
        for (int i4 = 0; i4 < size3; i4++) {
            float f2 = (float) 2;
            float c3 = ((C7283a) this.f26688al.get(i4)).mo23378b().f24838a - (((C7283a) this.f26688al.get(i4)).mo23379c() / f2);
            float c4 = ((C7283a) this.f26688al.get(i4)).mo23378b().f24839b - (((C7283a) this.f26688al.get(i4)).mo23379c() / f2);
            m39083d(c3, c4);
            mo21797V();
            mo21801a(m39083d(c3, c4), 100.0f);
            mo21826b(c3, c4, ((C7283a) this.f26688al.get(i4)).mo23379c(), ((C7283a) this.f26688al.get(i4)).mo23379c());
        }
        if (this.f26690an) {
            CharSequence charSequence = this.f26691ao;
            if (!(charSequence == null || charSequence.length() == 0)) {
                C6989c b5 = mo21823b(this.f24537i, this.f24538j);
                b5.mo21731d();
                b5.mo21999q(mo21849e(255, 20));
                int size4 = this.f26688al.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    float f3 = (float) 2;
                    float c5 = ((C7283a) this.f26688al.get(i5)).mo23378b().f24838a - (((C7283a) this.f26688al.get(i5)).mo23379c() / f3);
                    float c6 = ((C7283a) this.f26688al.get(i5)).mo23378b().f24839b - (((C7283a) this.f26688al.get(i5)).mo23379c() / f3);
                    int d = m39083d(c5, c6);
                    b5.mo21935a(d, (float) m39085g(d));
                    b5.mo21926U();
                    b5.mo21981f(c5, c6, ((C7283a) this.f26688al.get(i5)).mo23379c(), ((C7283a) this.f26688al.get(i5)).mo23379c());
                }
                b5.mo21734e();
                mo21842c(this.f26691ao);
                this.f26690an = false;
                this.f26691ao = "";
            }
        }
    }
}
