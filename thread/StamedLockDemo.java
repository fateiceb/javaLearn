package thread;

import java.util.concurrent.locks.StampedLock;

public class StamedLockDemo {
    private final StampedLock stampedLock = new StampedLock();
    private double x;
    private double y;
    public void move(double deltaX, double deltaY){
        long stamp = stampedLock.writeLock();
        try {
            x+=deltaX;
            y+= deltaY;
        }finally {
            stampedLock.unlockWrite(stamp);
        }
    }
    public double distanceFromOrigin(){
        long stamp = stampedLock.tryOptimisticRead();
        double currentX = x;
        double currentY = y;
        if (!stampedLock.validate(stamp)) {
            stamp = stampedLock.readLock();
            try {
                currentX = x;
                currentY = y;
            }finally {
                stampedLock.unlockRead(stamp);
            }
        }
        return Math.sqrt(currentX * currentY + currentY * currentY);
    }
}
