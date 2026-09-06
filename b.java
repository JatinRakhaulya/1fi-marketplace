package z2;

import java.util.NoSuchElementException;
import l2.b0;
/* compiled from: r8-map-id-c0d3c884047de8118f2064d4e1d8504d38edaacc94d44b538abe1fcf1e74421f */
/* loaded from: classes.dex */
public final class b extends b0 {

    /* renamed from: e  reason: collision with root package name */
    private final int f5632e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5633f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5634g;

    /* renamed from: h  reason: collision with root package name */
    private int f5635h;

    public b(int i4, int i5, int i6) {
        this.f5632e = i6;
        this.f5633f = i5;
        boolean z3 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z3 = true;
        }
        this.f5634g = z3;
        this.f5635h = z3 ? i4 : i5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5634g;
    }

    @Override // l2.b0
    public int nextInt() {
        int i4 = this.f5635h;
        if (i4 == this.f5633f) {
            if (this.f5634g) {
                this.f5634g = false;
                return i4;
            }
            throw new NoSuchElementException();
        }
        this.f5635h = this.f5632e + i4;
        return i4;
    }
}
