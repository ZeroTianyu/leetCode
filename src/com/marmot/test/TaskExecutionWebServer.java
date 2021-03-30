package com.marmot.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

class TaskExecutionWebServer {
    private static final int NTHREADS = 100;

    private static final Executor exec
            = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String[] args) throws IOException {


        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,2,200L, TimeUnit.MILLISECONDS,new SynchronousQueue<>());
        ServerSocket socket = new ServerSocket(80);
        while (true) {
            final Socket connection = socket.accept();
            Runnable task = new Runnable() {
                @Override
                public void run() {
//                    handleRequest(connection);
                }
            };
            threadPoolExecutor.execute(task);

        }
    }
}