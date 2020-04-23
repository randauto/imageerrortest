package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater.p277a;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p256e.p259c.C6989c;
import p256e.p259c.C7001k;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, mo10386c = {"Ljudi/com/kottlinbase/ui/creater/drawer/Emoji;", "", "dest", "Lprocessing/core/PVector;", "pos", "size", "", "texture", "Lprocessing/core/PGraphics;", "(Lprocessing/core/PVector;Lprocessing/core/PVector;FLprocessing/core/PGraphics;)V", "getDest", "()Lprocessing/core/PVector;", "setDest", "(Lprocessing/core/PVector;)V", "getPos", "setPos", "getSize", "()F", "setSize", "(F)V", "getTexture", "()Lprocessing/core/PGraphics;", "setTexture", "(Lprocessing/core/PGraphics;)V", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.creater.a.a */
/* compiled from: Emoji.kt */
public final class C7283a {

    /* renamed from: a */
    private C7001k f26510a;

    /* renamed from: b */
    private C7001k f26511b;

    /* renamed from: c */
    private float f26512c;

    /* renamed from: d */
    private C6989c f26513d;

    public C7283a() {
        this(null, null, 0.0f, null, 15, null);
    }

    public C7283a(C7001k kVar, C7001k kVar2, float f, C6989c cVar) {
        C1489j.m6972b(kVar, "dest");
        C1489j.m6972b(kVar2, "pos");
        this.f26510a = kVar;
        this.f26511b = kVar2;
        this.f26512c = f;
        this.f26513d = cVar;
    }

    public /* synthetic */ C7283a(C7001k kVar, C7001k kVar2, float f, C6989c cVar, int i, C1486g gVar) {
        if ((i & 1) != 0) {
            kVar = new C7001k();
        }
        if ((i & 2) != 0) {
            kVar2 = new C7001k();
        }
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            cVar = null;
        }
        this(kVar, kVar2, f, cVar);
    }

    /* renamed from: a */
    public final C7001k mo23377a() {
        return this.f26510a;
    }

    /* renamed from: b */
    public final C7001k mo23378b() {
        return this.f26511b;
    }

    /* renamed from: c */
    public final float mo23379c() {
        return this.f26512c;
    }

    /* renamed from: d */
    public final C6989c mo23380d() {
        return this.f26513d;
    }
}
