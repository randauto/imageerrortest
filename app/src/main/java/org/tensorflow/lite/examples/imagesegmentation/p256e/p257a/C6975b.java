package p256e.p257a;

import android.content.Context;
import android.service.wallpaper.WallpaperService;
import android.support.wearable.watchface.CanvasWatchFaceService;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import p256e.p258b.C6977a;
import p256e.p258b.C6979c;
import p256e.p259c.C6989c;
import p256e.p259c.C6998j;

/* renamed from: e.a.b */
/* compiled from: PSurfaceAndroid2D */
public class C6975b extends C6998j {

    /* renamed from: e.a.b$a */
    /* compiled from: PSurfaceAndroid2D */
    public class C6976a extends SurfaceView implements Callback {

        /* renamed from: a */
        SurfaceHolder f24485a;

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        public C6976a(Context context, SurfaceHolder surfaceHolder) {
            super(context);
            this.f24485a = surfaceHolder;
            getHolder().addCallback(this);
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
            C6975b.this.f24824e = false;
        }

        public SurfaceHolder getHolder() {
            if (this.f24485a == null) {
                return super.getHolder();
            }
            return this.f24485a;
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C6975b.this.f24824e = true;
            if (C6975b.this.f24829j) {
                C6975b.this.mo22069j();
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C6975b.this.f24820a.mo21876r();
            C6975b.this.f24820a.mo21802a(i2, i3);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            C6975b.this.f24820a.mo21819a(z);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C6975b.this.f24820a.mo21821a(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C6975b.this.f24820a.mo21805a(i, keyEvent);
            return super.onKeyDown(i, keyEvent);
        }

        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            C6975b.this.f24820a.mo21827b(i, keyEvent);
            return super.onKeyUp(i, keyEvent);
        }
    }

    public C6975b() {
    }

    public C6975b(C6989c cVar, C6977a aVar, SurfaceHolder surfaceHolder) {
        this.f24820a = cVar.f24755cj;
        this.f24821b = cVar;
        this.f24822c = aVar;
        if (aVar.mo21767e() == 0) {
            this.f24823d = ((C6979c) aVar).mo2120o();
            this.f24825f = new C6976a(this.f24823d, null);
        } else if (aVar.mo21767e() == 1) {
            this.f24827h = (WallpaperService) aVar;
            this.f24825f = new C6976a(this.f24827h, surfaceHolder);
        } else if (aVar.mo21767e() == 2) {
            this.f24828i = (CanvasWatchFaceService) aVar;
            this.f24825f = null;
            this.f24824e = true;
        }
    }
}
