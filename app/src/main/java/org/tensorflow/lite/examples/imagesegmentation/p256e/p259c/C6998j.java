package p256e.p259c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.service.wallpaper.WallpaperService;
import android.support.p053v4.app.C0625a;
import android.support.p053v4.p057c.C0723e;
import android.support.wearable.watchface.WatchFaceService;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p256e.p258b.C6977a;
import p256e.p258b.C6980d;
import p256e.p258b.C6981e;

/* renamed from: e.c.j */
/* compiled from: PSurfaceNone */
public class C6998j implements C6997i {
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public C6982a f24820a;

    /* renamed from: b */
    protected C6989c f24821b;

    /* renamed from: c */
    protected C6977a f24822c;

    /* renamed from: d */
    protected Activity f24823d;
    /* access modifiers changed from: protected */

    /* renamed from: e */
    public boolean f24824e;

    /* renamed from: f */
    protected SurfaceView f24825f;

    /* renamed from: g */
    protected View f24826g;

    /* renamed from: h */
    protected WallpaperService f24827h;

    /* renamed from: i */
    protected WatchFaceService f24828i;
    /* access modifiers changed from: protected */

    /* renamed from: j */
    public boolean f24829j = false;

    /* renamed from: k */
    protected Thread f24830k;

    /* renamed from: l */
    protected boolean f24831l;

    /* renamed from: m */
    protected Object f24832m = new Object();

    /* renamed from: n */
    protected float f24833n = 60.0f;

    /* renamed from: o */
    protected long f24834o = 16666666;

    /* renamed from: e.c.j$a */
    /* compiled from: PSurfaceNone */
    public class C7000a extends Thread {
        public C7000a() {
            super("Animation Thread");
        }

        public void run() {
            long nanoTime = System.nanoTime();
            if (C6998j.this.f24820a != null) {
                C6998j.this.f24820a.mo21877s();
                long j = 0;
                int i = 0;
                while (Thread.currentThread() == C6998j.this.f24830k && C6998j.this.f24820a != null && !C6998j.this.f24820a.f24515R && !Thread.currentThread().isInterrupted()) {
                    try {
                        C6998j.this.mo22077p();
                        C6998j.this.mo22078q();
                        long nanoTime2 = System.nanoTime();
                        long j2 = (C6998j.this.f24834o - (nanoTime2 - nanoTime)) - j;
                        if (j2 > 0) {
                            try {
                                Thread.sleep(j2 / 1000000, (int) (j2 % 1000000));
                                i = 0;
                            } catch (InterruptedException unused) {
                            }
                            j = (System.nanoTime() - nanoTime2) - j2;
                        } else {
                            i++;
                            if (i > 15) {
                                Thread.yield();
                                j = 0;
                                i = 0;
                            } else {
                                j = 0;
                            }
                        }
                        nanoTime = System.nanoTime();
                    } catch (InterruptedException unused2) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public C6977a mo22053a() {
        return this.f24822c;
    }

    /* renamed from: b */
    public Context mo22060b() {
        if (this.f24822c.mo21767e() == 0) {
            return this.f24823d;
        }
        if (this.f24822c.mo21767e() == 1) {
            return this.f24827h;
        }
        if (this.f24822c.mo21767e() == 2) {
            return this.f24828i;
        }
        return null;
    }

    /* renamed from: c */
    public Activity mo22062c() {
        return this.f24823d;
    }

    /* renamed from: n */
    public C6981e mo22075n() {
        return this.f24822c.mo21769i();
    }

    /* renamed from: g */
    public View mo22066g() {
        return this.f24826g;
    }

    /* renamed from: d */
    public void mo22063d() {
        this.f24820a = null;
        this.f24821b = null;
        Activity activity = this.f24823d;
        if (this.f24826g != null) {
            this.f24826g.destroyDrawingCache();
        }
        if (this.f24822c != null) {
            this.f24822c.mo21771l();
        }
        if (this.f24825f != null) {
            this.f24825f.getHolder().getSurface().release();
        }
    }

    /* renamed from: a */
    public void mo22074a(View view) {
        this.f24826g = view;
    }

    /* renamed from: e */
    public SurfaceView mo22064e() {
        return this.f24825f;
    }

    /* renamed from: f */
    public SurfaceHolder mo22065f() {
        SurfaceView e = mo22064e();
        if (e == null) {
            return null;
        }
        return e.getHolder();
    }

    /* renamed from: a */
    public void mo22056a(int i, int i2) {
        View view;
        if (this.f24822c.mo21767e() == 0) {
            int b = this.f24822c.mo21764b();
            int c = this.f24822c.mo21765c();
            if (i == b && i2 == c) {
                view = mo22064e();
            } else {
                RelativeLayout relativeLayout = new RelativeLayout(this.f24823d);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(13);
                LinearLayout linearLayout = new LinearLayout(this.f24823d);
                linearLayout.addView(mo22064e(), i, i2);
                relativeLayout.addView(linearLayout, layoutParams);
                relativeLayout.setBackgroundColor(this.f24820a.mo21875q());
                view = relativeLayout;
            }
            mo22074a(view);
        } else if (this.f24822c.mo21767e() == 1) {
            mo22074a((View) mo22064e());
        }
    }

    /* renamed from: a */
    public void mo22057a(int i, int i2, boolean z, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(this.f24820a.f24531c, viewGroup, false);
        SurfaceView e = mo22064e();
        if (z) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            layoutParams.setMargins(0, 0, 0, 0);
            e.setPadding(0, 0, 0, 0);
            viewGroup2.addView(e, layoutParams);
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(this.f24823d);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            relativeLayout.addView(e, i, i2);
            viewGroup2.addView(relativeLayout, layoutParams2);
        }
        viewGroup2.setBackgroundColor(this.f24820a.mo21875q());
        mo22074a((View) viewGroup2);
    }

    /* renamed from: a */
    public void mo22073a(Intent intent) {
        this.f24822c.mo21763a(intent);
    }

    /* renamed from: a */
    public void mo22058a(Runnable runnable) {
        if (this.f24822c.mo21767e() == 0) {
            this.f24823d.runOnUiThread(runnable);
        }
    }

    /* renamed from: h */
    public File mo22067h() {
        if (this.f24822c.mo21767e() == 0) {
            return this.f24823d.getFilesDir();
        }
        if (this.f24822c.mo21767e() == 1) {
            return this.f24827h.getFilesDir();
        }
        if (this.f24822c.mo21767e() == 2) {
            return this.f24828i.getFilesDir();
        }
        return null;
    }

    /* renamed from: a */
    public File mo22054a(String str) {
        if (this.f24822c.mo21767e() == 0) {
            return this.f24823d.getFileStreamPath(str);
        }
        if (this.f24822c.mo21767e() == 1) {
            return this.f24827h.getFileStreamPath(str);
        }
        if (this.f24822c.mo21767e() == 2) {
            return this.f24828i.getFileStreamPath(str);
        }
        return null;
    }

    /* renamed from: b */
    public InputStream mo22061b(String str) {
        if (this.f24822c.mo21767e() == 0) {
            try {
                return this.f24823d.openFileInput(str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: i */
    public AssetManager mo22068i() {
        if (this.f24822c.mo21767e() == 0) {
            return this.f24823d.getAssets();
        }
        if (this.f24822c.mo21767e() == 1) {
            return this.f24827h.getBaseContext().getAssets();
        }
        if (this.f24822c.mo21767e() == 2) {
            return this.f24828i.getBaseContext().getAssets();
        }
        return null;
    }

    /* renamed from: a */
    public void mo22055a(int i) {
        int e = this.f24822c.mo21767e();
        if (e == 0 || e == 1) {
            this.f24825f.setSystemUiVisibility(i);
        }
    }

    /* renamed from: o */
    public Thread mo22076o() {
        return new C7000a();
    }

    /* renamed from: j */
    public void mo22069j() {
        if (!this.f24824e) {
            this.f24829j = true;
        } else if (this.f24830k == null) {
            this.f24830k = mo22076o();
            this.f24830k.start();
            this.f24829j = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread already started in ");
            sb.append(getClass().getSimpleName());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: k */
    public void mo22070k() {
        if (this.f24824e) {
            this.f24831l = true;
        }
    }

    /* renamed from: l */
    public void mo22071l() {
        if (this.f24824e) {
            if (this.f24830k == null) {
                this.f24830k = mo22076o();
                this.f24830k.start();
            }
            this.f24831l = false;
            synchronized (this.f24832m) {
                this.f24832m.notifyAll();
            }
        }
    }

    /* renamed from: m */
    public boolean mo22072m() {
        if (!this.f24824e) {
            return true;
        }
        if (this.f24830k == null) {
            return false;
        }
        this.f24830k.interrupt();
        this.f24830k = null;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22077p() {
        synchronized (this.f24832m) {
            while (this.f24831l) {
                this.f24832m.wait();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo22078q() {
        this.f24822c.mo21762M_();
        if (this.f24822c.mo21770k() && this.f24820a != null) {
            this.f24820a.mo21882x();
        }
    }

    /* renamed from: a */
    public void mo22059a(String[] strArr) {
        if (this.f24822c.mo21768f()) {
            final C6981e n = mo22075n();
            if (n != null) {
                C69991 r2 = new C0723e(new Handler(Looper.getMainLooper())) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo2439a(int i, Bundle bundle) {
                        n.mo21775a(i, bundle.getStringArray("permissions"), bundle.getIntArray("grantResults"));
                    }
                };
                Intent intent = new Intent(mo22060b(), C6980d.class);
                intent.putExtra("resultReceiver", r2);
                intent.putExtra("permissions", strArr);
                intent.putExtra("requestCode", 1);
                intent.addFlags(268435456);
                mo22073a(intent);
            }
        } else if (this.f24823d != null) {
            C0625a.m2278a(this.f24823d, strArr, 1);
        }
    }
}
