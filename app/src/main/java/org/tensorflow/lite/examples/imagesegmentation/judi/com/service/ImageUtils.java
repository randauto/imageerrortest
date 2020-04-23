package org.tensorflow.lite.examples.imagesegmentation.judi.com.service;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;

/* renamed from: judi.com.service.f */
/* compiled from: ImageUtils */
public class ImageUtils {
    /* renamed from: a */
    public static int[] m39140a(int[][] iArr, int i, int i2) {
        int[] iArr2 = new int[(i * i2)];
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[(i4 * i) + i3] = iArr[i3][i4] == 1 ? -16777216 : 0;
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    public static Bitmap m39139a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, i, i2), null);
        return createBitmap;
    }

    /* renamed from: a */
    static int[][] m39142a(int[][] iArr, int i) {
        int[][] a = m39141a(iArr);
        for (int i2 = 0; i2 < a.length; i2++) {
            for (int i3 = 0; i3 < a[i2].length; i3++) {
                a[i2][i3] = a[i2][i3] <= i ? 1 : 0;
            }
        }
        return a;
    }

    /* renamed from: b */
    static int[][] m39143b(int[][] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            for (int i3 = 0; i3 < iArr[i2].length; i3++) {
                iArr[i2][i3] = 1 - iArr[i2][i3];
            }
        }
        int[][] a = m39141a(iArr);
        for (int i4 = 0; i4 < a.length; i4++) {
            for (int i5 = 0; i5 < a[i4].length; i5++) {
                a[i4][i5] = a[i4][i5] <= i ? 1 : 0;
            }
        }
        for (int i6 = 0; i6 < a.length; i6++) {
            for (int i7 = 0; i7 < a[i6].length; i7++) {
                a[i6][i7] = 1 - a[i6][i7];
            }
        }
        return a;
    }

    /* renamed from: a */
    static int[][] m39141a(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i].length; i2++) {
                if (iArr[i][i2] == 1) {
                    iArr[i][i2] = 0;
                } else {
                    iArr[i][i2] = iArr.length + iArr[i].length;
                    if (i > 0) {
                        iArr[i][i2] = Math.min(iArr[i][i2], iArr[i - 1][i2] + 1);
                    }
                    if (i2 > 0) {
                        iArr[i][i2] = Math.min(iArr[i][i2], iArr[i][i2 - 1] + 1);
                    }
                }
            }
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            for (int length2 = iArr[length].length - 1; length2 >= 0; length2--) {
                int i3 = length + 1;
                if (i3 < iArr.length) {
                    iArr[length][length2] = Math.min(iArr[length][length2], iArr[i3][length2] + 1);
                }
                int i4 = length2 + 1;
                if (i4 < iArr[length].length) {
                    iArr[length][length2] = Math.min(iArr[length][length2], iArr[length][i4] + 1);
                }
            }
        }
        return iArr;
    }
}
