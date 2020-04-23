package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater.p277a;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p256e.p259c.C6982a;
import p256e.p259c.C6989c;
import p256e.p259c.C6992d;
import p256e.p259c.C7001k;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo10386c = {"Ljudi/com/kottlinbase/ui/creater/drawer/EmojiDrawer;", "Lprocessing/core/PApplet;", "emojiCode", "", "", "(Ljava/util/List;)V", "isSaveFrame", "", "minDist", "", "minMouseDist", "points", "Ljudi/com/kottlinbase/ui/creater/drawer/Emoji;", "savePath", "draw", "", "saveEmoji", "path", "settings", "setup", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.creater.a.b */
/* compiled from: EmojiDrawer.kt */
public final class C7284b extends C6982a {

    /* renamed from: ah */
    private final int f26514ah = 50;

    /* renamed from: ai */
    private final int f26515ai;

    /* renamed from: aj */
    private List<C7283a> f26516aj = new ArrayList();

    /* renamed from: ak */
    private List<String> f26517ak;

    /* renamed from: al */
    private boolean f26518al;

    /* renamed from: am */
    private String f26519am;

    public C7284b(List<String> list) {
        C1489j.m6972b(list, "emojiCode");
        this.f26517ak = list;
    }

    /* renamed from: a */
    public void mo21800a() {
        mo21804a(this.f24537i, this.f24538j, "processing.opengl.PGraphics2D");
    }

    /* renamed from: a */
    public final void mo23381a(String str) {
        C1489j.m6972b(str, "path");
        this.f26519am = str;
        this.f26518al = true;
    }

    /* renamed from: b */
    public void mo21825b() {
        int i = (this.f24537i * this.f24538j) / 14400;
        StringBuilder sb = new StringBuilder();
        sb.append(": ");
        sb.append(i);
        Log.d("ddddd", sb.toString());
        int c = C6982a.m36420c(30, i);
        if (1 <= c) {
            int i2 = 1;
            while (true) {
                C7001k kVar = new C7001k(mo21861h((float) this.f24537i), mo21861h((float) this.f24538j));
                float c2 = mo21836c(80.0f, 200.0f);
                String str = (String) this.f26517ak.get((int) mo21836c(0.0f, (float) (this.f26517ak.size() - 1)));
                int i3 = (int) c2;
                C6989c b = mo21823b(i3, i3);
                b.mo21999q(255);
                b.mo21926U();
                b.mo21707a(((float) b.f24750ce) * 0.4f);
                b.mo21971d(3, 3);
                b.mo21731d();
                b.mo21945a(str, c2 / 2.0f, c2 / ((float) 2));
                b.mo21734e();
                List<C7283a> list = this.f26516aj;
                C7001k a = kVar.mo22081a();
                C1489j.m6969a((Object) a, "v.copy()");
                list.add(new C7283a(kVar, a, c2, b));
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
        mo21838c(255);
        C7001k kVar = new C7001k((float) this.f24543o, (float) this.f24544p);
        int size = this.f26516aj.size();
        for (int i = 0; i < size; i++) {
            C7001k a = ((C7283a) this.f26516aj.get(i)).mo23377a();
            float c = ((C7283a) this.f26516aj.get(i)).mo23379c();
            if (a.mo22080a(kVar) < ((float) this.f26514ah)) {
                float b = C6982a.m36414b(a.f24839b - kVar.f24839b, a.f24838a - kVar.f24838a);
                a.f24838a = kVar.f24838a + (C6982a.m36423e(b) * ((float) this.f26514ah));
                a.f24839b = kVar.f24839b + (C6982a.m36421d(b) * ((float) this.f26514ah));
            }
            int size2 = this.f26516aj.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (i != i2) {
                    C7001k a2 = ((C7283a) this.f26516aj.get(i2)).mo23377a();
                    double c2 = ((double) (((C7283a) this.f26516aj.get(i2)).mo23379c() + c)) * 0.5d;
                    if (((double) a.mo22080a(a2)) < ((double) this.f26515ai) + c2) {
                        float b2 = C6982a.m36414b(a2.f24839b - a.f24839b, a2.f24838a - a.f24838a);
                        int i3 = (int) c2;
                        a2.f24838a = a.f24838a + (C6982a.m36423e(b2) * ((float) (this.f26515ai + i3 + 2)));
                        a2.f24839b = a.f24839b + (C6982a.m36421d(b2) * ((float) (this.f26515ai + i3 + 2)));
                    }
                }
            }
            float f = (float) 0;
            if (a.f24838a < f || a.f24838a > ((float) this.f24537i) || a.f24839b < f || a.f24839b > ((float) this.f24537i)) {
                a.f24838a = C6982a.m36419c(a.f24838a, 0.0f, (float) this.f24537i);
                a.f24839b = C6982a.m36419c(a.f24839b, 0.0f, (float) this.f24537i);
            }
            C7001k b3 = ((C7283a) this.f26516aj.get(i)).mo23378b();
            b3.f24838a += (a.f24838a - ((C7283a) this.f26516aj.get(i)).mo23378b().f24838a) * 0.09f;
            C7001k b4 = ((C7283a) this.f26516aj.get(i)).mo23378b();
            b4.f24839b += (a.f24839b - ((C7283a) this.f26516aj.get(i)).mo23378b().f24839b) * 0.09f;
        }
        int size3 = this.f26516aj.size();
        for (int i4 = 0; i4 < size3; i4++) {
            float f2 = (float) 2;
            mo21812a(((C7283a) this.f26516aj.get(i4)).mo23380d(), ((C7283a) this.f26516aj.get(i4)).mo23378b().f24838a - (((C7283a) this.f26516aj.get(i4)).mo23379c() / f2), ((C7283a) this.f26516aj.get(i4)).mo23378b().f24839b - (((C7283a) this.f26516aj.get(i4)).mo23379c() / f2), ((C7283a) this.f26516aj.get(i4)).mo23379c(), ((C7283a) this.f26516aj.get(i4)).mo23379c());
        }
        if (this.f26518al) {
            CharSequence charSequence = this.f26519am;
            if (!(charSequence == null || charSequence.length() == 0)) {
                C6989c b5 = mo21823b(this.f24537i, this.f24538j);
                b5.mo21731d();
                b5.mo21975e(0.0f, 0.0f);
                int size4 = this.f26516aj.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    float f3 = (float) 2;
                    b5.mo21940a((C6992d) ((C7283a) this.f26516aj.get(i5)).mo23380d(), ((C7283a) this.f26516aj.get(i5)).mo23378b().f24838a - (((C7283a) this.f26516aj.get(i5)).mo23379c() / f3), ((C7283a) this.f26516aj.get(i5)).mo23378b().f24839b - (((C7283a) this.f26516aj.get(i5)).mo23379c() / f3), ((C7283a) this.f26516aj.get(i5)).mo23379c(), ((C7283a) this.f26516aj.get(i5)).mo23379c());
                }
                b5.mo21734e();
                b5.mo21990h(this.f26519am);
                this.f26518al = false;
                this.f26519am = "";
            }
        }
    }
}
