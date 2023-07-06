package Charan.Threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
    private int i = 0;
    private int j = 0;

    public void incrementI() {
        lockForI.lock();
        i++;
        lockForJ.unlock();
    }

    public void incrementJ() {
        lockForJ.lock();
        j++;
        lockForI.unlock();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
