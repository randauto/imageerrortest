package org.tensorflow.lite.examples.imagesegmentation.judi.com.p270c;

import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/* renamed from: judi.com.c.c */
/* compiled from: ScriptC_TrimWithMask */
public class ScriptC_TrimWithMask extends ScriptC {

    /* renamed from: a */
    private Element f26271a;

    /* renamed from: b */
    private Element f26272b;

    /* renamed from: c */
    private Element f26273c;

    /* renamed from: d */
    private Allocation f26274d;

    /* renamed from: e */
    private int f26275e = 255;

    public ScriptC_TrimWithMask(RenderScript renderScript) {
        super(renderScript, "trimwithmask", C7175d.m38341a(), C7175d.m38342b());
        this.f26271a = Element.ALLOCATION(renderScript);
        this.f26272b = Element.I32(renderScript);
        this.f26273c = Element.U8_4(renderScript);
    }

    /* renamed from: a */
    public synchronized void mo23094a(Allocation allocation) {
        setVar(0, (BaseObj) allocation);
        this.f26274d = allocation;
    }

    /* renamed from: a */
    public void mo23095a(Allocation allocation, Allocation allocation2) {
        mo23096a(allocation, allocation2, null);
    }

    /* renamed from: a */
    public void mo23096a(Allocation allocation, Allocation allocation2, LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f26273c)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        } else if (allocation2.getType().getElement().isCompatible(this.f26273c)) {
            Type type = allocation.getType();
            Type type2 = allocation2.getType();
            if (type.getCount() == type2.getCount() && type.getX() == type2.getX() && type.getY() == type2.getY() && type.getZ() == type2.getZ() && type.hasFaces() == type2.hasFaces() && type.hasMipmaps() == type2.hasMipmaps()) {
                forEach(1, allocation, allocation2, (FieldPacker) null, launchOptions);
                return;
            }
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        } else {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
    }
}
