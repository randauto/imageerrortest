package p265it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ViewConfiguration;

/* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch */
public class ImageViewTouch extends C7131a {

    /* renamed from: a */
    protected ScaleGestureDetector f26054a;

    /* renamed from: b */
    protected GestureDetector f26055b;

    /* renamed from: c */
    protected int f26056c;

    /* renamed from: d */
    protected float f26057d;

    /* renamed from: e */
    protected int f26058e;

    /* renamed from: f */
    protected OnGestureListener f26059f;

    /* renamed from: g */
    protected OnScaleGestureListener f26060g;

    /* renamed from: h */
    protected boolean f26061h;

    /* renamed from: i */
    protected boolean f26062i;

    /* renamed from: j */
    protected boolean f26063j;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C7128b f26064y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C7129c f26065z;

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$a */
    public class C7127a extends SimpleOnGestureListener {
        public C7127a() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f26065z != null) {
                ImageViewTouch.this.f26065z.mo21682a();
            }
            return ImageViewTouch.this.mo22925a(motionEvent);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDoubleTap. double tap enabled? ");
            sb.append(ImageViewTouch.this.f26061h);
            Log.i("ImageViewTouchBase", sb.toString());
            if (ImageViewTouch.this.f26061h) {
                ImageViewTouch.this.f26085q = true;
                ImageViewTouch.this.mo22957a(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(ImageViewTouch.this.mo22920a(ImageViewTouch.this.getScale(), ImageViewTouch.this.getMaxScale()), ImageViewTouch.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            if (ImageViewTouch.this.f26064y != null) {
                ImageViewTouch.this.f26064y.mo22947a();
            }
            return super.onDoubleTap(motionEvent);
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.f26054a.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ImageViewTouch.this.f26063j && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.f26054a.isInProgress()) {
                return ImageViewTouch.this.mo22926a(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ImageViewTouch.this.f26063j && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.f26054a.isInProgress() && ImageViewTouch.this.getScale() != 1.0f) {
                return ImageViewTouch.this.mo22928b(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ImageViewTouch.this.mo22930d(motionEvent);
        }

        public boolean onDown(MotionEvent motionEvent) {
            return ImageViewTouch.this.mo22927b(motionEvent);
        }
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$b */
    public interface C7128b {
        /* renamed from: a */
        void mo22947a();
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$c */
    public interface C7129c {
        /* renamed from: a */
        void mo21682a();
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$d */
    public class C7130d extends SimpleOnScaleGestureListener {

        /* renamed from: a */
        protected boolean f26067a = false;

        public C7130d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = ImageViewTouch.this.getScale() * scaleGestureDetector.getScaleFactor();
            if (ImageViewTouch.this.f26062i) {
                if (this.f26067a && currentSpan != 0.0f) {
                    ImageViewTouch.this.f26085q = true;
                    ImageViewTouch.this.mo22968b(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(scale, ImageViewTouch.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    ImageViewTouch.this.f26058e = 1;
                    ImageViewTouch.this.invalidate();
                    return true;
                } else if (!this.f26067a) {
                    this.f26067a = true;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo22925a(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: b */
    public boolean mo22927b(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: d */
    public boolean mo22930d(MotionEvent motionEvent) {
        return true;
    }

    public ImageViewTouch(Context context) {
        super(context);
        this.f26061h = true;
        this.f26062i = true;
        this.f26063j = true;
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26061h = true;
        this.f26062i = true;
        this.f26063j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22922a(Context context, AttributeSet attributeSet, int i) {
        super.mo22922a(context, attributeSet, i);
        this.f26056c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f26059f = getGestureListener();
        this.f26060g = getScaleListener();
        this.f26054a = new ScaleGestureDetector(getContext(), this.f26060g);
        this.f26055b = new GestureDetector(getContext(), this.f26059f, null, true);
        this.f26058e = 1;
    }

    public void setDoubleTapListener(C7128b bVar) {
        this.f26064y = bVar;
    }

    public void setSingleTapListener(C7129c cVar) {
        this.f26065z = cVar;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f26061h = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f26062i = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f26063j = z;
    }

    public boolean getDoubleTapEnabled() {
        return this.f26061h;
    }

    /* access modifiers changed from: protected */
    public OnGestureListener getGestureListener() {
        return new C7127a();
    }

    /* access modifiers changed from: protected */
    public OnScaleGestureListener getScaleListener() {
        return new C7130d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22923a(Drawable drawable, Matrix matrix, float f, float f2) {
        super.mo22923a(drawable, matrix, f, f2);
        this.f26057d = getMaxScale() / 3.0f;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f26054a.onTouchEvent(motionEvent);
        if (!this.f26054a.isInProgress()) {
            this.f26055b.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) != 1) {
            return true;
        }
        return mo22929c(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22921a(float f) {
        if (f < getMinScale()) {
            mo22975c(getMinScale(), 50.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo22920a(float f, float f2) {
        if (this.f26058e != 1) {
            this.f26058e = 1;
            return 1.0f;
        } else if ((this.f26057d * 2.0f) + f <= f2) {
            return f + this.f26057d;
        } else {
            this.f26058e = -1;
            return f2;
        }
    }

    /* renamed from: a */
    public boolean mo22926a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (getScale() == 1.0f) {
            return false;
        }
        this.f26085q = true;
        mo22977d(-f, -f2);
        invalidate();
        return true;
    }

    /* renamed from: b */
    public boolean mo22928b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
            return false;
        }
        this.f26085q = true;
        mo22955a(x / 2.0f, y / 2.0f, 300.0d);
        invalidate();
        return true;
    }

    /* renamed from: c */
    public boolean mo22929c(MotionEvent motionEvent) {
        if (getScale() < getMinScale()) {
            mo22975c(getMinScale(), 50.0f);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo22924a(int i) {
        RectF bitmapRect = getBitmapRect();
        mo22960a(bitmapRect, this.f26092x);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        boolean z = false;
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.right < ((float) rect.right) || i >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.f26092x.left)) > 1.0d) {
                z = true;
            }
            return z;
        }
        if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
            z = true;
        }
        return z;
    }
}
