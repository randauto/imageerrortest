package org.tensorflow.lite.examples.imagesegmentation.judi.com.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

import org.tensorflow.contrib.android.TensorFlowInferenceInterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;

/* renamed from: judi.com.service.b */
/* compiled from: DeeplabProcessor */
public class DeeplabProcessor {
    private final static String MODEL_FILE = "file:///android_asset/data_513.pb";

    private final static String INPUT_NAME = "ImageTensor";

    private final static String OUTPUT_NAME = "SemanticPredictions";

    /* renamed from: a */
    private static TensorFlowInferenceInterface sTFInterface;

    /* renamed from: b */
    private static Context f26716b;

    /* renamed from: a */
    public static synchronized void closeProcessor() {
        synchronized (DeeplabProcessor.class) {
            if (sTFInterface != null) {
                sTFInterface.close();
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m39108a(Context context) {
        FileInputStream fileInputStream;
        synchronized (DeeplabProcessor.class) {
            f26716b = context;
            try {
                fileInputStream = new FileInputStream(new File(MODEL_FILE));
            } catch (FileNotFoundException e) {
                Log.e("Input", e.getMessage());
                fileInputStream = null;
            }
            sTFInterface = new TensorFlowInferenceInterface(context.getAssets(), MODEL_FILE);
            if (sTFInterface == null) {
                Log.w("init model failed", MODEL_FILE);
                return false;
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized boolean m39110b() {
        boolean z;
        synchronized (DeeplabProcessor.class) {
            z = sTFInterface != null;
        }
        return z;
    }

    /* renamed from: a */
    public static synchronized int[] m39109a(Bitmap bitmap, int i) {
        int[][] iArr;
        synchronized (DeeplabProcessor.class) {
            if (sTFInterface == null) {
                Log.e("tfmodel not init", "");
                return null;
            } else if (bitmap == null) {
                Log.e("bitmap null ", "");
                return null;
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                StringBuilder sb = new StringBuilder();
                sb.append("bitmap: ");
                sb.append(width);
                sb.append("x");
                sb.append(height);
                Log.e(sb.toString(), "");
                if (width <= 513) {
                    if (height <= 513) {
                        int i2 = width * height;
                        int[] iArr2 = new int[i2];
                        byte[] bArr = new byte[(i2 * 3)];
                        int[] iArr3 = new int[i2];
                        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
                        for (int i3 = 0; i3 < iArr2.length; i3++) {
                            int i4 = iArr2[i3];
                            int i5 = i3 * 3;
                            bArr[i5 + 0] = (byte) ((i4 >> 16) & 255);
                            bArr[i5 + 1] = (byte) ((i4 >> 8) & 255);
                            bArr[i5 + 2] = (byte) (i4 & 255);
                        }
                        System.currentTimeMillis();
                        sTFInterface.feed(INPUT_NAME, bArr, 1, (long) height, (long) width, 3);
                        sTFInterface.run(new String[]{OUTPUT_NAME}, true);
                        sTFInterface.fetch(OUTPUT_NAME, iArr3);
                        double[] dArr = new double[256];
                        for (int i6 = 0; i6 < height; i6++) {
                            for (int i7 = 0; i7 < width; i7++) {
                                int i8 = (i6 * width) + i7;
                                if (iArr3[i8] != 0) {
                                    int i9 = iArr3[i8];
                                    dArr[i9] = dArr[i9] + 1.0d;
                                }
                            }
                        }
                        for (int i10 = (height / 2) - 10; i10 < (height / 2) + 10; i10++) {
                            for (int i11 = (width / 2) - 10; i11 < (width / 2) + 10; i11++) {
                                int i12 = (i10 * width) + i11;
                                dArr[iArr3[i12]] = dArr[iArr3[i12]] * 1.04d;
                            }
                        }
                        double d = 0.0d;
                        int i13 = 0;
                        for (int i14 = 1; i14 < 256; i14++) {
                            if (d < dArr[i14]) {
                                d = dArr[i14];
                                i13 = i14;
                            }
                        }
                        if (i != 0) {
                            int[][] iArr4 = (int[][]) Array.newInstance(int.class, new int[]{width, height});
                            for (int i15 = 0; i15 < width; i15++) {
                                for (int i16 = 0; i16 < height; i16++) {
                                    iArr4[i15][i16] = iArr3[(i16 * width) + i15];
                                }
                            }
                            if (i > 0) {
                                iArr = ImageUtils.m39143b(iArr4, Math.abs(i));
                            } else {
                                iArr = ImageUtils.m39142a(iArr4, Math.abs(i));
                            }
                            int[] a = ImageUtils.m39140a(iArr, width, height);
                            return a;
                        }
                        for (int i17 = 0; i17 < height; i17++) {
                            for (int i18 = 0; i18 < width; i18++) {
                                int i19 = (i17 * width) + i18;
                                iArr3[i19] = iArr3[i19] == i13 ? -16777216 : 0;
                            }
                        }
                        return iArr3;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("bitmap: ");
                sb2.append(width);
                sb2.append("x");
                sb2.append(height);
                Log.e(sb2.toString(), "");
                return null;
            }
        }
    }
}
