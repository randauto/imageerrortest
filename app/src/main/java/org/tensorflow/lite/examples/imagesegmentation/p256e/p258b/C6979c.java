package p256e.p258b;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.support.p053v4.app.C0647g;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import p256e.p259c.C6982a;

/* renamed from: e.b.c */
/* compiled from: PFragment */
public class C6979c extends C0647g implements C6977a {

    /* renamed from: a */
    private DisplayMetrics f24488a;

    /* renamed from: b */
    private Point f24489b;

    /* renamed from: c */
    private C6982a f24490c;

    /* renamed from: d */
    private int f24491d = -1;

    /* renamed from: M_ */
    public void mo21762M_() {
    }

    /* renamed from: e */
    public int mo21767e() {
        return 0;
    }

    /* renamed from: f */
    public boolean mo21768f() {
        return false;
    }

    /* renamed from: i */
    public C6981e mo21769i() {
        return null;
    }

    /* renamed from: l */
    public void mo21771l() {
    }

    public C6979c() {
    }

    public C6979c(C6982a aVar) {
        mo21772a(aVar);
    }

    /* renamed from: L_ */
    public void mo21761L_() {
        this.f24488a = new DisplayMetrics();
        this.f24489b = new Point();
        C6978b.m36371a(mo2120o().getWindowManager().getDefaultDisplay(), this.f24488a, this.f24489b);
    }

    /* renamed from: b */
    public int mo21764b() {
        return this.f24489b.x;
    }

    /* renamed from: c */
    public int mo2013c() {
        return this.f24489b.y;
    }

    /* renamed from: d */
    public float mo21766d() {
        return this.f24488a.density;
    }

    /* renamed from: a */
    public void mo21772a(C6982a aVar) {
        this.f24490c = aVar;
        if (this.f24491d != -1) {
            aVar.f24531c = this.f24491d;
        }
    }

    /* renamed from: a */
    public View mo2052a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f24490c == null) {
            return null;
        }
        this.f24490c.mo21809a(layoutInflater, viewGroup, bundle, (C6977a) this, (SurfaceHolder) null);
        this.f24490c.mo21806a(bundle);
        return this.f24490c.mo21845d().mo22066g();
    }

    /* renamed from: g */
    public void mo2019g() {
        super.mo2019g();
        if (this.f24490c != null) {
            this.f24490c.mo21867i();
        }
    }

    /* renamed from: B */
    public void mo2024B() {
        super.mo2024B();
        if (this.f24490c != null) {
            this.f24490c.mo21859g();
        }
    }

    /* renamed from: C */
    public void mo2025C() {
        super.mo2025C();
        if (this.f24490c != null) {
            this.f24490c.mo21863h();
        }
    }

    /* renamed from: h */
    public void mo2020h() {
        super.mo2020h();
        if (this.f24490c != null) {
            this.f24490c.mo21868j();
        }
    }

    /* renamed from: D */
    public void mo2026D() {
        super.mo2026D();
        if (this.f24490c != null) {
            this.f24490c.mo21869k();
        }
    }

    /* renamed from: a */
    public void mo2055a(int i, int i2, Intent intent) {
        if (this.f24490c != null) {
            this.f24490c.mo21803a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo2070a(Menu menu, MenuInflater menuInflater) {
        if (this.f24490c != null) {
            this.f24490c.mo21810a(menu, menuInflater);
        }
    }

    /* renamed from: a */
    public boolean mo2073a(MenuItem menuItem) {
        if (this.f24490c != null) {
            return this.f24490c.mo21820a(menuItem);
        }
        return super.mo2073a(menuItem);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (this.f24490c != null) {
            this.f24490c.mo21807a(contextMenu, view, contextMenuInfo);
        }
    }

    /* renamed from: b */
    public boolean mo2091b(MenuItem menuItem) {
        if (this.f24490c != null) {
            return this.f24490c.mo21835b(menuItem);
        }
        return super.mo2091b(menuItem);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: k */
    public boolean mo21770k() {
        return this.f24490c != null && this.f24490c.mo21777B();
    }
}
