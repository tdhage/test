package com.td.test.core;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MemoryMappedWritingMain {
    public static void main(String... args) throws IOException {
        String dir = "D:/temp";
        for (int i = 0; i < 4; i++) {
            long start = System.nanoTime();
            File tmp = new File(dir, "deleteme." + i);
            tmp.deleteOnExit();
            RandomAccessFile raf = new RandomAccessFile(tmp, "rw");
            final MappedByteBuffer map = raf.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, 1 << 30);
            IntBuffer array = map.order(ByteOrder.nativeOrder()).asIntBuffer();
            for (int n = 0; n < array.capacity(); n++)
                array.put(n, n);

            map.force();

            raf.close();
            long time = System.nanoTime() - start;
            System.out.printf("Took %.1f seconds to write 1 GB%n", time / 1e9);
        }
    }
}