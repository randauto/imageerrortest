package org.tensorflow.lite.examples.imagesegmentation.judi.com.p270c;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/* renamed from: judi.com.c.b */
/* compiled from: ScriptC_MaskGen */
public class C7173b extends ScriptC {

    /* renamed from: a */
    private Element f26267a;

    /* renamed from: b */
    private Element f26268b;

    /* renamed from: c */
    private Element f26269c;

    /* renamed from: d */
    private float f26270d = 255.0f;

    public C7173b(RenderScript renderScript) {
        super(renderScript, "maskgen", C7172a.m38330a(), C7172a.m38331b());
        this.f26267a = Element.ALLOCATION(renderScript);
        this.f26268b = Element.F32(renderScript);
        this.f26269c = Element.U8_4(renderScript);
    }

    /* renamed from: a */
    public void mo23092a(Allocation allocation, Allocation allocation2) {
        mo23093a(allocation, allocation2, null);
    }

    /* renamed from: a */
    public void mo23093a(Allocation allocation, Allocation allocation2, LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f26269c)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        } else if (allocation2.getType().getElement().isCompatible(this.f26269c)) {
            Type type = allocation.getType();
            Type type2 = allocation2.getType();
            if (type.getCount() == type2.getCount() && type.getX() == type2.getX() && type.getY() == type2.getY() && type.getZ() == type2.getZ() && type.hasFaces() == type2.hasFaces() && type.hasMipmaps() == type2.hasMipmaps()) {
                forEach(2, allocation, allocation2, (FieldPacker) null, launchOptions);
                return;
            }
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        } else {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
    }
}
