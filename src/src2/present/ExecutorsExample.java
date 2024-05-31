package present;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorsExample {
    public static void main(String[] args) {

        //создает пул с единственным потоком для выполнения всех задач.
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        //создает пул потоков, который повторно использует фиксированное количество потоков для выполнения любого количества задач.
        ExecutorService executorService2 = Executors.newFixedThreadPool(2);

        //Создает пул потоков, который создает новые потоки по мере необходимости, но будет повторно использовать ранее созданные потоки, когда они будут доступны.
        ExecutorService executorService3 = Executors.newCachedThreadPool();

        //создает пул потоков, который может планировать выполнение команд после заданной задержки или для периодического выполнения
        ScheduledExecutorService executorService4 = Executors.newScheduledThreadPool(2);

        //создает пул потоков, где количество потоков = количество ядер процессора, которые доступны для JVM.
        // Дефолтный уровень параллелизма – один. Это значит, что в пуле будет создано столько потоков, сколько ядер ЦП доступно JVM.
        // Если параллелизм равен 4, тогда вместо количества ядер используется переданное значение.
        ExecutorService executorService5 = Executors.newWorkStealingPool();


    }
}
