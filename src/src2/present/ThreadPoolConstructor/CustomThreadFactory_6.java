package present.ThreadPoolConstructor;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory_6 implements ThreadFactory {
        private int threadCount = 0;
        private final String namePrefix;
        public CustomThreadFactory_6(String namePrefix) {
            this.namePrefix = namePrefix;
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r, namePrefix + "-thread-" + threadCount++);
            thread.setPriority(Thread.NORM_PRIORITY);
            thread.setDaemon(false);
            return thread;
        }
    }

