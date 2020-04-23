package p256e.p262f;

import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.opengl.GLSurfaceView.Renderer;
import android.service.wallpaper.WallpaperService;
import android.support.wearable.watchface.Gles2WatchFaceService;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import p256e.p258b.C6977a;
import p256e.p258b.C6979c;
import p256e.p259c.C6982a;
import p256e.p259c.C6989c;
import p256e.p259c.C6998j;

/* renamed from: e.f.k */
/* compiled from: PSurfaceGLES */
public class C7084k extends C6998j {

    /* renamed from: p */
    public C7060f f25906p;

    /* renamed from: q */
    private C7087c f25907q;

    /* renamed from: e.f.k$a */
    /* compiled from: PSurfaceGLES */
    protected class C7085a implements EGLConfigChooser {

        /* renamed from: a */
        public int f25908a;

        /* renamed from: b */
        public int f25909b;

        /* renamed from: c */
        public int f25910c;

        /* renamed from: d */
        public int f25911d;

        /* renamed from: e */
        public int f25912e;

        /* renamed from: f */
        public int f25913f;

        /* renamed from: g */
        public int f25914g;

        /* renamed from: h */
        public int f25915h;

        /* renamed from: i */
        public int f25916i;

        /* renamed from: j */
        public int f25917j;

        /* renamed from: k */
        public int f25918k;

        /* renamed from: l */
        public int f25919l;

        /* renamed from: m */
        public int[] f25920m = new int[1];

        /* renamed from: n */
        public int f25921n;

        /* renamed from: o */
        protected int[] f25922o = {12352, 4, 12338, 0, 12344};

        public C7085a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f25908a = i;
            this.f25909b = i2;
            this.f25910c = i3;
            this.f25911d = i4;
            this.f25912e = i5;
            this.f25913f = i6;
            this.f25921n = i7;
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr;
            if (1 < this.f25921n) {
                eGLConfigArr = mo22827a(egl10, eGLDisplay, new int[]{12352, 4, 12338, 1, 12337, this.f25921n, 12344});
                if (eGLConfigArr == null) {
                    EGLConfig[] a = mo22827a(egl10, eGLDisplay, new int[]{12352, 4, 12512, 1, 12513, this.f25921n, 12344});
                    if (a == null) {
                        a = mo22827a(egl10, eGLDisplay, this.f25922o);
                    } else {
                        C7060f.f25441fN = true;
                        C7060f.f25442fO = true;
                        C7060f.f25443fP = this.f25921n;
                    }
                    eGLConfigArr = a;
                } else {
                    C7060f.f25441fN = true;
                    C7060f.f25442fO = false;
                    C7060f.f25443fP = this.f25921n;
                }
            } else {
                eGLConfigArr = mo22827a(egl10, eGLDisplay, this.f25922o);
            }
            if (eGLConfigArr != null) {
                return mo22826a(egl10, eGLDisplay, eGLConfigArr);
            }
            throw new IllegalArgumentException("No EGL configs match configSpec");
        }

        /* renamed from: a */
        public EGLConfig mo22826a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int i;
            EGLConfig[] eGLConfigArr2 = eGLConfigArr;
            int length = eGLConfigArr2.length;
            EGLConfig eGLConfig = null;
            int i2 = 0;
            float f = Float.MAX_VALUE;
            while (i2 < length) {
                EGLConfig eGLConfig2 = eGLConfigArr2[i2];
                if ((mo22825a(egl10, eGLDisplay, eGLConfig2, 12352, 0) & 4) != 0) {
                    EGL10 egl102 = egl10;
                    EGLDisplay eGLDisplay2 = eGLDisplay;
                    EGLConfig eGLConfig3 = eGLConfig2;
                    int a = mo22825a(egl102, eGLDisplay2, eGLConfig3, 12325, 0);
                    int a2 = mo22825a(egl102, eGLDisplay2, eGLConfig3, 12326, 0);
                    int a3 = mo22825a(egl102, eGLDisplay2, eGLConfig3, 12324, 0);
                    int a4 = mo22825a(egl102, eGLDisplay2, eGLConfig3, 12323, 0);
                    i = length;
                    int a5 = mo22825a(egl102, eGLDisplay2, eGLConfig3, 12322, 0);
                    int a6 = mo22825a(egl102, eGLDisplay2, eGLConfig3, 12321, 0);
                    float b = (((float) C6982a.m36416b(a3 - this.f25908a)) * 0.2f) + (((float) C6982a.m36416b(a4 - this.f25909b)) * 0.2f) + (((float) C6982a.m36416b(a5 - this.f25910c)) * 0.2f) + (((float) C6982a.m36416b(a6 - this.f25911d)) * 0.15f) + (((float) C6982a.m36416b(a - this.f25912e)) * 0.15f) + (((float) C6982a.m36416b(a2 - this.f25913f)) * 0.1f);
                    if (b < f) {
                        this.f25914g = a3;
                        this.f25915h = a4;
                        this.f25916i = a5;
                        this.f25917j = a6;
                        this.f25918k = a;
                        this.f25919l = a2;
                        f = b;
                        eGLConfig = eGLConfig2;
                    }
                } else {
                    i = length;
                }
                i2++;
                length = i;
                eGLConfigArr2 = eGLConfigArr;
            }
            return eGLConfig;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo22825a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f25920m) ? this.f25920m[0] : i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EGLConfig[] mo22827a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
            int[] iArr2 = new int[1];
            egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2);
            int i = iArr2[0];
            if (i <= 0) {
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr2);
            return eGLConfigArr;
        }
    }

    /* renamed from: e.f.k$b */
    /* compiled from: PSurfaceGLES */
    protected class C7086b implements Renderer {
        public C7086b() {
        }

        public void onDrawFrame(GL10 gl10) {
            C7084k.this.f25906p.mo22399b(gl10);
            C7084k.this.f24820a.mo21882x();
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            C7084k.this.f25906p.mo22399b(gl10);
            C7084k.this.f24820a.mo21876r();
            C7084k.this.f24820a.mo21802a(i, i2);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C7084k.this.f25906p.mo22397a(gl10);
        }
    }

    /* renamed from: e.f.k$c */
    /* compiled from: PSurfaceGLES */
    public class C7087c extends GLSurfaceView {

        /* renamed from: a */
        SurfaceHolder f25925a;

        public C7087c(Context context, SurfaceHolder surfaceHolder) {
            super(context);
            this.f25925a = surfaceHolder;
            if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
                getHolder().addCallback(this);
                setEGLContextClientVersion(2);
                setPreserveEGLContextOnPause(true);
                int p = C7084k.this.f24820a.mo21874p();
                if (1 < p) {
                    setEGLConfigChooser(C7084k.this.mo22823b(p));
                }
                setRenderer(C7084k.this.mo22824r());
                setRenderMode(0);
                setFocusable(true);
                setFocusableInTouchMode(true);
                requestFocus();
                C7084k.this.f24824e = false;
                return;
            }
            throw new RuntimeException("OpenGL ES 2.0 is not supported by this device.");
        }

        public SurfaceHolder getHolder() {
            if (this.f25925a == null) {
                return super.getHolder();
            }
            return this.f25925a;
        }

        /* renamed from: a */
        public void mo22832a() {
            super.destroyDrawingCache();
            super.onDetachedFromWindow();
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            super.surfaceChanged(surfaceHolder, i, i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            super.surfaceCreated(surfaceHolder);
            C7084k.this.f24824e = true;
            if (C7084k.this.f24829j) {
                C7084k.this.mo22069j();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            super.surfaceDestroyed(surfaceHolder);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            C7084k.this.f24820a.mo21819a(z);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if ((C7084k.this.f24820a.f24537i == C7084k.this.f24820a.f24533e && C7084k.this.f24820a.f24538j == C7084k.this.f24820a.f24534f) && C6982a.f24495a < 19) {
                setSystemUiVisibility(2);
            }
            return C7084k.this.f24820a.mo21821a(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C7084k.this.f24820a.mo21805a(i, keyEvent);
            return super.onKeyDown(i, keyEvent);
        }

        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            C7084k.this.f24820a.mo21827b(i, keyEvent);
            return super.onKeyUp(i, keyEvent);
        }
    }

    public C7084k() {
    }

    public C7084k(C6989c cVar, C6977a aVar, SurfaceHolder surfaceHolder) {
        this.f24820a = cVar.f24755cj;
        this.f24821b = cVar;
        this.f24822c = aVar;
        this.f25906p = (C7060f) ((C7065i) cVar).f25493a;
        if (aVar.mo21767e() == 0) {
            this.f24823d = ((C6979c) aVar).mo2120o();
            this.f24825f = new C7087c(this.f24823d, null);
        } else if (aVar.mo21767e() == 1) {
            this.f24827h = (WallpaperService) aVar;
            this.f24825f = new C7087c(this.f24827h, surfaceHolder);
        } else if (aVar.mo21767e() == 2) {
            this.f24828i = (Gles2WatchFaceService) aVar;
            this.f24824e = true;
        }
        this.f25907q = (C7087c) this.f24825f;
    }

    /* renamed from: d */
    public void mo22063d() {
        super.mo22063d();
        if (this.f25907q != null) {
            this.f25907q.mo22832a();
            this.f25907q = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo22078q() {
        this.f24822c.mo21762M_();
        if (this.f24822c.mo21770k() && this.f25907q != null) {
            this.f25907q.requestRender();
        }
    }

    /* renamed from: r */
    public C7086b mo22824r() {
        return new C7086b();
    }

    /* renamed from: b */
    public C7085a mo22823b(int i) {
        C7085a aVar = new C7085a(5, 6, 5, 4, 16, 1, i);
        return aVar;
    }
}
